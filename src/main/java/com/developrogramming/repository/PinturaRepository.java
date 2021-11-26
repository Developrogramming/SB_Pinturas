package com.developrogramming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developrogramming.model.Pintura;

@Repository
public interface PinturaRepository extends JpaRepository<Pintura, Long> {

}
