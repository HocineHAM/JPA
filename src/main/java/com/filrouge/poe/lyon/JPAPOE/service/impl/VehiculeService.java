package com.filrouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IClientDao;
import com.filrouge.poe.lyon.JPAPOE.dao.IVehiculeDao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.VehiculeDao;
import com.filrouge.poe.lyon.JPAPOE.model.Client;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;
import com.filrouge.poe.lyon.JPAPOE.service.IVehiculeService;

public class VehiculeService implements IVehiculeService {
	
	private IVehiculeDao vehiculeDao;

	public VehiculeService(Dao dao) {
		super();
		this.vehiculeDao= new VehiculeDao(dao);
	}

	public List<Vehicule> listeVehicules() {
		// TODO Auto-generated method stub
		return vehiculeDao.listeVehicules();
	}

	public void ajouterVehicule(Vehicule v) {
		this.vehiculeDao.ajouterVehicule(v);

	}

	public void modifierVehicule(Vehicule v) {
		// TODO Auto-generated method stub

	}

	public void supprimerVehicule(Vehicule v) {
		this.vehiculeDao.supprimerVehicule(v);

	}

	public Vehicule findVehicule(Integer i) {
		// TODO Auto-generated method stub
		return this.vehiculeDao.findVehicule(i);
	}

}
