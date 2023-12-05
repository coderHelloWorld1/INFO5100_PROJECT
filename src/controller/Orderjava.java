/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import java.util.ArrayList;
import model.Order;

/**
 * Database Connector class for interacting with database
 * @author Nitya
 */
public class Orderjava {

    private static final String URL = "jdbc:mysql://localhost:3307/test_database?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    /**
     * Privatized constructor so as to not allow object creation
     */
    private Orderjava() {
    }

    /**
     * Insert given user to database
     * @see User
     * @param user User object to be added
     */
//   

    /**
     * Return lost of all orders in database
     * @see Order
     * @return list of orders
     */
    public static ArrayList<Order> getAllorders_upsemp() {
//        return list of orders from db
        ArrayList<Order> orders = new ArrayList<>();

        String query = "SELECT * FROM orderTable";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Order o = new Order();
                o.setOrderid(rs.getInt("ORDERID"));
                o.setCreatorid(rs.getInt("CREATORID"));
                o.setProductname(rs.getString("PRODUCTNAME"));
                o.setAddress(rs.getString("ADDRESS"));
                o.setPlacedate(rs.getString("PLACEDATE"));
                o.setAgentid(rs.getInt("AGENTID"));
                o.setOrderstatus(rs.getString("STATUS"));
                o.setNotes(rs.getString("NOTES"));
                orders.add(o);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return orders;
   }

    // Edit order status and notes
     public static void editorder_upsemp(Order oldorder, Order neworder) {
        String query = "UPDATE orderTable SET STATUS=?, NOTES=? WHERE ORDERID=?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
             stmt.setString(1, neworder.getOrderstatus());
             stmt.setString(2, neworder.getNotes());
             stmt.setInt(3, oldorder.getOrderid());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




}
