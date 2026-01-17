package com.itshaala.expensetracker.dao;

import com.itshaala.expensetracker.model.ExpenseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseDao extends JpaRepository<ExpenseModel, Long> {
}
