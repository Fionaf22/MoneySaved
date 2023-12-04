package com.two.webapp.moneysaved.model;


/**
 * The Class DetailDepense.
 */
public class DetailDepense {
	/** The id. */
	private Long id;
	
	/** The id depense. */
	private Depense depense;
	
	/** The article. */
	private String article;
	
	/** The montant. */
	private Float montant;
	
	/** The utile. */
	private Boolean utile;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Depense getDepense() {
		return depense;
	}

	public void setDepense(Depense depense) {
		this.depense = depense;
	}

	/**
	 * Gets the article.
	 *
	 * @return the article
	 */
	public String getArticle() {
		return article;
	}
	
	/**
	 * Sets the article.
	 *
	 * @param article the new article
	 */
	public void setArticle(String article) {
		this.article = article;
	}
	
	/**
	 * Gets the montant.
	 *
	 * @return the montant
	 */
	public Float getMontant() {
		return montant;
	}
	
	/**
	 * Sets the montant.
	 *
	 * @param montant the new montant
	 */
	public void setMontant(Float montant) {
		this.montant = montant;
	}
	
	/**
	 * Gets the utile.
	 *
	 * @return the utile
	 */
	public Boolean getUtile() {
		return utile;
	}
	
	/**
	 * Sets the utile.
	 *
	 * @param utile the new utile
	 */
	public void setUtile(Boolean utile) {
		this.utile = utile;
	}
	
	
}
