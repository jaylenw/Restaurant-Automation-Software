/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantautomation;
import java.sql.*;
import java.util.ArrayList;
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
       //System.out.println(fname);
    }
    
    public void insertItem(String itemName, int price){
        try{
       PreparedStatement prep = conn.prepareStatement("insert into menu values(?,?)");
       prep.setString(1, itemName);
       prep.setString(2, price+"");
       prep.executeUpdate();
        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
       //System.out.println(fname);
    }
    
    public ArrayList<String> getEmployeeData(String username){
        ArrayList<String> list = new ArrayList<String>();
        try{
       PreparedStatement prep = conn.prepareStatement("select * from employee where username = ?");
       prep.setString(1, username);
       ResultSet query = prep.executeQuery();
       query.next();
       for(int i = 1; i < 6; i++){
           list.add(query.getString(i));
         }
       
       }
        catch(SQLException sql){System.out.println(sql.getMessage());}
       return list; 
    }
    
    public void updateItemPrice(String itemName, int price){
        deleteItem(itemName);
        insertItem(itemName, price);
    }
    
    public void deleteEmployee(String username){
        
        try{
       PreparedStatement prep = conn.prepareStatement("delete from employee where username = ?");
       prep.setString(1, username);
       prep.executeUpdate();
        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
       //System.out.println(fname);
    }
    public void deleteItem(String itemName){
        
        try{
       PreparedStatement prep = conn.prepareStatement("delete from menu where itemName = ?");
       prep.setString(1, itemName);
       prep.executeUpdate();
        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
       //System.out.println(fname);
    }
 }

    

    