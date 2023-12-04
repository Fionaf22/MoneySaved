package com.two.webapp.moneysaved.dto;

import java.time.LocalDate;
import java.util.List;

public class DepenseDTO {

	/** The id. */
	private Long id;
	
	/** The user. */
	private UtilisateurDTO utilisateur;
	
	private List<DetailDepenseDTO> listDetail;
	
	/** The title. */
	private String title;
	
	/** The montant. */
	private Float montant;
	
	/** The date. */
	private LocalDate date;
	
	/** The type. */
	private TypeDTO type;
	
	/** The category. */
	private CategorieDTO category;
	
	/** The tag. */
	private List<TagDTO> tags;

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
	 * @return the utilisateur
	 */
	public UtilisateurDTO getUtilisateur() {
		return utilisateur;
	}

	/**
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(UtilisateurDTO utilisateur) {
		this.utilisateur = utilisateur;
	}

	/**
	 * @return the listDetail
	 */
	public List<DetailDepenseDTO> getListDetail() {
		return listDetail;
	}

	/**
	 * @param listDetail the listDetail to set
	 */
	public void setListDetail(List<DetailDepenseDTO> listDetail) {
		this.listDetail = listDetail;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the montant
	 */
	public Float getMontant() {
		return montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(Float montant) {
		this.montant = montant;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the type
	 */
	public TypeDTO getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(TypeDTO type) {
		this.type = type;
	}

	/**
	 * @return the category
	 */
	public CategorieDTO getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(CategorieDTO category) {
		this.category = category;
	}

	/**
	 * @return the tags
	 */
	public List<TagDTO> getTags() {
		return tags;
	}

	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<TagDTO> tags) {
		this.tags = tags;
	}
	
}
