/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author varun
 */
public class RequestsData {
    private String newAddress;
    private String oldAddress;
    private String comments;
    private String requestType;
    private String requestStatus;
    private int orderId;
    private int requestedById;
    private String DateOfRequest;
    private String RequesterCompany;
    
    public int getRequestedById() {
        return requestedById;
    }

    public void setRequestedById(int requestedById) {
        this.requestedById = requestedById;
    }
    
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
     public String getNewAddress(){
       return newAddress;
    }
    public void setNewAddress(String newAddress){
        this.newAddress=newAddress;
    }
    public String getOldAddress(){
       return oldAddress;
    }
    public void setOldAddress(String oldAddress){
        this.oldAddress=oldAddress;
    }
    public String getComments(){
        return comments;
    }
    public void setComments(String comments){
        this.comments=comments;
    }
     public String getRequestType(){
        return requestType;
    }
    public void setRequestType(String requestType){
        this.requestType=requestType;
    }
    
   public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }
    public String getDateOfRequest() {
        return DateOfRequest;
    }

    /**
     * @param DateOfRequest the DateOfRequest to set
     */
    public void setDateOfRequest(String DateOfRequest) {
        this.DateOfRequest = DateOfRequest;
    }
public String getRequesterCompany() {
        return RequesterCompany;
    }

    /**
     * @param RequesterCompany the RequesterCompany to set
     */
    public void setRequesterCompany(String RequesterCompany) {
        this.RequesterCompany = RequesterCompany;
    }
    
}
