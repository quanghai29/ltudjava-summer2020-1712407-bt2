/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Thoikhoabieu;
import pojos.ThoikhoabieuId;
import util.NewHibernateUtil;

/**
 *
 * @author DELL
 */
public class ThoikhoabieuDAO {

    public static void themListTKB(List<Thoikhoabieu> dsTKB) {
        for (Thoikhoabieu t : dsTKB) {
            themTKB(t);
        }
    }

    public static boolean themTKB(Thoikhoabieu t) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        if (ThoikhoabieuDAO.lichMonHoc(t.getId()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(t);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return true;
    }

    public static Thoikhoabieu lichMonHoc(ThoikhoabieuId tID) {
        Thoikhoabieu kq = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            kq = (Thoikhoabieu) session.get(Thoikhoabieu.class, tID);
        } catch (Exception ex) {
            //Log the exception
            System.out.println(ex);
        } finally {
            session.close();
        }
        return kq;
    }

    public static List<String> dsLopTKB() {
        List<String> dsLop = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            String hql = "select distinct t.id.lop from Thoikhoabieu t";
            Query query = session.createQuery(hql);
            dsLop = query.list();

        } catch (HibernateException ex) {
            System.out.println(ex);
        } finally {
            session.close();
        }
        return dsLop;
    }

    public static List<Thoikhoabieu> TKBofLop(String lop) {
        List<Thoikhoabieu> kq = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            String hql = "select t from Thoikhoabieu as t where t.id.lop = :idLop";
            Query query = session.createQuery(hql);
            query.setParameter("idLop", lop);
            kq = query.list();

        } catch (HibernateException ex) {
            System.out.println(ex);
        } finally {
            session.close();
        }
        return kq;
    }
}
