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
public class District {
   private int Districtno;
   private String Districtname; 
   private int Rfno;
   private String Rname;

    /**
     * @return the Districtno
     */
    public int getDistrictno() {
        return Districtno;
    }

    /**
     * @param Districtno the Districtno to set
     */
    public void setDistrictno(int Districtno) {
        this.Districtno = Districtno;
    }

    /**
     * @return the Districtname
     */
    public String getDistrictname() {
        return Districtname;
    }

    /**
     * @param Districtname the Districtname to set
     */
    public void setDistrictname(String Districtname) {
        this.Districtname = Districtname;
    }

    /**
     * @return the Rfno
     */
    public int getRfno() {
        return Rfno;
    }

    /**
     * @param Rfno the Rfno to set
     */
    public void setRfno(int Rfno) {
        this.Rfno = Rfno;
    }

    /**
     * @return the Rname
     */
    public String getRname() {
        return Rname;
    }

    /**
     * @param Rname the Rname to set
     */
    public void setRname(String Rname) {
        this.Rname = Rname;
    }
          
    
}
