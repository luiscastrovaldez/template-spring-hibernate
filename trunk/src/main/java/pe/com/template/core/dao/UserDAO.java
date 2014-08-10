package pe.com.template.core.dao;

import pe.com.template.core.domain.User;

/**
 * 
 * @author lcastro
 * 
 */
public interface UserDAO {

	User findUserByUserName(String userName) throws Exception;

	void saveUser(User user) throws Exception;

	User updateUser(User user) throws Exception;
}
