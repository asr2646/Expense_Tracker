package com.itshaala.expensetracker.controller;

import com.itshaala.expensetracker.model.ExpenseModel;
import com.itshaala.expensetracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping
    public ExpenseModel addExpenses(@RequestBody ExpenseModel expense) {
        return expenseService.saveExpense(expense);
    }

    @GetMapping
    public List<ExpenseModel> getExpenses() {
        return expenseService.getAllExpenses();
    }

    @DeleteMapping("/{id}")
    public String deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
        return "Expense deleted with ID: " + id;
    }
}
