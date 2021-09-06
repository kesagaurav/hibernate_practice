package com.gaurav.hero.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.gaurav.dbutil.HibernateUtil;
import com.gaurav.model.Marvel;
import com.gaurav.model.Villian;

public class HeroVillianDao {

	private HibernateUtil hutil;

	public HeroVillianDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HeroVillianDao(HibernateUtil hutil) {
		super();
		this.hutil = hutil;
	}

	public void insert(Marvel mar) {
		Session ses = hutil.getSession();
		Transaction t = ses.beginTransaction();
		ses.save(mar);
		t.commit();

	}

	public void update() {
		Session ses = hutil.getSession();
		Transaction t = ses.beginTransaction();
		String hql = "update  com.gaurav.model.Marvel set name=:n,weapons=:weapons where color=:c";
		Query q = ses.createQuery(hql);
		q.setString("n", "ironman");
		q.setString("weapons", "repulsors_hulkbusters_flamethrowers");
		q.setString("c", "red");
		int r = q.executeUpdate();
		System.out.println("rows updated " + r);

		t.commit();

	}

	public void delete() {
		Session ses = hutil.getSession();
		Transaction t = ses.beginTransaction();
		Query q = ses.createQuery("delete from com.gaurav.model.Marvel where color=:color");
		q.setParameter("color", "red");
		int d = q.executeUpdate();
		System.out.println("deleted " + d);
		t.commit();
	}

	public List<Marvel> getAllMarvels() {
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

	public void joins() {
		Session ses = hutil.getSession();
//		 Query q=ses.createQuery("from com.gaurav.model.Marvel m JOIN com.gaurav.model.Villian v on m.villianName=v.villianName where v.name=:name");
//		 q.setString("name","redskull");
//		 List<Marvel> marLit=q.list();
//		 marLit.forEach(e->System.out.println(e));
//
//		Criteria criteria=ses.createCriteria(Marvel.class);
//		criteria.setFetchMode("marvel.villianName", FetchMode.JOIN);
//		List<Marvel> marList=criteria.list();
//		System.out.println(marList);
		
		
		

		Criteria criteriaMarvel=ses.createCriteria(Marvel.class);
		Criteria criteriaVillian=criteriaMarvel.createCriteria("villian");
		criteriaVillian.add(Restrictions.eq("color","black"));
		List<Marvel> marList1=criteriaMarvel.list();
		for (Iterator iterator = marList1.iterator(); iterator.hasNext();) { //iterate over collection
			Marvel marvel = (Marvel) iterator.next();
			System.out.println(marvel);

		}
		
		
	}
	
	
	
	
	public void someImportant() {
		Session ses=hutil.getSession();
		Query q=ses.createQuery("from com.gaurav.model.Marvel");
		List<Marvel> marList=q.list();
		for (Marvel marvel : marList) {
			System.out.println(marvel.getName());
			System.out.println("marvel hero details for " + marvel.getName() + " his villian name is  " + marvel.getVillian());
		}
	}
	
	
	

}
