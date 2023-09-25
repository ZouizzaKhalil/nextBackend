package com.example.nextl.bean;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "name", nullable = false)
    private String name;
	
	@Column(name = "email", nullable = false)
    private String email;
	
	@Column(name = "email_verified_at")
    private Date emailVerifiedAt;
	
	@Column(name = "password", nullable = false)
    private String password;
	
	@Column(name = "remember_token", length = 100)
    private String rememberToken;
	
	@Column(name = "created_at")
    private Date createdAt;
	
	@Column(name = "updated_at")
    private Date updatedAt;
	
	@Column(name = "admin", nullable = false)
    private Integer admin;
	
	@Column(name = "editeur", nullable = false)
    private Integer editeur;
	
	@Column(name = "revendeur", nullable = false)
    private Integer revendeur;
	
	@Column(name = "local", nullable = false, length = 30)
    private String local;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Date getEmailVerifiedAt() {
		return emailVerifiedAt;
	}

	public void setEmailVerifiedAt(Date emailVerifiedAt) {
		this.emailVerifiedAt = emailVerifiedAt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRememberToken() {
		return rememberToken;
	}

	public void setRememberToken(String rememberToken) {
		this.rememberToken = rememberToken;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getAdmin() {
		return admin;
	}

	public void setAdmin(Integer admin) {
		this.admin = admin;
	}

	public Integer getEditeur() {
		return editeur;
	}

	public void setEditeur(Integer editeur) {
		this.editeur = editeur;
	}

	public Integer getRevendeur() {
		return revendeur;
	}

	public void setRevendeur(Integer revendeur) {
		this.revendeur = revendeur;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	
	
}
