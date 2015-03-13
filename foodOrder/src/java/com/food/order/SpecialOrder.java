/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food.order;

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
public class SpecialOrder extends Order implements OrderInterface {
    private String ordCusName;
    private String ordAddress;
    private String ordFoodCategory;
    private String ordDeliverDate;
    private String ordDesc;
    private String ordQuantity;
    private PreparedStatement pstmt;
    private ResultSet rst;
    private Statement stmt;
    
    
    public String getOrdCusName() {
        return ordCusName;
    }

    public void setOrdCusName(String ordCusName) {
        this.ordCusName = ordCusName;
    }

    public String getOrdAddress() {
        return ordAddress;
    }

    public void setOrdAddress(String ordAddress) {
        this.ordAddress = ordAddress;
    }

    public String getOrdFoodCategory() {
        return ordFoodCategory;
    }

    public void setOrdFoodCategory(String ordFoodCategory) {
        this.ordFoodCategory = ordFoodCategory;
    }

    public String getOrdDeliverDate() {
        return ordDeliverDate;
    }

    public void setOrdDeliverDate(String ordDeliverDate) {
        this.ordDeliverDate = ordDeliverDate;
    }

    public String getOrdDesc() {
        return ordDesc;
    }

    public void setOrdDesc(String ordDesc) {
        this.ordDesc = ordDesc;
    }

    public String getOrdQuantity() {
        return ordQuantity;
    }

    public void setOrdQuantity(String ordQuantity) {
        this.ordQuantity = ordQuantity;
    }

    @Override
    public void addOrder() {
       
    
    }
    
    @Override
    public ResultSet getOrderDetails(){
        String sql = "SELECT o.orderid,so.ordfoodcate,so.orddesc,so.orderquantity,so.orddeliverdate,so.ordercusname,so.ordaddress,o.orderyear,o.ordermonth,o.orderday,o.ordertime,so.ordstate FROM order_tbl o,specialord_tbl so WHERE o.orderid=so.orderid ";
        try {
            stmt = DBConn.dbConn().createStatement();
            rst = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SpecialOrder.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rst;
    }
     
    @Override
    public int changeOrderStatus(){
        String sql = "UPDATE specialord_tbl set ordstate='D' WHERE orderid='"+getOrderId()+"'";
        int chk = 0;
        
        try {
            stmt = DBConn.dbConn().createStatement();
            chk = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SpecialOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return chk;
    }
    
}
