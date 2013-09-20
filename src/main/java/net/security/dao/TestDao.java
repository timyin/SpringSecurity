/**
 * 
 */
package net.security.dao;

import net.security.model.Test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author bo
 * 
 */
public interface TestDao extends JpaRepository<Test, Long>, JpaSpecificationExecutor<Test> {

	// @Query("from Draw c where c.drawName=:drawName")
	// Draw findByName(@Param("drawName") String drawName);

}
