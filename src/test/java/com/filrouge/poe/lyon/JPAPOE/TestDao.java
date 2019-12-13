package com.filrouge.poe.lyon.JPAPOE;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.filrouge.poe.lyon.JPAPOE.dao.IVehiculeDao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.model.Client;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;
import com.filrouge.poe.lyon.JPAPOE.service.IClientService;
import com.filrouge.poe.lyon.JPAPOE.service.IVehiculeService;
import com.filrouge.poe.lyon.JPAPOE.service.impl.ClientService;
import com.filrouge.poe.lyon.JPAPOE.service.impl.VehiculeService;

public class TestDao {
	private static Dao dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new Dao();
		dao.init();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dao.close();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testfindClient() {
		IClientService clientservice = new ClientService(dao);
		System.out.println(clientservice.findClient(1));

	}

//	@Test
//	public void testfindListClient() {
//		IClientService clientservice = new ClientService(dao);
//		System.out.println(clientservice.listeClients());
//
//	}
//
//	@Test
//	public void testAjouterClient() {
//		IClientService clientservice = new ClientService(dao);
//		Client c = new Client();
//		c.setCodepostal("1245");
//		c.setFirstname("Hocine");
//		c.setName("Hammar");
//		c.setPortable("021548782");
//		c.setTel("0365487954");
//		c.setVille("lyon");
//		c.setAdresse("7500 paris");		
//		clientservice.ajouterClient(c);
//		System.out.println(c.toString());
//		System.out.println(clientservice.listeClients());
//	}

//	@Test
//	public void testSupprimerClient() {
//		IClientService clientservice = new ClientService(dao);
//		Client client = clientservice.listeClients().get(2);
//		clientservice.supprimerClient(client);
//	}
	@Test
	public void testfindVehicule() {

		IVehiculeService vehiculeservice = new VehiculeService(dao);
		Vehicule v = vehiculeservice.findVehicule(2);
		System.out.println(v);
	}
	@Test
	public void testfindListeVehicules() {
		IVehiculeService vehiculeservice= new VehiculeService(dao);
		System.out.println(vehiculeservice.listeVehicules());

	}
	
	
	@Test
	public void testAjouterVehicule() {
		IVehiculeService vehiculeservice = new VehiculeService(dao);
		Vehicule v = new Vehicule();
		v.setModele("Golf7");
		v.setDatecreation(new Date());
		v.setPrixht((float) 21254.555);
		v.setQte(2);
		vehiculeservice.ajouterVehicule(v);
		
		System.out.println(v.toString());
		System.out.println(vehiculeservice.listeVehicules());
	}
	
	@Test
	public void testSupprimerVehicule() {
		IVehiculeService vehiculeservice = new VehiculeService(dao);
		Vehicule v  = vehiculeservice.findVehicule(4);
		vehiculeservice.supprimerVehicule(v);
	}
	

}
