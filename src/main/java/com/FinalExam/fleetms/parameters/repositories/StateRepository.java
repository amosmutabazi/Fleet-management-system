package com.FinalExam.fleetms.parameters.repositories;

import com.FinalExam.fleetms.parameters.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
