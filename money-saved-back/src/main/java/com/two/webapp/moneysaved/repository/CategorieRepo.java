package com.two.webapp.moneysaved.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.two.webapp.moneysaved.model.Categorie;

public interface CategorieRepo extends JpaRepository<Categorie, Long> {

}
