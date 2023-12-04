/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.EmpTable;

/**
 *
 * @author Purvam Sheth
 */
public class ManageEmployeeData {
    public static ArrayList<EmpTable> getAllUsers(){
        // Generating dummy data
        EmpTable employee1 = new EmpTable();
        employee1.setEID(1);
        employee1.setEmployeeName("John Doe");
        employee1.setDataJoined("2022-01-15");

        EmpTable employee2 = new EmpTable();
        employee2.setEID(2);
        employee2.setEmployeeName("Jane Smith");
        employee2.setDataJoined("2022-02-28");

        EmpTable employee3 = new EmpTable();
        employee3.setEID(3);
        employee3.setEmployeeName("Alice Johnson");
        employee3.setDataJoined("2022-03-10");

        // Creating an ArrayList and adding EmpTable objects
        ArrayList<EmpTable> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        // Returning the ArrayList
        return employeeList;    
    }
    public static void deleteEmployeeStatus(int eid){
        // delete employee based on eid
    }
    public static boolean isEIDUnique(int eid){
        // delete employee based on eid
        return true;
    }
    public static void addUser(int EID, String Name, String CompanyName, String Role, String Password){
     // add user to database .. add fields accordingly
    }
    public static int totalEmplyee(){
        // return total number of employee in ups except managers
        return 7;
    }
    
}
