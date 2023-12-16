package com.FinalExam.fleetms.accounts.repositories;

import com.FinalExam.fleetms.accounts.models.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionTypeRepository extends JpaRepository<TransactionType, Integer> {
}
