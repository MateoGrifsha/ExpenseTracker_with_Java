/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.expensetracker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author User
 */
public class DataHandler {
       //path to "DB
        String userInfoPath ="C:\\Users\\User\\Documents\\NetBeansProjects\\ExpenseTracker\\src\\main\\java\\com\\company\\expensetracker\\UserInfo.txt" ;
        String expensePath = "C:\\Users\\User\\Documents\\NetBeansProjects\\ExpenseTracker\\src\\main\\java\\com\\company\\expensetracker\\Expenses.txt";
            
        public boolean isFileEmpty(String path){
            try{
                BufferedReader br = new BufferedReader(new FileReader(path));
                return br.readLine() == null;
            }
            catch(Exception error){
                error.printStackTrace();
                return false;
            }
        }

        //Writes in the text file the new data AND/OR checks if the file is already written in or not
        public void writeInDB(String username, String password, String budget, String currency){      
            try{
                //reads from file and checks if it is empty or no
                if(isFileEmpty(userInfoPath)){
                    String[] data = {username, password, budget, currency};
                    FileWriter fw = new FileWriter(userInfoPath);
                    for (int i = 0; i < 4; i++) {
                        fw.write(data[i] + "\n");
                 }//end for
                System.out.println("Data written in DB!");
                fw.close();
                }//end if
                else{ // the file is not empty
                    System.out.println("The DB already has data in it!");
                }  // end else
            } // end try
            catch(IOException error){
                error.printStackTrace();
                System.out.println("The data could not be written!");
            }//end catch
        }//end function writeInDB
        
        public String returnElementFromDB(int index){
            String[] readData = new String[4];
            try{
                BufferedReader br = new BufferedReader(new FileReader(userInfoPath));
                            String line = br.readLine();
                            int count = 0;
                            while(line != null){
                                readData[count]= line;
                                count++;
                                line = br.readLine();
                            }
                            br.close();
            }            
            catch(IOException error){
                error.printStackTrace();
                System.out.println("Couldn't read data!");
            }//end catch
            
            return readData[index];
        }
        
        public void addExpense(String name, String amount, String date){
            try{
                FileWriter fw = new FileWriter(expensePath);
                String dataToWrite=name + "," + amount + "," + date + "\n";
                fw.write(dataToWrite);
                System.out.println("Data written in DB!");
                fw.close();
            } // end try
            catch(IOException error){
                error.printStackTrace();
                System.out.println("The data could not be written!");
            }//end catch
        }
        
        public String[] readExpenses(){
            String[] dataExtracted = null;
            try(BufferedReader br = new BufferedReader(new FileReader(expensePath))){
                String line;
            while ((line = br.readLine()) != null) {
                dataExtracted = line.split(",");
                String name = dataExtracted[0];
                String amount = dataExtracted[1];
                String date = dataExtracted[2];
            }
            }
            catch(IOException error){
                error.printStackTrace();
            }
            return dataExtracted;
        }
        
}
