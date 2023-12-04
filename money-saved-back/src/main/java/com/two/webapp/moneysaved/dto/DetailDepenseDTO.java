package com.two.webapp.moneysaved.dto;

public class DetailDepenseDTO {
	/** The id. */
	private Long id;
	
	/** The id depense. */
	private DepenseDTO depense;
	
	/** The article. */
	private String article;
	
	/** The montant. */
	private Float montant;
	
	/** The utile. */
	private Boolean utile;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the depense
	 */
	public DepenseDTO getDepense() {
		return depense;
	}

	/**
	 * @param depense the depense to set
	 */
	public void setDepense(DepenseDTO depense) {
		this.depense = depense;
	}

	/**
	 * @return the article
	 */
	public String getArticle() {
		return article;
	}

	/**
	 * @param article the article to set
	 */
	public void setArticle(String article) {
		this.article = article;
	}

	/**
	 * @return the montant
	 */
	public Float getMontant() {
		return montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(Float montant) {
		this.montant = montant;
	}

	/**
	 * @return the utile
	 */
	public Boolean getUtile() {
		return utile;
	}

	/**
	 * @param utile the utile to set
	 */
	public void setUtile(Boolean utile) {
		this.utile = utile;
	}
	
	
}
