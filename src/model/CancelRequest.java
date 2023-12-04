/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Purvam Sheth
 */
public class CancelRequest {

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
     * @return the RequesterCompany
     */
    public String getRequesterCompany() {
        return RequesterCompany;
    }

    /**
     * @param RequesterCompany the RequesterCompany to set
     */
    public void setRequesterCompany(String RequesterCompany) {
        this.RequesterCompany = RequesterCompany;
    }

    /**
     * @return the OrderStatus
     */
    public String getOrderStatus() {
        return OrderStatus;
    }

    /**
     * @param OrderStatus the OrderStatus to set
     */
    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * @return the DateOfRequest
     */
    public String getDateOfRequest() {
        return DateOfRequest;
    }

    /**
     * @param DateOfRequest the DateOfRequest to set
     */
    public void setDateOfRequest(String DateOfRequest) {
        this.DateOfRequest = DateOfRequest;
    }

    /**
     * @return the Comment
     */
    public String getComment() {
        return Comment;
    }

    /**
     * @param Comment the Comment to set
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }
    private int OID;
    private String RequesterCompany;
    private String OrderStatus;
    private String DateOfRequest;
    private String Comment;    
}
