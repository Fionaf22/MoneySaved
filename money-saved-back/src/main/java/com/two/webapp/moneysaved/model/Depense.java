package com.two.webapp.moneysaved.model;

import java.time.LocalDate;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Depense.
 */
public class Depense {
	
	/** The id. */
	private Long id;
	
	/** The user. */
	private Utilisateur utilisateur;
	
	/** The title. */
	private String title;
	
	/** The montant. */
	private Float montant;
	
	/** The date. */
	private LocalDate date;
	
	/** The type. */
	private Type type;
	
	/** The category. */
	private Categorie category;
	
	/** The tag. */
	private List<Tag> tags;
	
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
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Gets the montant.
	 *
	 * @return the montant
	 */
	public Float getMontant() {
		return montant;
	}
	
	/**
	 * Sets the montant.
	 *
	 * @param montant the new montant
	 */
	public void setMontant(Float montant) {
		this.montant = montant;
	}
	
	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}
	
	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public Categorie getCategory() {
		return category;
	}
	
	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(Categorie category) {
		this.category = category;
	}
	
	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public Type getType() {
		return type;
	}
	
	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(Type type) {
		this.type = type;
	}
	
}
