package com.two.webapp.moneysaved.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="UTILISATEUR")
public class UtilisateurEntity {
	
	/** The id. */
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	/** The nom. */
	@Column(name="NOM")
	private String nom;
	
	/** The prenom. */
	@Column(name="PRENOM")
	private String prenom;
		
	/** The username. */
	@Column(unique=true, name="USERNAME")
	private String username;
	
	/** The email. */
	@Column(unique=true,name="EMAIL")
	private String email;
	
	@Column(unique=true,name="PASSWORD")
	private String password;
	
	
	@OneToMany(mappedBy="utilisateur",targetEntity=BudgetEntity.class)
	private List<BudgetEntity> listBudget = new ArrayList<>();
	
	
	@OneToMany(mappedBy="utilisateur",targetEntity=DepenseEntity.class)
	private List<DepenseEntity> listDepense = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<BudgetEntity> getListBudget() {
		return listBudget;
	}

	public void setListBudget(List<BudgetEntity> listBudget) {
		this.listBudget = listBudget;
	}

	public List<DepenseEntity> getListDepense() {
		return listDepense;
	}

	public void setListDepense(List<DepenseEntity> listDepense) {
		this.listDepense = listDepense;
	}
	

}
