package com.two.webapp.moneysaved.model;

import java.time.YearMonth;

// TODO: Auto-generated Javadoc
/**
 * The Class Budget.
 */
public class Budget {
	
	/** The id. */
	private Long id;
	
	/** The utilisateur. */
	private Utilisateur utilisateur;
	
	/** The month. */
	private YearMonth month;
	
	/** The montant. */
	private Float montant;
	
	/** The comment. */
	private String comment;
	
	private AnalyseBudgetaire analyse;
	
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
	
	/**
	 * Gets the utilisateur.
	 *
	 * @return the utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	
	/**
	 * Sets the utilisateur.
	 *
	 * @param utilisateur the new utilisateur
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	/**
	 * Gets the month.
	 *
	 * @return the month
	 */
	public YearMonth getMonth() {
		return month;
	}
	
	/**
	 * Sets the month.
	 *
	 * @param month the new month
	 */
	public void setMonth(YearMonth month) {
		this.month = month;
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
	 * Gets the comment.
	 *
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	
	/**
	 * Sets the comment.
	 *
	 * @param comment the new comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	public AnalyseBudgetaire getAnalyse() {
		return analyse;
	}

	public void setAnalyse(AnalyseBudgetaire analyse) {
		this.analyse = analyse;
	}
	
	
}
