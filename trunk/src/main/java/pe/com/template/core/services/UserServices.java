package pe.com.template.core.services;

import pe.com.template.core.domain.User;


public interface UserServices {

	 User findUserByUserName(String usuario) throws Exception;
	 
	 void saveUser(User user)throws Exception;
}
