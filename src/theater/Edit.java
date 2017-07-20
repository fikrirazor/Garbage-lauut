/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theater;

import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author fikrirazor
 */
public class Edit extends javax.swing.JFrame {

    /**
     * Creates new form Edit
     */
    int posX=0,posY=0;
    
    public Edit() {
        initComponents();
        load_table();
        load_tablepenonton();
        load_tabletheater();
        hasil();hasil2();hasil3();hasil4();
    }
    private void hasil() {
    try {
    String sql = "select judul_film, count(judul_film) c from menonton\n" +
    "group by judul_film\n" +
    "order by c desc\n" +
    "limit 1";
    java.sql.Connection conn=(Connection)connector.configDB();
    java.sql.Statement stm=conn.createStatement();
    java.sql.ResultSet res=stm.executeQuery(sql);
    while(res.next()){
    labelhasil1.setText(res.getString("judul_film"));
    }
    }catch (Exception e) {
        }
    }
    private void hasil2() {
    try {
    String sql = 
    "select no_hp, count(no_hp) c from menonton\n" +
    "group by no_hp\n" +
    "order by c desc\n" +
    "limit 1";
    java.sql.Connection conn=(Connection)connector.configDB();
    java.sql.Statement stm=conn.createStatement();
    java.sql.ResultSet res=stm.executeQuery(sql);
    while(res.next()){
    labelhasil2.setText(res.getString("no_hp"));
    }
    }catch (Exception e) {
        }
    }
    private void hasil3() {
    try {
    String sql = 
    "select Nama_studio, count(Nama_studio) c from menonton\n" +
    "group by Nama_studio\n" +
    "order by c desc\n" +
    "limit 1;";
    java.sql.Connection conn=(Connection)connector.configDB();
    java.sql.Statement stm=conn.createStatement();
    java.sql.ResultSet res=stm.executeQuery(sql);
    while(res.next()){
    labelhasil3.setText(res.getString("Nama_studio"));
    }
    }catch (Exception e) {
        }
    }
    private void hasil4() {
    try {
    String sql = 
    "select harga, count(harga) c from menonton\n" +
    "group by harga\n" +
    "order by c desc\n" +
    "limit 1;";
    java.sql.Connection conn=(Connection)connector.configDB();
    java.sql.Statement stm=conn.createStatement();
    java.sql.ResultSet res=stm.executeQuery(sql);
    while(res.next()){
    labelhasil4.setText(res.getString("harga"));
    }
    }catch (Exception e) {
        }
    }
    private void load_table(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Nama Studio");
        model.addColumn("No hp");
        model.addColumn("Judul Film");
        model.addColumn("waktu");
        model.addColumn("harga");
        
        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql = "select * from menonton";
            java.sql.Connection conn=(Connection)connector.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
            tablepembelian.setModel(model);
        } catch (Exception e) {
        }
    }
      private void load_tablepenonton(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("No hp");
        model.addColumn("password");
        model.addColumn("email");
        model.addColumn("nama depan");
        model.addColumn("nama belakang");
        
        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql = "select * from Penonton";
            java.sql.Connection conn=(Connection)connector.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
            tablepenonton.setModel(model);
        } catch (Exception e) {
        }
    }
        private void load_tabletheater(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Nama Studio");
        model.addColumn("judul film");
        model.addColumn("waktu");
        model.addColumn("harga");
        model.addColumn("production");
        
        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql = "select * from theater";
            java.sql.Connection conn=(Connection)connector.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
            tabletheater.setModel(model);
        } catch (Exception e) {
        }
    }
    private void kosong(){
        txtnamebooking.setText(null);
        txthpbooking.setText(null);
        txtjudulbooking.setText(null);
        txtwaktubooking.setText(null);
        txthargabooking.setText(null);
        txthppenonton.setText(null);
        txtpasswordpenonton.setText(null);
        txtemailpenonton.setText(null);
        txtnamadepanpenonton.setText(null);
        txtnamabelakangpenonton.setText(null);
        txtstudio.setText(null);
        txtjudul.setText(null);
        txtwaktu.setText(null);
        txtharga.setText(null);
        txtproduksi.setText(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        btnbook = new javax.swing.JLabel();
        btnnonton = new javax.swing.JLabel();
        btntheater = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnhasil = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        theater = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        txtproduksi = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtharga = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtwaktu = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtjudul = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtstudio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabletheater = new javax.swing.JTable();
        emptybtntheater = new javax.swing.JLabel();
        clearbtntheater = new javax.swing.JLabel();
        editbuttontheater = new javax.swing.JLabel();
        addbtntheater = new javax.swing.JLabel();
        penonton = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        txtnamabelakangpenonton = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txtnamadepanpenonton = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txtemailpenonton = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        txtpasswordpenonton = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txthppenonton = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablepenonton = new javax.swing.JTable();
        emptybtnpenonton = new javax.swing.JLabel();
        clearbtnpenonton = new javax.swing.JLabel();
        editbuttonpenonton = new javax.swing.JLabel();
        addbtnpenonton = new javax.swing.JLabel();
        pembelian = new javax.swing.JPanel();
        jSeparator12 = new javax.swing.JSeparator();
        txthargabooking = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        txtwaktubooking = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        txtjudulbooking = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        txthpbooking = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        txtnamebooking = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablepembelian = new javax.swing.JTable();
        emptybtnpembelian = new javax.swing.JLabel();
        clearbtnpembelian = new javax.swing.JLabel();
        editbuttonpembelian = new javax.swing.JLabel();
        addbtnpembelian = new javax.swing.JLabel();
        hasil = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelhasil1 = new javax.swing.JLabel();
        labelhasil2 = new javax.swing.JLabel();
        labelhasil3 = new javax.swing.JLabel();
        labelhasil4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        Main.setBackground(new java.awt.Color(109, 146, 160));

        Header.setBackground(new java.awt.Color(16, 62, 80));

        btnbook.setBackground(new java.awt.Color(2, 39, 53));
        btnbook.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnbook.setForeground(new java.awt.Color(254, 254, 254));
        btnbook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnbook.setText("Booking");
        btnbook.setOpaque(true);
        btnbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbookMouseClicked(evt);
            }
        });

        btnnonton.setBackground(new java.awt.Color(69, 115, 133));
        btnnonton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnnonton.setForeground(new java.awt.Color(254, 254, 254));
        btnnonton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnnonton.setText("Penonton");
        btnnonton.setOpaque(true);
        btnnonton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnontonMouseClicked(evt);
            }
        });

        btntheater.setBackground(new java.awt.Color(69, 115, 133));
        btntheater.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btntheater.setForeground(new java.awt.Color(254, 254, 254));
        btntheater.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btntheater.setText("Theater");
        btntheater.setOpaque(true);
        btntheater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntheaterMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(69, 115, 133));
        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(69, 115, 133));
        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_label_outline_white_24dp.png"))); // NOI18N
        jLabel2.setText("Admin Window");

        btnhasil.setBackground(new java.awt.Color(69, 115, 133));
        btnhasil.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnhasil.setForeground(new java.awt.Color(254, 254, 254));
        btnhasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnhasil.setText("Hasil");
        btnhasil.setOpaque(true);
        btnhasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhasilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnbook, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnonton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btntheater, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                        .addGap(0, 36, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnonton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntheater, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        home.setBackground(new java.awt.Color(109, 146, 160));
        home.setLayout(new java.awt.CardLayout());

        theater.setBackground(new java.awt.Color(109, 146, 160));

        jSeparator6.setBackground(new java.awt.Color(0, 57, 38));
        jSeparator6.setForeground(new java.awt.Color(0, 57, 38));

        txtproduksi.setBackground(new java.awt.Color(109, 146, 160));
        txtproduksi.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        txtproduksi.setForeground(new java.awt.Color(254, 254, 254));
        txtproduksi.setText("Produksi :");
        txtproduksi.setBorder(null);

        jSeparator5.setBackground(new java.awt.Color(0, 57, 38));
        jSeparator5.setForeground(new java.awt.Color(0, 57, 38));

        txtharga.setBackground(new java.awt.Color(109, 146, 160));
        txtharga.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        txtharga.setForeground(new java.awt.Color(254, 254, 254));
        txtharga.setText("Harga :");
        txtharga.setBorder(null);
        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(0, 57, 38));
        jSeparator4.setForeground(new java.awt.Color(0, 57, 38));

        txtwaktu.setBackground(new java.awt.Color(109, 146, 160));
        txtwaktu.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        txtwaktu.setForeground(new java.awt.Color(254, 254, 254));
        txtwaktu.setText("2017-05-10 07:00:00");
        txtwaktu.setBorder(null);
        txtwaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwaktuActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 57, 38));
        jSeparator3.setForeground(new java.awt.Color(0, 57, 38));

        txtjudul.setBackground(new java.awt.Color(109, 146, 160));
        txtjudul.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        txtjudul.setForeground(new java.awt.Color(254, 254, 254));
        txtjudul.setText("Judul Film :");
        txtjudul.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(0, 57, 38));
        jSeparator2.setForeground(new java.awt.Color(0, 57, 38));

        txtstudio.setBackground(new java.awt.Color(109, 146, 160));
        txtstudio.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        txtstudio.setForeground(new java.awt.Color(254, 254, 254));
        txtstudio.setText("Nama Studio :");
        txtstudio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtstudio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtstudio.setSelectedTextColor(new java.awt.Color(254, 254, 254));
        txtstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudioActionPerformed(evt);
            }
        });

        tabletheater.setAutoCreateRowSorter(true);
        tabletheater.setBackground(new java.awt.Color(254, 254, 254));
        tabletheater.setBorder(null);
        tabletheater.setForeground(new java.awt.Color(1, 1, 1));
        tabletheater.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama Studio", "No Hp", "Studio", "Judul Film", "Waktu", "No Kursi"
            }
        ));
        tabletheater.setGridColor(new java.awt.Color(254, 254, 254));
        tabletheater.setSelectionBackground(new java.awt.Color(66, 176, 244));
        tabletheater.setSelectionForeground(new java.awt.Color(1, 1, 1));
        tabletheater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabletheaterMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabletheater);

        emptybtntheater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deleteblack.png"))); // NOI18N
        emptybtntheater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emptybtntheaterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                emptybtntheaterMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emptybtntheaterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emptybtntheaterMouseEntered(evt);
            }
        });

        clearbtntheater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clearallblack.png"))); // NOI18N
        clearbtntheater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearbtntheaterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clearbtntheaterMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtntheaterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearbtntheaterMouseEntered(evt);
            }
        });

        editbuttontheater.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        editbuttontheater.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editbuttontheater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/b.png"))); // NOI18N
        editbuttontheater.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        editbuttontheater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editbuttontheaterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editbuttontheaterMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbuttontheaterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editbuttontheaterMouseEntered(evt);
            }
        });

        addbtntheater.setBackground(new java.awt.Color(1, 1, 1));
        addbtntheater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addblack.png"))); // NOI18N
        addbtntheater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addbtntheaterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addbtntheaterMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtntheaterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbtntheaterMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout theaterLayout = new javax.swing.GroupLayout(theater);
        theater.setLayout(theaterLayout);
        theaterLayout.setHorizontalGroup(
            theaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(theaterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(theaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emptybtntheater)
                    .addComponent(clearbtntheater)
                    .addComponent(editbuttontheater)
                    .addComponent(addbtntheater))
                .addGap(54, 54, 54)
                .addGroup(theaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator4)
                    .addComponent(txtjudul)
                    .addComponent(txtwaktu)
                    .addComponent(txtharga)
                    .addComponent(txtproduksi)
                    .addComponent(txtstudio)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        theaterLayout.setVerticalGroup(
            theaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(theaterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(theaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(theaterLayout.createSequentialGroup()
                        .addComponent(txtstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txtjudul, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtproduksi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(theaterLayout.createSequentialGroup()
                        .addComponent(addbtntheater)
                        .addGap(18, 18, 18)
                        .addComponent(editbuttontheater)
                        .addGap(18, 18, 18)
                        .addComponent(clearbtntheater)
                        .addGap(18, 18, 18)
                        .addComponent(emptybtntheater)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        home.add(theater, "card2");

        penonton.setBackground(new java.awt.Color(109, 146, 160));

        jSeparator7.setBackground(new java.awt.Color(0, 57, 38));
        jSeparator7.setForeground(new java.awt.Color(0, 57, 38));

        txtnamabelakangpenonton.setBackground(new java.awt.Color(109, 146, 160));
        txtnamabelakangpenonton.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        txtnamabelakangpenonton.setForeground(new java.awt.Color(254, 254, 254));
        txtnamabelakangpenonton.setText("Nama Belakang");
        txtnamabelakangpenonton.setBorder(null);
        txtnamabelakangpenonton.setCaretColor(new java.awt.Color(254, 254, 254));

        jSeparator8.setBackground(new java.awt.Color(0, 57, 38));
        jSeparator8.setForeground(new java.awt.Color(0, 57, 38));

        txtnamadepanpenonton.setBackground(new java.awt.Color(109, 146, 160));
        txtnamadepanpenonton.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        txtnamadepanpenonton.setForeground(new java.awt.Color(254, 254, 254));
        txtnamadepanpenonton.setText("Nama Depan :");
        txtnamadepanpenonton.setBorder(null);
        txtnamadepanpenonton.setCaretColor(new java.awt.Color(254, 254, 254));
        txtnamadepanpenonton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamadepanpenontonActionPerformed(evt);
            }
        });

        jSeparator9.setBackground(new java.awt.Color(0, 57, 38));
        jSeparator9.setForeground(new java.awt.Color(0, 57, 38));

        txtemailpenonton.setBackground(new java.awt.Color(109, 146, 160));
        txtemailpenonton.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        txtemailpenonton.setForeground(new java.awt.Color(254, 254, 254));
        txtemailpenonton.setText("Email :");
        txtemailpenonton.setBorder(null);
        txtemailpenonton.setCaretColor(new java.awt.Color(254, 254, 254));
        txtemailpenonton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailpenontonActionPerformed(evt);
            }
        });

        jSeparator10.setBackground(new java.awt.Color(0, 57, 38));
        jSeparator10.setForeground(new java.awt.Color(0, 57, 38));

        txtpasswordpenonton.setBackground(new java.awt.Color(109, 146, 160));
        txtpasswordpenonton.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        txtpasswordpenonton.setForeground(new java.awt.Color(254, 254, 254));
        txtpasswordpenonton.setText("Password :");
        txtpasswordpenonton.setBorder(null);
        txtpasswordpenonton.setCaretColor(new java.awt.Color(254, 254, 254));

        jSeparator11.setBackground(new java.awt.Color(0, 57, 38));
        jSeparator11.setForeground(new java.awt.Color(0, 57, 38));

        txthppenonton.setBackground(new java.awt.Color(109, 146, 160));
        txthppenonton.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        txthppenonton.setForeground(new java.awt.Color(254, 254, 254));
        txthppenonton.setText("No Hp :");
        txthppenonton.setBorder(null);
        txthppenonton.setCaretColor(new java.awt.Color(254, 254, 254));
        txthppenonton.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txthppenonton.setSelectedTextColor(new java.awt.Color(254, 254, 254));
        txthppenonton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthppenontonActionPerformed(evt);
            }
        });

        tablepenonton.setAutoCreateRowSorter(true);
        tablepenonton.setBackground(new java.awt.Color(254, 254, 254));
        tablepenonton.setBorder(null);
        tablepenonton.setForeground(new java.awt.Color(1, 1, 1));
        tablepenonton.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama Studio", "No Hp", "Studio", "Judul Film", "Waktu", "No Kursi"
            }
        ));
        tablepenonton.setGridColor(new java.awt.Color(254, 254, 254));
        tablepenonton.setSelectionBackground(new java.awt.Color(66, 176, 244));
        tablepenonton.setSelectionForeground(new java.awt.Color(1, 1, 1));
        tablepenonton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablepenontonMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablepenonton);

        emptybtnpenonton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deleteblack.png"))); // NOI18N
        emptybtnpenonton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emptybtnpenontonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                emptybtnpenontonMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emptybtnpenontonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emptybtnpenontonMouseEntered(evt);
            }
        });

        clearbtnpenonton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clearallblack.png"))); // NOI18N
        clearbtnpenonton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearbtnpenontonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clearbtnpenontonMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtnpenontonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearbtnpenontonMouseEntered(evt);
            }
        });

        editbuttonpenonton.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        editbuttonpenonton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editbuttonpenonton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/b.png"))); // NOI18N
        editbuttonpenonton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        editbuttonpenonton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editbuttonpenontonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editbuttonpenontonMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbuttonpenontonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editbuttonpenontonMouseEntered(evt);
            }
        });

        addbtnpenonton.setBackground(new java.awt.Color(1, 1, 1));
        addbtnpenonton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addblack.png"))); // NOI18N
        addbtnpenonton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addbtnpenontonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addbtnpenontonMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnpenontonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbtnpenontonMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout penontonLayout = new javax.swing.GroupLayout(penonton);
        penonton.setLayout(penontonLayout);
        penontonLayout.setHorizontalGroup(
            penontonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penontonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(penontonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emptybtnpenonton)
                    .addComponent(clearbtnpenonton)
                    .addComponent(editbuttonpenonton)
                    .addComponent(addbtnpenonton))
                .addGap(72, 72, 72)
                .addGroup(penontonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator8)
                    .addComponent(jSeparator9)
                    .addComponent(txtpasswordpenonton)
                    .addComponent(txtemailpenonton)
                    .addComponent(txtnamadepanpenonton)
                    .addComponent(txtnamabelakangpenonton)
                    .addComponent(txthppenonton)
                    .addComponent(jSeparator11)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
        );
        penontonLayout.setVerticalGroup(
            penontonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(penontonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(penontonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(penontonLayout.createSequentialGroup()
                        .addComponent(txthppenonton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txtpasswordpenonton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtemailpenonton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtnamadepanpenonton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(penontonLayout.createSequentialGroup()
                        .addComponent(addbtnpenonton)
                        .addGap(18, 18, 18)
                        .addComponent(editbuttonpenonton)
                        .addGap(18, 18, 18)
                        .addComponent(clearbtnpenonton)
                        .addGap(18, 18, 18)
                        .addComponent(emptybtnpenonton)))
                .addGap(18, 18, 18)
                .addComponent(txtnamabelakangpenonton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        home.add(penonton, "card2");

        pembelian.setBackground(new java.awt.Color(109, 146, 160));

        jSeparator12.setBackground(new java.awt.Color(0, 57, 38));
        jSeparator12.setForeground(new java.awt.Color(0, 57, 38));

        txthargabooking.setBackground(new java.awt.Color(109, 146, 160));
        txthargabooking.setBorder(null);

        jSeparator13.setBackground(new java.awt.Color(0, 57, 38));
        jSeparator13.setForeground(new java.awt.Color(0, 57, 38));

        txtwaktubooking.setBackground(new java.awt.Color(109, 146, 160));
        txtwaktubooking.setBorder(null);
        txtwaktubooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwaktubookingActionPerformed(evt);
            }
        });

        jSeparator14.setBackground(new java.awt.Color(0, 57, 38));
        jSeparator14.setForeground(new java.awt.Color(0, 57, 38));

        txtjudulbooking.setBackground(new java.awt.Color(109, 146, 160));
        txtjudulbooking.setBorder(null);
        txtjudulbooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjudulbookingActionPerformed(evt);
            }
        });

        jSeparator15.setBackground(new java.awt.Color(0, 57, 38));
        jSeparator15.setForeground(new java.awt.Color(0, 57, 38));

        txthpbooking.setBackground(new java.awt.Color(109, 146, 160));
        txthpbooking.setBorder(null);

        jSeparator16.setBackground(new java.awt.Color(0, 57, 38));
        jSeparator16.setForeground(new java.awt.Color(0, 57, 38));

        txtnamebooking.setBackground(new java.awt.Color(109, 146, 160));
        txtnamebooking.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtnamebooking.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtnamebooking.setSelectedTextColor(new java.awt.Color(254, 254, 254));
        txtnamebooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamebookingActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(254, 254, 254));
        jLabel14.setText("Nama Studio");

        jLabel15.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(254, 254, 254));
        jLabel15.setText("No Hp");

        jLabel16.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(254, 254, 254));
        jLabel16.setText("Judul Film");

        jLabel17.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(254, 254, 254));
        jLabel17.setText("Waktu");

        jLabel18.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(254, 254, 254));
        jLabel18.setText("Harga");

        tablepembelian.setAutoCreateRowSorter(true);
        tablepembelian.setBackground(new java.awt.Color(254, 254, 254));
        tablepembelian.setBorder(null);
        tablepembelian.setForeground(new java.awt.Color(1, 1, 1));
        tablepembelian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama Studio", "No Hp", "Studio", "Judul Film", "Waktu", "No Kursi"
            }
        ));
        tablepembelian.setGridColor(new java.awt.Color(254, 254, 254));
        tablepembelian.setSelectionBackground(new java.awt.Color(66, 176, 244));
        tablepembelian.setSelectionForeground(new java.awt.Color(1, 1, 1));
        tablepembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablepembelianMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablepembelian);

        emptybtnpembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deleteblack.png"))); // NOI18N
        emptybtnpembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emptybtnpembelianMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                emptybtnpembelianMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emptybtnpembelianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emptybtnpembelianMouseEntered(evt);
            }
        });

        clearbtnpembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clearallblack.png"))); // NOI18N
        clearbtnpembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearbtnpembelianMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clearbtnpembelianMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtnpembelianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearbtnpembelianMouseEntered(evt);
            }
        });

        editbuttonpembelian.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        editbuttonpembelian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editbuttonpembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/b.png"))); // NOI18N
        editbuttonpembelian.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        editbuttonpembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editbuttonpembelianMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editbuttonpembelianMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbuttonpembelianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editbuttonpembelianMouseEntered(evt);
            }
        });

        addbtnpembelian.setBackground(new java.awt.Color(1, 1, 1));
        addbtnpembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addblack.png"))); // NOI18N
        addbtnpembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addbtnpembelianMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addbtnpembelianMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnpembelianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbtnpembelianMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pembelianLayout = new javax.swing.GroupLayout(pembelian);
        pembelian.setLayout(pembelianLayout);
        pembelianLayout.setHorizontalGroup(
            pembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pembelianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emptybtnpembelian)
                    .addComponent(clearbtnpembelian)
                    .addComponent(editbuttonpembelian)
                    .addComponent(addbtnpembelian))
                .addGap(28, 28, 28)
                .addGroup(pembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addGap(27, 27, 27)
                .addGroup(pembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator12)
                    .addComponent(jSeparator13)
                    .addComponent(jSeparator14)
                    .addComponent(txthpbooking)
                    .addComponent(txtjudulbooking)
                    .addComponent(txtwaktubooking)
                    .addComponent(txthargabooking)
                    .addComponent(txtnamebooking)
                    .addComponent(jSeparator16)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
        );
        pembelianLayout.setVerticalGroup(
            pembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(pembelianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pembelianLayout.createSequentialGroup()
                        .addGroup(pembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnamebooking, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(pembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txthpbooking, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjudulbooking, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtwaktubooking, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pembelianLayout.createSequentialGroup()
                        .addComponent(addbtnpembelian)
                        .addGap(18, 18, 18)
                        .addComponent(editbuttonpembelian)
                        .addGap(18, 18, 18)
                        .addComponent(clearbtnpembelian)
                        .addGap(18, 18, 18)
                        .addComponent(emptybtnpembelian)))
                .addGap(18, 18, 18)
                .addGroup(pembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthargabooking, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        home.add(pembelian, "card2");

        hasil.setBackground(new java.awt.Color(109, 146, 160));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("User yang paling banyak memesan :");

        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Film paling banyak di tonton :");

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Studio favorit penonton :");

        jLabel6.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Harga yang paling banyak disukai penonton :");

        labelhasil1.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        labelhasil1.setForeground(new java.awt.Color(254, 254, 254));
        labelhasil1.setText(" :");

        labelhasil2.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        labelhasil2.setForeground(new java.awt.Color(254, 254, 254));
        labelhasil2.setText(" :");

        labelhasil3.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        labelhasil3.setForeground(new java.awt.Color(254, 254, 254));
        labelhasil3.setText(" :");

        labelhasil4.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        labelhasil4.setForeground(new java.awt.Color(254, 254, 254));
        labelhasil4.setText(" :");

        javax.swing.GroupLayout hasilLayout = new javax.swing.GroupLayout(hasil);
        hasil.setLayout(hasilLayout);
        hasilLayout.setHorizontalGroup(
            hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hasilLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(73, 73, 73)
                .addGroup(hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelhasil2)
                    .addComponent(labelhasil1)
                    .addComponent(labelhasil3)
                    .addComponent(labelhasil4))
                .addContainerGap(399, Short.MAX_VALUE))
            .addGroup(hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hasilLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jLabel4)
                    .addContainerGap(596, Short.MAX_VALUE)))
        );
        hasilLayout.setVerticalGroup(
            hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hasilLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(labelhasil1)
                .addGap(40, 40, 40)
                .addGroup(hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelhasil2))
                .addGap(35, 35, 35)
                .addGroup(hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelhasil3))
                .addGap(44, 44, 44)
                .addGroup(hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelhasil4))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hasilLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jLabel4)
                    .addContainerGap(313, Short.MAX_VALUE)))
        );

        home.add(hasil, "card2");

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void txtwaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwaktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwaktuActionPerformed

    private void txtstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstudioActionPerformed

    private void tabletheaterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabletheaterMouseClicked
        int baris = tabletheater.rowAtPoint(evt.getPoint());
        String Nama_studio =tabletheater.getValueAt(baris, 1).toString();
        txtstudio.setText(Nama_studio);
        String judul = tabletheater.getValueAt(baris,2).toString();
        txtjudul.setText(judul);
        String time = tabletheater.getValueAt(baris, 3).toString();
        txtwaktu.setText(time);
        String harga=tabletheater.getValueAt(baris, 4).toString();
        txtharga.setText(harga);
        String produksi = tabletheater.getValueAt(baris, 5).toString();
        txtproduksi.setText(produksi); 
    }//GEN-LAST:event_tabletheaterMouseClicked

    private void emptybtntheaterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptybtntheaterMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/deletewhite.png"));
        emptybtntheater.setIcon(II);
    }//GEN-LAST:event_emptybtntheaterMousePressed

    private void emptybtntheaterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptybtntheaterMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/deleteblack.png"));
        emptybtntheater.setIcon(II);
    }//GEN-LAST:event_emptybtntheaterMouseReleased

    private void emptybtntheaterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptybtntheaterMouseClicked
        try {
            String sql ="delete from theater where Nama_studio ='"+txtstudio.getText()+"'";
            java.sql.Connection conn=(Connection)connector.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_tabletheater();
        kosong();
    }//GEN-LAST:event_emptybtntheaterMouseClicked

    private void emptybtntheaterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptybtntheaterMouseEntered
        emptybtntheater.setToolTipText("Klik Icon ini untuk menghapus data.");
    }//GEN-LAST:event_emptybtntheaterMouseEntered

    private void clearbtntheaterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtntheaterMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/clearallwhite.png"));
        clearbtntheater.setIcon(II);
    }//GEN-LAST:event_clearbtntheaterMousePressed

    private void clearbtntheaterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtntheaterMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/clearallblack.png"));
        clearbtntheater.setIcon(II);
    }//GEN-LAST:event_clearbtntheaterMouseReleased

    private void clearbtntheaterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtntheaterMouseClicked
        kosong();
    }//GEN-LAST:event_clearbtntheaterMouseClicked

    private void clearbtntheaterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtntheaterMouseEntered
        clearbtntheater.setToolTipText("Klik Icon ini untuk membersihkan cepat.");
    }//GEN-LAST:event_clearbtntheaterMouseEntered

    private void editbuttontheaterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttontheaterMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/a.png"));
        editbuttontheater.setIcon(II);
    }//GEN-LAST:event_editbuttontheaterMousePressed

    private void editbuttontheaterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttontheaterMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/b.png"));
        editbuttontheater.setIcon(II);
    }//GEN-LAST:event_editbuttontheaterMouseReleased

    private void editbuttontheaterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttontheaterMouseClicked
        try {
            String sql ="UPDATE theater SET Nama_studio = '"+txtstudio.getText()+"', judul_film = '"+txtjudul.getText()+"',waktu = '"+txtwaktu.getText()+"',harga = '"+txtharga.getText()+"',production = '"+txtproduksi.getText()+"' WHERE Nama_studio= '"+txtstudio.getText()+"'";
            java.sql.Connection conn=(Connection)connector.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        load_tabletheater();
        kosong();
    }//GEN-LAST:event_editbuttontheaterMouseClicked

    private void editbuttontheaterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttontheaterMouseEntered
        editbuttontheater.setToolTipText("Klik Icon ini untuk mengedit data.");
    }//GEN-LAST:event_editbuttontheaterMouseEntered

    private void addbtntheaterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtntheaterMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/addwhite.png"));
        addbtntheater.setIcon(II);
    }//GEN-LAST:event_addbtntheaterMousePressed

    private void addbtntheaterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtntheaterMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/addblack.png"));
        addbtntheater.setIcon(II);
    }//GEN-LAST:event_addbtntheaterMouseReleased

    private void addbtntheaterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtntheaterMouseClicked
        try {
            String sql = "INSERT INTO theater VALUES ('"+txtstudio.getText()+"','"+txtjudul.getText()+"','"+txtwaktu.getText()+"','"+txtharga.getText()+"','"+txtproduksi.getText()+"')";
            java.sql.Connection conn=(Connection)connector.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_tabletheater();
        kosong();
    }//GEN-LAST:event_addbtntheaterMouseClicked

    private void addbtntheaterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtntheaterMouseEntered
        addbtntheater.setToolTipText("Klik Icon ini untuk menambahkan data.");
    }//GEN-LAST:event_addbtntheaterMouseEntered

    private void btnbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbookMouseClicked
        setlblcolor(btnbook);
        resetlblcolor(btnnonton);
        resetlblcolor(btntheater);
        resetlblcolor(btnhasil);
        pembelian.setVisible(true);
        penonton.setVisible(false);
        theater.setVisible(false);
        hasil.setVisible(false);
    }//GEN-LAST:event_btnbookMouseClicked

    private void btnnontonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnontonMouseClicked
        setlblcolor(btnnonton);
        resetlblcolor(btnbook);
        resetlblcolor(btntheater);
        resetlblcolor(btnhasil);
        pembelian.setVisible(false);
        penonton.setVisible(true);
        theater.setVisible(false);
        hasil.setVisible(false);
    }//GEN-LAST:event_btnnontonMouseClicked

    private void btntheaterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntheaterMouseClicked
        setlblcolor(btntheater);
        resetlblcolor(btnbook);
        resetlblcolor(btnnonton);
        resetlblcolor(btnhasil);
        pembelian.setVisible(false);
        penonton.setVisible(false);
        theater.setVisible(true);
        hasil.setVisible(false);
    }//GEN-LAST:event_btntheaterMouseClicked

    private void txtnamadepanpenontonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamadepanpenontonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamadepanpenontonActionPerformed

    private void txtemailpenontonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailpenontonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailpenontonActionPerformed

    private void txthppenontonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthppenontonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthppenontonActionPerformed

    private void tablepenontonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablepenontonMouseClicked
        int baris = tablepenonton.rowAtPoint(evt.getPoint());
        String Nama_studio =tablepenonton.getValueAt(baris, 1).toString();
        txthppenonton.setText(Nama_studio);
        String judul = tablepenonton.getValueAt(baris,2).toString();
        txtpasswordpenonton.setText(judul);
        String time = tablepenonton.getValueAt(baris, 3).toString();
        txtemailpenonton.setText(time);
        String harga=tablepenonton.getValueAt(baris, 4).toString();
        txtnamadepanpenonton.setText(harga);
        String produksi = tablepenonton.getValueAt(baris, 5).toString();
        txtnamabelakangpenonton.setText(produksi); 
    }//GEN-LAST:event_tablepenontonMouseClicked

    private void emptybtnpenontonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptybtnpenontonMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/deletewhite.png"));
        emptybtnpenonton.setIcon(II);
    }//GEN-LAST:event_emptybtnpenontonMousePressed

    private void emptybtnpenontonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptybtnpenontonMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/deleteblack.png"));
        emptybtnpenonton.setIcon(II);
    }//GEN-LAST:event_emptybtnpenontonMouseReleased

    private void emptybtnpenontonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptybtnpenontonMouseClicked
        try {
            String sql ="delete from Penonton where no_hp ='"+txthppenonton.getText()+"'";
            java.sql.Connection conn=(Connection)connector.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_tablepenonton();
        kosong();
    }//GEN-LAST:event_emptybtnpenontonMouseClicked

    private void emptybtnpenontonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptybtnpenontonMouseEntered
        emptybtnpenonton.setToolTipText("Klik Icon ini untuk menghapus data.");
    }//GEN-LAST:event_emptybtnpenontonMouseEntered

    private void clearbtnpenontonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnpenontonMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/clearallwhite.png"));
        clearbtnpenonton.setIcon(II);
    }//GEN-LAST:event_clearbtnpenontonMousePressed

    private void clearbtnpenontonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnpenontonMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/clearallblack.png"));
        clearbtnpenonton.setIcon(II);
    }//GEN-LAST:event_clearbtnpenontonMouseReleased

    private void clearbtnpenontonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnpenontonMouseClicked
        kosong();
    }//GEN-LAST:event_clearbtnpenontonMouseClicked

    private void clearbtnpenontonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnpenontonMouseEntered
        clearbtnpenonton.setToolTipText("Klik Icon ini untuk membersihkan cepat.");
    }//GEN-LAST:event_clearbtnpenontonMouseEntered

    private void editbuttonpenontonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonpenontonMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/a.png"));
        editbuttonpenonton.setIcon(II);
    }//GEN-LAST:event_editbuttonpenontonMousePressed

    private void editbuttonpenontonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonpenontonMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/b.png"));
        editbuttonpenonton.setIcon(II);
    }//GEN-LAST:event_editbuttonpenontonMouseReleased

    private void editbuttonpenontonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonpenontonMouseClicked
        try {
            String sql ="UPDATE Penonton SET no_hp = '"+txthppenonton.getText()+"', password = '"+txtpasswordpenonton.getText()+"',email = '"+txtemailpenonton.getText()+"',depan = '"+txtnamadepanpenonton.getText()+"',belakang = '"+txtnamabelakangpenonton.getText()+"' WHERE no_hp = '"+txthppenonton.getText()+"'";
            java.sql.Connection conn=(Connection)connector.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        load_tablepenonton();
        kosong();
    }//GEN-LAST:event_editbuttonpenontonMouseClicked

    private void editbuttonpenontonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonpenontonMouseEntered
        editbuttonpenonton.setToolTipText("Klik Icon ini untuk mengedit data.");
    }//GEN-LAST:event_editbuttonpenontonMouseEntered

    private void addbtnpenontonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnpenontonMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/addwhite.png"));
        addbtnpenonton.setIcon(II);
    }//GEN-LAST:event_addbtnpenontonMousePressed

    private void addbtnpenontonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnpenontonMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/addblack.png"));
        addbtnpenonton.setIcon(II);
    }//GEN-LAST:event_addbtnpenontonMouseReleased

    private void addbtnpenontonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnpenontonMouseClicked
        try {
            String sql = "INSERT INTO Penonton VALUES ('"+txthppenonton.getText()+"','"+txtpasswordpenonton.getText()+"','"+txtemailpenonton.getText()+"','"+txtnamadepanpenonton.getText()+"','"+txtnamabelakangpenonton.getText()+"')";
            java.sql.Connection conn=(Connection)connector.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_tablepenonton();
        kosong();
    }//GEN-LAST:event_addbtnpenontonMouseClicked

    private void addbtnpenontonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnpenontonMouseEntered
        addbtnpenonton.setToolTipText("Klik Icon ini untuk menambahkan data.");
    }//GEN-LAST:event_addbtnpenontonMouseEntered

    private void txtwaktubookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwaktubookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwaktubookingActionPerformed

    private void txtjudulbookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjudulbookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjudulbookingActionPerformed

    private void txtnamebookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamebookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamebookingActionPerformed

    private void tablepembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablepembelianMouseClicked
        int baris = tablepembelian.rowAtPoint(evt.getPoint());
        String Nama_studio =tablepembelian.getValueAt(baris, 1).toString();
        txtnamebooking.setText(Nama_studio);
        String judul = tablepembelian.getValueAt(baris,2).toString();
        txthpbooking.setText(judul);
        String time = tablepembelian.getValueAt(baris, 3).toString();
        txtjudulbooking.setText(time);
        String harga=tablepembelian.getValueAt(baris, 4).toString();
        txtwaktubooking.setText(harga);
        String produksi = tablepembelian.getValueAt(baris, 5).toString();
        txthargabooking.setText(produksi); 
    }//GEN-LAST:event_tablepembelianMouseClicked

    private void emptybtnpembelianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptybtnpembelianMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/deletewhite.png"));
        emptybtnpembelian.setIcon(II);
    }//GEN-LAST:event_emptybtnpembelianMousePressed

    private void emptybtnpembelianMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptybtnpembelianMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/deleteblack.png"));
        emptybtnpembelian.setIcon(II);
    }//GEN-LAST:event_emptybtnpembelianMouseReleased

    private void emptybtnpembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptybtnpembelianMouseClicked
        try {
            String sql ="delete from menonton where Nama_studio ='"+txtwaktubooking.getText()+"'";
            java.sql.Connection conn=(Connection)connector.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_emptybtnpembelianMouseClicked

    private void emptybtnpembelianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptybtnpembelianMouseEntered
        emptybtnpembelian.setToolTipText("Klik Icon ini untuk menghapus data.");
    }//GEN-LAST:event_emptybtnpembelianMouseEntered

    private void clearbtnpembelianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnpembelianMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/clearallwhite.png"));
        clearbtnpembelian.setIcon(II);
    }//GEN-LAST:event_clearbtnpembelianMousePressed

    private void clearbtnpembelianMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnpembelianMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/clearallwhite.png"));
        clearbtnpembelian.setIcon(II);
    }//GEN-LAST:event_clearbtnpembelianMouseReleased

    private void clearbtnpembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnpembelianMouseClicked
        kosong();
    }//GEN-LAST:event_clearbtnpembelianMouseClicked

    private void clearbtnpembelianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnpembelianMouseEntered
        clearbtnpembelian.setToolTipText("Klik Icon ini untuk membersihkan cepat.");
    }//GEN-LAST:event_clearbtnpembelianMouseEntered

    private void editbuttonpembelianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonpembelianMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/a.png"));
        editbuttonpembelian.setIcon(II);
    }//GEN-LAST:event_editbuttonpembelianMousePressed

    private void editbuttonpembelianMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonpembelianMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/b.png"));
        editbuttonpembelian.setIcon(II);
    }//GEN-LAST:event_editbuttonpembelianMouseReleased

    private void editbuttonpembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonpembelianMouseClicked
        try {
            String sql ="UPDATE menonton SET Judul_film = '"+txtnamebooking.getText()+"', no_hp = '"+txthpbooking.getText()+"',judul_film = '"+txtjudulbooking.getText()+"',waktu = '"+txtwaktubooking.getText()+"',harga = '"+txthargabooking.getText()+"' WHERE no_hp = '"+txthpbooking.getText()+"'";
            java.sql.Connection conn=(Connection)connector.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_editbuttonpembelianMouseClicked

    private void editbuttonpembelianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonpembelianMouseEntered
        editbuttonpembelian.setToolTipText("Klik Icon ini untuk mengedit data.");
    }//GEN-LAST:event_editbuttonpembelianMouseEntered

    private void addbtnpembelianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnpembelianMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/addwhite.png"));
        addbtnpembelian.setIcon(II);
    }//GEN-LAST:event_addbtnpembelianMousePressed

    private void addbtnpembelianMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnpembelianMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/addblack.png"));
        addbtnpembelian.setIcon(II);
    }//GEN-LAST:event_addbtnpembelianMouseReleased

    private void addbtnpembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnpembelianMouseClicked
        try {
            String sql = "INSERT INTO menonton VALUES ('"+txtnamebooking.getText()+"','"+txthpbooking.getText()+"','"+txtjudulbooking.getText()+"','"+txtwaktubooking.getText()+"','"+txthargabooking.getText()+"')";
            java.sql.Connection conn=(Connection)connector.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_addbtnpembelianMouseClicked

    private void addbtnpembelianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnpembelianMouseEntered
        addbtnpembelian.setToolTipText("Klik Icon ini untuk menambahkan data.");
    }//GEN-LAST:event_addbtnpembelianMouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX=evt.getX();
        posY=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event_formMouseDragged

    private void btnhasilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhasilMouseClicked
        setlblcolor(btnhasil);
        resetlblcolor(btnbook);
        resetlblcolor(btntheater);
        resetlblcolor(btnnonton);
        pembelian.setVisible(false);
        penonton.setVisible(false);
        theater.setVisible(false);
        hasil.setVisible(true);
    }//GEN-LAST:event_btnhasilMouseClicked
    
    public void setlblcolor(JLabel lbl){
        lbl.setBackground(new Color(2,39,53));
    }
    public void resetlblcolor(JLabel lbl){
        lbl.setBackground(new Color(69,115,133));
    }
    
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
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JLabel addbtnpembelian;
    private javax.swing.JLabel addbtnpenonton;
    private javax.swing.JLabel addbtntheater;
    private javax.swing.JLabel btnbook;
    private javax.swing.JLabel btnhasil;
    private javax.swing.JLabel btnnonton;
    private javax.swing.JLabel btntheater;
    private javax.swing.JLabel clearbtnpembelian;
    private javax.swing.JLabel clearbtnpenonton;
    private javax.swing.JLabel clearbtntheater;
    private javax.swing.JLabel editbuttonpembelian;
    private javax.swing.JLabel editbuttonpenonton;
    private javax.swing.JLabel editbuttontheater;
    private javax.swing.JLabel emptybtnpembelian;
    private javax.swing.JLabel emptybtnpenonton;
    private javax.swing.JLabel emptybtntheater;
    private javax.swing.JPanel hasil;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelhasil1;
    private javax.swing.JLabel labelhasil2;
    private javax.swing.JLabel labelhasil3;
    private javax.swing.JLabel labelhasil4;
    private javax.swing.JPanel pembelian;
    private javax.swing.JPanel penonton;
    private javax.swing.JTable tablepembelian;
    private javax.swing.JTable tablepenonton;
    private javax.swing.JTable tabletheater;
    private javax.swing.JPanel theater;
    private javax.swing.JTextField txtemailpenonton;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txthargabooking;
    private javax.swing.JTextField txthpbooking;
    private javax.swing.JTextField txthppenonton;
    private javax.swing.JTextField txtjudul;
    private javax.swing.JTextField txtjudulbooking;
    private javax.swing.JTextField txtnamabelakangpenonton;
    private javax.swing.JTextField txtnamadepanpenonton;
    private javax.swing.JTextField txtnamebooking;
    private javax.swing.JTextField txtpasswordpenonton;
    private javax.swing.JTextField txtproduksi;
    private javax.swing.JTextField txtstudio;
    private javax.swing.JTextField txtwaktu;
    private javax.swing.JTextField txtwaktubooking;
    // End of variables declaration//GEN-END:variables
}
