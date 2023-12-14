package com.two.webapp.moneysaved.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.two.webapp.moneysaved.model.Type;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name="DEPENSE")
public class DepenseEntity {
	
	/** The id. */
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	/** The utilisateur. */
	@ManyToOne
    @JoinColumn(name = "UTILISATEUR_ID")
	private UtilisateurEntity utilisateur;
	
	@OneToMany(mappedBy="depense")
	@Column(name="DETAIL_ID")
	private List<DetailDepenseEntity> listDetail = new ArrayList<>();
	
	/** The title. */
	@Column(name="TITLE")
	private String title;
	
	/** The montant. */
	@Column(precision = 9,name="MONTANT")
	private Float montant;
	
	/** The date. */
	@Column(name="DATE")
	private LocalDate date;
	
	/** The type. */
	@Enumerated(EnumType.STRING)
	@Column(name="TYPE")
	private Type type;
	
	/** The category. */
    @ManyToOne
    @JoinColumn(name = "CATEGORIE_ID")
    private CategorieEntity category;
	
	/** The tag. */
	@ManyToMany
	@JoinTable(
	        name="DEPENSE_TAG",
	        joinColumns=
	            @JoinColumn(name="DEPENSE_ID", referencedColumnName="ID"),
	        inverseJoinColumns=
	            @JoinColumn(name="TAG_ID", referencedColumnName="ID")
	    )
	private List<TagEntity> tags;
	
	@Column(name="STORE_NAME")
	private String storeName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UtilisateurEntity getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurEntity utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<DetailDepenseEntity> getListDetail() {
		return listDetail;
	}

	public void setListDetail(List<DetailDepenseEntity> listDetail) {
		this.listDetail = listDetail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Float getMontant() {
		return montant;
	}

	public void setMontant(Float montant) {
		this.montant = montant;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public CategorieEntity getCategory() {
		return category;
	}

	public void setCategory(CategorieEntity category) {
		this.category = category;
	}

	public List<TagEntity> getTags() {
		return tags;
	}

	public void setTags(List<TagEntity> tags) {
		this.tags = tags;
	}

	/**
	 * @return the storeName
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * @param storeName the storeName to set
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	
}
