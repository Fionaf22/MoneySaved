package com.two.webapp.moneysaved.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.two.webapp.moneysaved.model.Budget;

public interface BudgetRepo extends JpaRepository<Budget, Long> {


}
