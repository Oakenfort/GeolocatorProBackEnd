package dao;

import java.util.List;

import javax.ejb.Local;

import entities.Smartphone;
import entities.User;


@Local
public interface IDaoUserRemote {
	boolean create(User u);
	boolean delete (User u);
	boolean update (User u);
	User getById(int id);
	List<User> getByImei(String imei);
	List<User> getAll();

}
