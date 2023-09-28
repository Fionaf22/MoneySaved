package com.two.webapp.moneysaved.model;

import java.time.LocalDate;

// TODO: Auto-generated Javadoc
/**
 * The Class Depense.
 */
public class Depense {
	
	/** The id. */
	private Long id;
	
	/** The id utilisateur. */
	private Long idUtilisateur;
	
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
	private Tag tag;
	
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
	 * Gets the id utilisateur.
	 *
	 * @return the id utilisateur
	 */
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}
	
	/**
	 * Sets the id utilisateur.
	 *
	 * @param idUtilisateur the new id utilisateur
	 */
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
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
