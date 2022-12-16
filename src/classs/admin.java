/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classs;

import Form.MainMenu;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class admin {
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel model;
    koneksi k = new koneksi();
    public void insertUD(char operation, int id, String nama, String user,
                            String pass, int idLevel){
        Connection con = koneksi.koneksiDb();
        PreparedStatement ps;
        if(operation == 'i'){
            try {
                ps = con.prepareStatement("INSERT INTO admin(id,nama, user, pass, id_level) VALUES (?,?,?,?,?)");
                ps.setInt(1, 0);
                ps.setString(2, nama);
                ps.setString(3, user);
                ps.setString(4, pass);
                ps.setInt(5, idLevel);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "New Account added");
                }
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Insert Gagal");
            }
        }
        else if(operation == 'u'){
            try {
                ps = con.prepareStatement("UPDATE `admin` SET `nama`=?,`user`=?,`pass`=?,`id_level`=? WHERE `id` = ?");
                ps.setString(1, nama);
                ps.setString(2, user);
                ps.setString(3, pass);
                ps.setInt(4, idLevel);
                ps.setInt(5, id);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Data User Updated");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        else if(operation == 'd'){
            try {
                ps = con.prepareStatement("DELETE FROM `admin` WHERE `id` = ?");
                ps.setInt(1, id);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Data User Deleted");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
}
    public void refrehTableUser(JTable table, String value){
//        model = new DefaultTableModel();
//        model.addColumn("Id");
//        model.addColumn("Nama");
//        model.addColumn("UserName");
//        model.addColumn("Password");
//        model.addColumn("ID Level");
//        table.setModel(model);
        try {
            ps = koneksi.koneksiDb().prepareStatement("select * from admin where concat(`id`,`nama`, `user`, `pass`, `id_level`) like ?");
            ps.setString(1, "%" + value + "%");
            model = (DefaultTableModel) table.getModel();
            rs = ps.executeQuery();
            while(rs.next()){
               Object [] row = new Object[5];
                 row[0] = rs.getInt(1);
                 row[1] = rs.getString(2);
                 row[2] = rs.getString(3);
                 row[3] = rs.getString(4);
                 row[4] = rs.getInt(5);
                 model.addRow(row);
            }
        } catch (Exception e) {
        }
    }
}
