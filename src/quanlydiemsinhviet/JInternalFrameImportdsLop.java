/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiemsinhviet;

import dao.SinhVienDAO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import util.myCSVFile;
import pojos.*;

/**
 *
 * @author DELL
 */
public class JInternalFrameImportdsLop extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameImportdsLop
     */
    private List<Sinhvien> dsSV;
    private List<String> dsLop;

    public JInternalFrameImportdsLop() {
        initComponents();
        setLocation(200, 30);
        this.jTabledsSV.setVisible(false);
        loadDSLop();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonOpenFIle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabledsSV = new javax.swing.JTable();
        jlabelLop = new javax.swing.JLabel();
        jButtonImportDsLop = new javax.swing.JButton();
        jComboBoxdsLop = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setTitle("Nhập Danh Sách Lớp");
        setPreferredSize(new java.awt.Dimension(900, 600));

        jButtonOpenFIle.setText("Open File");
        jButtonOpenFIle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenFIleActionPerformed(evt);
            }
        });

        jTabledsSV.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTabledsSV.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTabledsSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,null},
                {null, null, null, null,null}
            },
            new String [] {
                "STT", "MSSV", "Họ Tên", "Giới Tính","CMND"
            }
        ));
        jTabledsSV.setRowHeight(22);
        jTabledsSV.setRowMargin(2);
        jScrollPane1.setViewportView(jTabledsSV);

        jlabelLop.setText("Tên Lớp");

        jButtonImportDsLop.setText("Import");
        jButtonImportDsLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImportDsLopActionPerformed(evt);
            }
        });

        jComboBoxdsLop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxdsLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxdsLopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonImportDsLop)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(127, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlabelLop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOpenFIle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxdsLop, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonOpenFIle)
                    .addComponent(jComboBoxdsLop, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jlabelLop, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButtonImportDsLop)
                .addContainerGap(128, Short.MAX_VALUE))
        );

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
            //List<Sinhvien> ds = null;
            jComboBoxdsLop.setSelectedIndex(0);
            dsSV = myCSVFile.importDSLop(fileChooser);
            loadDataTable(dsSV);
        }
    }//GEN-LAST:event_jButtonOpenFIleActionPerformed

    private void jButtonImportDsLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImportDsLopActionPerformed
        // TODO add your handling code here:
        if (jComboBoxdsLop.getSelectedItem().toString() != "") {
            JOptionPane.showMessageDialog(null, "Danh sách đã tồn tại");
        } else {
            SinhVienDAO.themNhieuSinhVien(dsSV);
            if (!dsLop.contains(jlabelLop.getText())) {
                dsLop.add(jlabelLop.getText());
                jComboBoxdsLop.addItem(jlabelLop.getText());
            }

            JOptionPane.showMessageDialog(null, "Import Danh Sách Thành Công");
        }
    }//GEN-LAST:event_jButtonImportDsLopActionPerformed

    private void jComboBoxdsLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxdsLopActionPerformed
        // TODO add your handling code here:
        String lop = jComboBoxdsLop.getSelectedItem().toString();
        if (lop == "") {
            DefaultTableModel model = (DefaultTableModel) jTabledsSV.getModel();
            jlabelLop.setText("");
            model.setRowCount(0);
        } else {
            System.out.println(lop);
            List<Sinhvien> kq;
            kq = SinhVienDAO.layDanhSachSinhVienTheoLop(lop);
            loadDataTable(kq);
        }
    }//GEN-LAST:event_jComboBoxdsLopActionPerformed

    private void loadDataTable(List<Sinhvien> ds) {
        DefaultTableModel dsSV = new DefaultTableModel();

        dsSV.addColumn("STT");
        dsSV.addColumn("MSSV");
        dsSV.addColumn("Họ Tên");
        dsSV.addColumn("Giới Tính");
        dsSV.addColumn("CMND");
        int count = 1;
        for (Sinhvien sv : ds) {
            dsSV.addRow(new Object[]{count, sv.getMssv(), sv.getHoten(), sv.getGioitinh(), sv.getCmnd()});
            count++;
        }

        this.jlabelLop.setText(ds.get(0).getLop());
        this.jTabledsSV.setModel(dsSV);
        this.jTabledsSV.repaint();
        this.jTabledsSV.revalidate();
        this.jTabledsSV.setVisible(true);
    }

    private void loadDSLop() {
        dsLop = SinhVienDAO.getLop();
        dsLop.add(0, "");
        jComboBoxdsLop.setModel(new javax.swing.DefaultComboBoxModel<>(dsLop.toArray(new String[0])));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonImportDsLop;
    private javax.swing.JButton jButtonOpenFIle;
    private javax.swing.JComboBox<String> jComboBoxdsLop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabledsSV;
    private javax.swing.JLabel jlabelLop;
    // End of variables declaration//GEN-END:variables
}
