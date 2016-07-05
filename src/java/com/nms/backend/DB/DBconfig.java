package com.nms.backend.DB;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBconfig {

    protected final String HOSTNAME = "localhost", DB_NAME = "emdms", PORT_NO = "3306", USERNAME = "root", PASSWORD = "";
    public static Connection conn;
    public static Statement state;
    public static ResultSet rSet;
    public int nRows;

    protected String URL = "";

    public Connection select_database(int i) {
        URL = "jdbc:mysql://" + HOSTNAME + ":" + PORT_NO;
        if (i == 0) {
            URL += "/" + DB_NAME;
        }
        try {
            try {
                Class.forName(URL).newInstance();
            } catch (Exception es) {/*es.printStackTrace();*/

            }
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            state = conn.createStatement();
            URL = "";
        } catch (SQLException es) {
            es.printStackTrace();
        }
        return conn;
    }

    public int intoDb_SPACIAL(String query) {
        return servant(query);
    }

    public int intoDb(String query) {
        return servant(query);
    }

    public ResultSet outOfDb(String query) {
        conn = select_database(0);
        try {
            rSet = state.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBconfig.class.getName()).log(Level.SEVERE, null, ex);
            CloseConnection();
        }
        return rSet;
    }

    public static void CloseConnection() {
        try {
            if (rSet != null) 
                rSet.close();
            if (state != null) 
                state.close();
            if (conn != null) 
                conn.close();
        } catch (SQLException logOrIgnore) {
            Logger.getLogger(DBconfig.class.getName()).log(Level.SEVERE, null, logOrIgnore);
        }
    }

    private int servant(String query) {
        int l = 0;
        try {
            conn = select_database(0);
        
            l = state.executeUpdate(query);
//            System.out.println("after check point 2");
            CloseConnection();
            return l;
        } catch (SQLException ex) {
            ex.printStackTrace();
            CloseConnection();
            return l;
        }
        
    }

}
