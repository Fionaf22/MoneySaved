package com.two.webapp.moneysaved.model;

import java.util.HashSet;
import java.util.Set;

/**
 * The Class Tag.
 */
public class Tag {
	
	/** The id. */
	private Long id;
	
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;
	
	private Set<BudgetTag> budgetTags  = new HashSet<>();
	
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
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public Set<BudgetTag> getBudgetTags() {
		return budgetTags;
	}

	public void setBudgetTags(Set<BudgetTag> budgetTags) {
		this.budgetTags = budgetTags;
	}

	
}
