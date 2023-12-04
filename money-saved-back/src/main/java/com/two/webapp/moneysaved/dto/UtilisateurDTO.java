package com.two.webapp.moneysaved.dto;

import java.util.List;

public class UtilisateurDTO {
	/** The id. */
	private Long id;
	
	/** The nom. */
	private String nom;
	
	/** The prenom. */
	private String prenom;
	
	/** The username. */
	private String username;
	
	/** The email. */
	private String email;
	
	/** The password. */
	private String password;
	
	private List<BudgetDTO> listBudget;
	private List<DepenseDTO> listDepense;
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the listBudget
	 */
	public List<BudgetDTO> getListBudget() {
		return listBudget;
	}
	/**
	 * @param listBudget the listBudget to set
	 */
	public void setListBudget(List<BudgetDTO> listBudget) {
		this.listBudget = listBudget;
	}
	/**
	 * @return the listDepense
	 */
	public List<DepenseDTO> getListDepense() {
		return listDepense;
	}
	/**
	 * @param listDepense the listDepense to set
	 */
	public void setListDepense(List<DepenseDTO> listDepense) {
		this.listDepense = listDepense;
	}
	
	

}
