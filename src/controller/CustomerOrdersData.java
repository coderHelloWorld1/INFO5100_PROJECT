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
      private static final String URL = "jdbc:mysql://localhost:3307/test_database?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    
    public static ArrayList<CustomerOrders> getAllOrders() {
        // return list of users from db
        ArrayList<CustomerOrders> orderlist = new ArrayList<>();
        String query = "SELECT * FROM ORDERS";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                CustomerOrders order = new CustomerOrders();
                order.setOrderId(rs.getInt("ORDERID"));
                order.setProdName(rs.getString("PRODUCTNAME"));
                order.setAddress(rs.getString("ADDRESS"));
                order.setCreatorId(rs.getString("CREATORID"));
                 order.setAgentId(rs.getString("AGENTID"));
                  order.setDate(rs.getString("PLACEDATE"));
                   order.setStatus(rs.getString("STATUS"));
                    order.setNotes(rs.getString("NOTES"));
                     //order.setCreatorId(rs.getString(""));
                  
                orderlist.add(order);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            }
        return orderlist;
        }
    
    
    public static void NewUpdateRequest(CustomerOrders selectedorder, String newAddress) {
    String oldAddress = selectedorder.getAddress();
    int ID = selectedorder.getOrderId();
    String query = "INSERT INTO requests (TYPE,RequestbyID,ORDERID,RequestStatus,Comments) VALUES (?,?, ?, ?)";
    
    try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, ID); 
        stmt.setString(2,"address_update");// Set the ID as the first parameter
        stmt.setString(3, oldAddress);      // Set the oldAddress as the second parameter
        stmt.setString(4, newAddress);      // Set the newAddress as the third parameter
        stmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
        public static void NewOrder(CustomerOrders Order) {
    
    String query = "INSERT INTO OrderTable VALUES (?,?,?,?,?,?,?,?)";
     
    
    try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, Order.getOrderId()); 
        stmt.setString(2,Order.getCreatorId());// Set the ID as the first parameter
        stmt.setString(3, Order.getProdName());      // Set the oldAddress as the second parameter
        stmt.setString(4, Order.getAddress());
        stmt.setString(5, Order.getDate()); 
        stmt.setString(6,Order.getAgentId());// Set the ID as the first parameter
        stmt.setString(7, Order.getStatus());      // Set the oldAddress as the second parameter
        stmt.setString(8, Order.getNotes());
        // Set the newAddress as the third parameter
        stmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
