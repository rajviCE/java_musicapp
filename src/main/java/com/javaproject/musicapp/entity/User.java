package com.javaproject.musicapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
@Entity
@Table(name="users")
public class User 
{
	
	@Id
	@Column(name="id",unique=true)//if needed comment
	@GeneratedValue(strategy=GenerationType.IDENTITY)//
	private int userid;
	
	//@Id
	@Column(name="username",unique=true)
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
		
	@Column(name="age")
	private String age;
	
	@Column(name="gender")
	private String gender;
	@Column(name="enabled")
	private boolean enabled;
	

	
//	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
//	@JsonIgnoreProperties("users")
//	@JoinColumn(name="user_role_id",nullable=false)
//	private Role u_role;
	
	@Column(name="user_role")
	private String u_role;


	@Column(name="recently_played")
	private String r_playedmusic_name;
	// define constructors

	public User() {

	}


	public User(int userid, String username, String password, String email, String age, String gender, String u_role,
			String r_playedmusic_name,boolean enabled) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.u_role = u_role;
		this.r_playedmusic_name = r_playedmusic_name;
		this.enabled=enabled;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}

	public boolean getenabled() {
		enabled=true;
		return enabled;
	}


	public void setenabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	

//	public Role getU_role() {
//		return u_role;
//	}
//
//
//	public void setU_role(Role u_role) {
//		this.u_role = u_role;
//	}
	
	public String getU_role() {
		return u_role;
	}


	public void setU_role(String u_role) {
		this.u_role = u_role;
	}


	public String getR_playedmusic_name() {
		return r_playedmusic_name;
	}


	public void setR_playedmusic_name(String r_playedmusic_name) {
		this.r_playedmusic_name = r_playedmusic_name;
	}


	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", age=" + age + ", gender=" + gender + ", u_role=" + u_role + ", r_playedmusic_name="
				+ r_playedmusic_name + "]";
	}
}












