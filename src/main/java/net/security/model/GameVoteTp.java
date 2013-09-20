/**
 * 
 */
package net.security.model;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "game_vote_tp")
public class GameVoteTp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8169226377812100015L;

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	@Column(name = "browserseq")
	private String browserSeq;

	@Column(name = "vote")
	private String vote;

	@Column(name = "dtime")
	private Date dtime;

	@Column(name = "gamevoteid")
	private Long gameVoteId;

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
	 * @return the browserSeq
	 */
	public String getBrowserSeq() {
		return browserSeq;
	}

	/**
	 * @param browserSeq
	 *            the browserSeq to set
	 */
	public void setBrowserSeq(String browserSeq) {
		this.browserSeq = browserSeq;
	}

	/**
	 * @return the vote
	 */
	public String getVote() {
		return vote;
	}

	/**
	 * @param vote
	 *            the vote to set
	 */
	public void setVote(String vote) {
		this.vote = vote;
	}

	/**
	 * @return the dtime
	 */
	public Date getDtime() {
		return dtime;
	}

	/**
	 * @param dtime
	 *            the dtime to set
	 */
	public void setDtime(Date dtime) {
		this.dtime = dtime;
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

}
