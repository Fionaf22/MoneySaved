package com.two.webapp.moneysaved.entity;

import com.two.webapp.moneysaved.model.Budget;
import com.two.webapp.moneysaved.model.Ecart;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name="ANALYSE_BUDGETAIRE")
public class AnalyseBudgetaireEntity {
	
	/** The id. */
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	/** The id budget. */
	@OneToOne
	@Column(name="BUDGET_ID")
	private Budget budget;
	
	/** The clos. */
	@Column(name="IS_CLOS")
	private Boolean clos;
	
	/** The ecart. */
	@Enumerated(EnumType.STRING)
	@Column(name="ECART")
	private Ecart ecart;
	
	/** The comment. */
	@Column(name="COMMENT")
	private String comment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Budget getBudget() {
		return budget;
	}

	public void setBudget(Budget budget) {
		this.budget = budget;
	}

	public Boolean getClos() {
		return clos;
	}

	public void setClos(Boolean clos) {
		this.clos = clos;
	}

	public Ecart getEcart() {
		return ecart;
	}

	public void setEcart(Ecart ecart) {
		this.ecart = ecart;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	
}
