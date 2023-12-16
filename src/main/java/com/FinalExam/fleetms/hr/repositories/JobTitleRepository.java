package com.FinalExam.fleetms.hr.repositories;

import com.FinalExam.fleetms.hr.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {
}
