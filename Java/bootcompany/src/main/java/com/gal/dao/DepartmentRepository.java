package com.gal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gal.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
	 @Query("from Department d where d.depname = :depname")
Department findByName(String name);
}
