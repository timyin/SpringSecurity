package net.security;

import javax.annotation.Resource;

import net.security.dao.UserDao;
import net.security.model.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("restriction")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring/spring-jpa.xml" })
public class UserDaoTest {

	@Resource
	private UserDao userDao;

	@Test
	@Transactional
	@Rollback(false)
	public void testCreateUser() {
		User user = new User();
		user.setAccount("aa");
		user.setEnable(1l);
		user.setPassWord("11");
		userDao.save(user);

	}

}
