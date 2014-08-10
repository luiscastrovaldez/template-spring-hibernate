package pe.com.template.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.template.core.dao.UserDAO;
import pe.com.template.core.domain.User;

/**
 * 
 * @author lcastro
 * 
 */
@Service("usuarioServices")
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserDAO userDAO;

	public User findUserByUserName(String userName) throws Exception {
		return this.userDAO.findUserByUserName(userName);
	}

	public void saveUser(User user) throws Exception {
		this.userDAO.saveUser(user);

	}

	public User updateUser(User user) throws Exception {
		return this.userDAO.updateUser(user);
	}

}
