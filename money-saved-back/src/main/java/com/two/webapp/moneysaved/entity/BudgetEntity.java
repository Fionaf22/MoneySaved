package com.two.webapp.moneysaved.entity;

import java.time.YearMonth;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name="BUDGET")
public class BudgetEntity {
	
	/** The id. */
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	/** The utilisateur. */
	@ManyToOne
	@JoinColumn(name = "UTILISATEUR_ID")
	private UtilisateurEntity utilisateur;
	
	/** The month. */
	@Column(name="MONTH")
	private YearMonth month;
	
	/** The montant. */
	@Column(precision = 9,name="MONTANT")
	private Float montant;
	
	/** The comment. */
	@Column(name="COMMENT")
	private String comment;
	
	
	@OneToOne(mappedBy="budget")
	private AnalyseBudgetaireEntity analyse;
	
	@OneToMany(mappedBy="budget")
	private Set<BudgetCategorieEntity> budgetCategories  = new HashSet<>();
	
	@OneToMany(mappedBy="budget")
	private Set<BudgetTagEntity> budgetTags  = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UtilisateurEntity getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurEntity utilisateur) {
		this.utilisateur = utilisateur;
	}

	public YearMonth getMonth() {
		return month;
	}

	public void setMonth(YearMonth month) {
		this.month = month;
	}

	public Float getMontant() {
		return montant;
	}

	public void setMontant(Float montant) {
		this.montant = montant;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public AnalyseBudgetaireEntity getAnalyse() {
		return analyse;
	}

	public void setAnalyse(AnalyseBudgetaireEntity analyse) {
		this.analyse = analyse;
	}

	public Set<BudgetCategorieEntity> getBudgetCategories() {
		return budgetCategories;
	}

	public void setBudgetCategories(Set<BudgetCategorieEntity> budgetCategories) {
		this.budgetCategories = budgetCategories;
	}

	public Set<BudgetTagEntity> getBudgetTags() {
		return budgetTags;
	}

	public void setBudgetTags(Set<BudgetTagEntity> budgetTags) {
		this.budgetTags = budgetTags;
	}

	
}
