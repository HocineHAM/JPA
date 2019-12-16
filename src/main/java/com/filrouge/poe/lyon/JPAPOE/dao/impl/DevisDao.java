package com.filrouge.poe.lyon.JPAPOE.dao.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IDevisDao;
import com.filrouge.poe.lyon.JPAPOE.model.Client;
import com.filrouge.poe.lyon.JPAPOE.model.Devis;


public class DevisDao extends EntityDao<Devis> implements IDevisDao {
	public DevisDao(Dao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Devis> listeDevis() {
		// TODO Auto-generated method stub
		return this.findAll(Devis.class);
	}

	@Override
	public void ajouterDevis(Devis d) {
		// TODO Auto-generated method stub
		this.add(d);
	}

	@Override
	public void modifierDevis(Devis d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerDevis(Devis d) {
		// TODO Auto-generated method stub
		this.remove(Devis.class, d);
	}

	@Override
	public Devis findDevis(Integer i) {
		// TODO Auto-generated method stub
		return this.find(Devis.class, i);
	}

	@Override
	public List<Devis> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.requeteNamed(Devis.class, requete);
	}

	@Override
	public List<Devis> requetenamed(String requete,Object o) {
		// TODO Auto-generated method stub
		return this.requeteNamed(Devis.class, requete, o);
	}

	

}
