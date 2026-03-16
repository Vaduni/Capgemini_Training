package com.gal.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gal.model.Training;

public interface TrainingRepository extends JpaRepository<Training,Integer>{

    List<Training> findByTopicContainingIgnoreCase(String name);

    List<Training> findByTopicContainingIgnoreCaseAndStartDateAfter(String name, LocalDate date);

}