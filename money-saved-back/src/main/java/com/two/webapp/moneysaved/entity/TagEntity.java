package com.two.webapp.moneysaved.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="TAG")
public class TagEntity {
	/** The id. */
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	/** The name. */
	@Column(name="NAME")
	private String name;
	
	/** The description. */
	@Column(name="DESCRIPTION")
	private String description;
	
	@OneToMany(mappedBy="tag")
	private Set<BudgetTagEntity> budgetTags  = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<BudgetTagEntity> getBudgetTags() {
		return budgetTags;
	}

	public void setBudgetTags(Set<BudgetTagEntity> budgetTags) {
		this.budgetTags = budgetTags;
	}


}
