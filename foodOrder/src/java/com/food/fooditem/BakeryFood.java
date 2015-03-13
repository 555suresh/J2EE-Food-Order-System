/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food.fooditem;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import com.food.connection.DBConn;

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author IshanFX
 */
public class BakeryFood extends Food implements FoodManage {

    private ResultSet rst;
    private PreparedStatement pstmt;
    private Statement stmt;
    
    public BakeryFood() {
        
    }
    

    @Override
    public int addFoodItems() {
        int chk = 0;
        String sql= "INSERT INTO food_tbl(foodid,foodname,foodprice,fooddesc,foodstatus,foodcategory,foodimg) VALUES(?,?,?,?,?,?,?)";
        try {
            InputStream stream = getFoodimage().getInputStream();
            pstmt = DBConn.dbConn().prepareStatement(sql);
            pstmt.setInt(1,getFoodId());
            pstmt.setString(2, getFoodName());
            pstmt.setDouble(3,getFoodPrice());
            pstmt.setString(4,getFoodDesc());
            pstmt.setString(5, getFoodstatus());
            pstmt.setString(6, getFoodCateg());
            pstmt.setBlob(7, stream);
            chk = pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BakeryFood.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BakeryFood.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BakeryFood.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        return chk;
    }

    @Override
    public int modifyFoodItems() {
        int chk = 0;
        String sql = "UPDATE food_tbl set fooddesc=?,foodprice=? WHERE foodid='"+getFoodId()+"'";
        try {
            pstmt = DBConn.dbConn().prepareStatement(sql);
            pstmt.setString(1, getFoodDesc());
            pstmt.setDouble(2,getFoodPrice());
            chk = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BakeryFood.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chk;
    }

    @Override
    public int removeFoodItems() {
        int chk=0;
       
       try {
            stmt = DBConn.dbConn().createStatement();
            chk = stmt.executeUpdate("UPDATE Food_tbl set foodstatus='D' WHERE foodid='"+getFoodId()+"'");
        } catch (SQLException ex) {
            chk=10;
        }
       return chk;
    }
     
    public ResultSet getFoodDetails(){
        String sql = "SELECT foodid,foodname,foodprice,fooddesc,foodstatus,foodcategory FROM food_tbl";
        try {
            stmt = DBConn.dbConn().createStatement();
            rst = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(BakeryFood.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rst;
    }
    
    
    
   
}
