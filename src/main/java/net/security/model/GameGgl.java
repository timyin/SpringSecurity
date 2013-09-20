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
@Table(name = "game_ggl")
public class GameGgl implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2716845571667983985L;

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "picurl")
	private String picurl;

	@Column(name = "content")
	private String content;

	@Column(name = "help_content")
	private String helpContent;

	@Column(name = "constant")
	private int constant;

	@Column(name = "status")
	private String status;

	@Column(name = "accountid")
	private Long accountid;

	@Column(name = "createtime")
	private Date createtime;

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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the picurl
	 */
	public String getPicurl() {
		return picurl;
	}

	/**
	 * @param picurl
	 *            the picurl to set
	 */
	public void setPicurl(String picurl) {
		this.picurl = picurl;
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

	/**
	 * @return the helpContent
	 */
	public String getHelpContent() {
		return helpContent;
	}

	/**
	 * @param helpContent
	 *            the helpContent to set
	 */
	public void setHelpContent(String helpContent) {
		this.helpContent = helpContent;
	}

	/**
	 * @return the constant
	 */
	public int getConstant() {
		return constant;
	}

	/**
	 * @param constant
	 *            the constant to set
	 */
	public void setConstant(int constant) {
		this.constant = constant;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the accountid
	 */
	public Long getAccountid() {
		return accountid;
	}

	/**
	 * @param accountid
	 *            the accountid to set
	 */
	public void setAccountid(Long accountid) {
		this.accountid = accountid;
	}

	/**
	 * @return the createtime
	 */
	public Date getCreatetime() {
		return createtime;
	}

	/**
	 * @param createtime
	 *            the createtime to set
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
