package com.filrouge.poe.lyon.JPAPOE.dao.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IClientDao;
import com.filrouge.poe.lyon.JPAPOE.model.Client;

public class ClientDao extends EntityDao<Client> implements IClientDao {

	public ClientDao(Dao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	public List<Client> listeClients() {
		// TODO Auto-generated method stub
		return this.findAll(Client.class);
	}

	public void ajouterClient(Client c) {
		this.add(c);

	}

	public void modifierClient(Client c) {
		// TODO Auto-generated method stub

	}

	public void supprimerClient(Client c) {
		this.remove(Client.class, 2);

	}

	public Client findClient(Integer i) {
		// TODO Auto-generated method stub
		return this.find(Client.class, i);
	}

}
