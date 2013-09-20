/**
 * 
 */
package net.security.dao;

import net.security.model.Qxtlog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author bo
 * 
 */
public interface QxtlogDao extends JpaRepository<Qxtlog, Long>, JpaSpecificationExecutor<Qxtlog> {

	// @Query("from Draw c where c.drawName=:drawName")
	// Draw findByName(@Param("drawName") String drawName);

}
