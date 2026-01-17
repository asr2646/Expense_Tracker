package com.itshaala.expensetracker.service;

import com.itshaala.expensetracker.dao.ExpenseDao;
import com.itshaala.expensetracker.model.ExpenseModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    private final ExpenseDao expenseDao;

    public ExpenseService(ExpenseDao expenseDao) {
        this.expenseDao = expenseDao;
    }

    public ExpenseModel saveExpense(ExpenseModel expense){
        return expenseDao.save(expense);

    }
    public void deleteExpense(Long id){
        expenseDao.deleteById(id);
    }

    public List<ExpenseModel> getAllExpenses() {
        return  expenseDao.findAll();
    }
}
