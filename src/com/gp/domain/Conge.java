package com.gp.domain;

// Generated 14 sept. 2014 16:09:18 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Conge generated by hbm2java
 */
@Entity
@Table(name = "conge", catalog = "gp")
public class Conge implements java.io.Serializable {

	private Integer congeId;
	private Salarie salarie;
	private Integer annee;
	private Date datedebut;
	private Date datefin;
	private Integer jourrestant;
	private Integer jourtotal;

	public Conge() {
	}

	public Conge(Salarie salarie, Integer annee, Date datedebut, Date datefin,
			Integer jourrestant, Integer jourtotal) {
		this.salarie = salarie;
		this.annee = annee;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.jourrestant = jourrestant;
		this.jourtotal = jourtotal;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "congeID", unique = true, nullable = false)
	public Integer getCongeId() {
		return this.congeId;
	}

	public void setCongeId(Integer congeId) {
		this.congeId = congeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "salarieID")
	public Salarie getSalarie() {
		return this.salarie;
	}

	public void setSalarie(Salarie salarie) {
		this.salarie = salarie;
	}

	@Column(name = "annee")
	public Integer getAnnee() {
		return this.annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datedebut", length = 10)
	public Date getDatedebut() {
		return this.datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datefin", length = 10)
	public Date getDatefin() {
		return this.datefin;
	}

	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}

	@Column(name = "jourrestant")
	public Integer getJourrestant() {
		return this.jourrestant;
	}

	public void setJourrestant(Integer jourrestant) {
		this.jourrestant = jourrestant;
	}

	@Column(name = "jourtotal")
	public Integer getJourtotal() {
		return this.jourtotal;
	}

	public void setJourtotal(Integer jourtotal) {
		this.jourtotal = jourtotal;
	}

}
