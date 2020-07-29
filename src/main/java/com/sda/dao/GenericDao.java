package com.sda.dao;

import com.sda.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;

public class GenericDao<T> {
    public void createEntity(T entity) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }finally {
            assert session != null;
            session.close();
        }
    }


    public void deleteEntity(T entity) {
        Transaction transaction = null;
        Session session = null;
        try { session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(entity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }finally {
            session.close();
        }

    }

    public void updateEntity(T entity) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(entity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
