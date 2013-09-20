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
@Table(name = "test")
public class Test implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3527361819572918691L;

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	@Column(name = "t")
	private String t;

}
