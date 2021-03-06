package com.filrouge.poe.lyon.JPAPOE.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "firstname", length = 50, nullable = false)
	private String firstName;

	@Column(name = "lastname", length = 50, nullable = false)
	private String lastName;

	@Column(name = "LOGIN", length = 15, nullable = false)
	private String login;

	@Column(name = "pwd", length = 10, nullable = false)
	private String password;

	
	@ManyToMany 
	@JoinTable( name="profil_user",  
			joinColumns=@JoinColumn(name="id_user"), 
			inverseJoinColumns=@JoinColumn(name="id_profil") ) 
	private List<Profil> profils; 
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFistName() {
		return firstName;
	}

	public void setFistName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", login=" + login
				+ ", password=" + password + ", profils=" + profils + "]";
	}

	
	
	
	
}
