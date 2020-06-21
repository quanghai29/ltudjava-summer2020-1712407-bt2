/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DiemDAO.layThongTinDiemSV;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Diem;
import pojos.DiemId;
import pojos.Account;
import util.NewHibernateUtil;

/**
 *
 * @author DELL
 */
public class accountDAO {

    public static Account layThongTinAccount(String username) {
        Account acc = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            acc = (Account) session.get(Account.class, username);
        } catch (Exception ex) {
            //Log the exception
            System.out.println(ex);
        } finally {
            session.close();
        }
        return acc;
    }

    public static int ktTaiKhoan(String username, String password) {
        int loaiTK = -1;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select acc from Account as acc where username = :username and password = :password";
            Query query = session.createQuery(hql);
            query.setParameter("username", username);
            query.setParameter("password", password);

            List<Account> result = query.list();
            if (result.size() == 0) {
                return -1;
            }
            Account acc = (Account) result.get(0);
            loaiTK = acc.getLoaiTk();
        } catch (HibernateException ex) {
            System.out.println(ex);
        } finally {
            session.close();
        }
        return loaiTK;
    }

    public static boolean themAccount(Account newAccount) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        if (layThongTinAccount(newAccount.getUsername()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(newAccount);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return true;
    }

    public static void themNhieuAccount(List<Account> ds) {
        for (int i = 0; i < ds.size(); i++) {
            themAccount(ds.get(i));
        }
    }

    public static boolean doiPassWord(String username, String newpassword) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        if (layThongTinAccount(username) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String hql = "update Account set password = :newpass where username = :user";
            Query query = session.createQuery(hql);
            query.setParameter("newpass", newpassword);
            query.setParameter("user", username);
            int result = query.executeUpdate();
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
