/**
 * 
 */
package net.security.dao;

import net.security.model.WxMsgType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author bo
 * 
 */
public interface WxMsgTypeDao extends JpaRepository<WxMsgType, Long>, JpaSpecificationExecutor<WxMsgType> {

	// @Query("from Draw c where c.drawName=:drawName")
	// Draw findByName(@Param("drawName") String drawName);

}
