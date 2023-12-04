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
        return 21;
    }

    public static ArrayList<EmployeeLoadTable> getAllUsers() {
        ArrayList<EmployeeLoadTable> employees = new ArrayList<>();

        EmployeeLoadTable employee1 = new EmployeeLoadTable();
        employee1.setEID(1);
        employee1.setEmployeeName("John Doe");
        employee1.setCompletedOrder_thisMonth(10);
        employee1.setProcessingOrder_thisMonth(5);

        EmployeeLoadTable employee2 = new EmployeeLoadTable();
        employee2.setEID(2);
        employee2.setEmployeeName("Jane Smith");
        employee2.setCompletedOrder_thisMonth(15);
        employee2.setProcessingOrder_thisMonth(8);

        EmployeeLoadTable employee3 = new EmployeeLoadTable();
        employee3.setEID(3);
        employee3.setEmployeeName("Alice Johnson");
        employee3.setCompletedOrder_thisMonth(8);
        employee3.setProcessingOrder_thisMonth(3);
        
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        return employees;    
    }

    public static ArrayList<AssignmentRequests> getAllOrdersData() {
        ArrayList<AssignmentRequests> orders = new ArrayList<>();

        AssignmentRequests order1 = new AssignmentRequests();
        order1.setOID(1);
        order1.setCompanyName("Company A");
        order1.setAddress("123 Main St");
        order1.setOrderStatus("Pending");
        order1.setDate("2023-01-10");

        AssignmentRequests order2 = new AssignmentRequests();
        order2.setOID(2);
        order2.setCompanyName("Company B");
        order2.setAddress("456 Oak St");
        order2.setOrderStatus("Approved");
        order2.setDate("2023-02-20");

        AssignmentRequests order3 = new AssignmentRequests();
        order3.setOID(3);
        order3.setCompanyName("Company C");
        order3.setAddress("789 Pine St");
        order3.setOrderStatus("Rejected");
        order3.setDate("2023-03-15");

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        return orders;
    }

    public static void updateOrderStatus(int oid, int eid) {
        // Update order (find by oid) table, by changing its status to employee assigned and update agent id with eid
    }
    
}
