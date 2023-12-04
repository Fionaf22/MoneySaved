package com.two.webapp.moneysaved.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.two.webapp.moneysaved.model.Utilisateur;

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Long> {

}
