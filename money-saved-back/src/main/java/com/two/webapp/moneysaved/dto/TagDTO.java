package com.two.webapp.moneysaved.dto;

import java.util.HashSet;
import java.util.Set;

public class TagDTO {

	/** The id. */
	private Long id;
	
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;
	
	private Set<BudgetTagDTO> budgetTags  = new HashSet<>();

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
	
	
}
