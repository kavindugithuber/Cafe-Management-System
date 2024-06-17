/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.JOptionPane;
import modle.sql;
import views.Login;
import views.Signup;

/**
 *
 * @author Kavindu
 */
public class Accountc {
    
    
    public void createAccount(String Name, String Email, String Password) {
        if(!Name.equals("")&&!Email.equals("")&&!Password.equals("")){
            sql.CreateAcc(Name, Email, Password);
            
             Login l = new Login();
             l.setVisible(true);
        }
       else {
            Signup s = new Signup();
            s.setVisible(true);
             JOptionPane.showMessageDialog(null, "Some thing went wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


}
