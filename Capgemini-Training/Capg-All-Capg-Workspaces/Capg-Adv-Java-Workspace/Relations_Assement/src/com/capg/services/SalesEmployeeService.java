package com.capg.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.capg.beans.Address;
import com.capg.beans.SalesEmployee;

public class SalesEmployeeService {

    private EntityManagerFactory emf;

    public SalesEmployeeService(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void addEmployee(String department, int addrId) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            Address address = em.find(Address.class, addrId);

            SalesEmployee emp = new SalesEmployee();
            emp.setDepartment(department);
            emp.setAddress(address);

            em.persist(emp);

            tx.commit();
            System.out.println("Employee saved successfully");
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();   // IMPORTANT

        } finally {
            em.close();
        }
    }
}