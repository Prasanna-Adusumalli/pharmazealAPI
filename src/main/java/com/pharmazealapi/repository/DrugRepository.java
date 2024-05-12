package com.pharmazealapi.repository;

import com.pharmazealapi.entity.Drug;
import com.pharmazealapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DrugRepository extends JpaRepository<Drug,String> {
}