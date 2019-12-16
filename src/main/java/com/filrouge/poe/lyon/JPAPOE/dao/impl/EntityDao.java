package com.filrouge.poe.lyon.JPAPOE.dao.impl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;



public class EntityDao<T> {
	private Dao dao = null;

	public EntityDao(Dao dao) {
		super();
		this.dao = dao;
	}

	public T add(T p) {

		EntityManager em = null;
		try {
			em = dao.newEntityManager();
			em.persist(p);
			em.getTransaction().commit();
			return (p);
		} finally {
			dao.closeEntityManager(em);
		}
	}

	public void update(T p) {
		EntityManager em = null;
		try {
			em = dao.newEntityManager();
			em.merge(p);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.closeEntityManager(em);
		}

	}// TODO: handle exception

	public void remove(Class<T> eclass, Object pk) {

		EntityManager em = null;
		try {
			em = dao.newEntityManager();
			T p = em.find(eclass, pk);
			em.remove(p);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.closeEntityManager(em);
		}

	}

	public T find(Class<T> eclass, Object pk) {

		EntityManager em = null;
		try {
			em = dao.newEntityManager();
			return em.find(eclass, pk);
		} finally {
			dao.closeEntityManager(em);
		}
	}

	public List<T> findAll(Class<T> eclass) {

		EntityManager em = null;
		try {

			em = dao.newEntityManager();
			String query = "SELECT a FROM " + eclass.getSimpleName() + " a";
			TypedQuery<T> q = em.createQuery(query, eclass);
			return q.getResultList();

		} finally {
			dao.closeEntityManager(em);
		}
	}
	
	public List<T> requeteNamed(Class<T> eclass, String requete) {

		EntityManager em = null;
		try {

			em = dao.newEntityManager();
			
			TypedQuery<T> q = em.createNamedQuery(requete, eclass);
			return q.getResultList();

		} finally {
			dao.closeEntityManager(em);
		}
	}
	
	public List<T> requeteNamed(Class<T> eclass, String requete, Object... o) {

		EntityManager em = null;
		try {

			em = dao.newEntityManager();
			int i =1;
			TypedQuery<T> q = em.createNamedQuery(requete, eclass);
			for(Object p: o) {
				q.setParameter(i, p);
				i++;
			}
			return q.getResultList();

		} finally {
			dao.closeEntityManager(em);
		}
	}
	
	public List<T> devisFindByClient(Class<T> eclass, String requete, String...param) {

		EntityManager em = null;
		try {

			em = dao.newEntityManager();
			int i =1;
			TypedQuery<T> q = em.createNamedQuery(requete, eclass);
			for(String p: param) {
				q.setParameter(i, p);
				i++;
			}
			return q.getResultList();

		} finally {
			dao.closeEntityManager(em);
		}
	}
	
	
	
}
