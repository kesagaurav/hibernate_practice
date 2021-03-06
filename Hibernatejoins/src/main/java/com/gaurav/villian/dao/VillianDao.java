package com.gaurav.villian.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gaurav.dbutil.HibernateUtil;
import com.gaurav.model.Villian;

public class VillianDao {
	private HibernateUtil hutil;

	public VillianDao() {
		super();
	}

	public VillianDao(HibernateUtil hutil) {
		super();
		this.hutil = hutil;
	}

	
	public void insert(Villian v) {
		Session ses=hutil.getSession();
		Transaction t=ses.beginTransaction();
		ses.save(v);
		t.commit();
	}
	
	public void delete(int id) {
		Villian villian=new Villian();
		Session ses=hutil.getSession();
		Transaction t=ses.beginTransaction();
		Villian vill =  (Villian) ses.get(Villian.class, id);

		if(vill.getId()==0) {
			System.out.println("\n they are no villians plz insert some of them");
		}else {
			ses.delete(vill);
			System.out.println("  deleted successfuly " +  vill.getName() + " and its id is " + vill.getId());
		}
		
	}
	
	
	public List<Villian> getAllVillians(){
		Session ses=hutil.getSession();
		Query query=ses.createQuery("from com.gaurav.model.Villian");
		List<Villian> villList=query.list();
		if(villList.size()==0) {
			System.out.println("sorry no values plz insert some of them");
		}else {
			villList.forEach(e->System.out.println(e));
		}
		return villList;
		
	}
	
	
}
