package com.FinalExam.fleetms.accounts.repositories;

import com.FinalExam.fleetms.accounts.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
