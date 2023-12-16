package com.FinalExam.fleetms.parameters.repositories;

import com.FinalExam.fleetms.parameters.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
