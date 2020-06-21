/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiemsinhviet;

import dao.DiemDAO;
import pojos.Diem;
import pojos.DiemId;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import util.myCSVFile;

/**
 *
 * @author DELL
 */
public class JInternalFrameBangDiem extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameBangDiem
     */
    public JInternalFrameBangDiem() {
        initComponents();
        setLocation(200, 30);
        loadDsLopMon();
    }

    private List<Diem> dsDiemSV;
    private List<String> dsLop;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBangDiem = new javax.swing.JTable();
        jComboBoxLopMon = new javax.swing.JComboBox<>();
        jLabelLop = new javax.swing.JLabel();
        jButtonOpenFile = new javax.swing.JButton();
        jButtonImport = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaKQ = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButtonEdit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEdit = new javax.swing.JTable();

        setClosable(true);

        jTableBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null ,null},
                {null, null, null, null, null, null ,null}
            },
            new String [] {
                "STT", "MSSV", "Họ tên", "Điểm GK","Điểm CK","Điểm khác","Điểm tổng"
            }
        ));
        jTableBangDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBangDiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBangDiem);

        jComboBoxLopMon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {""}));
        jComboBoxLopMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLopMonActionPerformed(evt);
            }
        });

        jLabelLop.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelLop.setText("Lớp ");

        jButtonOpenFile.setText("Open File");
        jButtonOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenFileActionPerformed(evt);
            }
        });

        jButtonImport.setText("Import");
        jButtonImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImportActionPerformed(evt);
            }
        });

        jTextAreaKQ.setEditable(false);
        jTextAreaKQ.setBackground(new java.awt.Color(204, 204, 204));
        jTextAreaKQ.setColumns(20);
        jTextAreaKQ.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextAreaKQ.setRows(5);
        jScrollPane3.setViewportView(jTextAreaKQ);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Danh Sách Lớp");

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jTableEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null, null, null, null},
            },
            new String [] {
                "MSSV","Điểm GK", "Điểm CK","Điểm Khác","Điểm Tổng"
            }
        ));
        jScrollPane2.setViewportView(jTableEdit);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonImport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelLop, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxLopMon, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))
                        .addGap(71, 71, 71)
                        .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOpenFile)
                    .addComponent(jButtonImport)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLopMon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEdit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenFileActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "CSV UTF-8(Comma delimited)(*.csv)", "csv");
        chooser.setFileFilter(filter);

        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println(chooser.getSelectedFile());
            dsDiemSV = null;
            jComboBoxLopMon.setSelectedIndex(0);
            jTextAreaKQ.setText("");
            DefaultTableModel model = (DefaultTableModel) jTableEdit.getModel();
            model.setRowCount(0);
            String fileChooser = chooser.getSelectedFile().toString();

            DefaultTableModel defaultModel = new DefaultTableModel();
            //Load data to table LOP-MONHOC
            defaultModel.addColumn("STT");
            defaultModel.addColumn("MSSV");
            defaultModel.addColumn("Họ Tên");
            defaultModel.addColumn("Điểm GK");
            defaultModel.addColumn("Điểm CK");
            defaultModel.addColumn("Điểm Khác");
            defaultModel.addColumn("Điểm Tổng");

            dsDiemSV = util.myCSVFile.importBangDiem(fileChooser, defaultModel);
            if (dsDiemSV != null) {
                this.jLabelLop.setText(dsDiemSV.get(0).getId().getMalop());
            }
            this.jTableBangDiem.setModel(defaultModel);
            this.jTableBangDiem.repaint();
            this.jTableBangDiem.revalidate();
            this.jTableBangDiem.setVisible(true);

        }
    }//GEN-LAST:event_jButtonOpenFileActionPerformed

    private void jButtonImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImportActionPerformed
        // TODO add your handling code here:
        String lop = jComboBoxLopMon.getSelectedItem().toString();
        if (lop == "") {
            if (dsDiemSV != null) {
                DiemDAO.themDiemNSV(dsDiemSV);
                JOptionPane.showMessageDialog(null, "Thêm điểm thành công");
                if (!dsLop.contains(lop)) {
                    dsLop.add(lop);
                    jComboBoxLopMon.addItem(jLabelLop.getText());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Không thể import danh sách");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Danh sách đã tồn tại");
        }

    }//GEN-LAST:event_jButtonImportActionPerformed

    private void jComboBoxLopMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLopMonActionPerformed

        String lop = jComboBoxLopMon.getSelectedItem().toString();
        DefaultTableModel modelEdit = (DefaultTableModel) jTableEdit.getModel();
        modelEdit.setRowCount(0);
        if (lop == "") {
            DefaultTableModel model = (DefaultTableModel) jTableBangDiem.getModel();
            model.setRowCount(0);
            jTextAreaKQ.setText("");
            jLabelLop.setText("");
            return;
        }
        // TODO add your handling code here:
        DefaultTableModel defaultModel = new DefaultTableModel();
        //Load data to table LOP-MONHOC
        defaultModel.addColumn("STT");
        defaultModel.addColumn("MSSV");
        defaultModel.addColumn("Điểm GK");
        defaultModel.addColumn("Điểm CK");
        defaultModel.addColumn("Điểm Khác");
        defaultModel.addColumn("Điểm Tổng");
        defaultModel.addColumn("Đậu/Rớt");

        dsDiemSV = DiemDAO.layDiemCuaLop(lop);

        int height = 600;
        int counter = 1;
        for (Diem d : dsDiemSV) {
            defaultModel.addRow(new Object[]{counter, d.getId().getMssv(),
                d.getDiemGk(), d.getDiemCk(), d.getDiemKhac(), d.getDiemTong(), d.getDau()});
            counter++;
        }
        if (dsDiemSV != null) {
            this.jLabelLop.setText(dsDiemSV.get(0).getId().getMalop());
        }
        this.jTableBangDiem.setModel(defaultModel);
        this.jTableBangDiem.repaint();
        this.jTableBangDiem.revalidate();
        this.jTableBangDiem.setVisible(true);

        counter--;
        int SLdau = DiemDAO.SLDau(lop);
        float ptDau = (SLdau / counter) * 100;
        jTextAreaKQ.setText("Số Sinh Viên: " + counter + "\n"
                + "Số lượng đạt: " + SLdau + "\n"
                + "Tỷ lệ đạt: " + ptDau + " %");

    }//GEN-LAST:event_jComboBoxLopMonActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        String mssv = jTableEdit.getValueAt(0, 0).toString();
        if (mssv == "") {
            JOptionPane.showMessageDialog(null, "Bạn phải chọn 1 sinh viên");
        } else {
            String lop = jLabelLop.getText();
            DiemId id = new DiemId(jTableEdit.getValueAt(0, 0).toString(), lop);
            Float diemGK = Float.parseFloat(jTableEdit.getValueAt(0, 1).toString());
            Float diemCK = Float.parseFloat(jTableEdit.getValueAt(0, 2).toString());
            Float diemKhac = Float.parseFloat(jTableEdit.getValueAt(0, 3).toString());
            float diemTong = 0;
            String dau = null;

            Diem diemsv = new Diem(id, diemGK, diemCK, diemKhac, diemTong, dau);
            diemTong = DiemDAO.tinhDiemTong(diemsv);
            jTableEdit.setValueAt(diemTong, 0, 4);

            if (diemTong >= 5) {
                dau = "Đạt";
            }

            //Sửa vào csdl
            if (DiemDAO.capNhatDiemSV(diemsv)) {
                int row = jTableBangDiem.getSelectedRow();
                jTableBangDiem.setValueAt(mssv, row, 1);
                jTableBangDiem.setValueAt(diemGK, row, 2);
                jTableBangDiem.setValueAt(diemCK, row, 3);
                jTableBangDiem.setValueAt(diemKhac, row, 4);
                jTableBangDiem.setValueAt(diemTong, row, 5);
                jTableBangDiem.setValueAt(dau, row, 6);

                JOptionPane.showMessageDialog(null, "Chỉnh sửa thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
            }

        }

    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jTableBangDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBangDiemMouseClicked
        // TODO add your handling code here:
        String lop = jComboBoxLopMon.getSelectedItem().toString();
        if (lop == "") {
            return;
        }
        int row = jTableBangDiem.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableEdit.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{jTableBangDiem.getValueAt(row, 1), jTableBangDiem.getValueAt(row, 2),
            jTableBangDiem.getValueAt(row, 3), jTableBangDiem.getValueAt(row, 4), jTableBangDiem.getValueAt(row, 5)});
    }//GEN-LAST:event_jTableBangDiemMouseClicked

    private void loadDsLopMon() {
        dsLop = DiemDAO.dsLop();
        if (dsLop != null) {
            dsLop.add(0, "");
            jComboBoxLopMon.setModel(new javax.swing.DefaultComboBoxModel<>(dsLop.toArray(new String[0])));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonImport;
    private javax.swing.JButton jButtonOpenFile;
    private javax.swing.JComboBox<String> jComboBoxLopMon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableBangDiem;
    private javax.swing.JTable jTableEdit;
    private javax.swing.JTextArea jTextAreaKQ;
    // End of variables declaration//GEN-END:variables
}
