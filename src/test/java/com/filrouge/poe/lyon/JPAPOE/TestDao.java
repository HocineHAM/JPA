package com.filrouge.poe.lyon.JPAPOE;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.model.Client;
import com.filrouge.poe.lyon.JPAPOE.model.Devis;
import com.filrouge.poe.lyon.JPAPOE.model.User;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;
import com.filrouge.poe.lyon.JPAPOE.service.IClientService;
import com.filrouge.poe.lyon.JPAPOE.service.IDevisService;
import com.filrouge.poe.lyon.JPAPOE.service.IUserService;
import com.filrouge.poe.lyon.JPAPOE.service.IVehiculeService;
import com.filrouge.poe.lyon.JPAPOE.service.impl.ClientService;
import com.filrouge.poe.lyon.JPAPOE.service.impl.DevisService;
import com.filrouge.poe.lyon.JPAPOE.service.impl.UserService;
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
	
	@Test
	public void testNamedClient() {
		IClientService clientservice = new ClientService(dao);
		clientservice.requetenamed("Client.findAll").stream().forEach(System.out::println);
	}
	
	@Test
	public void testNametParamClient() {
		IClientService clientservice = new ClientService(dao);
		clientservice.requetnamed("Client.findByName","C%").stream().forEach(System.out::println);
	}
	
	
	@Test
	public void testAjouterUser() {
		IUserService userservice = new UserService(dao);
		User u = new User();
		u.setFistName("Hocine");
		u.setLastName("Hammar");
		u.setLogin("HocineHAMMAR");
		u.setPassword("12345");
		
		userservice.ajouterUser(u);
		System.out.println(u.toString());
		System.out.println(userservice.listeUsers());
	}
	
	@Test
	public void testAjouterDevis() {
		
		IClientService clientservice = new ClientService(dao);
		IVehiculeService vehiculeService = new VehiculeService(dao);
		IDevisService devisservice = new DevisService(dao);
		IUserService userservice = new UserService(dao);
		Devis d = new Devis();
		d.setClient(clientservice.findClient(1));
		d.setDatecreation(new Date());
		d.setEtat(true);
		d.setUser(userservice.findUser(1));
		d.setVehicule(vehiculeService.findVehicule(1));
		
		devisservice.ajouterDevis(d);
		System.out.println(d.toString());
		
	}
	
	@Test
	public void testfindDevis() {
		IDevisService devisservice = new DevisService(dao);
		System.out.println(devisservice.findDevis(1));

	}
	
	@Test
	public void testAllDevis() {
		IDevisService devisservice = new DevisService(dao);
		devisservice.requetenamed("Devis.devfindAll").stream().forEach(System.out::println);
	}
	
	@Test
	public void testDevisFindByClient() {
		IDevisService devisservice = new DevisService(dao);
		devisservice.requetenamed("Devis.findByClient", 1).stream().forEach(System.out::println);
	}

	@Test
	public void testfindAllDevisByClient() {
		
		IClientService clientservice = new ClientService(dao);		
		List<Devis>  ldev = clientservice.findAllDevisByClient(1);
		for ( Devis v :ldev) {
		System.out.println(v.getId()+"---"+v.getDatecreation());
		}
	}
	@Test
	public void testafficherFicheClient() {
		
		IDevisService devisService= new DevisService(dao);
		Client c = devisService.afficherFicheClient(1);
		System.out.println(c);
		}	
	
	@Test
	public void testafficherFicheUser() {
		
		IDevisService devisService= new DevisService(dao);
		User u = devisService.afficherFicheUser(2);
		System.out.println(u);
		}	
	
	@Test
	public void testafficherFicheVehicule() {
		
		IDevisService devisService= new DevisService(dao);
		Vehicule v = devisService.afficherFicheVehicule(1);
		System.out.println(v);
		}	

}
