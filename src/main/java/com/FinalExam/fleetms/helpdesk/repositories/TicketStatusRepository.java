package com.FinalExam.fleetms.helpdesk.repositories;

import com.FinalExam.fleetms.helpdesk.models.TicketStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketStatusRepository extends JpaRepository<TicketStatus, Integer> {

}
