package com.nms.backend.DB;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBquery extends DBconfig {

    private boolean check = false;

    public DBquery() {
    }



    public boolean checkUser(String name) {
        try {
            boolean result = false;
            result = outOfDb("SELECT * FROM user where username = '" + name + "' ;").next();
            CloseConnection();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            CloseConnection();
            return false;
        }
    }
    
    
     

    public void insertDataToAdmin() {
        intoDb("INSERT INTO user (firstname,lastname ,username ,password,role) VALUES ( 'usr1', 'usr2', 'nms',MD5('emhdms'),'Admin');");
    }

    public void addUser(String[] nameValue) {
        if (!checkUser(nameValue[2])) {
            nameValue = cleanTheQuerry(nameValue);
            intoDb("INSERT INTO user (firstname,lastname ,username ,password,role) VALUES ( '" + nameValue[0] + "','" + nameValue[1] + "','" + nameValue[2] + "',MD5('" + nameValue[3] + "'),'" + nameValue[4] + "');");
        } else {
        }
    }

//    public void addBranch(String[] nameValue) {
//        if (!check_code(nameValue[0])) {
//            nameValue = cleanTheQuerry(nameValue);
//            intoDb("INSERT INTO branch (branch_code,branch_name ,branch_loc,branch_manager,br_user ) VALUES ( '" + nameValue[0] + "','" + nameValue[1] + "','" + nameValue[2] + "','" + nameValue[3] + "','" + Equity_Bank.LOGIN_USER_ID + "');");
//        } else {
//        }
//    }
//
//    public void addTitle(String[] nameValue) {
//        nameValue = cleanTheQuerry(nameValue);
//        intoDb("INSERT INTO tittle (bak_id,tittle_details,t_user ) VALUES ( " + nameValue[0].trim() + ",'" + nameValue[1].replace("'", "''") + "','" + Equity_Bank.LOGIN_USER_ID + "');");
//    }

    public boolean check_code(String code) {
        try {
            boolean result = false;
            result = outOfDb("SELECT * FROM branch WHERE branch_code = '" + code + "' ;").next();
            CloseConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(DBquery.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int countUnique(String code) {
         ResultSet result ; int r=0;
        try {
            result = outOfDb("SELECT  COUNT(distinct cust_id ) AS num FROM  `drugs` WHERE branch_cod ='"+code+"' ");
            while(result.next())
                r= result.getInt("num");
            CloseConnection();
//            System.out.println("result count "+ r);
            return r;
        } catch (SQLException ex) {
            Logger.getLogger(DBquery.class.getName()).log(Level.SEVERE, null, ex);
            return r;
        }
    }

    /*
     * (0)branch_cod, (1)cust_id , (2)cust_name , (3)cust_tel , (4)insurer ,  (5)insurance_policy_no , (6)ownership , (7)valuer, (8)incumberance, (9)omv ,
     * (10)fsv , (11)insurance_value  ,(12)ins_expiry_date ,(13)no_of_securities ,  (14)collateral_id
     * */
//    public boolean addCollateral(String[] nameValue) {
//        nameValue = cleanTheQuerry(nameValue);
//        return intoDb("INSERT INTO collateral (branch_cod, cust_id, cust_name, cust_tel, insurer, insurance_policy_no, ownership,  valuer, incumberance, omv, fsv, insurance_value, ins_expiry_date, no_of_securities,   b_user)VALUES ( '" + nameValue[0] + "','" + nameValue[1] + "','" + nameValue[2].replace("'", "''") + "','" + nameValue[3] + "','" + nameValue[4] + "','" + nameValue[5] + "','" + nameValue[6] + "','" + nameValue[7] + "','" + nameValue[8] + "','" + nameValue[9] + "','" + nameValue[10] + "','" + nameValue[11] + "','" + nameValue[12].trim() + "','" + nameValue[13] + "','" + Equity_Bank.LOGIN_USER_ID + "' )") == 1;
//    }
//
    public void updateUser(String[] nameValue, int id) {
        nameValue = cleanTheQuerry(nameValue);
        intoDb("UPDATE user SET firstname='" + nameValue[0] + "' ,lastname='" + nameValue[1] + "' ,username='" + nameValue[2] + "',password ='" + nameValue[3] + "',role ='" + nameValue[4] + "' WHERE userid=" + id + ";");
    }
//
//    public void updateBranch(String[] nameValue, int id) {
//        nameValue = cleanTheQuerry(nameValue);
//        intoDb("UPDATE branch SET branch_code='" + nameValue[0] + "',branch_name='" + nameValue[1] + "' ,branch_loc='" + nameValue[2] + "',branch_manager='" + nameValue[3] + "',br_user='" + Equity_Bank.LOGIN_USER_ID + "' WHERE branch_id=" + id + ";");
//    }
//
//    public void updateTitle(String[] nameValue, int id) {//bak_id,tittle_details,t_user
//        nameValue = cleanTheQuerry(nameValue);
//        intoDb("UPDATE tittle SET tittle_details = '" + nameValue[1].replace("'", "''") + "', bak_id ='" + nameValue[0] + "', t_user='" + Equity_Bank.LOGIN_USER_ID + "'  WHERE tittle_id=" + id + "");
//    }

    /*
     * (0)branch_cod, (1)cust_id , (2)cust_name , (3)cust_tel , (4)insurer ,  (5)insurance_policy_no , (6)ownership , (7)valuer, (8)incumberance, (9)omv ,
     * (10)fsv , (11)insurance_value  ,(12)ins_expiry_date ,(13)no_of_securities ,  (14)collateral_id
     * */
//    public void updateCollateral(String[] nameValue, int id) {
//        nameValue = cleanTheQuerry(nameValue);
//        intoDb("UPDATE collateral SET branch_cod = '" + nameValue[0] + "', cust_id = '" + nameValue[1] + "', cust_name = '" + nameValue[2].replace("'", "''") + "', cust_tel='" + nameValue[3] + "', insurer='" + nameValue[4] + "', insurance_policy_no='" + nameValue[5] + "', ownership='" + nameValue[6] + "',  valuer='" + nameValue[7] + "', incumberance='" + nameValue[8] + "', omv='" + nameValue[9] + "', fsv='" + nameValue[10] + "', insurance_value='" + nameValue[11] + "', ins_expiry_date='" + nameValue[12] + "', no_of_securities='" + nameValue[13] + "',   b_user ='" + Equity_Bank.LOGIN_USER_ID + "'" + " WHERE collateral_id=" + id + ";");
//    }

    public String deleteUser(int id) {
        return intoDb("DELETE FROM user WHERE userid=" + id + " ;") == 1 ? "success" : "fail";
    }

    public String deleteBranch(int id) {
        return intoDb("DELETE FROM branch WHERE branch_id=" + id + " ;") == 1 ? "success" : "fail";
    }

    public String deleteDet(int id) {
        return intoDb("DELETE FROM tittle WHERE tittle_id=" + id + " ;") == 1 ? "success" : "fail";
    }

    public String deleteCollateral(int id) {
        return intoDb("DELETE FROM collateral WHERE collateral_id=" + id + " ;") == 1 ? "success" : "fail";
    }

    public ResultSet loadUser_atStart() {
        return outOfDb("SELECT * FROM user ;");
    }

    public ResultSet loadBranch_atStart() {
        return outOfDb("SELECT *,count(collateral_id) As num FROM branch left join collateral on branch_code=branch_cod group by branch_id;");
    }

    public ResultSet loadAUser(int i) {
        return (i == 0) ? outOfDb("SELECT * FROM user WHERE userid=(SELECT MAX(userid) FROM user);") : outOfDb("SELECT * FROM user ;");
    }

    public ResultSet loadABranch(int i) {
        return (i == 0) ? outOfDb("SELECT * ,count(collateral_id) As num FROM branch left join collateral on branch_code=branch_cod WHERE branch_id=(SELECT MAX(branch_id) FROM branch) group by branch_id;") : outOfDb("SELECT *,count(collateral_id) As num FROM branch left join collateral on branch_code=branch_cod group by branch_id;");
    }

    public ResultSet loadCollateral(int i) {
        return (i == 0) ? outOfDb("SELECT * FROM collateral WHERE collateral_id=(SELECT MAX(collateral_id) FROM collateral) ORDER BY  cust_name ASC, date_inset ASC ;") : outOfDb("SELECT * FROM collateral ORDER BY  cust_name ASC, date_inset ASC ;");
    }

    public ResultSet loadUsingId(String account) {
        return outOfDb("SELECT * FROM collateral left join branch on branch_code=branch_cod WHERE cust_id='" + account.trim() + "' ORDER BY  cust_name ASC, date_inset ASC ;");
    }

    public ResultSet loadUsingName(String account) {
        return outOfDb("SELECT * FROM collateral left join branch on branch_code=branch_cod WHERE cust_name like '%" + account.trim() + "%' ORDER BY  cust_name ASC, date_inset ASC ;");
    }

    public ResultSet getCollateralOfBranchCode(String pass) {
        return outOfDb("SELECT * FROM collateral where branch_cod='" + pass + "' ORDER BY  cust_name ASC, date_inset ASC ;");
    }

    public ResultSet maxpick() {
        return outOfDb("SELECT MAX(collateral_id) as col_id  FROM collateral ORDER BY  cust_name ASC, date_inset ASC ");
    }

    public ResultSet sepBranch2(String pass) {
        return outOfDb("SELECT * FROM collateral where cust_id='" + pass + "' ORDER BY  cust_name ASC, date_inset ASC ;");
    }

    public ResultSet getTitlesOfCollateral(int pass) {
        return outOfDb("SELECT * FROM tittle where bak_id=" + pass + ";");
    }

    public ResultSet difference(int pass) {
        return outOfDb("SELECT *,count(tittle_id) as no FROM tittle where bak_id=" + pass + " group by bak_id;");
    }

    public ResultSet Exp(String lower, String upper, int x,int status) {
        return (x == 0)
                ? outOfDb("SELECT * FROM collateral Where status="+status+" and ins_expiry_date >= '" + lower + "' and ins_expiry_date <= '" + upper + "' ORDER BY  cust_name ASC, date_inset ASC ;") : outOfDb("SELECT * FROM collateral Where status="+status+" and ins_expiry_date < '" + lower + "' ORDER BY  cust_name ASC, date_inset ASC ;");
    }

    public ResultSet Exp_c(String lower, String upper, int x,int status) {
        return (x == 0)
                ? outOfDb("SELECT  count(collateral_id) As c FROM collateral Where status="+status+" and ins_expiry_date >= '" + lower + "' and ins_expiry_date <= '" + upper + "' ORDER BY  cust_name ASC, date_inset ASC ;") : outOfDb("SELECT  count(collateral_id) As c FROM collateral Where status="+status+" and ins_expiry_date < '" + lower + "' ORDER BY  cust_name ASC, date_inset ASC ;");
    }

    public ResultSet loadUserLogin(String username, String password) {
        return outOfDb("SELECT * FROM user where username ='" + username + "'  and password =MD5('" + password + "');");
    }

    public ResultSet getAllCol() {
        return outOfDb("Select count(collateral_id) as col_tot, sum(no_of_securities) as tit_tot from collateral"); //To change body of generated methods, choose Tools | Templates.
    }

    private String[] cleanTheQuerry(String[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = (!array[i].contains("''")) ? (array[i].contains("'") ? array[i].replace("'", "''") : array[i]) : array[i];
            } catch (NullPointerException e) {
            }
        }
        return array;
    }

    public boolean deleteBank(String id) {
        return intoDb("DELETE FROM collateral WHERE collateral_id=" + id + " ;") == 1;
    }

//    public boolean closeBank(String id,int status) {
////        UPDATE  `collateral` SET status=0 where `cust_id`=10385618
//        return  intoDb("UPDATE collateral SET status="+status+",  b_user ='" + Equity_Bank.LOGIN_USER_ID + "'  WHERE collateral_id=" + id + ";")==1;
//    }

    public void addnewuser(String fname, String lname, String email) {
        intoDb("insert into user(firstname, lastname, email) values('"+ fname+ "','"+lname+"','"+email+"')");
    }
    
    

    public ResultSet getUsers() {
        return outOfDb("select * from user;");
    }

   public void addnewRegion(String rname) throws NullPointerException{
        intoDb("INSERT INTO regions (region_name) VALUES ('"+rname+"' );");
    }
   
   
    public void addHealthfac(int level,String location,String hfname ,int Zone, int district)throws NullPointerException {
        
 try{
     
            intoDb(" INSERT INTO heath_facility ( health_facility_level, heath_facility_location, heath_facility_name, regions_region_no, district_district_no) VALUES ( "+level+", '"+ location+ "', '"+ hfname+ "', "+ Zone+ ","+ district+ " )");


            System.out.println("sucess added!");
        }
         catch(Exception e){
         System.out.print(e);
         e.printStackTrace();
         }
        
    }
   
   public ResultSet getregions() {
        return outOfDb("select * from regions;");
    }
public ResultSet getdelivery() {
        return outOfDb("select delivery_id,delivery_name,delivery_phone_no,delivery_time_exp from deliveries");
    }
    public ResultSet getdistricts() {
         return outOfDb("SELECT  * FROM  district LEFT JOIN  regions ON  regions_region_no = region_no GROUP BY  district_no");

    }

      public ResultSet getzones() {
         return outOfDb("SELECT  * FROM  zone ");

    }
 public ResultSet getdistricts1() {
         return outOfDb("SELECT  * FROM  district WHERE regions_region_no = '1'");

    }
    public ResultSet getdistricts2() {
         return outOfDb("SELECT  * FROM  district SELECT WHERE regions_region_no = '2'");

    }
 public ResultSet getdistricts3() {
         return outOfDb(" SELECT  * FROM  district WHERE regions_region_no = '10'");

    }
 
  public ResultSet getdistricts4(){
         return outOfDb("SELECT  * FROM  district WHERE regions_region_no = '4'");

    }
   public ResultSet getdistricts5() {
         return outOfDb("SELECT  * FROM  district WHERE regions_region_no = '5'");

    }

    public ResultSet getDistribution() {
         return outOfDb("SELECT  * FROM  distribution LEFT JOIN heath_facility ON heath_facility_health_facility_no = health_facility_no");    }
    
    public ResultSet gethfcDistribution() {
         return outOfDb("SELECT  * FROM  distribution WHERE heath_facility_health_facility_no = 1");    }
    
    public ResultSet getDistribution1(int hfno) {
         return outOfDb("SELECT  * FROM  distribution WHERE heath_facility_health_facility_no= "+hfno+" ");    }
    
    public ResultSet getdistrictDistribution() {
         return outOfDb("SELECT * FROM  `distribution` LEFT JOIN heath_facility ON heath_facility_health_facility_no = health_facility_no LEFT JOIN district ON district_district_no = district_no");    }
    
    
    public ResultSet getmessages1() {
    return outOfDb("SELECT  * FROM  messages LEFT JOIN  heath_facility ON  heath_facility_health_facility_no = health_facility_no GROUP BY  message_id");
    
    }
    public ResultSet getusermessages() {
    return outOfDb("SELECT  * FROM  messages LEFT JOIN  heath_facility ON  heath_facility_health_facility_no = health_facility_no  where message_in_out=2 and heath_facility_health_facility_no = 1 GROUP BY  message_id ");
    
    }
    
    public ResultSet getstockin(int hfno) {
         return outOfDb("SELECT  * FROM  distribution WHERE heath_facility_health_facility_no= "+hfno+" ");    }
    
    public ResultSet getallstockin() {
         return outOfDb("SELECT *  FROM  `distribution`LEFT JOIN heath_facility ON heath_facility_health_facility_no = health_facility_no WHERE  `stockin_out` =  'stock in'");    }
    
     public ResultSet getallstockout() {
         return outOfDb("SELECT *  FROM  `distribution`LEFT JOIN heath_facility ON heath_facility_health_facility_no = health_facility_no WHERE  `stockin_out` =  'stock out'");    }
    
    public ResultSet getuserHc() {
    return outOfDb("SELECT  * FROM  messages LEFT JOIN  heath_facility ON  heath_facility_health_facility_no = health_facility_no GROUP BY  message_id");


    
    }
    public ResultSet getmessages() {
    return outOfDb("SELECT  * FROM  messages");


    
    }
public void confirmdelivery(String deliveryStatus) {
            try{
            intoDb("UPDATE distribution SET recieved =  '"+ deliveryStatus+ "' WHERE heath_facility_health_facility_no =2");
                System.out.println("updated");
        }
         catch(Exception e){
         System.out.print(e);
         e.printStackTrace();
         }

}
//    public void addnewdistribution( int healthfaciliity, String panadol, String ceptrine, String testkits, String gloves, String artenum, String coartem, String cetamol) {
//        
//        try{
//     
//            intoDb(" insert into distribution (heath_facility_health_facility_no,Panadol, Ceptrine, Testkits, Gloves, Artenum, Coartem, Cetamol) values("+healthfaciliity+ ",'"+ panadol+ "','"+ceptrine+"','"+testkits+"','"+gloves+"','"+artenum+"','"+coartem+"','"+cetamol+"')");
//       
//        
//        }
//         catch(Exception e){
//         System.out.print(e);
//         e.printStackTrace();
//         }
//    
//        }
//        
        public void addnewdistribution(String recieved, String stockin_out, int hno, String panadol, String ceptrine, String testkits, String gloves, String artenum, String coartem, String cetamol) {
        
        try{
     
            intoDb(" insert into distribution (distribution_id, recieved, stockin_out, time, heath_facility_health_facility_no,Panadol, Ceptrine, Testkits, Medical_gloves, Artenum, Coartem, Cetamol) values( '0','"+ recieved+ "','"+ stockin_out+ "', CURRENT_TIMESTAMP ,"+ hno+ ",'"+ panadol+ "','"+ceptrine+"','"+testkits+"','"+gloves+"','"+artenum+"','"+coartem+"','"+cetamol+"')");


            System.out.println("sucess");
        }
         catch(Exception e){
         System.out.print(e);
         e.printStackTrace();
         }
        
    
        }

    public ResultSet gethealthfac() {
        return outOfDb("SELECT  * FROM  heath_facility");
        
    }

    public void sendnewmessage(String title, String text,  int msgtype) {
        
        try{
     
            intoDb(" INSERT INTO messages ( messages_title, messages_text,message_in_out, time, heath_facility_health_facility_no, msgtype_msgtype_no) VALUES ( '"+title+ "', '"+ text+ "','1', CURRENT_TIMESTAMP, '1', '2')");


            System.out.println("sucess");
        }
         catch(Exception e){
         System.out.print(e);
         e.printStackTrace();
         }
        
    
        }

    public void addnewhealthoff(String fname, String lname, int level, String username, String password, int healthfac, int district ) {
        
        try{
     
            intoDb(" INSERT INTO heath_officer ( health_officer_Fname, health_officer_Lname, health_officer_Level, Usename, Password, heath_facility_health_facility_no,district_district_no) VALUES ( '"+fname+ "', '"+ lname+ "', "+level+ " , '"+ username+ "', '"+ password+ "',"+ healthfac+ ","+ district+ " )");


            System.out.println("sucess");
        }
         catch(Exception e){
         System.out.print(e);
         e.printStackTrace();
         }

    
    }

    public void sendadminmessage(String title, int inout, String text, int healthfac, int msgtype, int zone, int district) {
        
    try{
     
            intoDb("INSERT INTO messages (message_id, messages_title, message_in_out, messages_text, time, heath_facility_health_facility_no, msgtype_msgtype_no, region_no, district_no) VALUES ('0', '"+title+ "', "+inout+ ", '"+text+ "', CURRENT_TIMESTAMP, "+healthfac+ ", "+msgtype+ ", "+zone+ ", "+district+ ")");

            System.out.println("sucess");
        }
         catch(Exception e){
         System.out.print(e);
         e.printStackTrace();
         }
        
        
    }

    public void adddelivery(String deliveryname, int phoneno,String timexp, String deliverydate,int distno,int hfno) {

         try{
     
            intoDb("INSERT INTO deliveries (delivery_name, delivery_phone_no, delivery_time_exp, delivery_date, district_district_no, heath_facility_health_facility_no) VALUES ('"+deliveryname+ "', "+phoneno+ ", '"+timexp+ "','"+deliverydate+ "', "+distno+ ", "+hfno+ ")");

            System.out.println("sucess");
        }
         catch(Exception e){
         System.out.print(e);
         e.printStackTrace();
         }
        
    
    }

    

    
  
  
}
