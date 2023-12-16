package com.FinalExam.fleetms.parameters.repositories;

import com.FinalExam.fleetms.parameters.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
