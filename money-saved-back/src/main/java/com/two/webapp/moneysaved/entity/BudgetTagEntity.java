package com.two.webapp.moneysaved.entity;

import com.two.webapp.moneysaved.model.Budget;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="BUDGET_TAG")
public class BudgetTagEntity {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="BUDGET_ID")
	private Budget budget;
	
	/** The tag. */
	@ManyToOne
	@JoinColumn(name="TAG_ID")
	private TagEntity tag;
	
	/** The depense max. */
	@Column(precision = 9, scale = 2,name="DEPENSE_MAX")
	private Float depenseMax;
	
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

	public TagEntity getTag() {
		return tag;
	}

	public void setTag(TagEntity tag) {
		this.tag = tag;
	}

	public Float getDepenseMax() {
		return depenseMax;
	}

	public void setDepenseMax(Float depenseMax) {
		this.depenseMax = depenseMax;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	

}
