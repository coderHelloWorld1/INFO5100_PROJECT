/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Purvam Sheth
 */
public class EmployeeLoadTable {

    /**
     * @return the EID
     */
    public int getEID() {
        return EID;
    }

    /**
     * @param EID the EID to set
     */
    public void setEID(int EID) {
        this.EID = EID;
    }

    /**
     * @return the EmployeeName
     */
    public String getEmployeeName() {
        return EmployeeName;
    }

    /**
     * @param EmployeeName the EmployeeName to set
     */
    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    /**
     * @return the completedOrder_thisMonth
     */
    public int getCompletedOrder_thisMonth() {
        return completedOrder_thisMonth;
    }

    /**
     * @param completedOrder_thisMonth the completedOrder_thisMonth to set
     */
    public void setCompletedOrder_thisMonth(int completedOrder_thisMonth) {
        this.completedOrder_thisMonth = completedOrder_thisMonth;
    }

    /**
     * @return the processingOrder_thisMonth
     */
    public int getProcessingOrder_thisMonth() {
        return processingOrder_thisMonth;
    }

    /**
     * @param processingOrder_thisMonth the processingOrder_thisMonth to set
     */
    public void setProcessingOrder_thisMonth(int processingOrder_thisMonth) {
        this.processingOrder_thisMonth = processingOrder_thisMonth;
    }
    private int EID;
    private String EmployeeName;
    private int completedOrder_thisMonth;
    private int processingOrder_thisMonth;
}
