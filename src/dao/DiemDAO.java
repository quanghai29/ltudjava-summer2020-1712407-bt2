/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Sinhvien;
import pojos.Diem;
import pojos.DiemId;
import util.NewHibernateUtil;

/**
 *
 * @author DELL
 */
public class DiemDAO {

    public static Sinhvien layThongTinDiemSV(String maSinhVien) {
        Sinhvien sv = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            sv = (Sinhvien) session.get(Sinhvien.class, maSinhVien);
        } catch (Exception ex) {
            //Log the exception
            System.out.println(ex);
        } finally {
            session.close();
        }
        return sv;
    }

    public static boolean themSinhVien(Sinhvien sv) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        if (SinhVienDAO.laythongtinsinhvien(sv.getMssv()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(sv);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return true;
    }

    public static void themNhieuSinhVien(List<Sinhvien> ds) {
        for (int i = 0; i < ds.size(); i++) {
            System.out.println(ds.get(i).getHoten());
            themSinhVien(ds.get(i));
        }
    }
}
