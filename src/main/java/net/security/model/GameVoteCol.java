/**
 * 
 */
package net.security.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author bo
 * 
 */
@Entity
@Table(name = "game_vote_col")
public class GameVoteCol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 115339692298722118L;

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	@Column(name = "gamevoteid")
	private Long gameVoteId;

	@Column(name = "content")
	private String content;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the gameVoteId
	 */
	public Long getGameVoteId() {
		return gameVoteId;
	}

	/**
	 * @param gameVoteId
	 *            the gameVoteId to set
	 */
	public void setGameVoteId(Long gameVoteId) {
		this.gameVoteId = gameVoteId;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

}
