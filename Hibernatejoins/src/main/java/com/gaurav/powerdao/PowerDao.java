package com.gaurav.powerdao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gaurav.dbutil.HibernateUtil;
import com.gaurav.model.Power;

public class PowerDao {
	private static HibernateUtil hutil;

	public PowerDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PowerDao(HibernateUtil hutil) {
		super();
		this.hutil = hutil;
	}

	public void insert(Power p) {
		Session ses=hutil.getSession();
		Transaction t=ses.beginTransaction();
		ses.save(p);
		t.commit();
		
	}
	
	public List<Power> getAllPowers(){
		Session ses=hutil.getSession();
		Query q=ses.createQuery("from com.gaurav.model.Power");
		List<Power> powerList=q.list();
		powerList.forEach(e->System.out.println(e));
		return powerList;
	}

}
