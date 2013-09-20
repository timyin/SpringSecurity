package net.security.service;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

public class SecurityFilter extends AbstractSecurityInterceptor implements Filter {

	// ��applicationContext-security.xml���myFilter������securityMetadataSource��Ӧ��
	// ���������������Ѿ���AbstractSecurityInterceptor����
	private FilterInvocationSecurityMetadataSource securityMetadataSource;

	@Override
	public SecurityMetadataSource obtainSecurityMetadataSource() {
		return (SecurityMetadataSource) this.securityMetadataSource;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		FilterInvocation fi = new FilterInvocation(request, response, chain);
		invoke(fi);
	}

	private void invoke(FilterInvocation fi) throws IOException, ServletException {
		// objectΪFilterInvocation����
		// super.beforeInvocation(fi);Դ��
		// 1.��ȡ������Դ��Ȩ��
		// ִ��Collection<ConfigAttribute> attributes =
		// SecurityMetadataSource.getAttributes(object);
		// 2.�Ƿ�ӵ��Ȩ��
		// this.accessDecisionManager.decide(authenticated, object, attributes);
		InterceptorStatusToken token = super.beforeInvocation(fi);
		try {
			fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
		} finally {
			super.afterInvocation(token, null);
		}
	}

	public FilterInvocationSecurityMetadataSource getSecurityMetadataSource() {
		return securityMetadataSource;
	}

	public void setSecurityMetadataSource(FilterInvocationSecurityMetadataSource securityMetadataSource) {
		this.securityMetadataSource = securityMetadataSource;
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public Class<? extends Object> getSecureObjectClass() {
		// �����MyAccessDecisionManager��supports�������Ż�true,������������ʹ���
		return FilterInvocation.class;
	}

}
