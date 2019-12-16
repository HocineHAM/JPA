package com.filrouge.poe.lyon.JPAPOE.dao.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IUserDao;
import com.filrouge.poe.lyon.JPAPOE.model.User;

public class UserDao extends EntityDao<User>implements IUserDao {
	
	

	public UserDao( Dao dao) {
		super(dao);
		
	}

	@Override
	public List<User> listeUsers() {
		// TODO Auto-generated method stub
		return this.findAll(User.class);
	}

	@Override
	public void ajouterUser(User u) {
		this.add(u);

	}

	@Override
	public void modifierUser(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerUser(User u) {
		this.remove(User.class, u);

	}

	@Override
	public User findUser(Integer i) {
		// TODO Auto-generated method stub
		return this.find(User.class, i);
	}

	@Override
	public List<User> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.requeteNamed(User.class, requete);
	}

	@Override
	public List<User> requetenamed(String requete, String... tab) {
		// TODO Auto-generated method stub
		return this.requeteNamed(User.class, requete, tab);
	}

}
