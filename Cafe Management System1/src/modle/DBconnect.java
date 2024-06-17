/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modle;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Kavindu
 */
public class DBconnect {
    
     public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafeemanegement", "root", "");
        } catch (Exception e) {
            System.out.println(e);
    
     }

        return conn;
    }
    
}


