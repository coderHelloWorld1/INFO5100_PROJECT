/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.CancelRequest;
import utils.db_connector.*;

/**
 *
 * @author Purvam Sheth
 */
public class OrderCancellationRequestData {
    public static ArrayList<CancelRequest> getAllUsers(){
        return utils.db_connector.getorders_upsManager();
    }
    
    public static void updateOrderStatus(int OID){
        // Update the databaese by finding order of OID, and make its status to cancelled.
        // Delete from the reqeust table (find by OID).
        utils.db_connector.editUser_upsmanager(OID);
    }

    public static void deleteRequest(int OID){
        // Delete from the reqeust table (find by OID).
        utils.db_connector.deleteUser_upsmanager(OID);
    }
 
    public static int totalCancellationRequestTally(){
        // Return total number of request queries. 
        return utils.db_connector.totalTally_cancellation_upsmanager();
    }
}
