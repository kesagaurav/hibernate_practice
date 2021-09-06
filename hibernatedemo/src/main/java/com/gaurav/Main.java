package com.gaurav;

import com.gaurav.dao.MarvelCrudDao;
import com.gaurav.dbutil.HibernateUtil;
import com.gaurav.model.Marvel;

public class Main {
	
	public static void main(String[] args) {
	HibernateUtil hutil=new HibernateUtil();
	MarvelCrudDao mcDao=new MarvelCrudDao(hutil);
	Marvel mar=new Marvel("ironman","red","missles");
	Marvel mar1=new Marvel("captainamerica","blue","sheild");
	Marvel mar2=new Marvel("blackwidwo","black","gun");
	Marvel mar3=new Marvel("nickfury","one eyed man","nullifeir");
	Marvel mar4=new Marvel("hulk","green","strongarms");
	Marvel mar5=new Marvel("vamplire","red","shadows");
	Marvel mar6=new Marvel("redhulk","red","nullifiernadgun");
	mcDao.insert(mar);
	mcDao.insert(mar1);
	mcDao.insert(mar2);
	mcDao.insert(mar3);
	mcDao.update(mar3);
	mcDao.insert(mar4);
	mcDao.update(mar);
	mcDao.insert(mar5);
	mcDao.insert(mar6);

	

	
	mcDao.getAllMarvel();
		
		
		
		
		
	}
}
