/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classs;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CATURWARGA COMPUTER
 */
public class Masakan {
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel model;
    public void insertUD(char operation, int id, String nama, int harga,
                            String status){
        Connection con = koneksi.koneksiDb();
        switch (operation) {
            case 'i':
                try {
                    ps = con.prepareStatement("INSERT INTO makanan(idMasakan,namaMasakan, harga, status) VALUES (?,?,?,?)");
                    ps.setInt(1, 0);
                    ps.setString(2, nama);
                    ps.setInt(3, harga);
                    ps.setString(4, status);
                    if(ps.executeUpdate() > 0){
                        JOptionPane.showMessageDialog(null, "New Food added");
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Insert Gagal");
                }   break;
            case 'u':
                try {
                    ps = con.prepareStatement("UPDATE `makanan` SET `namaMasakan`=?,`harga`=?,`status`=? WHERE `idMasakan` = ?");
                    ps.setString(1, nama);
                    ps.setInt(2, harga);
                    ps.setString(3, status);
                    ps.setInt(4, id);
                    if(ps.executeUpdate() > 0){
                        JOptionPane.showMessageDialog(null, "Data Food Updated");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }   break;
            case 'd':
                try {
                    ps = con.prepareStatement("DELETE FROM `makanan` WHERE `idMasakan` = ?");
                    ps.setInt(1, id);
                    if(ps.executeUpdate() > 0){
                        JOptionPane.showMessageDialog(null, "Data Food Deleted");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }   break;
            default:
                break;
        }
}
    public void refrehTableUser(JTable table, String value){
//        model = new DefaultTableModel();
//        model.addColumn("Id Masakan");
//        model.addColumn("Nama Masakan");
//        model.addColumn("Harga");
//        model.addColumn("Status");
//        table.setModel(model);
        try {
            ps = koneksi.koneksiDb().prepareStatement("select * from makanan where concat(`idMasakan`,`namaMasakan`, `harga`, `status`) like ?");
            ps.setString(1, "%" + value + "%");
            model = (DefaultTableModel) table.getModel();
            rs = ps.executeQuery();
            while(rs.next()){
               Object [] row = new Object[4];
                 row[0] = rs.getInt(1);
                 row[1] = rs.getString(2);
                 row[2] = rs.getInt(3);
                 row[3] = rs.getString(4);
                 model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Ambil Data");
        }
    }
}
