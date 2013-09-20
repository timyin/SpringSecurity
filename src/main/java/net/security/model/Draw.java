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
@Table(name = "draw")
public class Draw implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2594114184806143985L;

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	@Column(name = "drawtype")
	private int drawType;

	@Column(name = "drawnum")
	private int drawNum;

	@Column(name = "nowdo")
	private int nowDo;

	@Column(name = "drawname")
	private String drawName;

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
	 * @return the drawType
	 */
	public int getDrawType() {
		return drawType;
	}

	/**
	 * @param drawType
	 *            the drawType to set
	 */
	public void setDrawType(int drawType) {
		this.drawType = drawType;
	}

	/**
	 * @return the drawNum
	 */
	public int getDrawNum() {
		return drawNum;
	}

	/**
	 * @param drawNum
	 *            the drawNum to set
	 */
	public void setDrawNum(int drawNum) {
		this.drawNum = drawNum;
	}

	/**
	 * @return the nowDo
	 */
	public int getNowDo() {
		return nowDo;
	}

	/**
	 * @param nowDo
	 *            the nowDo to set
	 */
	public void setNowDo(int nowDo) {
		this.nowDo = nowDo;
	}

	/**
	 * @return the drawName
	 */
	public String getDrawName() {
		return drawName;
	}

	/**
	 * @param drawName
	 *            the drawName to set
	 */
	public void setDrawName(String drawName) {
		this.drawName = drawName;
	}

}
