/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantautomation;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Michael
 */
public class RestrauntDatabase {
    static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static String DB_URL = "jdbc:derby://localhost:1527/";
    
    static Statement stmt;
    static Connection conn;
    
    public RestrauntDatabase(){
        try {
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DB_URL = DB_URL + "RestrauntEmployees" + ";user=" + "access" + ";password=" + "granted";
            conn = DriverManager.getConnection(DB_URL);
        
            stmt = conn.createStatement();
        }
        catch (SQLException se) {
            
            se.printStackTrace();
        } catch (Exception e) {
           
            e.printStackTrace();
        }
    }
    
    public void end(){
        try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
    }
    
    public static String dispNull(String input) {
        
        if (input == null || input.length() == 0) {
            return "N/A";
        } else {
            return input;
        }
    }
    
    public void insertEmployee(String fname, String lname, String username, 
            String password, int priority){
        try{
       PreparedStatement prep = conn.prepareStatement("insert into employee values(?,?,?,?,?)");
       prep.setString(1, fname);
       prep.setString(2, lname);
       prep.setString(3, username);
       prep.setString(4, password);
       prep.setString(5, priority+"");
       prep.executeUpdate();
        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
       System.out.println(fname);
    }
}
    

    