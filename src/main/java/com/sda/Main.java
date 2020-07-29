package com.sda;

import com.sda.dao.VeterinarianDao;
import com.sda.model.Veterinarian;
import com.sda.utils.HibernateUtils;

import static com.sda.utils.HibernateUtils.getSessionFactory;

public class Main {
    public static void main(String[] args) {
        getSessionFactory().openSession();
        HibernateUtils.shutdown();

        VeterinarianDao veterinarianDao = new VeterinarianDao();
        Veterinarian veterinarian = new Veterinarian("Ana","Popescu","Ion Creanga nr.106","Orthopedics");
        veterinarianDao.createEntity(veterinarian);
        veterinarian = veterinarianDao.findVeterinarianById(5L);
        System.out.println(veterinarian);
    }
}
