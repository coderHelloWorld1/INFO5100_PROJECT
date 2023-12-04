/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.CancelRequest;

/**
 *
 * @author Purvam Sheth
 */
public class OrderCancellationRequestData {
    public static ArrayList<CancelRequest> getAllUsers(){
        // Generating dummy data
        CancelRequest request1 = new CancelRequest();
        request1.setOID(1);
        request1.setRequesterCompany("Company A");
        request1.setOrderStatus("Pending");
        request1.setDateOfRequest("2023-01-01");
        request1.setComment("Cancellation request for order #1");

        CancelRequest request2 = new CancelRequest();
        request2.setOID(2);
        request2.setRequesterCompany("Company B");
        request2.setOrderStatus("Approved");
        request2.setDateOfRequest("2023-02-15");
        request2.setComment("Cancellation request for order #2");

        CancelRequest request3 = new CancelRequest();
        request3.setOID(3);
        request3.setRequesterCompany("Company C");
        request3.setOrderStatus("Rejected");
        request3.setDateOfRequest("2023-03-20");
        request3.setComment("Cancellation request for order #3");

        // Creating an ArrayList and adding CancelRequest objects
        ArrayList<CancelRequest> cancelRequests = new ArrayList<>();
        cancelRequests.add(request1);
        cancelRequests.add(request2);
        cancelRequests.add(request3);

        // Returning the ArrayList
        return cancelRequests;
    }
    
    public static void updateOrderStatus(int OID){
        // Update the databaese by finding order of OID, and make its status to cancelled.
        // Delete from the reqeust table (find by OID).
    }

    public static void deleteRequest(int OID){
        // Delete from the reqeust table (find by OID).
    }
 
    public static int totalCancellationRequestTally(){
        // Return total number of request queries. 
        return 10;
    }
}
