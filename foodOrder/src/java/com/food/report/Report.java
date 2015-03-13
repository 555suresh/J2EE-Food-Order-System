/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food.report;

import com.food.connection.DBConn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IshanFX
 */
public class Report {
   
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rst;
    private double normalIncome;
    private double specialOrder;
    private double monthlyIncome;
    
    
    
    public double getAnnualIncome(){
        
        String sql1 = "SELECT SUM(ordtotal) FROM normalord_tbl";
        try {
            stmt = DBConn.dbConn().createStatement();
            rst = stmt.executeQuery(sql1);
            while(rst.next()){
                normalIncome = rst.getDouble(1);
            }
            String sql2 = "SELECT SUM(ordtotal) FROM specialord_tbl";
            stmt = DBConn.dbConn().createStatement();
            rst = stmt.executeQuery(sql2);
            while(rst.next()){
                specialOrder = rst.getDouble(1);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return normalIncome+specialOrder; 
  
    }
    
    public double getCurrentMonthIncome(){
    
        String sql1 = "SELECT SUM(no.ordtotal) FROM normalord_tbl no,order_tbl o WHERE no.orderid=o.orderid AND o.ordermonth=2";
        try {
            stmt = DBConn.dbConn().createStatement();
            rst = stmt.executeQuery(sql1);
            while(rst.next()){
                monthlyIncome = rst.getDouble(1);
            }
            
            String sql2 = "SELECT SUM(so.ordtotal) FROM specialord_tbl so,order_tbl o WHERE o.orderid=so.orderid AND o.ordermonth=2";
            stmt = DBConn.dbConn().createStatement();
            rst = stmt.executeQuery(sql2);
            while(rst.next()){
                monthlyIncome += rst.getDouble(1);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return monthlyIncome; 
    }
    
    public ResultSet getAllMonthIncome(){
        String sql = "SELECT SUM(n.ordtotal) FROM normalord_tbl n,order_tbl o WHERE o.orderid=n.orderid Group by o.ordermonth";
        int rowCount=0;
        try {
            stmt = DBConn.dbConn().createStatement();
            rst = stmt.executeQuery(sql);
            while(rst.next()){
            rowCount =  rst.getRow();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rst;
    }
  
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
