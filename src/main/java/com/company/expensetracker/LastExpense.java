/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.expensetracker;

/**
 *
 * @author User
 */
public class LastExpense extends Expense {
    DataHandler handleData = new DataHandler();
    String[] expenseData;
    
    @Override
    public String retrieveLastName() {
            String[] allData = handleData.readExpenses();
            
            expenseData = allData[allData.length - 1].split(",");
            
        return expenseData[0];
    }
    
}
