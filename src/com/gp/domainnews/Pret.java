package com.gp.domainnews;

// Generated 13 oct. 2014 17:42:27 by Hibernate Tools 3.4.0.CR1

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
 * Pret generated by hbm2java
 */
@Entity
@Table(name = "pret", catalog = "gp")
public class Pret implements java.io.Serializable {

	private Integer pretId;
	private Float montant;
	private Integer ordrevirementId;
	private Set<Ordrevirement> ordrevirements = new HashSet<Ordrevirement>(0);

	public Pret() {
	}

	public Pret(Float montant, Integer ordrevirementId,
			Set<Ordrevirement> ordrevirements) {
		this.montant = montant;
		this.ordrevirementId = ordrevirementId;
		this.ordrevirements = ordrevirements;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "pretID", unique = true, nullable = false)
	public Integer getPretId() {
		return this.pretId;
	}

	public void setPretId(Integer pretId) {
		this.pretId = pretId;
	}

	@Column(name = "montant", precision = 12, scale = 0)
	public Float getMontant() {
		return this.montant;
	}

	public void setMontant(Float montant) {
		this.montant = montant;
	}

	@Column(name = "ordrevirementID")
	public Integer getOrdrevirementId() {
		return this.ordrevirementId;
	}

	public void setOrdrevirementId(Integer ordrevirementId) {
		this.ordrevirementId = ordrevirementId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pret")
	public Set<Ordrevirement> getOrdrevirements() {
		return this.ordrevirements;
	}

	public void setOrdrevirements(Set<Ordrevirement> ordrevirements) {
		this.ordrevirements = ordrevirements;
	}

}
