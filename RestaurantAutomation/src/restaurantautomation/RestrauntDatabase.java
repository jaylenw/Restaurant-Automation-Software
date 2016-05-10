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
            build();
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
    
    public void build(){
        
        menu();
        employee();
        tables();
        orders();
        alter1();
        alter2();
        
        
    }
    private void orders(){
        PreparedStatement prep;
        try{
            prep = conn.prepareStatement("create table orders(orderID INT, "
                    + "qty INT, itemName varChar(20), CONSTRAINT pk_orderID "
                    + "PRIMARY KEY (orderID), CONSTRAINT fk_itemName FOREIGN KEY"
                    + " (itemName) REFERENCES menu(itemName))");
            prep.executeUpdate();
        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
    }
    private void alter2(){
        PreparedStatement prep;
        try{
        prep = conn.prepareStatement("alter table orders add constraint "
                + "fk_tableNum FOREIGN KEY (tableNumber) "
                + "references tables(tableNumber)");
        prep.executeUpdate();
        }
        catch(SQLException sql){/*System.out.println(sql.getMessage());*/}
    }
    private void alter1(){
        PreparedStatement prep;
        try{
        prep = conn.prepareStatement("alter table orders add tableNumber int");
        prep.executeUpdate();}
        catch(SQLException sql){/*System.out.println(sql.getMessage());*/}
    }
    private void tables(){
        PreparedStatement prep;
        try{
        prep = conn.prepareStatement("create table tables( tableStatus varChar(1), "
               + "tableNumber INT, CONSTRAINT pk_tableNumber "
               + "PRIMARY KEY (tableNumber))");
        prep.executeUpdate();}
        catch(SQLException sql){System.out.println(sql.getMessage());}
    }
    private void employee(){
        PreparedStatement prep;
        try{
        prep = conn.prepareStatement("create table employee("
               + "fname varChar (20), lname varChar (20), username varChar(20), "
               + "password varChar(20), priority INT;)");
        prep.executeUpdate();}
        catch(SQLException sql){/*System.out.println(sql.getMessage());*/}
    }
    private void menu(){
        PreparedStatement prep;
        try{
       prep = conn.prepareStatement("create table menu( "
               + "itemName varChar (20), price INT, CONSTRAINT pk_itemName "
               + "PRIMARY KEY (itemName))");
        prep.executeUpdate();
        }
        catch(SQLException sql){/*System.out.println(sql.getMessage());*/}
    }
    
    public static String dispNull(String input) {
        
        if (input == null || input.length() == 0) {
            return "N/A";
        } else {
            return input;
        }
    }
    
    //////////EMPLOYEE METHODS
    
    public boolean isEmployee(String username){
        if(getEmployeeData(username).size() != 0)
            return true;
        return false;
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
    
    public ArrayList<String> getAllUsernames(){
        ArrayList<String> names = new ArrayList<String>();
        try{
       PreparedStatement prep = conn.prepareStatement("select username from employee");
       ResultSet query = prep.executeQuery();
       //query.next();
       while(query.next()){
           names.add(query.getString(1));
       }
        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
        return names;
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
    
////////////////////MENU
    
    public void insertItem(String itemName, int price){
        try{
       PreparedStatement prep = conn.prepareStatement("insert into menu values(?,?)");
       prep.setString(1, itemName);
       prep.setString(2, price+"");
       prep.executeUpdate();
        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
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
    
    public void updateItemPrice(String itemName, int price){
        deleteItem(itemName);
        insertItem(itemName, price);
    }
    
    public int getPrice(String itemName){
        int price = -1; 
        try{
        PreparedStatement prep = conn.prepareStatement("select price from menu where itemName = ?");
       prep.setString(1, itemName);
        ResultSet r = prep.executeQuery();
        r.next();
        price = Integer.parseInt(r.getString(1));
        }
        catch(SQLException sql){System.out.println(sql.getMessage());
        }
        return price;
    }
    
    public ArrayList<String> getAllItems(){
        ArrayList<String> names = new ArrayList<String>();
        try{
        PreparedStatement prep = conn.prepareStatement("select itemName from menu");
        ResultSet r = prep.executeQuery();
        while(r.next()){
            names.add(r.getString(1));
        }
        }
        catch(SQLException sql){System.out.println(sql.getMessage());
        }
        return names;
    }
    
    
////////////////////TABLE
    public void setStaus(int num,String status){
        try{
       PreparedStatement prep = 
               conn.prepareStatement("update tables set tableStatus = ? where tables.tableNumber = ?");
       prep.setString(1, status);
       prep.setString(2, num+"");
       prep.executeUpdate();
        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
    }
    
    public void insertTable(String tableStatus, int tableNum){
         try{
       PreparedStatement prep = conn.prepareStatement("insert into tables values(?,?)");
       prep.setString(1, tableStatus);
       prep.setString(2, tableNum+"");
       prep.executeUpdate();
        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
    }
    
    public void deleteTable(int tableNum){
         try{
       PreparedStatement prep = conn.prepareStatement("delete from tables where"
               + " tableNumber = ?");
       prep.setString(1, tableNum+"");
       prep.executeUpdate();
        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
    }

//////////////////ORDERS
    public void insertOrder(int orderID, int qty, String itemName, int tableNum){
        try{
       PreparedStatement prep = conn.prepareStatement("insert into orders values(?,?,?, ?)");
       prep.setString(3, itemName);
       prep.setString(2, qty+"");
       prep.setString(1, orderID+"");
       prep.setString(4, tableNum+"");
       prep.executeUpdate();
       }
       catch(SQLException sql){System.out.println(sql.getMessage());}
    }
    
    public void deleteOrder(int orderID){
         try{
       PreparedStatement prep = conn.prepareStatement("delete from orders"
               + " where orderID = ?");
       prep.setString(1, orderID+"");
       prep.executeUpdate();
       }
       catch(SQLException sql){System.out.println(sql.getMessage());}
    }

////////////////BILL
    public int total(int tableNum){ 
        int num = -1;
        try{
       PreparedStatement prep = conn.prepareStatement("select SUM(price*qty) from "
               + "(orders natural join menu) where orders.tableNumber = ?");
       prep.setString(1, tableNum+"");
       ResultSet query = prep.executeQuery();
       query.next();
       num = query.getInt(1);

        }
        catch(SQLException sql){System.out.println(sql.getMessage());}
        return num;
    }
    
    

}
    

    