/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CATURWARGA COMPUTER
 */
public class koneksi {
    static final String jdbc = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/reataurant";
    static final String user = "root";
    static final String pass = "";
    static Connection conn;
    
    public static Connection koneksiDb(){
        try {
            Class.forName(jdbc);
            
        } catch (ClassNotFoundException cnf) {
        }try {
             conn = (Connection) DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conn;
    }
}
