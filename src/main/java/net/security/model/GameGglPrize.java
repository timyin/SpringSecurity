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
@Table(name = "game_ggl_prize")
public class GameGglPrize implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8198302948069431453L;

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	@Column(name = "browserseq")
	private String browserSeq;

	@Column(name = "prize")
	private int prize;

	@Column(name = "gamegglid")
	private int gameGglId;

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
	 * @return the prize
	 */
	public int getPrize() {
		return prize;
	}

	/**
	 * @param prize
	 *            the prize to set
	 */
	public void setPrize(int prize) {
		this.prize = prize;
	}

	/**
	 * @return the gameGglId
	 */
	public int getGameGglId() {
		return gameGglId;
	}

	/**
	 * @param gameGglId
	 *            the gameGglId to set
	 */
	public void setGameGglId(int gameGglId) {
		this.gameGglId = gameGglId;
	}

}
