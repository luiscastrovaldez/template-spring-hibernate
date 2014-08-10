package pe.com.template.core.dao;

import pe.com.template.core.domain.User;

public interface UserDAO {

	 User findUserByUserName(String userName) throws Exception;
	 
	 void saveUser(User user)throws Exception;
}
