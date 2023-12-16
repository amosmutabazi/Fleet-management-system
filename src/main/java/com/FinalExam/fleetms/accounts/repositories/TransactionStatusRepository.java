package com.FinalExam.fleetms.accounts.repositories;

import com.FinalExam.fleetms.accounts.models.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionStatusRepository extends JpaRepository<TransactionStatus, Integer> {
}
