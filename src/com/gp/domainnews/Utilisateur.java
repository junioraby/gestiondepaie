package com.gp.domainnews;

// Generated 11 oct. 2014 11:17:51 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Utilisateur generated by hbm2java
 */
@Entity
@Table(name = "utilisateur", catalog = "gp", uniqueConstraints = @UniqueConstraint(columnNames = "login"))
public class Utilisateur implements java.io.Serializable {

	private Integer utilisateurId;
	private Societe societe;
	private Role role;
	private String login;
	private String motdepasse;
	private boolean enabled;

	public Utilisateur() {
	}

	public Utilisateur(Role role, String login, String motdepasse,
			boolean enabled) {
		this.role = role;
		this.login = login;
		this.motdepasse = motdepasse;
		this.enabled = enabled;
	}

	public Utilisateur(Societe societe, Role role, String login,
			String motdepasse, boolean enabled) {
		this.societe = societe;
		this.role = role;
		this.login = login;
		this.motdepasse = motdepasse;
		this.enabled = enabled;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "utilisateurID", unique = true, nullable = false)
	public Integer getUtilisateurId() {
		return this.utilisateurId;
	}

	public void setUtilisateurId(Integer utilisateurId) {
		this.utilisateurId = utilisateurId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "societeID")
	public Societe getSociete() {
		return this.societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roleID", nullable = false)
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Column(name = "login", unique = true, nullable = false, length = 200)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "motdepasse", nullable = false, length = 200)
	public String getMotdepasse() {
		return this.motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

	@Column(name = "enabled", nullable = false)
	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
