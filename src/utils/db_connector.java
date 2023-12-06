/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import controller.OrderCancellationRequestData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.AssignmentRequests;
import model.CancelRequest;
import model.EmpTable;
import model.EmployeeLoadTable;

/**
 *
 * @author Jeel
 */
public class db_connector {

    private static final String URL = "jdbc:mysql://localhost:3306/amazon?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    public static ArrayList<AssignmentRequests> getorders_data;

    /**
     * Privatized constructor so as to not allow object creation
     */
    private db_connector() {
    }

        public static ArrayList<CancelRequest> getorders_upsManager() {
        
        ArrayList<CancelRequest> orders = new ArrayList<>();
        //System.out.println("calling get orderrs");
                //System.out.println("calling get orderrs");

        String query = "select OrderID, requester_company, OrderStatus, Date , CommentsOfRequestUser from OrderTable inner JOIN RequestTable ON OrderTable.OrderID = RequestTable.Order_ID  where RequestStatus='cancellation'";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                CancelRequest order = new CancelRequest();
                order.setOID(rs.getInt("OrderID"));
                order.setRequesterCompany(rs.getString("requester_company"));
                order.setDateOfRequest(rs.getString("Date"));
                order.setOrderStatus(rs.getString("OrderStatus"));
                order.setComment(rs.getString("CommentsOfRequestUser"));
                orders.add(order);   
            }
            rs.close();
            for(int i = 0; i < orders.size(); i++) {   
                System.out.print(orders.get(i));
            }  
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;
    }
    
    public static void editUser_upsmanager(int rid) {
        String query = "update OrderTable set OrderStatus='canceled' where OrderId = ? ";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, rid);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void deleteUser_upsmanager(int rid) {
        String query = "delete from RequestTable where Order_ID=?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, rid);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int totalTally_cancellation_upsmanager() {
        String query = "select count(OrderID) as data from OrderTable Inner JOIN RequestTable ON OrderTable.OrderID = RequestTable.Order_ID where RequestStatus='cancellation'";
        int i = 0;
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                i = rs.getInt("data"); 
            }
            rs.close(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    
        public static ArrayList<EmpTable> getallusers_upsManager() {
        
        ArrayList<EmpTable> orders = new ArrayList<>();
        String query = "select ID, name, joining_date from UserTable where Company_name='UPS' and role='associate'";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                EmpTable order = new EmpTable();
                order.setEID(rs.getInt("ID"));
                order.setEmployeeName(rs.getString("name"));
                order.setDataJoined(rs.getString("joining_date"));
                orders.add(order);   
            }
            rs.close();
            for(int i = 0; i < orders.size(); i++) {   
                System.out.print(orders.get(i));
            }  
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;
    }  
    
    public static void deleteEmployeeStatus_upsmanager(int eid) {
        String query = "delete from UserTable where Id=?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, eid);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }    }
    public static boolean uniqueID_upsmanager(int eid) {
        String query = "select count(ID) as data from UserTable where Id=?";
        int i = 0;
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, eid);
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                i = rs.getInt("data"); 
            }
            rs.close(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        boolean x = true;
        if(i==1){
            x=false;
        }           
        return x;
    }

   public static void Add_Emp_upsmanager(int EID, String Name, String CompanyName, String Role, String Password) {
        //add to database
        String query = "INSERT INTO UserTable VALUES (?, ?, ?, ?, ?, curdate())";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, EID);
            stmt.setString(2, Name);
                        stmt.setString(3, Password);
            stmt.setString(4, Role);
            stmt.setString(5, CompanyName);
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }       
   } 

    public static int totalEmployee_upsmanager() {
        String query = "select count(*) as data from UserTable where Company_name='UPS' and role='associate'";
        int i = 0;
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                i = rs.getInt("data"); 
            }
            rs.close(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    } 

    public static ArrayList<EmployeeLoadTable> getAllusersa_upsManager() {
        ArrayList<EmployeeLoadTable> orders = new ArrayList<>();
        String query = "SELECT distinct Id, name, (Select COunt(OrderID) FROM OrderTable WHERE OrderStatus = 'completed' AND a.Id = AgentID) as Completedorders,  (Select COunt(OrderID) FROM OrderTable WHERE OrderStatus != 'Completed' AND a.Id = AgentID) as IncompletedOrders FROM UserTable a INNER JOIN OrderTable b ON a.Id = b.AgentID;";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                EmployeeLoadTable order = new EmployeeLoadTable();
                order.setEID(rs.getInt("ID"));
                order.setEmployeeName(rs.getString("name"));
                order.setCompletedOrder_thisMonth(rs.getInt("Completedorders")); 
                order.setProcessingOrder_thisMonth(rs.getInt("IncompletedOrders"));
                orders.add(order);   
            }
            rs.close();
            for(int i = 0; i < orders.size(); i++) {   
                System.out.print(orders.get(i));
            }  
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;    
    }
   
    public static int gettotal_employee_upsManager() {
        String query = " select count(OrderStatus) as data from OrderTable where OrderStatus='pending_assignment'";
        int i = 0;
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                i = rs.getInt("data"); 
            }
            rs.close(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;        
    }
    public static ArrayList<AssignmentRequests> getorders_data() {
        ArrayList<AssignmentRequests> orders = new ArrayList<>();
        String query = "select OrderId, Company_name , Address, OrderStatus, PlacedDate from OrderTable Inner Join UserTable ON OrderTable.CreatorID = UserTable.ID where OrderStatus='pending_assignment'";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                AssignmentRequests order = new AssignmentRequests();
                order.setOID(rs.getInt("OrderId"));
                order.setCompanyName(rs.getString("Company_name"));
                order.setAddress(rs.getString("Address")); 
                order.setOrderStatus(rs.getString("OrderStatus"));
                order.setDate(rs.getString("PlacedDate"));
                orders.add(order);   
            }
            rs.close();
            for(int i = 0; i < orders.size(); i++) {   
                System.out.print(orders.get(i));
            }  
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;         
    }

    public static void updateorder_status_empmanager(int oid, int eid) {
        String query = "update OrderTable set OrderStatus='ongoing', AgentID=? where OrderID=? ";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, eid);
            stmt.setInt(2, oid);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }        
    }
     public static ArrayList<Order_upsemp> getAllorders_upsemp() {
//        return list of users from db
        ArrayList<Order_upsemp> orders = new ArrayList<>();

        String query = "SELECT * FROM orderTable";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Order_upsemp o = new Order_upsemp();
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
    
     public static void editorder_upsemp(Order_upsemp oldorder, Order_upsemp neworder) {
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
