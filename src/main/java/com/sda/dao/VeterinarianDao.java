package com.sda.dao;

import com.sda.model.Pet;
import com.sda.model.Veterinarian;
import com.sda.utils.HibernateUtils;
import org.hibernate.Session;

public class VeterinarianDao extends GenericDao<Veterinarian>{
    public Veterinarian findVeterinarianById(Long id) {
        try {
            try (Session session = HibernateUtils.getSessionFactory().openSession()) {
                return session.find(Veterinarian.class, id);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
