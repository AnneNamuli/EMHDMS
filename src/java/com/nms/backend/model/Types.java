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
public class Types {
    private int DrugTypeNo;
    private String DrugType;

    /**
     * @return the DrugTypeNo
     */
    public int getDrugTypeNo() {
        return DrugTypeNo;
    }

    /**
     * @param DrugTypeNo the DrugTypeNo to set
     */
    public void setDrugTypeNo(int DrugTypeNo) {
        this.DrugTypeNo = DrugTypeNo;
    }

    /**
     * @return the DrugType
     */
    public String getDrugType() {
        return DrugType;
    }

    /**
     * @param DrugType the DrugType to set
     */
    public void setDrugType(String DrugType) {
        this.DrugType = DrugType;
    }
}
