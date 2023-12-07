/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.CustomerOrders;

/**
 *
 * @author Akash Bahri
 */
public class CustomerOrdersData {
      private static final String URL = "jdbc:mysql://localhost:3307/amazon?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    
    public static ArrayList<CustomerOrders> getAllOrders() {
        // return list of users from db
        ArrayList<CustomerOrders> orderlist = new ArrayList<>();
        String query = "SELECT * FROM OrderTable";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
            Statement stmt = conn.createStatement();
            System.out.println("does this run");
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                CustomerOrders order = new CustomerOrders();
                order.setOrderId(rs.getInt("OrderID"));
                order.setCreatorId(rs.getInt("CreatorID"));
                order.setProdName(rs.getString("ProductName"));
                order.setAddress(rs.getString("Address"));
                order.setDate(rs.getString("placedDate"));
                order.setAgentId(rs.getString("AgentID"));  
                order.setStatus(rs.getString("OrderStatus"));
                order.setNotes(rs.getString("Notes"));
                     //order.setCreatorId(rs.getString(""));
                  
                orderlist.add(order);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            }
        return orderlist;
        }
    
    
    public static void NewUpdateRequest(CustomerOrders selectedorder, String newAddress, int loggedInID) {
    String oldAddress = selectedorder.getAddress();
    int ID = selectedorder.getOrderId();
    CustomerOrders date=new CustomerOrders();
    String query = "INSERT INTO RequestTable VALUES (?,?,?,?,?,?,?,?)";
    
    try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1,"address");//requesttype
        stmt.setInt(2,loggedInID);// Requested_by_id
        stmt.setInt(3, ID);
        stmt.setString(4,"pending");// requestStatus // Set the ID as the first parameter
        stmt.setString(5, newAddress); 
        stmt.setString(6, "old address:"+oldAddress);     
        stmt.setString(7, "Amazon");
        stmt.setString(8, date.getDate());
// Set the newAddress as the third parameter
        stmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
        public static void NewOrder(CustomerOrders Order) {
    
    String query = "INSERT INTO OrderTable VALUES (?,?,?,?,?,?,?,?)";
     String agentID=null;
    
    try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, Order.getOrderId()); 
        stmt.setInt(2,Order.getCreatorId());// Set the ID as the first parameter
        stmt.setString(3, Order.getProdName());      // Set the oldAddress as the second parameter
        stmt.setString(4, Order.getAddress());
        stmt.setString(5, Order.getDate()); 
        stmt.setString(6,   null);// Set the ID as the first parameter
        stmt.setString(7, "pending_assignment");      // Set the oldAddress as the second parameter
        stmt.setString(8, Order.getNotes());
        // Set the newAddress as the third parameter
        stmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
