/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiemsinhviet;

import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import pojos.LopMonhoc;
import dao.LopMonHocDAO;
import javax.swing.JOptionPane;
import util.myCSVFile;

/**
 *
 * @author DELL
 */
public class JInternalFrameImportLopMonHoc extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameImportLopMonHoc
     */
    private List<LopMonhoc> dsLOPmonHoc;

    public JInternalFrameImportLopMonHoc() {
        initComponents();
        setLocation(200, 30);
        loadDSLopMon();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLopMonHoc = new javax.swing.JTable();
        jButtonOpenFIle = new javax.swing.JButton();
        jLabelLop = new javax.swing.JLabel();
        jButtonImport = new javax.swing.JButton();
        jComboBoxdsLopMon = new javax.swing.JComboBox<>();

        setClosable(true);

        jTableLopMonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "MSSV", "Họ Tên", "Giới Tính","CMND"
            }
        ));
        jScrollPane1.setViewportView(jTableLopMonHoc);

        jButtonOpenFIle.setText("Open File");
        jButtonOpenFIle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenFIleActionPerformed(evt);
            }
        });

        jLabelLop.setText("Lớp");

        jButtonImport.setText("Import");
        jButtonImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImportActionPerformed(evt);
            }
        });

        jComboBoxdsLopMon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxdsLopMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxdsLopMonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonOpenFIle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxdsLopMon, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonImport, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLop, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOpenFIle)
                    .addComponent(jComboBoxdsLopMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelLop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButtonImport)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOpenFIleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenFIleActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "CSV UTF-8(Comma delimited)(*.csv)", "csv");
        chooser.setFileFilter(filter);

        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println(chooser.getSelectedFile());
            String fileChooser = chooser.getSelectedFile().toString();
            dsLOPmonHoc = null;
            DefaultTableModel LMH = new DefaultTableModel();

            //Load data to table LOP-MONHOC
            LMH.addColumn("STT");
            LMH.addColumn("MSSV");
            LMH.addColumn("Họ Tên");
            LMH.addColumn("Giới Tính");
            LMH.addColumn("CMND");

            dsLOPmonHoc = myCSVFile.importLopMonHoc(fileChooser, LMH);
            this.jLabelLop.setText(dsLOPmonHoc.get(0).getId().getMalop());
            this.jTableLopMonHoc.setModel(LMH);
            this.jTableLopMonHoc.repaint();
            this.jTableLopMonHoc.revalidate();
            this.jTableLopMonHoc.setVisible(true);

            //INSERT TO data
        }
    }//GEN-LAST:event_jButtonOpenFIleActionPerformed

    private void jButtonImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImportActionPerformed
        // TODO add your handling code here:
        LopMonHocDAO.themNhieuSVLop(dsLOPmonHoc);
        JOptionPane.showMessageDialog(null, "Import Thành Công");
    }//GEN-LAST:event_jButtonImportActionPerformed

    private void jComboBoxdsLopMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxdsLopMonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBoxdsLopMonActionPerformed

    private void loadDSLopMon() {
        List<String> dsLopMon = LopMonHocDAO.layDSLop();
        dsLopMon.add(0, "");
        jComboBoxdsLopMon.setModel(new javax.swing.DefaultComboBoxModel<>(dsLopMon.toArray(new String[0])));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonImport;
    private javax.swing.JButton jButtonOpenFIle;
    private javax.swing.JComboBox<String> jComboBoxdsLopMon;
    private javax.swing.JLabel jLabelLop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLopMonHoc;
    // End of variables declaration//GEN-END:variables
}
