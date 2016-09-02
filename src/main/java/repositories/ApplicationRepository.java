package repositories;

import domain.Application;

public interface ApplicationRepository {

	Application getApplicationByEmailAddresss(String email);
	Application getApplicationByUsername(String login, String password);
	void add(Application application);
	int count();
}
