package com.sda.dao;

import com.sda.model.Consult;
import com.sda.utils.HibernateUtils;
import org.hibernate.Session;

public class ConsultDao extends GenericDao<Consult> {
    public Consult findConsultById(Long id) {
        try {
            Session session = HibernateUtils.getSessionFactory().openSession();
            return session.find(Consult.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
