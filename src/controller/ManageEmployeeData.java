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
        return utils.db_connector.getallusers_upsManager();    
    }
    public static void deleteEmployeeStatus(int eid){
        // delete employee based on eid
        utils.db_connector.deleteEmployeeStatus_upsmanager(eid);
    }
    public static boolean isEIDUnique(int eid){
        // delete employee based on eid
        return utils.db_connector.uniqueID_upsmanager(eid);
    }
    public static void addUser(int EID, String Name, String CompanyName, String Role, String Password){
     // add user to database .. add fields accordingly
        utils.db_connector.Add_Emp_upsmanager(EID, Name, CompanyName, Role, Password);
    }
    public static int totalEmplyee(){
        return utils.db_connector.totalEmployee_upsmanager();
    }
    
}
