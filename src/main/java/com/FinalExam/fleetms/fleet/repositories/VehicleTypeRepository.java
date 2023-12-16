package com.FinalExam.fleetms.fleet.repositories;

import com.FinalExam.fleetms.fleet.models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
