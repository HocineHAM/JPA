package com.filrouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IDevisDao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.DevisDao;
import com.filrouge.poe.lyon.JPAPOE.model.Client;
import com.filrouge.poe.lyon.JPAPOE.model.Devis;
import com.filrouge.poe.lyon.JPAPOE.model.User;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;
import com.filrouge.poe.lyon.JPAPOE.service.IDevisService;

public class DevisService implements IDevisService {
	private IDevisDao devisdao;

	public DevisService(Dao dao) {
		super();
		this.devisdao = new DevisDao(dao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Devis> listeDevis() {
		// TODO Auto-generated method stub
		return devisdao.listeDevis();
	}

	@Override
	public void ajouterDevis(Devis d) {
		// TODO Auto-generated method stub
		devisdao.ajouterDevis(d);
	}

	@Override
	public void modifierDevis(Devis d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerDevis(Devis d) {
		// TODO Auto-generated method stub
		devisdao.supprimerDevis(d);
	}

	@Override
	public Devis findDevis(Integer i) {
		// TODO Auto-generated method stub
		return devisdao.findDevis(i);
	}

	@Override
	public List<Devis> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return devisdao.requetenamed(requete);
	}

	@Override
	public List<Devis> requetenamed(String requete, Object o) {
		// TODO Auto-generated method stub
		return devisdao.requetenamed(requete, o);
	}

	@Override
	public Client afficherFicheClient(Integer i) {
		// TODO Auto-generated method stub
		return devisdao.findDevis(i).getClient();
	}

	@Override
	public User afficherFicheUser(Integer i) {
		// TODO Auto-generated method stub
		return devisdao.findDevis(i).getUser();
	}

	@Override
	public Vehicule afficherFicheVehicule(Integer i) {
		// TODO Auto-generated method stub
		return devisdao.findDevis(i).getVehicule();
	}


}
