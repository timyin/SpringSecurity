/**
 * 
 */
package net.security.dao;

import net.security.model.WxContent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author bo
 * 
 */
public interface WxContentDao extends JpaRepository<WxContent, Long>, JpaSpecificationExecutor<WxContent> {

	// @Query("from Draw c where c.drawName=:drawName")
	// Draw findByName(@Param("drawName") String drawName);

}
