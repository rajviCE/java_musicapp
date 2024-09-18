package com.javaproject.musicapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
@Entity
public class Authorities {

	//@OneToOne
    //@JoinColumn(name = "user_role", nullable = false)
	@Column(name="authority")
    private String role;
	
//	@Id
//	@OneToOne
//  @JoinColumn(name = "username", nullable = false)
	@Id
	@Column(name="username")
	private String user;


	public Authorities( String role, String user) {
		super();
		
		this.role = role;
		this.user = user;
	}


	public Authorities() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}
	
	
	


}

