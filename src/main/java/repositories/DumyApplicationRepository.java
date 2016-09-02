package repositories;

import java.util.ArrayList;
import java.util.List;

import domain.Application;

public class DumyApplicationRepository implements ApplicationRepository{
	
	private static List<Application> db = new ArrayList<Application>();
	
	public List<Application> getList(){
		return db;
	}
	@Override
	public Application getApplicationByEmailAddresss(String email){
		for(Application application: db){
			if(application.getEmail().equalsIgnoreCase(email))
				return application;
		}
		return null;
	}
	@Override
	public Application getApplicationByUsername(String login, String password){
		for(Application application: db){
			if(application.getUsername().equals(login) && application.getPassword().equals(password))
				return application;
		}
		return null;
	}
	@Override
	public void add(Application application){
		db.add(application);
	}
	@Override
	public int count(){
		return db.size();
	}
}
