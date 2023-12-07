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
import model.RequestsData;

/**
 *
 * @author varunkumar
 */
public class CustomerManagerDBC {
    private static final String URL = "jdbc:mysql://localhost:3307/amazon?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    /** 
    * Privatized constructor so as to not allow object creation
    */
    private CustomerManagerDBC() {
    }
    /**
    * Insert given user to database
    * @see User
    * @param CustomerManagerDBC User object to be added
    */
   /* public static void addOrder(CustomerOrders CustomerOrders) {
    //add to database
        String query = "INSERT INTO Patient(NAME,AGE) VALUES(?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, CustomerOrders.getProdName());
            stmt.setInt(2, CustomerOrders.getOrderId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);      
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
    /**
    * Return lost of all users in database
    * @see Patient
    * @return list of Patient
    */
    public static ArrayList<CustomerOrders> getAllOrders() {
        // return list of users from db
        ArrayList<CustomerOrders> orderlist = new ArrayList<>();
        String query = "SELECT * FROM OrderTable";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                CustomerOrders order = new CustomerOrders();
                order.setOrderId(rs.getInt("OrderID"));
                order.setProdName(rs.getString("ProductName"));
                order.setAddress(rs.getString("Address"));
                order.setCreatorId(rs.getInt("CreatorID"));
                 order.setAgentId(rs.getString("AgentID"));
                  order.setDate(rs.getString("PlacedDate"));
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
    public static ArrayList<RequestsData> getAllRequests() {
        // return list of users from db
        ArrayList<RequestsData> requestlist = new ArrayList<>();
        String query = "SELECT * FROM RequestTable";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                RequestsData request = new RequestsData();
                //EmpTable employee=new EmpTable();
                request.setRequestType(rs.getString("RequestType"));
                //employee.setEID(rs.getInt("Requested_By_ID"));
                request.setOrderId(rs.getInt("Order_ID"));
                request.setRequestedById(rs.getInt("Requested_By_Id"));
                request.setRequestStatus(rs.getString("RequestStatus"));
                request.setNewAddress(rs.getString("NewAddress"));
                request.setComments(rs.getString("CommentsOfRequestUser"));
                request.setRequesterCompany(rs.getString("requester_company"));
                request.setDateOfRequest(rs.getString("date"));
                requestlist.add(request);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            }
        return requestlist;
        }
        /**
        * Delete given user from database
        * @see User
        * @param p User to be deleted
        *
        * 
        */
        public static void deleteRequest(RequestsData requests) {
            String query = "delete from RequestTable where Order_ID = ?";
                try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setInt(1, requests.getOrderId());
                    stmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
            }
        }
        /**
        * Edit given user details in the database
        * @param oldPatient existing user in database
        * @param newPatient modified user details to be added
        */
        public static void updateRequest(RequestsData newRequestsData) {
            String query = "UPDATE OrderTable SET OrderStatus=? WHERE OrderID=?";
                try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setString(1, newRequestsData.getRequestStatus());
                    //stmt.setInt(2, newOrderDetails());
                    stmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
        }
       }
        
        
         public static void updateAddress(CustomerOrders newOrderDetails) {
             String newAddress = newOrderDetails.getAddress();
             //String newAddress=reqData.getNewAddress();
             int id=newOrderDetails.getOrderId();
             //System.out.println(address);
             System.out.println(newAddress);
             System.out.println(id);
            String query = "UPDATE OrderTable SET Address=? WHERE OrderID=?";
                try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
                    PreparedStatement stmt = conn.prepareStatement(query);
                     stmt.setString(1, newAddress);
                     stmt.setInt(2,  id);
                   // stmt.executeUpdate();
                     int rowaffected=stmt.executeUpdate();
                    System.out.println(rowaffected);
                } catch (SQLException e) {
                     System.out.println("rowaffected");
                    e.printStackTrace();
        }
       }
         public static void updateRequestStatus(RequestsData newRequestDetails) {
             String requestStatus = "Approved";
             //String newAddress=reqData.getNewAddress();
             int id=newRequestDetails.getOrderId();
             //System.out.println(address);
             System.out.println(requestStatus);
             System.out.println(id);
            String query = "UPDATE RequestTable SET RequestStatus=? WHERE Order_ID=?";
                try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
                    PreparedStatement stmt = conn.prepareStatement(query);
                     stmt.setString(1, requestStatus);
                     stmt.setInt(2,  id);
                   // stmt.executeUpdate();
                     int rowaffected=stmt.executeUpdate();
                    System.out.println(rowaffected);
                } catch (SQLException e) {
                     System.out.println("rowaffected");
                    e.printStackTrace();
        }
       }

         public static void updateRequestType(CustomerOrders newOrderDetails, RequestsData newRequestDetails) {
           String type=newRequestDetails.getRequestType();
           int ID=newOrderDetails.getOrderId();
          // String companyName=newRequestDetails.getRequesterCompany();
          String companyName="Amazon";
           newRequestDetails.setRequestStatus("cancellation");
           newRequestDetails.setComments("Placing a cancel request");
           newRequestDetails.setDateOfRequest("2023-12-06");
           System.out.println(ID);
           //int requestById=newRequestDetails.getRequestedById();
           String requestStatus= newRequestDetails.getRequestStatus();
           String query = "Insert INTO RequestTable (RequestType, Order_ID, Requested_By_ID, RequestStatus, NewAddress, CommentsOfRequestUser, requester_company, date) VALUES(?,?,?,?,?,?,?,?)" ;
                 try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
                    PreparedStatement stmt = conn.prepareStatement(query);
                     stmt.setString(1, type);
                     stmt.setInt(2, ID);
                     stmt.setInt(3, 9);
                     stmt.setString(4, newRequestDetails.getRequestStatus());
                     stmt.setString(5, newRequestDetails.getNewAddress());
                    
                     stmt.setString(6, newRequestDetails.getComments());
                      stmt.setString(7, companyName);
                     stmt.setString(8, newRequestDetails.getDateOfRequest());
                    stmt.executeUpdate();
                     
                } catch (SQLException e) {
                    e.printStackTrace();
        }
             
         }
    }
