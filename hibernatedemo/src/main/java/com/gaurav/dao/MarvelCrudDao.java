package com.gaurav.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gaurav.dbutil.HibernateUtil;
import com.gaurav.model.Marvel;

public class MarvelCrudDao {

	private HibernateUtil hutil;

	public MarvelCrudDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MarvelCrudDao(HibernateUtil hutil) {
		super();
		this.hutil = hutil;
	}

	public void insert(Marvel mar) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(mar);
		tx.commit();

	}

	public void update(Marvel mar) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		if(mar.getClass()!=null) {
			ses.update(mar);
			System.out.println("updated with the record " + mar.getId() +  " sucessfully ");
		}else {
			System.out.println("sorry something wrong in the update method plz do check");
		}
	
		tx.commit();
	}

	public void delete(int id) {
		Session ses = hutil.getSession();
		Transaction tx = ses.beginTransaction();
		Marvel mar = (Marvel) ses.get(Marvel.class, id);
		if(mar.getId()==0) {
			System.out.println("they are no elments to delete");
		}else {
			ses.delete(mar);
			System.out.println("\n deleted successfully "  + mar.getId() + "th row has been deleted ");
		}
		
		tx.commit();
	}

	public List<Marvel> getAllMarvel() {
		Session ses = hutil.getSession();
		Query query = ses.createQuery("from com.gaurav.model.Marvel");
		List<Marvel> marList = query.list();
		if (marList.size() == 0) {
			System.out.println("sorry they are no elements  plz insert some values");
		} else {
			marList.forEach(e -> System.out.println(e));
		}

		return marList;

	}

}
