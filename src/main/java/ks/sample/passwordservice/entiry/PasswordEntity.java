package ks.sample.passwordservice.entiry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pwd_holder")
public class PasswordEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String userName;
	private String password;
	private String name;

	private String email;

	public PasswordEntity() {
		super();
	}
	
	
	
	public PasswordEntity(String userName, String password, String name, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.email = email;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "PasswordEntity [id=" + id + ", userName=" + userName + ", password=" + password + ", name=" + name
				+ ", email=" + email + "]";
	}
	
	

}
