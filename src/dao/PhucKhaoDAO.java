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
import pojos.Account;
import pojos.Sinhvien;
import util.NewHibernateUtil;
import pojos.Phuckhao;
import pojos.PhuckhaoId;

/**
 *
 * @author DELL
 */
public class PhucKhaoDAO {

    public static List<Phuckhao> layDSPhucKhao() {
        List<Phuckhao> ds = null;
        Session session = NewHibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select pk from Phuckhao as pk";
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
            System.out.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static Phuckhao laythongtindon(PhuckhaoId id) {
        Phuckhao pk = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {

            pk = (Phuckhao) session.get(Phuckhao.class, id);
        } catch (Exception ex) {
            //Log the exception
            System.out.println(ex);
        } finally {
            session.close();
        }
        return pk;
    }

    public static boolean themDonPhucKhao(Phuckhao pk) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        if (laythongtindon(pk.getId()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(pk);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return true;
    }

    public static boolean capNhatTinhTrang(PhuckhaoId id, int TinhTrang) {
        Session session = NewHibernateUtil.getSessionFactory()
                .openSession();
        if (laythongtindon(id) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();

            String hql = "update Phuckhao set tinhtrang = :TinhTrang where id = :id";
            Query query = session.createQuery(hql);
            query.setParameter("TinhTrang", TinhTrang);
            query.setParameter("id", id);
            int result = query.executeUpdate();
            System.out.println(result);

            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.out.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
}
