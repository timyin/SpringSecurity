/**
 * 
 */
package net.security.dao;

import net.security.model.Draw;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author bo
 * 
 */
public interface DrawDao extends JpaRepository<Draw, Long>, JpaSpecificationExecutor<Draw> {

	// @Query("from Draw c where c.drawName=:drawName")
	// Draw findByName(@Param("drawName") String drawName);

}
