/**
 * 
 */
package net.security;

import net.security.dao.DrawDao;
import net.security.model.Draw;
import net.security.util.BeanToStringUtil;

import org.apache.log4j.Logger;
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
public class DrawDaoTest {

	@Autowired
	private DrawDao dao;

	private static final Logger log = Logger.getLogger(DrawDaoTest.class);

	@Test
	@Transactional
	public void testCreate() {
		Draw draw = new Draw();
		draw.setDrawType(1);
		draw.setDrawNum(2);
		draw.setDrawName("test123");
		draw = dao.save(draw);
		log.warn("testCreateDraw*****" + BeanToStringUtil.toString(draw));
	}

	@Test
	@Transactional
	public void testUpdate() {
		Draw draw = new Draw();

		draw = dao.findOne(7l);
		draw.setDrawType(1);
		draw.setDrawNum(2);
		draw.setDrawName("woddd");
		draw = dao.saveAndFlush(draw);
		log.warn("testUpdate*****" + BeanToStringUtil.toString(draw));
	}

}
