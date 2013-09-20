package net.security.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.security.dao.UserDao;
import net.security.model.Resources;
import net.security.model.Roles;
import net.security.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service("userDetailService")
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Assert.isNull(username, "UserName is Null" + username);
		User user = userDao.findByName(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		Collection<GrantedAuthority> grantedAuths = obtionGrantedAuthorities(user);

		UserDetails userdetail = new UserDetailsDecorator(user.getUserId(), user.getAccount(), user.getPassWord(), grantedAuths);
		return userdetail;
	}

	// ȡ���û���Ȩ��
	private Set<GrantedAuthority> obtionGrantedAuthorities(User user) {
		Set<GrantedAuthority> authSet = new HashSet<GrantedAuthority>();
		List<Roles> roles = user.getRoleList();
		for (Roles role : roles) {
			List<Resources> tempRes = role.getResourcesList();
			for (Resources res : tempRes) {
				authSet.add(new SimpleGrantedAuthority(res.getName()));
			}
		}
		return authSet;
	}
}
