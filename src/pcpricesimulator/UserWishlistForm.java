package pcpricesimulator;


import java.awt.Component;
import java.awt.Image;
import static java.lang.String.format;
import javax.swing.ImageIcon;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gazel
 */
public class UserWishlistForm extends javax.swing.JFrame {
    
    

    
    /**
     * Creates new form PcPriceSimulatorForm
     */
    public UserWishlistForm(String username) {
        // ALL THIS CODE MADE BY GAZEL AVERROUS

        initComponents();
        scaleimage();
        
        
        // labelUserName.setAlignmentX(Component.CENTER_ALIGNMENT);
        // labelUserName.setAlignmentY(Component.CENTER_ALIGNMENT);
        labelUserName.setText(username);
        labelUserName.setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    public UserWishlistForm(String userCpu, String userCpuCooler,String userMotherboard, String userMemory, String userStorage, String userGraphicsCard, String userCase, String userPowerSupply, String userMonitor, Double total){
         // ALL THIS CODE MADE BY GAZEL AVERROUS

        initComponents();
        scaleimage();
        
       this.userCpu.setText(userCpu);
       this.userCpuCooler.setText(userCpuCooler);
       this.userMotherboard.setText(userMotherboard);
       this.userMemory.setText(userMemory);
       this.userStorage.setText(userStorage);
       this.userGraphicsCard.setText(userGraphicsCard);
       this.userCase.setText(userCase);
       this.userPowerSupply.setText(userPowerSupply);
       this.userMonitor.setText(userMonitor);
        
        // labelUserName.setAlignmentX(Component.CENTER_ALIGNMENT);
        // labelUserName.setAlignmentY(Component.CENTER_ALIGNMENT);
        labelUserName.setText(LoginForm.currentUser.getName());
        labelUserName.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrice.setText(String.format("Rp%,.2f",(total)));      
        
        
    }
    
    public void scaleimage(){
        ImageIcon icon = new ImageIcon("C:\\Users\\gazel\\OneDrive\\Dokumen\\NetBeansProjects\\PcPriceSimulator\\src\\pcpricesimulator\\defaultpp.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(pplabel.getWidth(), pplabel.getHeight(), Image.SCALE_SMOOTH);  
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        pplabel.setIcon(scaledIcon);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        pplabel = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        userCpuCooler = new javax.swing.JLabel();
        userCpu = new javax.swing.JLabel();
        userMotherboard = new javax.swing.JLabel();
        userMemory = new javax.swing.JLabel();
        userStorage = new javax.swing.JLabel();
        userGraphicsCard = new javax.swing.JLabel();
        userCase = new javax.swing.JLabel();
        userMonitor = new javax.swing.JLabel();
        userPowerSupply = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPU :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPU Cooler :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Motherboard :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Memory :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Storage :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Graphics Card :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Case :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Power Supply :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 102, 102));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Your Wish List");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 350, 70));

        jPanel2.setBackground(new java.awt.Color(205, 138, 250));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel2.setForeground(new java.awt.Color(255, 153, 153));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("TOTAL PRICE");

        labelPrice.setBackground(new java.awt.Color(51, 51, 51));
        labelPrice.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelPrice.setForeground(new java.awt.Color(51, 51, 51));
        labelPrice.setText("Rp0,00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPrice)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 160, 100));

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Monitor :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 80, 30));
        jPanel1.add(pplabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 40, 40));

        labelUserName.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        labelUserName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(labelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 380, 70, 20));

        userCpuCooler.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        userCpuCooler.setForeground(new java.awt.Color(255, 255, 255));
        userCpuCooler.setText("None");
        jPanel1.add(userCpuCooler, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 210, 20));

        userCpu.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        userCpu.setForeground(new java.awt.Color(255, 255, 255));
        userCpu.setText("None");
        jPanel1.add(userCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 210, 20));

        userMotherboard.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        userMotherboard.setForeground(new java.awt.Color(255, 255, 255));
        userMotherboard.setText("None");
        jPanel1.add(userMotherboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 210, 20));

        userMemory.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        userMemory.setForeground(new java.awt.Color(255, 255, 255));
        userMemory.setText("None");
        jPanel1.add(userMemory, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 210, 20));

        userStorage.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        userStorage.setForeground(new java.awt.Color(255, 255, 255));
        userStorage.setText("None");
        jPanel1.add(userStorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 210, -1));

        userGraphicsCard.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        userGraphicsCard.setForeground(new java.awt.Color(255, 255, 255));
        userGraphicsCard.setText("None");
        jPanel1.add(userGraphicsCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 210, -1));

        userCase.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        userCase.setForeground(new java.awt.Color(255, 255, 255));
        userCase.setText("None");
        jPanel1.add(userCase, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 210, -1));

        userMonitor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        userMonitor.setForeground(new java.awt.Color(255, 255, 255));
        userMonitor.setText("None");
        jPanel1.add(userMonitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 210, -1));

        userPowerSupply.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        userPowerSupply.setForeground(new java.awt.Color(255, 255, 255));
        userPowerSupply.setText("None");
        jPanel1.add(userPowerSupply, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 210, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 80, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pcpricesimulator/pcBackgroundBlur_1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -480, 800, 1020));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        User currentUser = LoginForm.currentUser;
        int x;
        x=JOptionPane.showConfirmDialog(null, "Are you Sure?", "Confirm", JOptionPane.YES_NO_OPTION);
        
        if(x==JOptionPane.YES_NO_OPTION){
            LoginForm.loginForm.setVisible(true);
            currentUser.getUserWishlistForm().setVisible(false);
            LoginForm.currentUser = null;
        } else {
            return;
        }
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        User currentUser = LoginForm.currentUser;
        
        currentUser.getUserWishlistForm().setVisible(false);
        LoginForm.mainForm.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JLabel pplabel;
    private javax.swing.JLabel userCase;
    private javax.swing.JLabel userCpu;
    private javax.swing.JLabel userCpuCooler;
    private javax.swing.JLabel userGraphicsCard;
    private javax.swing.JLabel userMemory;
    private javax.swing.JLabel userMonitor;
    private javax.swing.JLabel userMotherboard;
    private javax.swing.JLabel userPowerSupply;
    private javax.swing.JLabel userStorage;
    // End of variables declaration//GEN-END:variables
}
