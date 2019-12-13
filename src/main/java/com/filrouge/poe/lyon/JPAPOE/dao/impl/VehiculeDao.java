package com.filrouge.poe.lyon.JPAPOE.dao.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IVehiculeDao;
import com.filrouge.poe.lyon.JPAPOE.model.Client;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;

public class VehiculeDao extends EntityDao<Vehicule> implements IVehiculeDao {

	public VehiculeDao(Dao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	public List<Vehicule> listeVehicules() {
		// TODO Auto-generated method stub
		 return this.findAll(Vehicule.class);
	}

	public void ajouterVehicule(Vehicule v) {
		this.add(v);

	}

	public void modifierVehicule(Vehicule v) {
		// TODO Auto-generated method stub

	}

	public void supprimerVehicule(Vehicule v) {
		this.remove(Vehicule.class, v);
	}

	public Vehicule findVehicule(Integer i) {
		// TODO Auto-generated method stub
		return this.find(Vehicule.class, i);
	}

}
