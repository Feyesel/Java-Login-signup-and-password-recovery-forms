/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.*;
/**
 *
 * @author Feyesel Sultan
 */
public class MyConnection {
    public static Connection getConnection(){
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/moviedata","root","");
            System.out.println("connected to....moviedata database");
        } catch (Exception ex) {
            System.out.println("disconnected to....moviedata database");
            System.out.println(ex.getMessage());
        }
         return con;
    }
    
}
