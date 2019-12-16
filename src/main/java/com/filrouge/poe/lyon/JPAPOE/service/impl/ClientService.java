package com.filrouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IClientDao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.ClientDao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.model.Client;
import com.filrouge.poe.lyon.JPAPOE.model.Devis;
import com.filrouge.poe.lyon.JPAPOE.service.IClientService;


public class ClientService implements IClientService {
	private IClientDao clientdao;

	
	public ClientService (Dao dao) {
		super();
		this.clientdao = new ClientDao(dao);
	}
	public List<Client> listeClients() {
		// TODO Auto-generated method stub
		return this.clientdao.listeClients();
	}

	public void ajouterClient(Client c) {
		this.clientdao.ajouterClient(c);
		

	}

	public void modifierClient(Client c) {
		// TODO Auto-generated method stub

	}

	public void supprimerClient(Client c) {
		this.clientdao.supprimerClient(c);

	}

	public Client findClient(Integer i) {
		// TODO Auto-generated method stub
		return this.clientdao.findClient(i);
	}
	public List<Client> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.clientdao.requetenamed(requete);
	}
	public List<Client> requetnamed(String requete, String... tab) {
		// TODO Auto-generated method stub
		return this.clientdao.requetenamed(requete, tab);
	}
	@Override
	public List<Devis> findAllDevisByClient(Integer i) {
		// TODO Auto-generated method stub
		return this.clientdao.findClient(i).getListeDevis();
	}

}
