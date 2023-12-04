package com.two.webapp.moneysaved.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.two.webapp.moneysaved.model.BudgetCategorie;

public interface BudgetCategorieRepo extends JpaRepository<BudgetCategorie, Long> {

}
