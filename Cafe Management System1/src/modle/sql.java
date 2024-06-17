/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kavindu
 */
public class sql {
    
    
      public static void CreateAcc(String username, String name, String password) {
        Connection conn = (Connection) DBconnect.connect();
        PreparedStatement pst;
        String query = "INSERT INTO sign (Id, username, password) VALUES (?, ?, ?)";

        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, username);
            pst.setString(3, password);
            pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "Account acount create successful");
        } catch (SQLException e) {
            System.out.println(e);
           JOptionPane.showMessageDialog(null, "error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
}
      
      
      public static ResultSet checkuser(String username, String Password) {
        Connection conn = (Connection) DBconnect.connect();
        PreparedStatement pst;
        ResultSet rs = null;
        String query = "SELECT username, password FROM sign WHERE username = ? AND password = ?";

        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, Password);
            rs = pst.executeQuery();

            return rs;
        } catch (SQLException e) {
            System.out.println(e);   
        }

    return rs;
    }

    public static void submitData(String Fname, String Lname, String City, String Lname0, String Year, String tdname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
