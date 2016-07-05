/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.backend.model;

/**
 *
 * @author Elijah
 */
public class Drugs {
    
    private int DrugNo;
    private String DrugName;
    private String Healthfac;
    private int Delivery;
    private int Type;

    /**
     * @return the DrugNo
     */
    public int getDrugNo() {
        return DrugNo;
    }

    /**
     * @param DrugNo the DrugNo to set
     */
    public void setDrugNo(int DrugNo) {
        this.DrugNo = DrugNo;
    }

    /**
     * @return the DrugName
     */
    public String getDrugName() {
        return DrugName;
    }

    /**
     * @param DrugName the DrugName to set
     */
    public void setDrugName(String DrugName) {
        this.DrugName = DrugName;
    }

    /**
     * @return the Healthfac
     */
    public String getHealthfac() {
        return Healthfac;
    }

    /**
     * @param Healthfac the Healthfac to set
     */
    public void setHealthfac(String Healthfac) {
        this.Healthfac = Healthfac;
    }

    /**
     * @return the Delivery
     */
    public int getDelivery() {
        return Delivery;
    }

    /**
     * @param Delivery the Delivery to set
     */
    public void setDelivery(int Delivery) {
        this.Delivery = Delivery;
    }

    /**
     * @return the Type
     */
    public int getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(int Type) {
        this.Type = Type;
    }
    
}
