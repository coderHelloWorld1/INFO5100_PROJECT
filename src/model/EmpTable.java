/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Purvam Sheth
 */
public class EmpTable {

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
     * @return the DataJoined
     */
    public String getDataJoined() {
        return DataJoined;
    }

    /**
     * @param DataJoined the DataJoined to set
     */
    public void setDataJoined(String DataJoined) {
        this.DataJoined = DataJoined;
    }
    private int EID;
    private String EmployeeName;
    private String DataJoined;
}
