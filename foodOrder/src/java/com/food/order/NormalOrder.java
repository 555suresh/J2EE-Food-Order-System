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
public class NormalOrder extends Order implements OrderInterface {
    private int orderQuantity;
    private double orderPrice;
    private int orderFoodId;
    
    public PreparedStatement pstmt;
    public Statement stmt;

    public int getOrderFoodId() {
        return orderFoodId;
    }

    public void setOrderFoodId(int orderFoodId) {
        this.orderFoodId = orderFoodId;
    }
    
    
    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }
 
    @Override
    public void addOrder() {
        
    }
    
    @Override
    public ResultSet getOrderDetails(){
        ResultSet rst = null;
       String sql = "SELECT o.orderid,f.foodcategory,f.foodname,no.ordquantity,no.orderextra,no.orddeliverdate,no.orderaddress,o.orderyear,o.ordermonth,o.orderday,o.ordertime,no.orderstate,f.foodid FROM food_tbl f,normalord_tbl no,order_tbl o WHERE o.orderid=no.orderid AND no.foodid=f.foodid";
        try {
            stmt = DBConn.dbConn().createStatement();
            rst = stmt.executeQuery(sql);
            
        } catch (SQLException ex) {
           
        }
        return rst;
    }

    @Override
    public int changeOrderStatus() {
        String sql = "UPDATE normalord_tbl set orderstate='D' WHERE orderid='"+getOrderId()+"' AND foodid='"+getOrderFoodId()+"'";
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
