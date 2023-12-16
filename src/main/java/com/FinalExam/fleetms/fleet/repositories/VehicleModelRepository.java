package com.FinalExam.fleetms.fleet.repositories;

import com.FinalExam.fleetms.fleet.models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
