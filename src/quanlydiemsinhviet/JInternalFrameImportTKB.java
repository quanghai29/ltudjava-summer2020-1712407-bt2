/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiemsinhviet;

import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import util.*;
import pojos.*;
import dao.ThoikhoabieuDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class JInternalFrameImportTKB extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameImportTKB
     */
    private List<Thoikhoabieu> tkb;

    public JInternalFrameImportTKB() {
        initComponents();
        setLocation(200, 30);
        //jTable1.setVisible(false);
//        ThoikhoabieuId tID = new ThoikhoabieuId("100", "17HCB");
//        Thoikhoabieu kq;
//        kq = ThoikhoabieuDAO.lichMonHoc(tID);
//        if (kq != null) {
//            System.out.println("tim thay");
//        } else {
//            System.out.println("not found");
//        }
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
        jButtonImportTKB = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableTKB = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabelLop = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Thời khóa biểu");

        jButtonImportTKB.setText("Open File");
        jButtonImportTKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImportTKBActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        jTableTKB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Môn", "Tên Môn", "Phòng"
            }
        ));
        jTableTKB.setRowHeight(22);
        jTableTKB.setRowMargin(5);
        jScrollPane4.setViewportView(jTableTKB);

        jButton1.setText("Import");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelLop.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelLop.setText("Lớp");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonImportTKB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButtonImportTKB)
                .addGap(18, 18, 18)
                .addComponent(jLabelLop, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonImportTKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImportTKBActionPerformed
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
            tkb = myCSVFile.importTKB(fileChooser);
            loadDataTable(tkb);
        }
    }//GEN-LAST:event_jButtonImportTKBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ThoikhoabieuDAO.themListTKB(tkb);
        JOptionPane.showMessageDialog(null, "Nhập Thời Khóa biểu thành công");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loadDataTable(List<Thoikhoabieu> t) {
        DefaultTableModel TKB = new DefaultTableModel();

        TKB.addColumn("STT");
        TKB.addColumn("Mã môn");
        TKB.addColumn("Tên Môn");
        TKB.addColumn("Phòng Học");

        int count = 1;
        for (Thoikhoabieu tbieu : t) {
            TKB.addRow(new Object[]{count, tbieu.getId().getMamon(), tbieu.getTenmon(), tbieu.getPhonghoc()});
            count++;
        }

        this.jLabelLop.setText(t.get(0).getId().getLop());
        this.jTableTKB.setModel(TKB);
        this.jTableTKB.repaint();
        this.jTableTKB.revalidate();
        this.jTableTKB.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonImportTKB;
    private javax.swing.JLabel jLabelLop;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableTKB;
    // End of variables declaration//GEN-END:variables
}
