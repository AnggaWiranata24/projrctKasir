/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import classs.Masakan;
import classs.Transaksi;
import classs.admin;
import classs.koneksi;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author CATURWARGA COMPUTER
 */
public class MainMenu extends javax.swing.JFrame {

    Font bigFont = new Font("sansserif", Font.PLAIN, 24); //
    Border txBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue);
    DefaultTableModel model,model2,model3;
    admin a = new admin();
    Masakan m = new Masakan();
    Transaksi t = new Transaksi();
    
    PreparedStatement ps;
    ResultSet rs;
    
    public MainMenu() {
        initComponents();
        koneksi.koneksiDb();
        a.refrehTableUser(tabelUser, "");
        m.refrehTableUser(tabelMasakan, "");
        t.refrehTableTransaksi(tabelTransaksi, "");
        
        model = (DefaultTableModel)tabelUser.getModel();
        model2 = (DefaultTableModel)tabelMasakan.getModel();
        model3 = (DefaultTableModel)tabelTransaksi.getModel();
        
        Masakan.setVisible(false);
        Registrasi.hide();
        Transaksi.hide();
        
        txtIdM.setBorder(txBorder);
        txtnamaM.setBorder(txBorder);
        txtHarga.setBorder(txBorder);
        txtSearchMasakan.setBorder(txBorder);
        
        txtIdTransaksi.setBorder(txBorder);
        txtNamaPelanggan.setBorder(txBorder);
        cbxMasakan.setBorder(txBorder);
        dateTransaksi.setBorder(txBorder);
        txtJumlahB.setBorder(txBorder);
        txtTotalB.setBorder(txBorder);
        txtSearchT.setBorder(txBorder);
        
        txtIDuser.setBorder(txBorder);
        TXTNama.setBorder(txBorder);
        TXTUser.setBorder(txBorder);
        TXTPassword.setBorder(txBorder);
        TXTcari.setBorder(txBorder);
        
        //tabel
        tabelMasakan.setRowHeight(35);
        JTableHeader header = tabelMasakan.getTableHeader();
        header.setBackground(Color.getColor("orange"));
        header.setForeground(Color.darkGray);
        header.setFont(bigFont);
        
        tabelTransaksi.setRowHeight(35);
        JTableHeader header1 = tabelTransaksi.getTableHeader();
        header1.setFont(bigFont);
        
        tabelUser.setRowHeight(35);
        JTableHeader header2 = tabelUser.getTableHeader();
        header2.setBackground(Color.orange);
        header2.setForeground(Color.darkGray);
        header2.setFont(bigFont);
        
        refreshCombo();
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        SideMenu = new javax.swing.JPanel();
        MenuMasakan = new javax.swing.JLabel();
        MenuTransaksi = new javax.swing.JLabel();
        MenuRegistrasi = new javax.swing.JLabel();
        MenuLogout = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        Registrasi = new javax.swing.JPanel();
        Rheader = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        RField = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIDuser = new javax.swing.JTextField();
        TXTUser = new javax.swing.JTextField();
        TXTPassword = new javax.swing.JTextField();
        TXTNama = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        cbxLevelUser = new javax.swing.JComboBox<>();
        Aksi2 = new javax.swing.JPanel();
        btnInputRegistrasi = new javax.swing.JButton();
        btnUpdateRegistrasi = new javax.swing.JButton();
        btnDeleteRegistrasi = new javax.swing.JButton();
        btnToMenuManan = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelUser = new javax.swing.JTable();
        TXTcari = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        Masakan = new javax.swing.JPanel();
        Mheader = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        MField = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdM = new javax.swing.JTextField();
        txtnamaM = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        cbxAvailable = new javax.swing.JComboBox<>();
        Aksi = new javax.swing.JPanel();
        btnInputMasakan = new javax.swing.JButton();
        btnUpdateMasakan = new javax.swing.JButton();
        btnDeleteMasakan = new javax.swing.JButton();
        btnToRegistrasi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMasakan = new javax.swing.JTable();
        txtSearchMasakan = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Transaksi = new javax.swing.JPanel();
        Theader = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        TField = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIdTransaksi = new javax.swing.JTextField();
        txtNamaPelanggan = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtJumlahB = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtTotalB = new javax.swing.JTextField();
        cbxMasakan = new javax.swing.JComboBox<>();
        btnMenu = new javax.swing.JButton();
        dateTransaksi = new com.toedter.calendar.JDateChooser();
        tabelTR = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        Aksi1 = new javax.swing.JPanel();
        btnInputTransaksi = new javax.swing.JButton();
        btnUpdateTransaksi = new javax.swing.JButton();
        btnDeleteTransaksi = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        txtSearchT = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1840, 1200));

        Header.setBackground(new java.awt.Color(83, 166, 214));
        Header.setPreferredSize(new java.awt.Dimension(1840, 100));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/restaurant_50px.png"))); // NOI18N
        jLabel11.setText("My Restaurant");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        SideMenu.setBackground(new java.awt.Color(83, 134, 219));
        SideMenu.setPreferredSize(new java.awt.Dimension(400, 1100));

        MenuMasakan.setBackground(new java.awt.Color(83, 109, 222));
        MenuMasakan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuMasakan.setForeground(new java.awt.Color(255, 255, 255));
        MenuMasakan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuMasakan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/food_30px.png"))); // NOI18N
        MenuMasakan.setText("MASAKAN");
        MenuMasakan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuMasakan.setOpaque(true);
        MenuMasakan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMasakanMouseClicked(evt);
            }
        });

        MenuTransaksi.setBackground(new java.awt.Color(83, 109, 222));
        MenuTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        MenuTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/transaction_26px.png"))); // NOI18N
        MenuTransaksi.setText("TRANSAKSI");
        MenuTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuTransaksi.setOpaque(true);
        MenuTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuTransaksiMouseClicked(evt);
            }
        });

        MenuRegistrasi.setBackground(new java.awt.Color(83, 109, 222));
        MenuRegistrasi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuRegistrasi.setForeground(new java.awt.Color(255, 255, 255));
        MenuRegistrasi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuRegistrasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/registration_26px.png"))); // NOI18N
        MenuRegistrasi.setText("REGISTRASI");
        MenuRegistrasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuRegistrasi.setOpaque(true);
        MenuRegistrasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuRegistrasiMouseClicked(evt);
            }
        });

        MenuLogout.setBackground(new java.awt.Color(83, 109, 222));
        MenuLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuLogout.setForeground(new java.awt.Color(255, 255, 255));
        MenuLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logout Rounded_26px.png"))); // NOI18N
        MenuLogout.setText("LOG OUT");
        MenuLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuLogout.setOpaque(true);
        MenuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SideMenuLayout = new javax.swing.GroupLayout(SideMenu);
        SideMenu.setLayout(SideMenuLayout);
        SideMenuLayout.setHorizontalGroup(
            SideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuMasakan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MenuTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MenuRegistrasi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(MenuLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SideMenuLayout.setVerticalGroup(
            SideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideMenuLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(MenuMasakan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(MenuTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(MenuRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(MenuLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menu.setPreferredSize(new java.awt.Dimension(1440, 1100));
        Menu.setLayout(new java.awt.CardLayout());

        Registrasi.setBackground(new java.awt.Color(204, 204, 204));
        Registrasi.setPreferredSize(new java.awt.Dimension(1440, 1100));

        Rheader.setPreferredSize(new java.awt.Dimension(1440, 100));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/registration_40px.png"))); // NOI18N
        jLabel8.setText("REGISTRASI");

        javax.swing.GroupLayout RheaderLayout = new javax.swing.GroupLayout(Rheader);
        Rheader.setLayout(RheaderLayout);
        RheaderLayout.setHorizontalGroup(
            RheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RheaderLayout.createSequentialGroup()
                .addGap(579, 579, 579)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RheaderLayout.setVerticalGroup(
            RheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RheaderLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        RField.setBackground(new java.awt.Color(204, 204, 204));
        RField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        RField.setPreferredSize(new java.awt.Dimension(1440, 319));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Nama User");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Password");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Username");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ID User");

        txtIDuser.setEditable(false);
        txtIDuser.setBackground(new java.awt.Color(204, 204, 204));
        txtIDuser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtIDuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TXTUser.setBackground(new java.awt.Color(204, 204, 204));
        TXTUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TXTUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TXTPassword.setBackground(new java.awt.Color(204, 204, 204));
        TXTPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TXTPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TXTNama.setBackground(new java.awt.Color(204, 204, 204));
        TXTNama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TXTNama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("ID Level");

        cbxLevelUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxLevelUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<--- Pilih --->", "1", "2", "3", "4" }));

        javax.swing.GroupLayout RFieldLayout = new javax.swing.GroupLayout(RField);
        RField.setLayout(RFieldLayout);
        RFieldLayout.setHorizontalGroup(
            RFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RFieldLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(RFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(RFieldLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(TXTNama))
                    .addGroup(RFieldLayout.createSequentialGroup()
                        .addGroup(RFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(RFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDuser, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTUser, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                            .addComponent(TXTPassword)
                            .addComponent(cbxLevelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(574, Short.MAX_VALUE))
        );
        RFieldLayout.setVerticalGroup(
            RFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RFieldLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(RFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(RFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(RFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(RFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(RFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxLevelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        Aksi2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Aksi2.setPreferredSize(new java.awt.Dimension(1440, 100));
        Aksi2.setVerifyInputWhenFocusTarget(false);

        btnInputRegistrasi.setBackground(new java.awt.Color(204, 204, 204));
        btnInputRegistrasi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInputRegistrasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/input_24px.png"))); // NOI18N
        btnInputRegistrasi.setText("INPUT");
        btnInputRegistrasi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnInputRegistrasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInputRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputRegistrasiActionPerformed(evt);
            }
        });

        btnUpdateRegistrasi.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdateRegistrasi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateRegistrasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/update_30px.png"))); // NOI18N
        btnUpdateRegistrasi.setText("UPDATE");
        btnUpdateRegistrasi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUpdateRegistrasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRegistrasiActionPerformed(evt);
            }
        });

        btnDeleteRegistrasi.setBackground(new java.awt.Color(204, 204, 204));
        btnDeleteRegistrasi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteRegistrasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Delete_24px.png"))); // NOI18N
        btnDeleteRegistrasi.setText("DELETE");
        btnDeleteRegistrasi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDeleteRegistrasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRegistrasiActionPerformed(evt);
            }
        });

        btnToMenuManan.setBackground(new java.awt.Color(204, 204, 204));
        btnToMenuManan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnToMenuManan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/food_30px.png"))); // NOI18N
        btnToMenuManan.setText("MENU MASAKAN");
        btnToMenuManan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnToMenuManan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnToMenuManan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToMenuMananMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Aksi2Layout = new javax.swing.GroupLayout(Aksi2);
        Aksi2.setLayout(Aksi2Layout);
        Aksi2Layout.setHorizontalGroup(
            Aksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Aksi2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnInputRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnUpdateRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnDeleteRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
                .addComponent(btnToMenuManan, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        Aksi2Layout.setVerticalGroup(
            Aksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Aksi2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(Aksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnToMenuManan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        tabelUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tabelUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID User", "Nama User", "UserNama", "Password", "ID Level"
            }
        ));
        tabelUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelUserMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelUser);

        TXTcari.setBackground(new java.awt.Color(204, 204, 204));
        TXTcari.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TXTcari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TXTcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXTcariKeyReleased(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search_26px.png"))); // NOI18N
        jLabel26.setText("Search");

        javax.swing.GroupLayout RegistrasiLayout = new javax.swing.GroupLayout(Registrasi);
        Registrasi.setLayout(RegistrasiLayout);
        RegistrasiLayout.setHorizontalGroup(
            RegistrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrasiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aksi2, javax.swing.GroupLayout.DEFAULT_SIZE, 1430, Short.MAX_VALUE)
                    .addComponent(RField, javax.swing.GroupLayout.DEFAULT_SIZE, 1430, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Rheader, javax.swing.GroupLayout.DEFAULT_SIZE, 1454, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrasiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(TXTcari, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        RegistrasiLayout.setVerticalGroup(
            RegistrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrasiLayout.createSequentialGroup()
                .addComponent(Rheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(RField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(Aksi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(RegistrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        Menu.add(Registrasi, "card4");

        Masakan.setBackground(new java.awt.Color(204, 204, 204));
        Masakan.setPreferredSize(new java.awt.Dimension(1440, 1100));

        Mheader.setPreferredSize(new java.awt.Dimension(1440, 100));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/food_50px.png"))); // NOI18N
        jLabel5.setText("MASAKAN");

        javax.swing.GroupLayout MheaderLayout = new javax.swing.GroupLayout(Mheader);
        Mheader.setLayout(MheaderLayout);
        MheaderLayout.setHorizontalGroup(
            MheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MheaderLayout.createSequentialGroup()
                .addGap(627, 627, 627)
                .addComponent(jLabel5)
                .addContainerGap(637, Short.MAX_VALUE))
        );
        MheaderLayout.setVerticalGroup(
            MheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MheaderLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(17, 17, 17))
        );

        MField.setBackground(new java.awt.Color(204, 204, 204));
        MField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MField.setPreferredSize(new java.awt.Dimension(1440, 309));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Status Masakan");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Harga");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nama Masakan");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ID Masakan");

        txtIdM.setEditable(false);
        txtIdM.setBackground(new java.awt.Color(204, 204, 204));
        txtIdM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtIdM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtnamaM.setBackground(new java.awt.Color(204, 204, 204));
        txtnamaM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtnamaM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtHarga.setBackground(new java.awt.Color(204, 204, 204));
        txtHarga.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtHarga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbxAvailable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxAvailable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Habis" }));

        javax.swing.GroupLayout MFieldLayout = new javax.swing.GroupLayout(MField);
        MField.setLayout(MFieldLayout);
        MFieldLayout.setHorizontalGroup(
            MFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MFieldLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(MFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(MFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtIdM, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnamaM, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                        .addComponent(txtHarga))
                    .addComponent(cbxAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MFieldLayout.setVerticalGroup(
            MFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MFieldLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(MFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnamaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(MFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(MFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        Aksi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Aksi.setPreferredSize(new java.awt.Dimension(1440, 100));

        btnInputMasakan.setBackground(new java.awt.Color(204, 204, 204));
        btnInputMasakan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInputMasakan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/input_24px.png"))); // NOI18N
        btnInputMasakan.setText("INPUT");
        btnInputMasakan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnInputMasakan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInputMasakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputMasakanActionPerformed(evt);
            }
        });

        btnUpdateMasakan.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdateMasakan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateMasakan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/update_30px.png"))); // NOI18N
        btnUpdateMasakan.setText("UPDATE");
        btnUpdateMasakan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUpdateMasakan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateMasakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMasakanActionPerformed(evt);
            }
        });

        btnDeleteMasakan.setBackground(new java.awt.Color(204, 204, 204));
        btnDeleteMasakan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteMasakan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Delete_24px.png"))); // NOI18N
        btnDeleteMasakan.setText("DELETE");
        btnDeleteMasakan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDeleteMasakan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteMasakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMasakanActionPerformed(evt);
            }
        });

        btnToRegistrasi.setBackground(new java.awt.Color(204, 204, 204));
        btnToRegistrasi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnToRegistrasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/registration_40px.png"))); // NOI18N
        btnToRegistrasi.setText("MENU REGISTRASI");
        btnToRegistrasi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnToRegistrasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnToRegistrasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToRegistrasiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AksiLayout = new javax.swing.GroupLayout(Aksi);
        Aksi.setLayout(AksiLayout);
        AksiLayout.setHorizontalGroup(
            AksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AksiLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnInputMasakan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnUpdateMasakan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnDeleteMasakan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addComponent(btnToRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );
        AksiLayout.setVerticalGroup(
            AksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AksiLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(AksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputMasakan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateMasakan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteMasakan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnToRegistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        tabelMasakan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tabelMasakan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Masakan", "NAMA MASAKAN", "HARGA", "STATUS MAKANAN"
            }
        ));
        tabelMasakan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMasakanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMasakan);

        txtSearchMasakan.setBackground(new java.awt.Color(204, 204, 204));
        txtSearchMasakan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSearchMasakan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSearchMasakan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchMasakanKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search_26px.png"))); // NOI18N
        jLabel15.setText("Search");

        javax.swing.GroupLayout MasakanLayout = new javax.swing.GroupLayout(Masakan);
        Masakan.setLayout(MasakanLayout);
        MasakanLayout.setHorizontalGroup(
            MasakanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MasakanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtSearchMasakan, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(MasakanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MasakanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MasakanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(MField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1423, Short.MAX_VALUE)
                        .addComponent(Aksi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1423, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MasakanLayout.setVerticalGroup(
            MasakanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MasakanLayout.createSequentialGroup()
                .addComponent(Mheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Aksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(MasakanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchMasakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        Menu.add(Masakan, "card2");

        Transaksi.setBackground(new java.awt.Color(204, 204, 204));
        Transaksi.setDoubleBuffered(false);
        Transaksi.setPreferredSize(new java.awt.Dimension(1440, 1100));

        Theader.setPreferredSize(new java.awt.Dimension(1440, 100));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cash_in_hand_80px.png"))); // NOI18N
        jLabel7.setText("TRANSAKSI");

        javax.swing.GroupLayout TheaderLayout = new javax.swing.GroupLayout(Theader);
        Theader.setLayout(TheaderLayout);
        TheaderLayout.setHorizontalGroup(
            TheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TheaderLayout.createSequentialGroup()
                .addGap(627, 627, 627)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TheaderLayout.setVerticalGroup(
            TheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TheaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(17, 17, 17))
        );

        TField.setBackground(new java.awt.Color(204, 204, 204));
        TField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TField.setPreferredSize(new java.awt.Dimension(1440, 250));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Tanggal");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ID Masakan");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Nama Pelanggan");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ID Transaksi");

        txtIdTransaksi.setEditable(false);
        txtIdTransaksi.setBackground(new java.awt.Color(204, 204, 204));
        txtIdTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtIdTransaksi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNamaPelanggan.setBackground(new java.awt.Color(204, 204, 204));
        txtNamaPelanggan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNamaPelanggan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Jumlah Beli");

        txtJumlahB.setBackground(new java.awt.Color(204, 204, 204));
        txtJumlahB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtJumlahB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtJumlahB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJumlahBKeyReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Total Bayar");

        txtTotalB.setBackground(new java.awt.Color(204, 204, 204));
        txtTotalB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTotalB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbxMasakan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        btnMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Menu_24px.png"))); // NOI18N
        btnMenu.setText("MENU");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        dateTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout TFieldLayout = new javax.swing.GroupLayout(TField);
        TField.setLayout(TFieldLayout);
        TFieldLayout.setHorizontalGroup(
            TFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TFieldLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(TFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(TFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtIdTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .addComponent(txtNamaPelanggan))
                    .addGroup(TFieldLayout.createSequentialGroup()
                        .addComponent(cbxMasakan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMenu)))
                .addGap(80, 80, 80)
                .addGroup(TFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TFieldLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtTotalB))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TFieldLayout.createSequentialGroup()
                        .addGroup(TFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(TFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJumlahB, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        TFieldLayout.setVerticalGroup(
            TFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TFieldLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(TFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TFieldLayout.createSequentialGroup()
                        .addGroup(TFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(dateTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(TFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJumlahB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(TFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TFieldLayout.createSequentialGroup()
                        .addGroup(TFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(TFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(TFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxMasakan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tabelTransaksi.setAutoCreateRowSorter(true);
        tabelTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Transaksi", "NAMA PELANGGAN", "ID MASAKAN", "TANGGAL", "NAMA MASAKAN", "HARGA", "JUMLAH BELI", "TOTAL BAYAR"
            }
        ));
        tabelTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelTransaksi.setGridColor(new java.awt.Color(204, 255, 255));
        tabelTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTransaksiMouseClicked(evt);
            }
        });
        tabelTR.setViewportView(tabelTransaksi);

        Aksi1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Aksi1.setPreferredSize(new java.awt.Dimension(1440, 100));

        btnInputTransaksi.setBackground(new java.awt.Color(204, 204, 204));
        btnInputTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInputTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/input_24px.png"))); // NOI18N
        btnInputTransaksi.setText("INPUT");
        btnInputTransaksi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnInputTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInputTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputTransaksiActionPerformed(evt);
            }
        });

        btnUpdateTransaksi.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdateTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/update_30px.png"))); // NOI18N
        btnUpdateTransaksi.setText("UPDATE");
        btnUpdateTransaksi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUpdateTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTransaksiActionPerformed(evt);
            }
        });

        btnDeleteTransaksi.setBackground(new java.awt.Color(204, 204, 204));
        btnDeleteTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Delete_24px.png"))); // NOI18N
        btnDeleteTransaksi.setText("DELETE");
        btnDeleteTransaksi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDeleteTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTransaksiActionPerformed(evt);
            }
        });

        btnCetak.setBackground(new java.awt.Color(204, 204, 204));
        btnCetak.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/print_50px.png"))); // NOI18N
        btnCetak.setText("CETAK LAPORAN");
        btnCetak.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCetak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCetak.setEnabled(false);
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Aksi1Layout = new javax.swing.GroupLayout(Aksi1);
        Aksi1.setLayout(Aksi1Layout);
        Aksi1Layout.setHorizontalGroup(
            Aksi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Aksi1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnInputTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnUpdateTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnDeleteTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        Aksi1Layout.setVerticalGroup(
            Aksi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Aksi1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(Aksi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        txtSearchT.setBackground(new java.awt.Color(204, 204, 204));
        txtSearchT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSearchT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSearchT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchTKeyReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search_26px.png"))); // NOI18N
        jLabel21.setText("Search");

        javax.swing.GroupLayout TransaksiLayout = new javax.swing.GroupLayout(Transaksi);
        Transaksi.setLayout(TransaksiLayout);
        TransaksiLayout.setHorizontalGroup(
            TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransaksiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSearchT, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(TransaksiLayout.createSequentialGroup()
                .addComponent(TField, javax.swing.GroupLayout.PREFERRED_SIZE, 1446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Theader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1446, Short.MAX_VALUE)
            .addGroup(TransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Aksi1, javax.swing.GroupLayout.DEFAULT_SIZE, 1422, Short.MAX_VALUE)
                    .addGroup(TransaksiLayout.createSequentialGroup()
                        .addComponent(tabelTR, javax.swing.GroupLayout.PREFERRED_SIZE, 1419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        TransaksiLayout.setVerticalGroup(
            TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiLayout.createSequentialGroup()
                .addComponent(Theader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Aksi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(tabelTR, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        Menu.add(Transaksi, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuMasakanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMasakanMouseClicked
        // TODO add your handling code here:
        Masakan.setVisible(true);
        Registrasi.hide();
        Transaksi.hide();
    }//GEN-LAST:event_MenuMasakanMouseClicked

    private void MenuTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuTransaksiMouseClicked
        // TODO add your handling code here:
        Masakan.setVisible(false);
        Registrasi.hide();
        Transaksi.setVisible(true);
    }//GEN-LAST:event_MenuTransaksiMouseClicked

    private void MenuRegistrasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuRegistrasiMouseClicked
        // TODO add your handling code here:
        Registrasi.setVisible(true);
        Masakan.hide();
        Transaksi.hide();
    }//GEN-LAST:event_MenuRegistrasiMouseClicked

    private void MenuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuLogoutMouseClicked
        // TODO add your handling code here:
        SignUp s =new SignUp();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuLogoutMouseClicked

    private void btnToMenuMananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToMenuMananMouseClicked
        // TODO add your handling code here:
        Masakan.setVisible(true);
        Registrasi.hide();
    }//GEN-LAST:event_btnToMenuMananMouseClicked

    private void btnInputRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputRegistrasiActionPerformed
        // TODO add your handling code here:
        try {
            String nama,username,password;
            int idLevel;
            nama = TXTNama.getText();
            username = TXTUser.getText();
            password = TXTPassword.getText();
            idLevel = Integer.parseInt((String) cbxLevelUser.getSelectedItem());
            if(check()){
                koneksi.koneksiDb();
                a.insertUD('i',0,nama, username, password, idLevel);
                a.refrehTableUser(tabelUser, "");
                kosongkan();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Input Data Gagal");
        }
    }//GEN-LAST:event_btnInputRegistrasiActionPerformed

    private void tabelUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelUserMouseClicked
        // TODO add your handling code here:
        try {
            koneksi.koneksiDb();
            int row = tabelUser.getSelectedRow();
            txtIDuser.setText(model.getValueAt(row, 0).toString());
            TXTNama.setText(model.getValueAt(row, 1).toString());
            TXTUser.setText(model.getValueAt(row, 2).toString());
            TXTPassword.setText(model.getValueAt(row, 3).toString());
            cbxLevelUser.setSelectedItem(model.getValueAt(row, 4).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tabelUserMouseClicked

    private void btnUpdateRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRegistrasiActionPerformed
        // TODO add your handling code here:
        try {
            String nama,username,password;
            int idLevel,id;
            nama = TXTNama.getText();
            username = TXTUser.getText();
            password = TXTPassword.getText();
            idLevel = Integer.parseInt((String) cbxLevelUser.getSelectedItem());
            id = Integer.parseInt(txtIDuser.getText());
            if(check()){
                a.insertUD('u',id,nama, username, password, idLevel);
                koneksi.koneksiDb();
                a.refrehTableUser(tabelUser, "");
                kosongkan();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update Data Gagal");
        }
    }//GEN-LAST:event_btnUpdateRegistrasiActionPerformed

    private void btnDeleteRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRegistrasiActionPerformed
        // TODO add your handling code here:
        try {
            String nama,username,password;
            int idLevel,id;
            nama = TXTNama.getText();
            username = TXTUser.getText();
            password = TXTPassword.getText();
            idLevel = Integer.parseInt((String) cbxLevelUser.getSelectedItem());
            id = Integer.parseInt(txtIDuser.getText());
            if(check()){
                a.insertUD('d',id,nama, username, password, idLevel);
                koneksi.koneksiDb();
                a.refrehTableUser(tabelUser, "");
                kosongkan();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Delete Data Gagal");
        }
    }//GEN-LAST:event_btnDeleteRegistrasiActionPerformed

    private void btnInputMasakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputMasakanActionPerformed
        // TODO add your handling code here:
        try {
            String nama,status;
            int harga;
            nama = txtnamaM.getText();
            status = (String) cbxAvailable.getSelectedItem();
            harga = Integer.parseInt(txtHarga.getText());
            if(checkM()){
                koneksi.koneksiDb();
                m.insertUD('i',0,nama, harga, status);
                m.refrehTableUser(tabelMasakan, "");
                cbxMasakan.removeAllItems();
                refreshCombo();
                kosongkanFM();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Input Data Gagal");
        }
    }//GEN-LAST:event_btnInputMasakanActionPerformed

    private void btnUpdateMasakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMasakanActionPerformed
        // TODO add your handling code here:
        try {
            String nama,status;
            int idM, harga;
            nama = txtnamaM.getText();
            status = (String) cbxAvailable.getSelectedItem();
            harga = Integer.parseInt(txtHarga.getText());
            idM = Integer.parseInt(txtIdM.getText());
            if(checkM()){
                koneksi.koneksiDb();
                m.insertUD('u',idM,nama, harga, status);
                m.refrehTableUser(tabelMasakan, "");
                cbxMasakan.removeAllItems();
                refreshCombo();
                kosongkanFM();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update Data Gagal");
        }
    }//GEN-LAST:event_btnUpdateMasakanActionPerformed

    private void btnDeleteMasakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMasakanActionPerformed
        // TODO add your handling code here:
        try {
            String nama,status;
            int idM, harga;
            nama = txtnamaM.getText();
            status = (String) cbxAvailable.getSelectedItem();
            harga = Integer.parseInt(txtHarga.getText());
            idM = Integer.parseInt(txtIdM.getText());
            if(checkM()){
                koneksi.koneksiDb();
                m.insertUD('d',idM,nama, harga, status);
                m.refrehTableUser(tabelMasakan, "");
                cbxMasakan.removeAllItems();
                refreshCombo();
                kosongkanFM();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Delete Data Gagal");
        }
    }//GEN-LAST:event_btnDeleteMasakanActionPerformed

    private void btnToRegistrasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToRegistrasiMouseClicked
        // TODO add your handling code here:
        Registrasi.setVisible(true);
        Masakan.hide();
    }//GEN-LAST:event_btnToRegistrasiMouseClicked

    private void tabelMasakanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMasakanMouseClicked
        // TODO add your handling code here:
        try {
            koneksi.koneksiDb();
            int row = tabelMasakan.getSelectedRow();
            txtIdM.setText(model2.getValueAt(row, 0).toString());
            txtnamaM.setText(model2.getValueAt(row, 1).toString());
            txtHarga.setText(model2.getValueAt(row, 2).toString());
            cbxAvailable.setSelectedItem(model2.getValueAt(row, 3).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tabelMasakanMouseClicked

    private void btnInputTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputTransaksiActionPerformed
        // TODO add your handling code here:
        try {
            int idMs, jumlahB, hargaB, totalB;
            String namaP, tanggal, namaMas;

            namaP = txtNamaPelanggan.getText();
            String combo = cbxMasakan.getSelectedItem().toString();
            String[] arr = combo.split(":");
            idMs = Integer.parseInt(arr[0]);
                Date date = (Date) dateTransaksi.getDate();
                DateFormat format = new SimpleDateFormat("YYYY-MM-dd");
                tanggal = format.format(date);
            namaMas = arr[1];
            hargaB = Integer.parseInt(arr[2]);
            jumlahB = Integer.parseInt(txtJumlahB.getText());
            totalB = hargaB * jumlahB;
            if(checkT()){
                t.insertUD('i',0,namaP, idMs, tanggal, namaMas, hargaB, jumlahB, totalB);
            }
            t.refrehTableTransaksi(tabelTransaksi, "");
            kosongkanFT();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnInputTransaksiActionPerformed

    private void txtJumlahBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahBKeyReleased
       int jum = Integer.parseInt(txtJumlahB.getText());
       String combo = cbxMasakan.getSelectedItem().toString();
       String [] arr = combo.split(":");
       int harga = Integer.parseInt(arr[2]);
       int total = jum * harga;
       txtTotalB.setText(""+total);
    }//GEN-LAST:event_txtJumlahBKeyReleased

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        Masakan.setVisible(true);
        Transaksi.hide();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnUpdateTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTransaksiActionPerformed
        // TODO add your handling code here:
        try {
            int idt,idMs, jumlahB, hargaB, totalB;
            String namaP, tanggal, namaMas;
            
            idt = Integer.parseInt(txtIdTransaksi.getText());
            namaP = txtNamaPelanggan.getText();
            String combo = cbxMasakan.getSelectedItem().toString();
            String[] arr = combo.split(":");
            idMs = Integer.parseInt(arr[0]);
                Date date = (Date) dateTransaksi.getDate();
                DateFormat format = new SimpleDateFormat("YYYY-MM-dd");
                tanggal = format.format(date);
            namaMas = arr[1];
            hargaB = Integer.parseInt(arr[2]);
            jumlahB = Integer.parseInt(txtJumlahB.getText());
            totalB = hargaB * jumlahB;
            if(checkT()){
                t.insertUD('u',idt,namaP, idMs, tanggal, namaMas, hargaB, jumlahB, totalB);
            }
            t.refrehTableTransaksi(tabelTransaksi, "");
            kosongkanFT();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateTransaksiActionPerformed

    private void tabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTransaksiMouseClicked
        // TODO add your handling code here:
        try {
            koneksi.koneksiDb();
            int row = tabelTransaksi.getSelectedRow();
            txtIdTransaksi.setText(model3.getValueAt(row, 0).toString());
            txtNamaPelanggan.setText(model3.getValueAt(row, 1).toString());
            txtJumlahB.setText(model3.getValueAt(row, 6).toString());
            txtTotalB.setText(model3.getValueAt(row, 7).toString());
            
            Date bdate;
            try {
                bdate = new SimpleDateFormat("yyyy-MM-dd").parse(model3.getValueAt(row, 3).toString());
                dateTransaksi.setDate(bdate);
            } catch (ParseException ex) {
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tabelTransaksiMouseClicked

    private void btnDeleteTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTransaksiActionPerformed
        // TODO add your handling code here:
        try {
            int idt,idMs, jumlahB, hargaB, totalB;
            String namaP, tanggal, namaMas;
            
            idt = Integer.parseInt(txtIdTransaksi.getText());
            namaP = txtNamaPelanggan.getText();
            String combo = cbxMasakan.getSelectedItem().toString();
            String[] arr = combo.split(":");
            idMs = Integer.parseInt(arr[0]);
                Date date = (Date) dateTransaksi.getDate();
                DateFormat format = new SimpleDateFormat("YYYY-MM-dd");
                tanggal = format.format(date);
            namaMas = arr[1];
            hargaB = Integer.parseInt(arr[2]);
            jumlahB = Integer.parseInt(txtJumlahB.getText());
            totalB = hargaB * jumlahB;
            if(checkT()){
                t.insertUD('d',idt,namaP, idMs, tanggal, namaMas, hargaB, jumlahB, totalB);
            }
            t.refrehTableTransaksi(tabelTransaksi, "");
            kosongkanFT();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteTransaksiActionPerformed

    private void TXTcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTcariKeyReleased
        // TextField Pencarian User
          tabelUser.setModel(new DefaultTableModel(null, new Object[]{"ID",
            "Nama","Username","Password","ID Level"}));
          a.refrehTableUser(tabelUser, TXTcari.getText());
    }//GEN-LAST:event_TXTcariKeyReleased

    private void txtSearchMasakanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchMasakanKeyReleased
        // TextField Pencarian Masakan
        tabelMasakan.setModel(new DefaultTableModel(null, new Object[]{"ID Masakan",
            "Nama Masakan","Harga","Status Masakan"}));
          m.refrehTableUser(tabelMasakan, txtSearchMasakan.getText());
    }//GEN-LAST:event_txtSearchMasakanKeyReleased

    private void txtSearchTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchTKeyReleased
        // TextField Pencarian Transaksi
        tabelTransaksi.setModel(new DefaultTableModel(null, new Object[]{"ID Transaksi",
            "Nama Pelanggan","ID Masakan","Tanggal","Nama Masakan","Harga","Jumlah Beli","Total Bayar"}));
          t.refrehTableTransaksi(tabelTransaksi, txtSearchT.getText());
    }//GEN-LAST:event_txtSearchTKeyReleased

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        //Menu Cetak Laporan
        try {
            File namaFile = new File("src/Laporan/Laporan.jasper");
            JasperPrint jp = JasperFillManager.fillReport(namaFile.getPath(), null, koneksi.koneksiDb());
            JasperViewer.viewReport(jp, false);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    public void refreshCombo(){
        try {
            ps = koneksi.koneksiDb().prepareStatement("select * from makanan where status='Tersedia'");
            rs = ps.executeQuery();
            while (rs.next()) {                
                cbxMasakan.addItem(rs.getString("idMasakan")+":"+rs.getString("namaMasakan")+":"+rs.getString("harga"));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public boolean check(){
        if(TXTNama.getText().equals("") || TXTUser.getText().equals("") ||
                TXTPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
            return false;
        }
        
       return true;
    }
    
    public boolean checkM(){
        if(txtnamaM.getText().equals("") || txtHarga.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
            return false;
        }
        
       return true;
    }
    
    public boolean checkT(){
        if(txtNamaPelanggan.getText().equals("") || txtJumlahB.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
            return false;
        }
        
       return true;
    }
    
    public void kosongkan(){
        TXTNama.setText("");
        TXTUser.setText("");
        TXTPassword.setText("");
        txtIDuser.setText("");
        cbxLevelUser.setSelectedIndex(0);
    }
    
    public void kosongkanFM(){
        txtIdM.setText("");
        txtnamaM.setText("");
        txtHarga.setText("");
        cbxAvailable.setSelectedIndex(0);
    }
    
    public void kosongkanFT(){
        txtIdTransaksi.setText("");
        txtNamaPelanggan.setText("");
        cbxMasakan.setSelectedIndex(0);
        txtJumlahB.setText("");
        txtTotalB.setText("");
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Aksi;
    private javax.swing.JPanel Aksi1;
    private javax.swing.JPanel Aksi2;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel MField;
    public javax.swing.JPanel Masakan;
    public javax.swing.JPanel Menu;
    private javax.swing.JLabel MenuLogout;
    public javax.swing.JLabel MenuMasakan;
    public javax.swing.JLabel MenuRegistrasi;
    public javax.swing.JLabel MenuTransaksi;
    private javax.swing.JPanel Mheader;
    private javax.swing.JPanel RField;
    public javax.swing.JPanel Registrasi;
    private javax.swing.JPanel Rheader;
    public javax.swing.JPanel SideMenu;
    private javax.swing.JPanel TField;
    private javax.swing.JTextField TXTNama;
    private javax.swing.JTextField TXTPassword;
    private javax.swing.JTextField TXTUser;
    private javax.swing.JTextField TXTcari;
    private javax.swing.JPanel Theader;
    public javax.swing.JPanel Transaksi;
    public javax.swing.JButton btnCetak;
    private javax.swing.JButton btnDeleteMasakan;
    private javax.swing.JButton btnDeleteRegistrasi;
    private javax.swing.JButton btnDeleteTransaksi;
    private javax.swing.JButton btnInputMasakan;
    private javax.swing.JButton btnInputRegistrasi;
    private javax.swing.JButton btnInputTransaksi;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnToMenuManan;
    private javax.swing.JButton btnToRegistrasi;
    private javax.swing.JButton btnUpdateMasakan;
    private javax.swing.JButton btnUpdateRegistrasi;
    private javax.swing.JButton btnUpdateTransaksi;
    private javax.swing.JComboBox<String> cbxAvailable;
    private javax.swing.JComboBox<String> cbxLevelUser;
    public javax.swing.JComboBox<String> cbxMasakan;
    private com.toedter.calendar.JDateChooser dateTransaksi;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable tabelMasakan;
    private javax.swing.JScrollPane tabelTR;
    private javax.swing.JTable tabelTransaksi;
    public javax.swing.JTable tabelUser;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIDuser;
    private javax.swing.JTextField txtIdM;
    private javax.swing.JTextField txtIdTransaksi;
    private javax.swing.JTextField txtJumlahB;
    private javax.swing.JTextField txtNamaPelanggan;
    private javax.swing.JTextField txtSearchMasakan;
    private javax.swing.JTextField txtSearchT;
    private javax.swing.JTextField txtTotalB;
    private javax.swing.JTextField txtnamaM;
    // End of variables declaration//GEN-END:variables
}
