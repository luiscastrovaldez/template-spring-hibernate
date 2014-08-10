package pe.com.template.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.template.core.dao.UserDAO;
import pe.com.template.core.domain.User;

@Service("usuarioServices")
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserDAO userDAO;

	public User findUserByUserName(String userName) throws Exception {
		// TODO Auto-generated method stub
		return userDAO.findUserByUserName(userName);
	}

	public void saveUser(User user) throws Exception {
		userDAO.saveUser(user);

	}

}
