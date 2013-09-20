/**
 * 
 */
package net.security.dao;

import net.security.model.GmTp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author bo
 * 
 */
public interface GmTpDao extends JpaRepository<GmTp, Long>, JpaSpecificationExecutor<GmTp> {

	// @Query("from Draw c where c.drawName=:drawName")
	// Draw findByName(@Param("drawName") String drawName);

}
