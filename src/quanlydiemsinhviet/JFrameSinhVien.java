/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiemsinhviet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class JFrameSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form JFrameSinhVien
     */
    public JFrameSinhVien() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        String user = JFrameMain.username;
        setTitle("Xin chào, " + user);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuXemDiem = new javax.swing.JMenu();
        jMenuDoiMatkhau = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(104, 30));

        jMenuXemDiem.setText("Xem điểm");
        jMenuXemDiem.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jMenuXemDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuXemDiemMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuXemDiem);

        jMenuDoiMatkhau.setText("Đổi mật khẩu");
        jMenuDoiMatkhau.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jMenuDoiMatkhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDoiMatkhauMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuDoiMatkhau);

        jMenu1.setText("Đăng Xuất");
        jMenu1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuXemDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuXemDiemMouseClicked
        // TODO add your handling code here:
        JInternalFrameSVXemDiem SVXemDiem = new JInternalFrameSVXemDiem();
        SVXemDiem.setVisible(true);
        this.jDesktopPane1.add(SVXemDiem);
    }//GEN-LAST:event_jMenuXemDiemMouseClicked

    public static JInternalFrameDoiMatKhau MK;
    private void jMenuDoiMatkhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDoiMatkhauMouseClicked
        // TODO add your handling code here:
        MK = new JInternalFrameDoiMatKhau();
        MK.setVisible(true);
        this.jDesktopPane1.add(MK);
    }//GEN-LAST:event_jMenuDoiMatkhauMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất ?");
        if (result == 0) {//yes
            JFrameMain.frameSV.setVisible(false);
            JFrameMain.frameSV.dispose();
            JFrameMain frameMain = new JFrameMain();
            frameMain.setVisible(true);
        }
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(JFrameSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDoiMatkhau;
    private javax.swing.JMenu jMenuXemDiem;
    // End of variables declaration//GEN-END:variables
}
