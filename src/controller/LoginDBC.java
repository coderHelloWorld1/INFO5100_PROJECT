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
import model.EmpTable;
import model.RequestsData;

/**
 *
 * @author varunkumar
 */
public class LoginDBC {
    private static final String URL = "jdbc:mysql://localhost:3307/amazon?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    
     public static void LoginDetails(EmpTable empDetails, int loggedIn) {
             String username= empDetails.getEmployeeName();
             String pwd=empDetails.getPassword();
             //String newAddress=reqData.getNewAddress();
             //loggedIn=empDetails.getEID();
             //System.out.println(address);
             System.out.println(empDetails);
             System.out.println(loggedIn);
            String query = "SELECT * FROM UserTable WHERE name = ? AND password = ?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                
                empDetails.setEmployeeName(rs.getString("name"));
                empDetails.setPassword(rs.getString("password"));
                loggedIn=rs.getInt("id");
            }
                   
                } catch (SQLException e) {
                     System.out.println("rowaffected");
                    e.printStackTrace();
        }
       }
}
/**
 *
 * @author varun
 */

