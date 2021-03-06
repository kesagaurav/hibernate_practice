package com.gaurav;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import com.gaurav.dbutil.HibernateUtil;
import com.gaurav.hero.dao.HeroVillianDao;
import com.gaurav.model.Marvel;
import com.gaurav.model.Power;
import com.gaurav.model.Villian;
import com.gaurav.powerdao.PowerDao;
import com.gaurav.villian.dao.VillianDao;

public class HeroVillianMain {

	public static void main(String[] args) {

		HibernateUtil hutil = new HibernateUtil();
		HeroVillianDao mcDao = new HeroVillianDao(hutil);
		VillianDao vDao = new VillianDao(hutil);
		PowerDao pDao = new PowerDao(hutil);
		Villian v=new Villian();

		Villian v1 = new Villian("redskull", "red", "guns", null);
		Villian v2 = new Villian("doctoroctopuss", "black", "octopussstings", null);
		Villian v3 = new Villian("greengoblin", "green", "glider", null);
		Villian v4 = new Villian("dormamu", "pink", "magic", null);
		Villian v5 = new Villian("carnage", "red", "like spider webs", null);
		Villian v6 = new Villian("thanos", "pink", "infinity_gaunlet", null);
		Power p = new Power("cosmiccube", v1);
		Power p1 = new Power("super-strong and durable mechanical appendages", v2);
		Power p2 = new Power("martialarts", v3);
		Power p3 = new Power("time_travel and teleportation", v4);
		Power p4 = new Power("limitedshapeshifting", v5);
		Power p5 = new Power("telekinesis and telepathy", v6);
		pDao.insert(p);
		pDao.insert(p1);
		pDao.insert(p2);
		pDao.insert(p3);
		pDao.insert(p4);
		pDao.insert(p5);
		pDao.getAllPowers();

		Marvel mar = new Marvel("ironman", "red", "missles", v1);
		Marvel mar1 = new Marvel("captainamerica", "blue", "sheild", v2);
		Marvel mar2 = new Marvel("blackwidwo", "black", "gun", v3);
		Marvel mar3 = new Marvel("nickfury", "one eyed man", "nullifeir", v4);
		Marvel mar4 = new Marvel("hulk", "green", "strongarms", v5);
		Marvel mar5 = new Marvel("vamplire", "red", "shadows", v6);
		Marvel mar6 = new Marvel("redhulk", "red", "nullifiernadgun", v1);

		mcDao.insert(mar);
		mcDao.insert(mar1);
		mcDao.insert(mar2);
		mcDao.insert(mar3);
		mcDao.insert(mar4);
		mcDao.insert(mar5);
		mcDao.insert(mar6);
		mcDao.getAllMarvels();
		mcDao.joins();
		mcDao.someImportant();

//		vDao.insert(v1);
//		vDao.insert(v2);
//		vDao.insert(v3);
//		vDao.insert(v4);
//		vDao.insert(v5);
//		vDao.insert(v6);

	//	vDao.getAllVillians();

		List<Power> powerList = new ArrayList<>();
		powerList.add(p);
	Villian v7= new Villian("redskull", "red", "guns", powerList);
		Marvel mar7 = new Marvel("ironman", "red", "missles", v7);
	vDao.getAllVillians().add(v7);

		
		List<Power> powerList1 = new ArrayList<>();
		powerList.add(p1);
		Villian v8 = new Villian("doctoroctopuss", "black", "octopussstings", powerList1);
		Marvel mar8 = new Marvel("captainamerica", "blue", "sheild", v8);
		vDao.getAllVillians().add(v8);

		List<Power> powerList2 = new ArrayList<>();
		powerList.add(p2);
		Villian v9 = new Villian("greengoblin", "green", "glider", powerList2);
		Marvel mar9 = new Marvel("blackwidwo", "black", "gun", v9);
		vDao.getAllVillians().add(v9);

		List<Power> powerList3 = new ArrayList<>();
		powerList3.add(p3);
		Villian v10 = new Villian("dormamu", "pink", "magic", powerList3);
		Marvel mar10 = new Marvel("nickfury", "one eyed man", "nullifeir", v10);
		vDao.getAllVillians().add(v10);
		List<Power> powerList4 = new ArrayList<>();
		powerList4.add(p4);
		Villian v11 = new Villian("carnage", "red", "like spider webs", powerList4);
		Marvel mar11 = new Marvel("hulk", "green", "strongarms", v11);
		vDao.getAllVillians().add(v11);

		List<Power> powerList5 = new ArrayList<>();
		powerList5.add(p5);
		Villian v12 = new Villian("thanos", "pink", "infinity_gaunlet", powerList5);
		Marvel mar12 = new Marvel("vamplire", "red", "shadows", v12);
		vDao.getAllVillians().add(v12);

		vDao.insert(v7);

		vDao.insert(v8);

		vDao.insert(v9);

		vDao.insert(v10);

		vDao.insert(v11);

		vDao.insert(v12);

		
	
		mcDao.insert(mar7);
		mcDao.insert(mar8);
		mcDao.insert(mar9);
		mcDao.insert(mar10);
		mcDao.insert(mar11);
		mcDao.insert(mar12);
		mcDao.insert(mar8);
		
		
		
		
		
		
	}

}
