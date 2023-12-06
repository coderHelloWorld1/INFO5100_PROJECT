/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.AssignmentRequests;
import model.EmployeeLoadTable;

/**
 *
 * @author Purvam Sheth
 */

public class AssignOrdersData {

    public static int totalEmplyee() {
        // total request for approval
        return utils.db_connector.gettotal_employee_upsManager();
    }

    public static ArrayList<EmployeeLoadTable> getAllUsers() {
        return utils.db_connector.getAllusersa_upsManager();    
    }

    public static ArrayList<AssignmentRequests> getAllOrdersData() {
        return utils.db_connector.getorders_data();
    }

    public static void updateOrderStatus(int oid, int eid) {
        // Update order (find by oid) table, by changing its status to employee assigned and update agent id with eid
        utils.db_connector.updateorder_status_empmanager(oid, eid);
    }
    
}
