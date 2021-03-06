package com.gaurav;

import java.util.ArrayList;
import java.util.List;

import com.gaurav.dao.VillianCrudDao;
import com.gaurav.dbutil.HibernateUtil;
import com.gaurav.model.Villian;

public class Main {

	
	public static void main(String[] args) {
		
		
		HibernateUtil hutil=new HibernateUtil();
		VillianCrudDao vDao=new VillianCrudDao(hutil);
		
		Villian v1=new Villian("redskull","red","guns");
		Villian v2=new Villian("doctoroctopuss","black","octopussstings");
		Villian v3=new Villian("greengoblin","green","glider");
		Villian v4=new Villian("dormamu","pink","magic");
		Villian v5=new Villian("carnage","red","like spider webs");
		Villian v6=new Villian("thanos","pink","infinity_gaunlet");
		
		vDao.insert(v1);
		vDao.insert(v2);
		vDao.insert(v3);

		vDao.insert(v4);
		vDao.insert(v5);
		vDao.insert(v6);
		
		vDao.delete(v5.getId());
		
		vDao.getAllVillians();
		
		
		
		
	}
}
