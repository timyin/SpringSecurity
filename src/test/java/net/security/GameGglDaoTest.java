/**
 * 
 */
package net.security;

import net.security.dao.GameGglDao;
import net.security.model.GameGgl;
import net.security.util.BeanToStringUtil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author bo
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring/spring-jpa.xml" })
public class GameGglDaoTest {

	@Autowired
	private GameGglDao dao;

	// private static final Logger log = Logger.getLogger(GameGglDaoTest.class);

	@Test
	@Transactional
	public void testCreate() throws IllegalArgumentException, IllegalAccessException {
		GameGgl bean = new GameGgl();
		BeanToStringUtil.setValue(bean);
		dao.save(bean);
	}

}
