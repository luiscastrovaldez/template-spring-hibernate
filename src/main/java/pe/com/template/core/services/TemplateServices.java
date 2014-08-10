package pe.com.template.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.template.core.domain.User;

@Service("templateServices")
public class TemplateServices {

	@Autowired
	private UserServices userServices;

	public User findUserByUserName(String userName) throws Exception {
		// TODO Auto-generated method stub
		return this.userServices.findUserByUserName(userName);
	}

	public void saveUser(User user) throws Exception {
		this.userServices.saveUser(user);

	}
}
