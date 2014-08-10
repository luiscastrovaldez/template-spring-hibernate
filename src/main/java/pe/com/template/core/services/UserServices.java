package pe.com.template.core.services;

import pe.com.template.core.domain.User;

/**
 * 
 * @author lcastro
 * 
 */
public interface UserServices {

	User findUserByUserName(String usuario) throws Exception;

	void saveUser(User user) throws Exception;

	User updateUser(User user) throws Exception;
}
