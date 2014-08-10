package pe.com.template.core.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 
 * @author lcastro
 * 
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7349107116457247403L;
	private Long id;
	private String userName;
	private String password;
	private Timestamp creationDate;

	public User() {

	}

	public User(Long id, String userName, String password,
			Timestamp creationDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.creationDate = creationDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

}
