package com.codingTechV2.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	private String password;
	@ManyToMany(fetch = FetchType.EAGER )
	@JoinTable(
		    name = "user_role",
		    joinColumns = @JoinColumn(name = "id_user"),
		    inverseJoinColumns = @JoinColumn(name = "id_role"))
	 @JsonManagedReference
	private List<Role> roles;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public User(String username, String password, List<Role> roles) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
	}
	public User() {
		super();
	}
	
	
	
}
