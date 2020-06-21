/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import pojos.*;
import util.*;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class SinhVienDAO {

    public static List<Sinhvien> layDanhSachSinhVien() {
        List<Sinhvien> ds = null;
        Session session = NewHibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select sv from Sinhvien sv";
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
            System.out.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static List<Sinhvien> layDanhSachSinhVienTheoLop(String lop) {
        List<Sinhvien> ds = null;
        Session session = NewHibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select sv from Sinhvien sv where lop = sv.lop";
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
            System.out.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static Sinhvien laythongtinsinhvien(String maSinhVien) {
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
        for (Sinhvien sv : ds) {
            //System.out.println(ds.get(i).getHoten());
            boolean result = themSinhVien(sv);
            if (result == true) {
                Account acc = new Account(sv.getMssv(), sv.getMssv(), 2);
                accountDAO.themAccount(acc);
            }
        }
    }

    public static List<String> getLop() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        List<String> dsLop = null;
        Transaction transaction = null;
        try {
            String hql = "select distinct lop from Sinhvien sv";
            Query query = session.createQuery(hql);
            dsLop = query.list();
        } catch (HibernateException ex) {
            System.out.println(ex);
        } finally {
            session.close();
        }
        return dsLop;
    }
}
