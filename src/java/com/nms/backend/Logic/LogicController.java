package com.nms.backend.Logic;

import com.nms.backend.DB.DBquery;
import com.nms.backend.DB.DBconfig;
import com.nms.backend.model.Deliveries;
import com.nms.backend.model.Region;
import com.nms.backend.model.District;
import com.nms.backend.model.Distribution;
import com.nms.backend.model.Zones;
import com.nms.backend.model.HealthFac;
import com.nms.backend.model.Messages;
import com.nms.backend.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.*;


public class LogicController {

  
    
    public LogicController() {
    }

    public static void addUser(String fname, String lname, String email) {
          DBquery conn = new DBquery();
        conn.addnewuser( fname, lname , email);
        
    }
    
    //public static void addDistribution(String healthfacility, String panadol, String ceptrine, String testkits, String gloves, String artenum, String coartem, String cetamol ) {
    public static void addDistribution(String recieved, String stockin_out, int hno, String panadol, String ceptrine, String testkits, String gloves, String artenum, String coartem, String cetamol ) {    
          DBquery conn = new DBquery();
        conn.addnewdistribution(recieved, stockin_out, hno, panadol, ceptrine, testkits, gloves, artenum, coartem, cetamol);
    }

    public static  List<User> getUsers(){
          DBquery conn = new DBquery();
        List <User> list=new  ArrayList<>();
       try {
           ResultSet rset = conn.getUsers();
           
           while (rset.next()) {
               User user = new User();
               user.setFname(rset.getString("fname"));
               list.add(user);
           }
           
           
           
           return list;
          
       } catch (SQLException ex) {
           Logger.getLogger(LogicController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       }
    }
    public static void addRegion(String rname) throws NullPointerException{
         DBquery conn = new DBquery();
        conn.addnewRegion( rname );
    }
    
    public static void sendmessage1(String title, String text, int msgtype) throws NullPointerException{
         DBquery conn = new DBquery();
         
        conn.sendnewmessage(title,  text,  msgtype );

    }
    
    public static void addhealthoff(String fname, String lname, int level, String username, String password ,int healthfac,int district) throws NullPointerException{
         DBquery conn = new DBquery();
         
        conn.addnewhealthoff(fname, lname, level, username, password, healthfac, district);

    }
    public static void addHealthFacility(int level,String location,String hfname ,int Zone, int district) throws NullPointerException{
         DBquery conn = new DBquery();
        conn.addHealthfac(level, location, hfname, Zone, district);

    }

    public static void adminmessage1(String title, int inout, String text, int healthfac, int msgtype, int zone, int district) throws NullPointerException{
         DBquery conn = new DBquery();
         
        conn.sendadminmessage(title, inout, text, healthfac, msgtype, zone, district);

    }
    
    public static void addDelivery(String deliveryname, int phoneno,String timexp, String deliverydate,int distno,int hfno) throws NullPointerException{
         DBquery conn = new DBquery();
        conn.adddelivery(deliveryname, phoneno, timexp, deliverydate, distno, hfno);

    } 
    
     public static void confirmDelivery(String deliveryStatus) throws NullPointerException{
         DBquery conn = new DBquery();
        conn.confirmdelivery(deliveryStatus);

    } 
    
    /**
     *
     */
    public static List <Region> getRegion(){
          DBquery conn = new DBquery();
        List <Region> Rlist=new  ArrayList<>();
       try {
           ResultSet rrset = conn.getregions();
           
           while (rrset.next()) {
               Region region = new Region();
                              
               region.setRno(rrset.getInt("region_no"));
             region.setRname(rrset.getString("region_name"));
               Rlist.add(region);
           }
           
        int size = Rlist.size();
           
         return Rlist;
          
       } catch (SQLException ex) {
           Logger.getLogger(LogicController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       }
       
    }
    
    public static List <District> getDistrict(){
          DBquery conn = new DBquery();
        List <District> Dlist=new  ArrayList<>();
       try {
           ResultSet dset = conn.getdistricts();
           
           while (dset.next()) {
               District district= new District();
              // Region region = new Region();
               
                             
                district.setDistrictno(dset.getInt("district_no"));
                district.setDistrictname(dset.getString("district_name"));
                district.setRname(dset.getString("region_name"));
                district.setRfno(dset.getInt("regions_region_no"));
                
             
               Dlist.add(district);
           }
           
        int size = Dlist.size();
           
         return Dlist;
          
       } catch (SQLException ex) {
           Logger.getLogger(LogicController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       }
       
    }
    
    public static List <Zones> getZones(){
          DBquery conn = new DBquery();
        List <Zones> Zlist=new  ArrayList<>();
       try {
           ResultSet zset = conn.getzones();
           
           while (zset.next()) {
               
               Zones zones = new Zones();
              
               
               zones.setZone1(zset.getString("zone1"));
               zones.setZone2(zset.getString("zone2"));
               zones.setZone3(zset.getString("zone3"));
               zones.setZone4(zset.getString("zone4"));
               zones.setZone5(zset.getString("zone5"));
                
                
             
               Zlist.add(zones);
           }
           
        int size = Zlist.size();
           
         return Zlist;
          
       } catch (SQLException ex) {
           Logger.getLogger(LogicController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       }
       
    }
    
    private void Jbuttonaction(){
    
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         dataset.setValue(null, null, null);
    
    }
    
    public static List <Distribution> getDistribution(){
          DBquery conn = new DBquery();
        List <Distribution> Drlist=new  ArrayList<>();
       try {
           ResultSet drset = conn.getDistribution();
           
           while (drset.next()) {
               
               Distribution distribution = new Distribution();
              
               
               distribution.setDisid(drset.getString("distribution_id"));
               distribution.setRecieved(drset.getString("recieved"));
               distribution.setStockin(drset.getString("stockin_out"));
               
               distribution.setTime(drset.getString("time"));
               distribution.setHno(drset.getInt("heath_facility_health_facility_no"));
               distribution.setPanadol(drset.getString("Panadol"));
               distribution.setCeptrine(drset.getString("Ceptrine"));
               distribution.setTestkits(drset.getString("Testkits"));
               distribution.setMedicalgloves(drset.getString("Medical_gloves"));
               distribution.setArtenum(drset.getString("Artenum"));
               distribution.setCoartem(drset.getString("Coartem"));
               distribution.setCetamol(drset.getString("Cetamol"));
               distribution.setHname(drset.getString("heath_facility_name"));
                
                
             
               Drlist.add(distribution);
           }
           
        int size = Drlist.size();
           
         return Drlist;
          
       } catch (SQLException ex) {
           Logger.getLogger(LogicController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       }
       
    }
    
     public static List <Distribution> gethfcDistribution(){
          DBquery conn = new DBquery();
        List <Distribution> Drlist=new  ArrayList<>();
       try {
           ResultSet drset = conn.gethfcDistribution();
           
           while (drset.next()) {
               
               Distribution distribution = new Distribution();
              
               
               distribution.setDisid(drset.getString("distribution_id"));
               distribution.setRecieved(drset.getString("recieved"));
               distribution.setStockin(drset.getString("stockin_out"));
               
               distribution.setTime(drset.getString("time"));
               distribution.setHno(drset.getInt("heath_facility_health_facility_no"));
               distribution.setPanadol(drset.getString("Panadol"));
               distribution.setCeptrine(drset.getString("Ceptrine"));
               distribution.setTestkits(drset.getString("Testkits"));
               distribution.setMedicalgloves(drset.getString("Medical_gloves"));
               distribution.setArtenum(drset.getString("Artenum"));
               distribution.setCoartem(drset.getString("Coartem"));
               distribution.setCetamol(drset.getString("Cetamol"));
                
                
             
               Drlist.add(distribution);
           }
           
        int size = Drlist.size();
           
         return Drlist;
          
       } catch (SQLException ex) {
           Logger.getLogger(LogicController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       }
       
    }
     
      public static List <Distribution> getallstockin(){
          DBquery conn = new DBquery();
        List <Distribution> Drlist=new  ArrayList<>();
       try {
           ResultSet drset = conn.getallstockin();
           
           while (drset.next()) {
               
               Distribution distribution = new Distribution();
              
               
               distribution.setDisid(drset.getString("distribution_id"));
               distribution.setRecieved(drset.getString("recieved"));
               distribution.setStockin(drset.getString("stockin_out"));
               
               distribution.setTime(drset.getString("time"));
               distribution.setHno(drset.getInt("heath_facility_health_facility_no"));
               distribution.setPanadol(drset.getString("Panadol"));
               distribution.setCeptrine(drset.getString("Ceptrine"));
               distribution.setTestkits(drset.getString("Testkits"));
               distribution.setMedicalgloves(drset.getString("Medical_gloves"));
               distribution.setArtenum(drset.getString("Artenum"));
               distribution.setCoartem(drset.getString("Coartem"));
               distribution.setCetamol(drset.getString("Cetamol"));
                distribution.setHname(drset.getString("heath_facility_name"));
                
             
               Drlist.add(distribution);
           }
           
        int size = Drlist.size();
           
         return Drlist;
          
       } catch (SQLException ex) {
           Logger.getLogger(LogicController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       }
       
    }
      
       public static List <Distribution> getallstockout(){
          DBquery conn = new DBquery();
        List <Distribution> Drlist=new  ArrayList<>();
       try {
           ResultSet drset = conn.getallstockout();
           
           while (drset.next()) {
               
               Distribution distribution = new Distribution();
              
               
               distribution.setDisid(drset.getString("distribution_id"));
               distribution.setRecieved(drset.getString("recieved"));
               distribution.setStockin(drset.getString("stockin_out"));
               
               distribution.setTime(drset.getString("time"));
               distribution.setHno(drset.getInt("heath_facility_health_facility_no"));
               distribution.setPanadol(drset.getString("Panadol"));
               distribution.setCeptrine(drset.getString("Ceptrine"));
               distribution.setTestkits(drset.getString("Testkits"));
               distribution.setMedicalgloves(drset.getString("Medical_gloves"));
               distribution.setArtenum(drset.getString("Artenum"));
               distribution.setCoartem(drset.getString("Coartem"));
               distribution.setCetamol(drset.getString("Cetamol"));
               distribution.setHname(drset.getString("heath_facility_name")); 
                
             
               Drlist.add(distribution);
           }
           
        int size = Drlist.size();
           
         return Drlist;
          
       } catch (SQLException ex) {
           Logger.getLogger(LogicController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       }
       
    }
    public static List <Distribution> getDistribution1(int hfno){
          DBquery conn = new DBquery();
        List <Distribution> Drlist=new  ArrayList<>();
       try {
           ResultSet drset = conn.getDistribution1(hfno);
           
           while (drset.next()) {
               
               Distribution distribution = new Distribution();
              
               
               distribution.setDisid(drset.getString("distribution_id"));
               distribution.setRecieved(drset.getString("recieved"));
               distribution.setStockin(drset.getString("stock_in"));
               distribution.setStockout(drset.getString("stock_out"));
               distribution.setTime(drset.getString("time"));
               distribution.setHno(drset.getInt("heath_facility_health_facility_no"));
               distribution.setPanadol(drset.getString("Panadol"));
               distribution.setCeptrine(drset.getString("Ceptrine"));
               distribution.setTestkits(drset.getString("Testkits"));
               distribution.setMedicalgloves(drset.getString("Medical_gloves"));
               distribution.setArtenum(drset.getString("Artenum"));
               distribution.setCoartem(drset.getString("Coartem"));
               distribution.setCetamol(drset.getString("Cetamol"));
                
                
             
               Drlist.add(distribution);
           }
           
        int size = Drlist.size();
           
         return Drlist;
          
       } catch (SQLException ex) {
           Logger.getLogger(LogicController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       }
       
    }
    
    public static List <Distribution> getdistrictDistribution(){
          DBquery conn = new DBquery();
        List <Distribution> Drlist=new  ArrayList<>();
       try {
           ResultSet drset = conn.getdistrictDistribution();
           
           while (drset.next()) {
               
               Distribution distribution = new Distribution();
              
               
               distribution.setDisid(drset.getString("distribution_id"));
               distribution.setRecieved(drset.getString("recieved"));
               distribution.setStockin(drset.getString("stockin_out"));
               distribution.setTime(drset.getString("time"));
               distribution.setHno(drset.getInt("heath_facility_health_facility_no"));
               distribution.setPanadol(drset.getString("Panadol"));
               distribution.setCeptrine(drset.getString("Ceptrine"));
               distribution.setTestkits(drset.getString("Testkits"));
               distribution.setMedicalgloves(drset.getString("Medical_gloves"));
               distribution.setArtenum(drset.getString("Artenum"));
               distribution.setCoartem(drset.getString("Coartem"));
               distribution.setCetamol(drset.getString("Cetamol"));
               distribution.setDistrict(drset.getString("district_name"));
                
             
               Drlist.add(distribution);
           }
           
        int size = Drlist.size();
           
         return Drlist;
          
       } catch (SQLException ex) {
           Logger.getLogger(LogicController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       }
       
    }
    
    public static List <HealthFac> getHealthfac(){
          DBquery conn = new DBquery();
        List <HealthFac> HFlist=new  ArrayList<>();
       try {
           ResultSet hfset = conn.gethealthfac();
           
           while (hfset.next()) {
               
               HealthFac healthfac = new HealthFac();
              
               
               healthfac.setNo(hfset.getInt("health_facility_no"));
               healthfac.setLevel(hfset.getInt("health_facility_level"));
               healthfac.setLocation(hfset.getString("heath_facility_location"));
               healthfac.setHfName(hfset.getString("heath_facility_name"));
               healthfac.setRegionNo(hfset.getInt("regions_region_no"));
               healthfac.setDistrictNo(hfset.getInt("district_district_no"));
               
              
             
               HFlist.add(healthfac);
           }
           
        int size = HFlist.size();
           
         return HFlist;
          
       } catch (SQLException ex) {
           Logger.getLogger(LogicController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       }
       
    }
    public static List <Deliveries> getDelivery(){
          DBquery conn = new DBquery();
        List <Deliveries> Dylist=new  ArrayList<>();
//        List <Region> reglist=new  ArrayList<>();
       try {
           ResultSet dlset = conn.getdelivery();
           
           while (dlset.next()) {
               
               Deliveries delivery = new Deliveries();
               Region reg = new Region();
              
               delivery.setDeliveryid(dlset.getInt("delivery_id"));
                delivery.setDeliveryname(dlset.getString("delivery_name"));
                delivery.setDeliveryphone(dlset.getInt("delivery_phone_no"));
               delivery.setDeliveryexp(dlset.getString("delivery_time_exp"));
               reg.setRname(null);
//               reg.setRno(Rno);
//               delivery.setRegion(reg);
               
              
             
               Dylist.add(delivery);
//               reglist.add(reg);
           }
           
        int size = Dylist.size();
           
         return Dylist;
          
       } catch (SQLException ex) {
           Logger.getLogger(LogicController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       }
       
    }
    public static List <Messages> getMessages(){
          DBquery conn = new DBquery();
        List <Messages> Mlist=new  ArrayList<>();
       try {
           ResultSet mset = conn.getmessages1();
           
           while (mset.next()) {
               
               Messages msg = new Messages();
              
               
               msg.setMsgTime(mset.getString("time"));
               msg.setMessageTitle(mset.getString("messages_title"));
               msg.setMsgText(mset.getString("messages_text"));
               msg.setHealthfacname(mset.getString("heath_facility_name"));
//              msg.setMessageTitle(mset.getString("messages_title"));
               
               
              
             
               Mlist.add(msg);
           }
           
        int size = Mlist.size();
           
         return Mlist;
          
       } catch (SQLException ex) {
           Logger.getLogger(LogicController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       }
       
    }
    public static List <Messages> getuserMessages(){
          DBquery conn = new DBquery();
        List <Messages> Mlist=new  ArrayList<>();
       try {
           ResultSet mset = conn.getusermessages();
           
           while (mset.next()) {
               
               Messages msg = new Messages();
              
               
               msg.setMsgTime(mset.getString("time"));
               msg.setMessageTitle(mset.getString("messages_title"));
               msg.setMsgText(mset.getString("messages_text"));
               msg.setHealthfacname(mset.getString("heath_facility_name"));
//              msg.setMessageTitle(mset.getString("messages_title"));
               
               
              
             
               Mlist.add(msg);
           }
           
        int size = Mlist.size();
           
         return Mlist;
          
       } catch (SQLException ex) {
           Logger.getLogger(LogicController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       }
       
    }
    
}
