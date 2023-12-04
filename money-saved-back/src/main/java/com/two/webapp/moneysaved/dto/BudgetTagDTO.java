package com.two.webapp.moneysaved.dto;

public class BudgetTagDTO {

	/** The id. */
	private Long id;
	
	/** The budget. */
	private BudgetDTO budget;
	
	/** The tag. */
	private TagDTO tag;
	
	/** The depense max. */
	private Float depenseMax;
	
	/** The comment. */
	private String comment;

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
	 * @return the budget
	 */
	public BudgetDTO getBudget() {
		return budget;
	}

	/**
	 * @param budget the budget to set
	 */
	public void setBudget(BudgetDTO budget) {
		this.budget = budget;
	}

	/**
	 * @return the tag
	 */
	public TagDTO getTag() {
		return tag;
	}

	/**
	 * @param tag the tag to set
	 */
	public void setTag(TagDTO tag) {
		this.tag = tag;
	}

	/**
	 * @return the depenseMax
	 */
	public Float getDepenseMax() {
		return depenseMax;
	}

	/**
	 * @param depenseMax the depenseMax to set
	 */
	public void setDepenseMax(Float depenseMax) {
		this.depenseMax = depenseMax;
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
	
	
	
}
