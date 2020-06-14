/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.LopMonhoc;
import pojos.LopMonhocId;
import pojos.Sinhvien;
import util.NewHibernateUtil;

/**
 *
 * @author DELL
 */
public class LopMonHocDAO {

    public static void themNhieuSVLop(List<LopMonhoc> dsSV) {
        for (LopMonhoc newSV : dsSV) {
            themMotSVLop(newSV);
        }
    }

    public static boolean themMotSVLop(LopMonhoc newlop) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        if (LopMonHocDAO.layMotSVThuocLop(newlop.getId()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(newlop);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return true;
    }

    public static LopMonhoc layMotSVThuocLop(LopMonhocId id) {
        LopMonhoc kq = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {

            kq = (LopMonhoc) session.get(LopMonhoc.class, id);
        } catch (Exception ex) {
            //Log the exception
            System.out.println(ex);
        } finally {
            session.close();
        }
        return kq;
    }

    public static List<String> layDSLop() {
        List<String> kq = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            String hql = "select distinct l.id.malop from LopMonhoc l";
            Query query = session.createQuery(hql);
            kq = query.list();
        } catch (HibernateException ex) {
            System.out.println(ex);
        } finally {
            session.close();
        }
        return kq;
    }

    public static List<Sinhvien> layDStheoLop(String malop) {
        List<Sinhvien> kq = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            String hql = "select s from LopMonhoc l ,Sinhvien as s where l.id.mssv = s.mssv AND l.id.malop = :idLop";
            Query query = session.createQuery(hql);
            query.setParameter("idLop", malop);
            kq = query.list();

        } catch (HibernateException ex) {
            System.out.println(ex);
        } finally {
            session.close();
        }
        return kq;
    }
}
