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
public class Deliveries {
    
    private int deliveryid;
    private String deliveryname;
    private int  deliveryphone;
    private String deliveryexp;
    private String deliverydate;
    private Region region;
    private int disttrictno;
    private int healthfac;

    /**
     * @return the deliveryid
     */
    public int getDeliveryid() {
        return deliveryid;
    }

    /**
     * @param deliveryid the deliveryid to set
     */
    public void setDeliveryid(int deliveryid) {
        this.deliveryid = deliveryid;
    }

    /**
     * @return the deliveryname
     */
    public String getDeliveryname() {
        return deliveryname;
    }

    /**
     * @param deliveryname the deliveryname to set
     */
    public void setDeliveryname(String deliveryname) {
        this.deliveryname = deliveryname;
    }

    /**
     * @return the deliveryphone
     */
    public int getDeliveryphone() {
        return deliveryphone;
    }

    /**
     * @param deliveryphone the deliveryphone to set
     */
    public void setDeliveryphone(int deliveryphone) {
        this.deliveryphone = deliveryphone;
    }

    /**
     * @return the deliveryexp
     */
    public String getDeliveryexp() {
        return deliveryexp;
    }

    /**
     * @param deliveryexp the deliveryexp to set
     */
    public void setDeliveryexp(String deliveryexp) {
        this.deliveryexp = deliveryexp;
    }

    /**
     * @return the deliverydate
     */
    public String getDeliverydate() {
        return deliverydate;
    }

    /**
     * @param deliverydate the deliverydate to set
     */
    public void setDeliverydate(String deliverydate) {
        this.deliverydate = deliverydate;
    }

    /**
     * @return the disttrictno
     */
    public int getDisttrictno() {
        return disttrictno;
    }

    /**
     * @param disttrictno the disttrictno to set
     */
    public void setDisttrictno(int disttrictno) {
        this.disttrictno = disttrictno;
    }

    /**
     * @return the healthfac
     */
    public int getHealthfac() {
        return healthfac;
    }

    /**
     * @param healthfac the healthfac to set
     */
    public void setHealthfac(int healthfac) {
        this.healthfac = healthfac;
    }

    /**
     * @return the region
     */
    public Region getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(Region region) {
        this.region = region;
    }
    
    
}
