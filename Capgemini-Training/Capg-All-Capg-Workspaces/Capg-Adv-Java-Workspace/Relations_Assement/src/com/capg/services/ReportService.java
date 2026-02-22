package com.capg.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReportService {
	public EntityManagerFactory emf;
	public ReportService(EntityManagerFactory emf) {
		this.emf=emf;
	}
	public Long getEmployeePerformance(int employeeId) {

	    EntityManager em = emf.createEntityManager();

	    String jpql = "SELECT COUNT(l) FROM Lead l WHERE l.employee.empId = :id";

	    return em.createQuery(jpql, Long.class)
	             .setParameter("id", employeeId)
	             .getSingleResult();
	}
}
