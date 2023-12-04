package com.two.webapp.moneysaved.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.two.webapp.moneysaved.model.BudgetTag;

public interface BudgetTagRepo extends JpaRepository<BudgetTag, Long> {

}
