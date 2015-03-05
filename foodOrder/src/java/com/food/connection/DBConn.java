/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author IshanFX
 */
public class DBConn {
    public static Connection dbConn(){
        
        Connection conn = null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddb", "root", "");
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return conn;
    
    } 
    
    public static int Getlastid(String clm,String tbl){//get all table id column last id 
       String sql;
       int maxid = 0;
       ResultSet rs=null;
       PreparedStatement ps=null;
       
        try{
                            
           ps=dbConn().prepareStatement("select max("+clm+") from "+tbl+"");
           rs=ps.executeQuery(); 
           
           while(rs.next()){
               maxid=rs.getInt(1);
           }          
            dbConn().close();
        }
        catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Check The Server","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        
        return maxid+1; //get last id and add 1 to id(10+1=11)
    } 
}
