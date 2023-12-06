/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import java.util.ArrayList;

/**
 * Database Connector class for interacting with database
 * @author Nitya
 */
public class Ordercontroller_upsemp {

    private static final String URL = "jdbc:mysql://localhost:3307/test_database?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    /**
     * Privatized constructor so as to not allow object creation
     */
    private Ordercontroller_upsemp() {
    }

    /**
     * Insert given user to database
     * @see User
     * @param user User object to be added
     */


    /**
     * Return lost of all users in database
     * @see User
     * @return list of users
     */
    public static ArrayList<model.Order_upsemp> getAllorders() {
//        return list of users from db
        ArrayList<model.Order_upsemp> orders = new ArrayList<>();

        String query = "SELECT * FROM OrderTable";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                model.Order_upsemp o = new model.Order_upsemp();
                o.setOrderid(rs.getInt("OrderID"));
                o.setCreatorid(rs.getInt("CreatorID"));
                o.setProductname(rs.getString("ProductName"));
                o.setAddress(rs.getString("Address"));
                o.setPlacedate(rs.getString("PlacedDate"));
                o.setAgentid(rs.getInt("AgentID"));
                o.setOrderstatus(rs.getString("OrderStatus"));
                o.setNotes(rs.getString("Notes"));
                orders.add(o);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return orders;
   }
    
     public static void editorder(model.Order_upsemp oldorder, model.Order_upsemp neworder) {
        String query = "UPDATE OrderTable SET STATUS=?, NOTES=? WHERE ORDERID=?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
             stmt.setString(1, neworder.getOrderstatus());
             stmt.setString(2, neworder.getNotes());
             stmt.setInt(3, oldorder.getOrderid());
//            stmt.setString(1, newUser.getName());
//            stmt.setInt(2, newUser.getAge());
//            stmt.setInt(3, oldUser.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Delete given user from database
     * @see User
     * @param u User to be deleted
     * 
     */
//    public static void deleteUser(User u) {
//        String query = "delete from User where id = ?";
//
//        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
//            PreparedStatement stmt = conn.prepareStatement(query);
//            stmt.setInt(1, u.getId());
//            stmt.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * Edit given user details in the database
     * @param oldUser existing user in database
     * @param newUser modified user details to be added
     */
//   
}
