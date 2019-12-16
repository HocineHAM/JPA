package com.filrouge.poe.lyon.JPAPOE.service;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.model.Client;
import com.filrouge.poe.lyon.JPAPOE.model.Devis;
import com.filrouge.poe.lyon.JPAPOE.model.User;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;

public interface IDevisService {
	List<Devis> listeDevis();
	void ajouterDevis(Devis d);
	void modifierDevis(Devis d);
	void supprimerDevis(Devis d);
	Devis findDevis(Integer i);
	List<Devis> requetenamed(String requete);
	List<Devis> requetenamed(String requete, Object o);
	Client afficherFicheClient(Integer i);
	User afficherFicheUser(Integer i);
	Vehicule afficherFicheVehicule(Integer i);
}
