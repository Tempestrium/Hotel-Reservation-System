/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.*;
import javax.swing.*;



/**
 *
 * @author Kristine Vergara
 */
public class Rooms extends javax.swing.JFrame {
    Connection Con;
    PreparedStatement Pst;
    ResultSet Rs;
    Statement St; 
    DefaultTableModel model;

    /**
     * Creates new form Rooms
//     */
    public Rooms() {
        initComponents();
        Connect();
        ShowRooms();
        
    

    }
    
        
    public void Connect(){
        
        try {
            //Open Connection to MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            
        }catch(SQLException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        searchTf = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        roomsBtn = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RNameTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        roomNumCB = new javax.swing.JComboBox<>();
        roomTypeCB = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        addonsCB = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        statusCB = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RoomsList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel3.setBackground(new java.awt.Color(49, 48, 77));
        jPanel3.setLayout(null);

        jPanel4.setOpaque(false);

        searchTf.setFont(new java.awt.Font("Georgia Pro Cond Light", 0, 12)); // NOI18N
        searchTf.setText("Search");
        searchTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTfKeyReleased(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTf, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(searchBtn))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(22, 26, 48));
        jPanel2.setLayout(null);

        logoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutBtn.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        jPanel2.add(logoutBtn);
        logoutBtn.setBounds(30, 440, 176, 36);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Customer");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(27, 208, 176, 36);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Bookings");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(27, 262, 176, 36);

        roomsBtn.setBackground(new java.awt.Color(255, 255, 255));
        roomsBtn.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        roomsBtn.setForeground(new java.awt.Color(255, 255, 255));
        roomsBtn.setText("Rooms");
        roomsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomsBtnMouseClicked(evt);
            }
        });
        jPanel2.add(roomsBtn);
        roomsBtn.setBounds(27, 154, 176, 36);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Yu Gothic Light", 3, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Rooms");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(27, 154, 176, 36);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Name");

        RNameTb.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        RNameTb.setForeground(new java.awt.Color(51, 51, 51));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Room Number");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Room Type/Price");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Addons");

        roomNumCB.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        roomNumCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RM-101 ~ TWIN DELUXE ROOM ", "RM-102 ~ TWIN DELUXE ROOM ", "RM-103 ~ TWIN DELUXE ROOM ", "RM-104 ~ TWIN DELUXE ROOM ", "RM-105 ~ TWIN DELUXE ROOM ", "RM-201 ~ TWIN EXCLUSIVE ROOM", "RM-202 ~ TWIN EXCLUSIVE ROOM", "RM-203 ~ TWIN EXCLUSIVE ROOM", "RM-204 ~ TWIN EXCLUSIVE ROOM", "RM-205 ~ TWIN EXCLUSIVE ROOM", "RM-301 ~ KING DELUXE ROOM ", "RM-302 ~ KING DELUXE ROOM ", "RM-303 ~ KING DELUXE ROOM ", "RM-304 ~ KING DELUXE ROOM ", "RM-305 ~ KING DELUXE ROOM ", "RM-401 ~ KING EXCLUSIVE ROOM ", "RM-402 ~ KING EXCLUSIVE ROOM ", "RM-403 ~ KING EXCLUSIVE ROOM ", "RM-404 ~ KING EXCLUSIVE ROOM ", "RM-405 ~ KING EXCLUSIVE ROOM ", "RM-501 ~ KING DELUXE SUITE", "RM-502 ~ KING DELUXE SUITE", "RM-503 ~ KING DELUXE SUITE", "RM-504 ~ KING DELUXE SUITE", "RM-505 ~ KING DELUXE SUITE", "RM-601 ~ KING EXCLUSIVE SUIT ", "RM-602 ~ KING EXCLUSIVE SUIT ", "RM-603 ~ KING EXCLUSIVE SUIT ", "RM-604 ~ KING EXCLUSIVE SUIT ", "RM-605 ~ KING EXCLUSIVE SUIT " }));

        roomTypeCB.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        roomTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TWIN DELUXE ROOM -- $400", "TWIN EXCLUSIVE ROOM -- $500", "KING DELUXE ROOM -- $700", "KING EXCLUSIVE ROOM -- $800", "KING DELUXE SUITE -- $1200", "KING EXCLUSIVE SUIT -- $1500" }));

        updateBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 16)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        AddBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 16)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        DelBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 16)); // NOI18N
        DelBtn.setText("Delete");
        DelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBtnActionPerformed(evt);
            }
        });

        addonsCB.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        addonsCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Room Upgrade --- $30 to $100 per night", "Breakfast Inclusion --- $30 per person", "Fitness and Wellness Classes --- $30 per person", "In-Room Dining Packages --- $80 per person", "Wellness and Spa Packages  --- $120 per person", "Laundry and Dry-Cleaning Services  --- $110 per day", "Special Occasion Packages  --- $350 per day" }));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Yu Gothic Light", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Status");

        statusCB.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        statusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Approved", "Finished" }));

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 919, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        RoomsList.setFont(new java.awt.Font("Georgia Pro Light", 1, 12)); // NOI18N
        RoomsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Type", "Room Number", "Addons", "Status"
            }
        ));
        RoomsList.setFocusable(false);
        RoomsList.setGridColor(new java.awt.Color(51, 51, 51));
        RoomsList.setRowHeight(25);
        RoomsList.setRowMargin(1);
        RoomsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomsListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RoomsList);

        jLabel1.setFont(new java.awt.Font("Georgia Pro Cond", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Bookings");

        jLabel7.setFont(new java.awt.Font("Georgia Pro Cond", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Hotel De Furina ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(roomTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(roomNumCB, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addonsCB, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(statusCB, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(DelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(357, 357, 357)
                                        .addComponent(jLabel1)))
                                .addGap(0, 879, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1048, 1048, 1048)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(814, 814, 814)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomNumCB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addonsCB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusCB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ShowRooms(){
         try {
            model = (DefaultTableModel) RoomsList.getModel();
            model.setRowCount(0);
            
            Pst = Con.prepareStatement("SELECT * FROM checkin");
            Rs = Pst.executeQuery();
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("id"), Rs.getString("name"), Rs.getString("rooms"), Rs.getString("roomnum"), Rs.getString("additionals"), Rs.getString("status")});
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
            
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TO//add button input values into table
        String name = RNameTb.getText();
        if(name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Data.");
        }else{
            try{
                PreparedStatement Save = Con.prepareStatement("insert into `checkin`(`name`, `rooms`, `roomnum`, `additionals`, `status`) values(?,?,?,?,?)");
                Save.setString(1, RNameTb.getText());
                Save.setString(2, roomTypeCB.getSelectedItem().toString());
                Save.setString(3, roomNumCB.getSelectedItem().toString());
                Save.setString(4, addonsCB.getSelectedItem().toString());
                Save.setString(5, statusCB.getSelectedItem().toString());
                
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Room Added");
                ShowRooms();
            }catch (SQLException ex){
                JOptionPane.showMessageDialog(this, ex);
            }
             }
    }//GEN-LAST:event_AddBtnActionPerformed
int Key = 0;
    private void DelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelBtnActionPerformed
        // delete row
        String name = RNameTb.getText();
        int notFound = 0;
        if(name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure all fields are filled out");
        }
        try{
            Pst = Con.prepareStatement("SELECT * FROM checkin WHERE name='"+name+"'");
            Rs = Pst.executeQuery();
            while(Rs.next()){
                notFound = 1;
                Pst = Con.prepareStatement("DELETE FROM checkin WHERE name='"+name+"'");
                Pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Succesfully Deleted!");
                ShowRooms(); 
            }
        if(notFound == 0){
            JOptionPane.showMessageDialog(this, "Booking Not Found!");
        }
        }catch(SQLException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex); 
        }
        
    }//GEN-LAST:event_DelBtnActionPerformed

    private void RoomsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomsListMouseClicked
        // TODO add your handling code here:
        
        int row = RoomsList.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)RoomsList.getModel();
        
        RNameTb.setText(model.getValueAt(row, 1).toString());
        roomTypeCB.setSelectedItem(model.getValueAt(row, 2).toString());
        roomNumCB.setSelectedItem(model.getValueAt(row, 3).toString());
        addonsCB.setSelectedItem(model.getValueAt(row, 4).toString());
        statusCB.setSelectedItem(model.getValueAt(row, 5).toString());
    }//GEN-LAST:event_RoomsListMouseClicked

    private void searchTfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTfKeyReleased
        // TODO add your handling code here:
        DefaultTableModel obj=(DefaultTableModel) RoomsList.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        RoomsList.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(searchTf.getText()));
    }//GEN-LAST:event_searchTfKeyReleased

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) RoomsList.getModel();
        if(RoomsList.getSelectedRowCount() == 1){
            try{
                // get the id of the selected row from the database
                int selectedRowIndex = RoomsList.getSelectedRow();
                int id = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());

                PreparedStatement Save = Con.prepareStatement("Update checkin SET name=?, rooms=?, roomnum=?, additionals=?,status=? WHERE id=?");
                Save.setString(1, RNameTb.getText());
                Save.setString(2, roomTypeCB.getSelectedItem().toString());
                Save.setString(3, roomNumCB.getSelectedItem().toString());
                Save.setString(4, addonsCB.getSelectedItem().toString());
                Save.setString(5, statusCB.getSelectedItem().toString());
                Save.setInt(6, id);
                
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Updated Succesfully!");
                ShowRooms();
            }catch (SQLException ex){
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel obj=(DefaultTableModel) RoomsList.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        RoomsList.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(searchTf.getText()));
    }//GEN-LAST:event_searchBtnActionPerformed

    private void roomsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsBtnMouseClicked
        // TODO add your handling code here:
        Room1 roomPage = new Room1();
        roomPage.setLocationRelativeTo(null);
        roomPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_roomsBtnMouseClicked

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        // TODO add your handling code here:
        Login loginPage = new Login();
        loginPage.setLocationRelativeTo(null);
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Rooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton DelBtn;
    private javax.swing.JTextField RNameTb;
    private javax.swing.JTable RoomsList;
    private javax.swing.JComboBox<String> addonsCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JComboBox<String> roomNumCB;
    private javax.swing.JComboBox<String> roomTypeCB;
    private javax.swing.JLabel roomsBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTf;
    private javax.swing.JComboBox<String> statusCB;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
