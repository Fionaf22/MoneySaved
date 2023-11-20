package com.two.webapp.moneysaved.model;

import java.util.HashSet;
import java.util.Set;

public class Categorie {
	/** The id. */
	private Long id;
	
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;
	
	private Set<BudgetCategorie> budgetCategories  = new HashSet<>();
	
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

	public Set<BudgetCategorie> getBudgetCategories() {
		return budgetCategories;
	}

	public void setBudgetCategories(Set<BudgetCategorie> budgetCategories) {
		this.budgetCategories = budgetCategories;
	}

	

}
