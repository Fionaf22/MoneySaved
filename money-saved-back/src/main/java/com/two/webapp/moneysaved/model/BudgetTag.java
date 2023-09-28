package com.two.webapp.moneysaved.model;

public class BudgetTag {
	
	/** The id. */
	private Long id;
	
	/** The budget. */
	private Budget budget;
	
	/** The tag. */
	private Tag tag;
	
	/** The depense max. */
	private Float depenseMax;
	
	/** The comment. */
	private String comment;
	
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
	 * Gets the budget.
	 *
	 * @return the budget
	 */
	public Budget getBudget() {
		return budget;
	}
	
	/**
	 * Sets the budget.
	 *
	 * @param budget the new budget
	 */
	public void setBudget(Budget budget) {
		this.budget = budget;
	}
	
	/**
	 * Gets the tag.
	 *
	 * @return the tag
	 */
	public Tag getTag() {
		return tag;
	}
	
	/**
	 * Sets the tag.
	 *
	 * @param tag the new tag
	 */
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	
	/**
	 * Gets the depense max.
	 *
	 * @return the depense max
	 */
	public Float getDepenseMax() {
		return depenseMax;
	}
	
	/**
	 * Sets the depense max.
	 *
	 * @param depenseMax the new depense max
	 */
	public void setDepenseMax(Float depenseMax) {
		this.depenseMax = depenseMax;
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
	
	

	
}
