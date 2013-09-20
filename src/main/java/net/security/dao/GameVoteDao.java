/**
 * 
 */
package net.security.dao;

import net.security.model.GameVote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author bo
 * 
 */
public interface GameVoteDao extends JpaRepository<GameVote, Long>, JpaSpecificationExecutor<GameVote> {

	// @Query("from Draw c where c.drawName=:drawName")
	// Draw findByName(@Param("drawName") String drawName);

}
