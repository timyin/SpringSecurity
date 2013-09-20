/**
 * 
 */
package net.security.dao;

import net.security.model.GameVoteCol;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author bo
 * 
 */
public interface GameVoteColDao extends JpaRepository<GameVoteCol, Long>, JpaSpecificationExecutor<GameVoteCol> {

	// @Query("from Draw c where c.drawName=:drawName")
	// Draw findByName(@Param("drawName") String drawName);

}
