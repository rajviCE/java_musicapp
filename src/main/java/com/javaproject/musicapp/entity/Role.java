//package com.javaproject.musicapp.entity;
//
//import java.util.List;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import jakarta.persistence.*;
//
//@Entity
//public class Role
//{
//	public Role(){}
//	public Role(int roleid, String rolename/*, String password*/, List<User> users) {
//		super();
//		Roleid = roleid;
//		Rolename = rolename;
//		//this.password = password;
//		this.users = users;
//	}
//
//
//
//
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="id")
//	private int Roleid;
//
//	@Column(name="Role_name")
//	private String Rolename;
//
////	@Column(name="password")
////	private String password;
//
//	@OneToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},mappedBy="u_role")
//	@JsonIgnoreProperties("u_role")
//	private List<User> users;
//
//
//
//	public List<User> getUsers() {
//		return users;
//	}
//	public void setUsers(List<User> users) {
//		this.users = users;
//	}
//	public int getRoleid() {
//		return Roleid;
//	}
//
//
//	public void setRoleid(int roleid) {
//		Roleid = roleid;
//	}
//
//	public String getRolename() {
//		return Rolename;
//	}
//
//	public void setRolename(String rolename) {
//		Rolename = rolename;
//	}
//
////	public String getPassword() {
////		return password;
////	}
////
////	public void setPassword(String password) {
////		this.password = password;
////	}
//	@Override
//	public String toString() {
//		return "Role [Roleid=" + Roleid + ", Rolename=" + Rolename + /*", password=" + password +*/ ", users=" + users
//				+ "]";
//	}
//}