package com.sda.dao;

import com.sda.model.Consult;
import com.sda.model.Pet;
import com.sda.utils.HibernateUtils;
import org.hibernate.Session;

public class PetDao extends GenericDao<Pet> {
    public Pet findPetById(Long id) {
        try {
            Session session = HibernateUtils.getSessionFactory().openSession();
            return session.find(Pet.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
