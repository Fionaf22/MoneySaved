package com.two.webapp.moneysaved.dto;

import java.time.YearMonth;
import java.util.HashSet;
import java.util.Set;

public class BudgetDTO {
	/** The id. */
	private Long id;
	
	/** The utilisateur. */
	private UtilisateurDTO utilisateur;
	
	/** The month. */
	private YearMonth month;
	
	/** The montant. */
	private Float montant;
	
	/** The comment. */
	private String comment;
	
	private AnalyseBudgetaireDTO analyse;
	private Set<BudgetTagDTO> budgetTags  = new HashSet<>();
	private Set<BudgetCategorieDTO> budgetCategories  = new HashSet<>();
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
	 * @return the utilisateur
	 */
	public UtilisateurDTO getUtilisateur() {
		return utilisateur;
	}
	/**
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(UtilisateurDTO utilisateur) {
		this.utilisateur = utilisateur;
	}
	/**
	 * @return the month
	 */
	public YearMonth getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(YearMonth month) {
		this.month = month;
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
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the analyse
	 */
	public AnalyseBudgetaireDTO getAnalyse() {
		return analyse;
	}
	/**
	 * @param analyse the analyse to set
	 */
	public void setAnalyse(AnalyseBudgetaireDTO analyse) {
		this.analyse = analyse;
	}
	/**
	 * @return the budgetTags
	 */
	public Set<BudgetTagDTO> getBudgetTags() {
		return budgetTags;
	}
	/**
	 * @param budgetTags the budgetTags to set
	 */
	public void setBudgetTags(Set<BudgetTagDTO> budgetTags) {
		this.budgetTags = budgetTags;
	}
	/**
	 * @return the budgetCategories
	 */
	public Set<BudgetCategorieDTO> getBudgetCategories() {
		return budgetCategories;
	}
	/**
	 * @param budgetCategories the budgetCategories to set
	 */
	public void setBudgetCategories(Set<BudgetCategorieDTO> budgetCategories) {
		this.budgetCategories = budgetCategories;
	}
	
	
}
