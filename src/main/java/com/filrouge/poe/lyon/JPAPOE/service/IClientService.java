package com.filrouge.poe.lyon.JPAPOE.service;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.model.Client;

public interface IClientService {
	List<Client> listeClients();
	void ajouterClient(Client c);
	void modifierClient(Client c);
	void supprimerClient(Client c);
	Client findClient(Integer i);
}
