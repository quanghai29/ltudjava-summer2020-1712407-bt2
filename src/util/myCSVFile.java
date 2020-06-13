/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import pojos.*;
import quanlydiemsinhviet.JInternalFrameImportdsLop;

/**
 *
 * @author DELL
 */
public class myCSVFile {

    public static List<Sinhvien> importDSLop(String file) {
        List<Sinhvien> dsSV = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            dsSV = new ArrayList<Sinhvien>();
            String str;
            String[] s;
            int counter = 0;
            String lop = "";
            while (true) {
                str = br.readLine();
                if (str == null) {
                    break;
                }
                s = str.split(",");

                //first line
                if (counter == 0) {
                    lop = s[0];
                } else if (counter >= 2) {
                    Sinhvien sv = new Sinhvien(s[1], s[2], s[3], s[4], lop);
                    dsSV.add(sv);
                }

                counter++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JInternalFrameImportdsLop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JInternalFrameImportdsLop.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsSV;
    }

    public static List<Thoikhoabieu> importTKB(String file) {
        List<Thoikhoabieu> tkb = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            tkb = new ArrayList<Thoikhoabieu>();
            String str;
            String[] s;
            int counter = 0;
            String lop = "";
            while (true) {
                str = br.readLine();
                if (str == null) {
                    break;
                }
                s = str.split(",");

                //first line
                if (counter == 0) {
                    lop = s[0];
                } else if (counter >= 2) {
                    ThoikhoabieuId id = new ThoikhoabieuId(s[1], lop);

                    Thoikhoabieu TKB = new Thoikhoabieu(id, s[2], s[3]);
                    tkb.add(TKB);
                }

                counter++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JInternalFrameImportdsLop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JInternalFrameImportdsLop.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tkb;
    }

    public static List<LopMonhoc> importLopMonHoc(String file, DefaultTableModel defaultTBModel) {
        List<LopMonhoc> lMhoc = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            lMhoc = new ArrayList<LopMonhoc>();
            String str;
            String[] s;
            int counter = 0;
            String lop = "";
            while (true) {
                str = br.readLine();
                if (str == null) {
                    break;
                }
                s = str.split(",");

                //first line
                if (counter == 0) {
                    lop = s[0];
                } else if (counter >= 2) {
                    LopMonhoc l = new LopMonhoc(new LopMonhocId(lop, s[1]));
                    lMhoc.add(l);
                    defaultTBModel.addRow(new Object[]{counter - 1, s[1], s[2], s[3], s[4]});
                }

                counter++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JInternalFrameImportdsLop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JInternalFrameImportdsLop.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lMhoc;
    }
}
