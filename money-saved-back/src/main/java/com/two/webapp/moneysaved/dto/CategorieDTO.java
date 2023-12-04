package com.two.webapp.moneysaved.dto;

import java.util.HashSet;
import java.util.Set;

public class CategorieDTO {

	/** The id. */
	private Long id;
	
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;
	
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
