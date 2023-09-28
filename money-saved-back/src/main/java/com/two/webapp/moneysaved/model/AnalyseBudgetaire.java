package com.two.webapp.moneysaved.model;

// TODO: Auto-generated Javadoc
/**
 * The Class AnalyseBudgetaire.
 */
public class AnalyseBudgetaire {

	/** The id. */
	private Long id;
	
	/** The id budget. */
	private Budget budget;
	
	/** The clos. */
	private Boolean clos;
	
	/** The ecart. */
	private Ecart ecart;
	
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
	 * Gets the clos.
	 *
	 * @return the clos
	 */
	public Boolean getClos() {
		return clos;
	}
	
	/**
	 * Sets the clos.
	 *
	 * @param clos the new clos
	 */
	public void setClos(Boolean clos) {
		this.clos = clos;
	}
	
	/**
	 * Gets the ecart.
	 *
	 * @return the ecart
	 */
	public Ecart getEcart() {
		return ecart;
	}
	
	/**
	 * Sets the ecart.
	 *
	 * @param ecart the new ecart
	 */
	public void setEcart(Ecart ecart) {
		this.ecart = ecart;
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
	
	
}
