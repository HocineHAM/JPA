package com.filrouge.poe.lyon.JPAPOE.dao;

import java.util.List;


import com.filrouge.poe.lyon.JPAPOE.model.User;

public interface IUserDao {
	
	List<User> listeUsers();
	void ajouterUser(User u);
	void modifierUser(User u);
	void supprimerUser(User u);
	User findUser(Integer i);
	List<User> requetenamed(String requete);
	List<User> requetenamed(String requete, String ...tab);


}
