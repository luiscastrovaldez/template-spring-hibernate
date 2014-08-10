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
	private Timestamp dateCreated;
	private Timestamp dateUpdated;

	public User() {

	}

	public User(String userName, String password, Timestamp dateCreated,
			Timestamp dateUpdated) {
		super();
		this.userName = userName;
		this.password = password;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
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

	public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Timestamp dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

}
