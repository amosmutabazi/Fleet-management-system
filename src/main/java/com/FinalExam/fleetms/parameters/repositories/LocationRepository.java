package com.FinalExam.fleetms.parameters.repositories;

import com.FinalExam.fleetms.parameters.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
