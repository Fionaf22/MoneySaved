package com.two.webapp.moneysaved.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.two.webapp.moneysaved.model.Tag;

public interface TagRepo extends JpaRepository<Tag, Long> {

}
