/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarket_hadi;
import java.awt.HeadlessException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi_hadi;

/**
 *
 * @author admin
 */
public class formuser_hadii extends javax.swing.JFrame {
     private Connection koneksi;
   private koneksi_hadi db=new koneksi_hadi();    
   public boolean databaru;
   public String vpassword,vmd5;


    /**
     * Creates new form formuser_hadii
     */
    public formuser_hadii() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        userid_hadi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        idpegawai_hadi = new javax.swing.JComboBox<>();
        pegawai_hadi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        username_hadi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        password_hadi = new javax.swing.JPasswordField();
        add = new javax.swing.JButton();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        search = new javax.swing.JButton();
        cari_hadi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_hadi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel5.setText("FORM USER");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 40, 143, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, -10, 140, 120);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 100);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("USER ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 150, 90, 30);
        getContentPane().add(userid_hadi);
        userid_hadi.setBounds(140, 140, 190, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("ID PEGAWAI");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 210, 90, 30);

        idpegawai_hadi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        idpegawai_hadi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                idpegawai_hadiItemStateChanged(evt);
            }
        });
        getContentPane().add(idpegawai_hadi);
        idpegawai_hadi.setBounds(140, 210, 190, 40);
        getContentPane().add(pegawai_hadi);
        pegawai_hadi.setBounds(350, 210, 260, 40);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("USERNAME");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 290, 90, 30);
        getContentPane().add(username_hadi);
        username_hadi.setBounds(140, 290, 260, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 360, 90, 30);
        getContentPane().add(password_hadi);
        password_hadi.setBounds(140, 350, 260, 40);

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(20, 430, 110, 40);

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(150, 430, 110, 40);

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(270, 430, 120, 40);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(400, 430, 120, 40);

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(530, 430, 120, 40);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(660, 430, 120, 40);

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seaRch.png"))); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(20, 490, 130, 40);
        getContentPane().add(cari_hadi);
        cari_hadi.setBounds(160, 490, 250, 40);

        Tabel_hadi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabel_hadi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_hadiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel_hadi);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 550, 760, 120);

        setSize(new java.awt.Dimension(816, 860));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //----------------------------Menampilkan Data Ke Tabel -----------
     public void getdata(){
        // Code Tampil Data
       DefaultTableModel tbm = new DefaultTableModel();
               //membuat nama kolom pada tabel
                  tbm.addColumn("User ID");
                   tbm.addColumn("ID Pegawai");
                  tbm.addColumn("User Name");
                  tbm.addColumn("Password");
                Tabel_hadi.setModel(tbm);              
      db.koneksiDatabase();
        try {
            String query = "SELECT * FROM tbuser_hadi";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
             
            while (rs.next()) {               
              tbm.addRow(new Object[]{
                rs.getString("id_User"),
                rs.getString("id_pegawai"),
                rs.getString("username"),
                rs.getString("password"),
            });
               Tabel_hadi.setModel(tbm);
          }            
        } catch (SQLException e)
        {      
    }
 }
      public void textblank()
            {
                userid_hadi.setText("");
                pegawai_hadi.setText("");
                username_hadi.setText("");
                password_hadi.setText("");
                idpegawai_hadi.setSelectedIndex(0);
                cari_hadi.setText("");
            } 
     //---------------Menampilkan Data ke Combobox --------------------------
       public void tampil_ID()
       {
         try
          {
            String query = "SELECT * FROM tbpegawai_hadi group by id_pegawai";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            idpegawai_hadi.addItem(" Pilih Data Pegawai");             
            while (rs.next()) 
              {                       
                 idpegawai_hadi.addItem(rs.getString("id_pegawai"));
             }
          }       
        catch(Exception ex)
        {
            
        }
       }
 //---------------------End --------------
    // Procedure MD5
    private String encryptPasswordMD5(){
        vpassword=password_hadi.getText();
        String encPass=null;
        try{
            MessageDigest digest=MessageDigest.getInstance("MD5");
            digest.update(vpassword.getBytes(),0,vpassword.length());
            encPass=new BigInteger(1,digest.digest()).toString(16);
            vmd5=encPass.toUpperCase();
            password_hadi.setText(vmd5);
        }
        catch(Exception e)
        {
        }
        return encPass;
    }
    
    private void Tabel_hadiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_hadiMouseClicked

        // TODO add your handling code here:
        boolean result = false;
        String idpegawai, pass;
        idpegawai= (String) idpegawai_hadi.getSelectedItem();

        encryptPasswordMD5();
        password_hadi.setText(vmd5);

        databaru = false; // menampilkan data ke textboxt
        try {
            int row =Tabel_hadi.getSelectedRow();
            String tabel_klik=(Tabel_hadi.getModel().getValueAt(row, 0).toString());
            db.koneksiDatabase();
            String query = "SELECT * FROM tbuser_hadi where id_user = '" + tabel_klik + "'";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                userid_hadi.setText(rs.getString("id_user"));
                username_hadi.setText(rs.getString("username"));
                idpegawai=idpegawai+"id_pegawai";
                password_hadi.setText(rs.getString("password"));
            }
        } catch (Exception e)
        {

        }
    }//GEN-LAST:event_Tabel_hadiMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        getdata();
        tampil_ID();
    }//GEN-LAST:event_formWindowOpened

    private void idpegawai_hadiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_idpegawai_hadiItemStateChanged
        // TODO add your handling code here:
        // TODO add your handling code here:
        String id;
        id=(String)idpegawai_hadi.getSelectedItem();
        pegawai_hadi.setText(id);
        db.koneksiDatabase();
        try {
            String query = "SELECT * FROM tbpegawai_hadi where id_pegawai = '" + id + "'";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) 
            {
              pegawai_hadi.setText(rs.getString("nama_pegawai"));
            }
       }
     catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan !");
        }    
    }//GEN-LAST:event_idpegawai_hadiItemStateChanged

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
         // Simpan Data
          db.koneksiDatabase();
          boolean result = false;
          String idpegawai, pass;
          idpegawai= (String) idpegawai_hadi.getSelectedItem();

          encryptPasswordMD5();
          password_hadi.setText(vmd5);
          
   // kode Simpan---------------
        String sql = "Insert Into tbuser_hadi Values ('" + userid_hadi.getText() + "',  '" +
                                                       idpegawai + "','" + 
                                                        username_hadi.getText() + "','" + 
                                                         password_hadi.getText() + "' )";
        try {
                 Statement st = db.getKoneksi().createStatement();
                  st.executeUpdate(sql);
                  result=true;
                 JOptionPane.showMessageDialog(null, "Proses Simpan Sukses !");
                getdata();
          } catch (SQLException e)
             {     
                  JOptionPane.showMessageDialog(null, e.getMessage());              
             }   
    }//GEN-LAST:event_saveActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        userid_hadi.setText("");
        username_hadi.setText("");
        idpegawai_hadi.getSelectedItem();
        password_hadi.setText("");
        cari_hadi.setText("");
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        //Update
        db.koneksiDatabase();
        
        encryptPasswordMD5();
        password_hadi.setText(vmd5);

        
        try{
            String sql = "update tbuser_hadi SET id_user_hadi = '"+userid_hadi.getText()
                    +"', username = '"+username_hadi.getText()
                    +"', password = '"+password_hadi.getText()
                    +"' WHERE id_user_hadi = '"+userid_hadi.getText()+"'";
            Statement st = db.getKoneksi().createStatement();
            st.executeUpdate(sql);
            
            textblank();
            tampil_ID();
            getdata();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Ubah !");
           
        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
         //Hapus
        db.koneksiDatabase();
        int ok=JOptionPane.showConfirmDialog(null,"Apakah Yakin Mendelete record ini???",
            "Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0)
        {
            try
            {
                String sql = "Delete FROM tbuser_hadi where id_user_indahp = '" + userid_hadi.getText() + "'";
                Statement st = db.getKoneksi().createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Delete Data Sukses");
                
                textblank();
                getdata();
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Delete Data Gagal");
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        //Batal
        textblank();
    }//GEN-LAST:event_cancelActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        //Keluar
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        //Cari
        db.koneksiDatabase();
        try {
            String query = "SELECT * FROM tbuser_hadi where id_user = '" + cari_hadi.getText() + "'";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                userid_hadi.setText(rs.getString("id_user"));
                idpegawai_hadi.setSelectedItem(rs.getString("id_pegawai"));
                pegawai_hadi.setText(rs.getString("username"));
                username_hadi.setText(rs.getString("username"));
                password_hadi.setText(rs.getString("password"));
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan !");
        }
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(formuser_hadii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formuser_hadii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formuser_hadii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formuser_hadii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formuser_hadii().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel_hadi;
    private javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cari_hadi;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> idpegawai_hadi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password_hadi;
    private javax.swing.JTextField pegawai_hadi;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    private javax.swing.JTextField userid_hadi;
    private javax.swing.JTextField username_hadi;
    // End of variables declaration//GEN-END:variables
}
