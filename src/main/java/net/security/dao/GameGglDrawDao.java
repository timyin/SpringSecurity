/**
 * 
 */
package net.security.dao;

import net.security.model.GameGglDraw;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author bo
 * 
 */
public interface GameGglDrawDao extends JpaRepository<GameGglDraw, Long>, JpaSpecificationExecutor<GameGglDraw> {

	// @Query("from Draw c where c.drawName=:drawName")
	// Draw findByName(@Param("drawName") String drawName);

}
