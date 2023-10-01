package com.two.webapp.moneysaved.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name="DETAIL_DEPENSE")
public class DetailDepenseEntity {
	
	/** The id. */
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	/** The associated expense. */
	@ManyToOne
	@Column(name="DEPENSE_ID")
	private DepenseEntity depense;
	
	/** The article. */
	@Column(name="ARTICLE")
	private String article;
	
	/** The montant. */
	@Column(precision = 9, scale = 2,name="MONTANT")
	private Float montant;
	
	/** The utile. */
	@Column(name="IS_USEFUL")
	private Boolean utile;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DepenseEntity getDepense() {
		return depense;
	}

	public void setDepense(DepenseEntity depense) {
		this.depense = depense;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public Float getMontant() {
		return montant;
	}

	public void setMontant(Float montant) {
		this.montant = montant;
	}

	public Boolean getUtile() {
		return utile;
	}

	public void setUtile(Boolean utile) {
		this.utile = utile;
	}
	
	

}
