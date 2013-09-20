/**
 * 
 */
package net.security.dao;

import net.security.model.GameVoteTp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author bo
 * 
 */
public interface GameVoteTpDao extends JpaRepository<GameVoteTp, Long>, JpaSpecificationExecutor<GameVoteTp> {

	// @Query("from Draw c where c.drawName=:drawName")
	// Draw findByName(@Param("drawName") String drawName);

}
