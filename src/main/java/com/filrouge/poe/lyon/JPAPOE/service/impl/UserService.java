package com.filrouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IUserDao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.ClientDao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.UserDao;
import com.filrouge.poe.lyon.JPAPOE.model.User;
import com.filrouge.poe.lyon.JPAPOE.service.IUserService;

public class UserService implements IUserService {
private IUserDao userDao;
	public UserService(Dao dao) {
		super();
		this.userDao = new UserDao(dao);
	// TODO Auto-generated constructor stub
}

	@Override
	public List<User> listeUsers() {
		// TODO Auto-generated method stub
		return this.userDao.listeUsers();
	}

	@Override
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		this.userDao.ajouterUser(u);
		}

	@Override
	public void modifierUser(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerUser(User u) {
		this.userDao.supprimerUser(u);

	}

	@Override
	public User findUser(Integer i) {
		// TODO Auto-generated method stub
		return this.userDao.findUser(i);
	}

	@Override
	public List<User> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.userDao.requetenamed(requete);
	}

	@Override
	public List<User> requetenamed(String requete, String... tab) {
		// TODO Auto-generated method stub
		return this.userDao.requetenamed(requete, tab);
	}

}
