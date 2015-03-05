/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food.user;

import com.food.connection.DBConn;
import java.sql.*;

/**
 *
 * @author NImesh Chathuranga
 */
public class usercontrol {
    
    Connection conn;
    String query;
    Statement stmt;
    ResultSet rst;
    int status;
    int maxid;
    
    public int saveUser(user user) throws SQLException {
        maxid();
        stmt=DBConn.dbConn().createStatement();
        query="INSERT INTO account_tbl VALUES('"+maxid+"','"+user.getCusfname()+"','"+user.getAccpsw()+"','"+user.getCusemail()+"')";
        status=stmt.executeUpdate(query);
        query="INSERT INTO customer_tbl VALUES('"+user.getCusfname()+"','"+user.getCuslname()+"','"+user.getCusaddress()+"','"+user.getCustel()+"','"+maxid+"')";
        stmt.executeUpdate(query);
        return status;
    }
    
    public void maxid()
        {      
           maxid=DBConn.Getlastid("accid","account_tbl");
        }
    
    
    public boolean logcheck(user user) throws SQLException 
    {
        
        stmt=DBConn.dbConn().createStatement();
        query="SELECT * FROM account_tbl WHERE email='"+user.getCusemail()+"'";
        rst=stmt.executeQuery(query);
        
        while(rst.next())
        {
            String uname=rst.getString("email");
            String psw=rst.getString("accpsw");
            user.setCusfname(rst.getString("accuname"));
            
            if(user.getCusemail().equals(uname) && user.getAccpsw().equals(psw))
            {
               return true;
            }
            else
            {
               return false;
            }
        }
        return false;
    }
    
}
