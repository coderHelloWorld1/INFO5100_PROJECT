/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author varun
 */
public class CustomerManager {
    private String prodName;
    private String creator_id;
    private int order_id;
    private int req_orderid;
    private String address;
    private String agentId;
    private String date;
    private String status;
    private String notes;
    private String newAddress;
    private String comments;
    private String requestType;
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String Name) {
        this.prodName = Name;
    }

    public String getCreatorId() {
        return creator_id;
    }

    public void setCreatorId(String CreatorId) {
        this.creator_id = CreatorId;
    }

    public int getOrderId() {
        return order_id;
    }

    public void setOrderId(int id) {
        this.order_id = id;
    }    
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAgentId(){
        return agentId;
    }
    public void setAgentId(String agentId){
        this.agentId=agentId;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date=date;
    }
    public String getStatus(){
        return address;
    }
    public void setStatus(String status){
        this.status=status;
    }
    public String getNotes(){
        return notes;
    }
    public void setNotes(String notes){
        this.notes=notes;
    }
    public String getNewAddress(){
       return newAddress;
    }
    public void setNewAddress(String newAddress){
        this.newAddress=newAddress;
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
    public int getReqOrderId() {
        return req_orderid;
    }

    public void setReqOrderId(int id) {
        this.req_orderid = id;
    } 
}
