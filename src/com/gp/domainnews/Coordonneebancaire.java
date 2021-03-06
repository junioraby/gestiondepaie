package com.gp.domainnews;

<<<<<<< HEAD:src/com/gp/domainnews/Coordonneebancaire.java
// Generated 26 sept. 2014 14:49:21 by Hibernate Tools 3.4.0.CR1
=======
// Generated 13 oct. 2014 17:42:27 by Hibernate Tools 3.4.0.CR1
>>>>>>> n-theme:src/com/gp/domainnews/Coordonneebancaire.java

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Coordonneebancaire generated by hbm2java
 */
@Entity
@Table(name = "coordonneebancaire", catalog = "gp")
public class Coordonneebancaire implements java.io.Serializable {

	private Integer coordoneebancaireId;
	private String agence;
	private String banque;
	private String compte;
	private String libellecompte;
	private Set<Salarie> salaries = new HashSet<Salarie>(0);

	public Coordonneebancaire() {
	}

	public Coordonneebancaire(String agence, String banque, String compte,
			String libellecompte, Set<Salarie> salaries) {
		this.agence = agence;
		this.banque = banque;
		this.compte = compte;
		this.libellecompte = libellecompte;
		this.salaries = salaries;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "coordoneebancaireID", unique = true, nullable = false)
	public Integer getCoordoneebancaireId() {
		return this.coordoneebancaireId;
	}

	public void setCoordoneebancaireId(Integer coordoneebancaireId) {
		this.coordoneebancaireId = coordoneebancaireId;
	}

	@Column(name = "agence")
	public String getAgence() {
		return this.agence;
	}

	public void setAgence(String agence) {
		this.agence = agence;
	}

	@Column(name = "banque")
	public String getBanque() {
		return this.banque;
	}

	public void setBanque(String banque) {
		this.banque = banque;
	}

	@Column(name = "compte")
	public String getCompte() {
		return this.compte;
	}

	public void setCompte(String compte) {
		this.compte = compte;
	}

	@Column(name = "libellecompte")
	public String getLibellecompte() {
		return this.libellecompte;
	}

	public void setLibellecompte(String libellecompte) {
		this.libellecompte = libellecompte;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coordonneebancaire")
	public Set<Salarie> getSalaries() {
		return this.salaries;
	}

	public void setSalaries(Set<Salarie> salaries) {
		this.salaries = salaries;
	}

}
