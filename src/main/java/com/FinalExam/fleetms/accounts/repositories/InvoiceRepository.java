package com.FinalExam.fleetms.accounts.repositories;

import com.FinalExam.fleetms.accounts.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
