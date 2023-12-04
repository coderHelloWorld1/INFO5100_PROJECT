/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Purvam Sheth
 */
public class AssignmentRequests {

    /**
     * @return the OID
     */
    public int getOID() {
        return OID;
    }

    /**
     * @param OID the OID to set
     */
    public void setOID(int OID) {
        this.OID = OID;
    }

    /**
     * @return the CompanyName
     */
    public String getCompanyName() {
        return CompanyName;
    }

    /**
     * @param CompanyName the CompanyName to set
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the AddressStatus
     */
    public String getOrderStatus() {
        return OrderStatus;
    }

    /**
     * @param OrderStatus the AddressStatus to set
     */
    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }
    private int OID;
    private String CompanyName;
    private String Address;
    private String OrderStatus;
    private String Date;
}
