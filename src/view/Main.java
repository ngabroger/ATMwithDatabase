/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Roger Simanjuntak
 */
public class Main extends javax.swing.JFrame {
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }
  
    int myNorek;
    public Main(int norek){
        initComponents();
        myNorek = norek;
        jLabelNorek.setText(""+myNorek);
        GetSaldo();
    }
   
    Connection con = null;
    PreparedStatement pst = null,Pst1=null;
    ResultSet Rs = null,Rs1=null;
    Statement St = null,St1=null;
    int oldSaldo;
    String myNama;

    Main(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void GetSaldo()
    {
    String Query = "select * from accounttable where no_rek='"+myNorek+"'";
        try {
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbatm","root","");  
         St1 = con.createStatement();
         Rs1 = St1.executeQuery(Query);
         if(Rs1.next()){
            oldSaldo = Rs1.getInt(5);
            myNama = Rs1.getString(2);
             jLabelSaldo.setText(""+oldSaldo);  
             jLabelNama.setText(""+myNama);
         }else
         {
         //   JOptionPane.showMessageDialog(this, "Nomor Rekening atau PIN salah");
         }
         
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        KeluarMenu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Deposit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Withdraw = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Transfer = new javax.swing.JButton();
        jLabelNama = new javax.swing.JLabel();
        jLabelNorek = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabelSaldo = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        History = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabelNama1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Roger Simanjuntak\\OneDrive\\Documents\\Asset Source Java\\9631.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 80));

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Keluar dari Menu Bank ?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 230, 20));

        KeluarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/exit_icon-icons.com_7097_10x10-removebg-preview.png"))); // NOI18N
        KeluarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeluarMenuMouseClicked(evt);
            }
        });
        jPanel1.add(KeluarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 60, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/oogha.com_wallpaper.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DEPOSIT");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 90, 30));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Menarik Uang");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 120, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Roger Simanjuntak\\Downloads\\ezgif.com-gif-maker (3).gif")); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 90, 60));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Menyimpan Uang");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 120, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Roger Simanjuntak\\Downloads\\ezgif.com-gif-maker (1).gif")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 100, 70));

        Deposit.setBackground(new java.awt.Color(74, 197, 238));
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });
        jPanel2.add(Deposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 250, 80));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("WITHDRAW");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Roger Simanjuntak\\Downloads\\ezgif.com-gif-maker (2).gif")); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 70, 70));

        Withdraw.setBackground(new java.awt.Color(255, 0, 255));
        Withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawActionPerformed(evt);
            }
        });
        jPanel2.add(Withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 250, 80));

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CHANGE PIN");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Mengganti Pin");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, -1, -1));

        Transfer.setBackground(new java.awt.Color(102, 255, 102));
        Transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferActionPerformed(evt);
            }
        });
        jPanel2.add(Transfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 250, 80));

        jLabelNama.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabelNama.setForeground(new java.awt.Color(153, 153, 0));
        jLabelNama.setText("Nama Kamu");
        jLabelNama.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabelNamaComponentAdded(evt);
            }
        });
        jPanel2.add(jLabelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 300, 30));

        jLabelNorek.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabelNorek.setForeground(new java.awt.Color(204, 0, 204));
        jLabelNorek.setText("Nomor Rekening Kamu");
        jPanel2.add(jLabelNorek, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 310, 30));

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Selamat Datang Di Bank Emas ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 310, 20));

        jLabel15.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Nomor Rekening");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabelSaldo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabelSaldo.setForeground(new java.awt.Color(102, 255, 51));
        jLabelSaldo.setText("Saldo kamu");
        jPanel2.add(jLabelSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/9631.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 90, 80));

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Daftar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Percayakan Kepada Kami,");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 190, 40));

        jLabel20.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Kamu Memiliki Saldo");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Anda Menabung, Kami  Kenyang");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 210, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Roger Simanjuntak\\OneDrive\\Documents\\Asset Source Java\\5570863.jpg")); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 410, 270));

        jLabel21.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("HISTORY");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 120, 30));

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Roger Simanjuntak\\Downloads\\ezgif.com-gif-maker (5).gif")); // NOI18N
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 70, 60));

        jLabel23.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Riwayat Transfer");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 100, 20));

        History.setBackground(new java.awt.Color(255, 102, 102));
        History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryActionPerformed(evt);
            }
        });
        jPanel2.add(History, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 250, 80));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/1091550.jpg"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 800, 550));

        jLabelNama1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabelNama1.setForeground(new java.awt.Color(153, 153, 0));
        jLabelNama1.setText("Nama Kamu");
        jLabelNama1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabelNama1ComponentAdded(evt);
            }
        });
        jPanel2.add(jLabelNama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KeluarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeluarMenuMouseClicked
        System.exit(0);
    }//GEN-LAST:event_KeluarMenuMouseClicked

    private void jLabelNamaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabelNamaComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelNamaComponentAdded

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    jLabelSaldo.setText(""+oldSaldo);
    jLabelNama.setText(""+myNama);
    
    
    }//GEN-LAST:event_formWindowActivated

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
     setResizable(false);
    }//GEN-LAST:event_formComponentResized

    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        new MenuDeposit(myNorek).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DepositActionPerformed

    private void WithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawActionPerformed
     new MenuWithdraw(myNorek).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_WithdrawActionPerformed

    private void TransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferActionPerformed
    new MenuPin(myNorek).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TransferActionPerformed

    private void HistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryActionPerformed
      new MenuHistory(myNorek).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HistoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Register rg =new Register ();
        rg.setVisible(true);
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabelNama1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabelNama1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelNama1ComponentAdded

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deposit;
    private javax.swing.JButton History;
    private javax.swing.JLabel KeluarMenu;
    private javax.swing.JButton Transfer;
    private javax.swing.JButton Withdraw;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelNama1;
    private javax.swing.JLabel jLabelNorek;
    private javax.swing.JLabel jLabelSaldo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}