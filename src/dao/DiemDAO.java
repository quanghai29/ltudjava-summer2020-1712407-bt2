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
import pojos.Sinhvien;
import pojos.Diem;
import pojos.DiemId;
import util.NewHibernateUtil;

/**
 *
 * @author DELL
 */
public class DiemDAO {

    public static List<Diem> layDiemCuaLop(String lop) {
        List<Diem> dsDiem = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        //Transaction transaction = null;
        try {
            String hql = "select d from Diem as d where d.id.malop = :idLop";
            Query query = session.createQuery(hql);
            query.setParameter("idLop", lop);
            dsDiem = query.list();
        } catch (HibernateException ex) {
            System.out.println(ex);
        } finally {
            session.close();
        }
        return dsDiem;
    }

    public static Diem layThongTinDiemSV(DiemId id) {
        Diem d = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            d = (Diem) session.get(Diem.class, id);
        } catch (Exception ex) {
            //Log the exception
            System.out.println(ex);
        } finally {
            session.close();
        }
        return d;
    }

    public static boolean themDiemSV(Diem newDiem) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        if (layThongTinDiemSV(newDiem.getId()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(newDiem);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return true;
    }

    public static void themDiemNSV(List<Diem> ds) {
        for (int i = 0; i < ds.size(); i++) {
            themDiemSV(ds.get(i));
        }
    }

    public static List<String> dsLop() {
        List<String> kq = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        //Transaction transaction = null;
        try {
            String hql = "select distinct d.id.malop from Diem as d";
            Query query = session.createQuery(hql);
            kq = query.list();
        } catch (HibernateException ex) {
            System.out.println(ex);
        } finally {
            session.close();
        }
        return kq;
    }

}
