package pe.com.template.core.services;

import java.sql.Timestamp;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import pe.com.template.UnitTest;
import pe.com.template.core.domain.User;

public class TemplateServicesTest extends UnitTest{
	
	@Autowired
	private TemplateServices templateServices;

	@Test
	public void saveUserTest() {
		User user = null;
		try {
			user = new User(null, "lcastro", "lcastro", new Timestamp(
					System.currentTimeMillis()));
			this.templateServices.saveUser(user);
			Assert.assertTrue(Boolean.TRUE);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void findUserTest() {
		User user = null;
		try {
			user = this.templateServices.findUserByUserName("lcastro");
			Assert.assertNotNull(user);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
}
