/**
 * 
 */
package net.security;

import net.security.dao.GameVoteTpDao;
import net.security.model.GameVoteTp;
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
public class GameVoteTpDaoTest {

	@Autowired
	private GameVoteTpDao dao;

	// private static final Logger log = Logger.getLogger(GameGglDaoTest.class);

	@Test
	@Transactional
	public void testCreate() throws IllegalArgumentException, IllegalAccessException {
		GameVoteTp bean = new GameVoteTp();
		BeanToStringUtil.setValue(bean);
		dao.save(bean);
	}

}
