package pe.com.template.core.services;

import java.sql.Timestamp;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import pe.com.template.UnitTest;
import pe.com.template.core.domain.User;

/**
 * 
 * @author lcastro
 * 
 */
public class UserServicesTest extends UnitTest {

	@Autowired
	private UserServices userServices;

	@Test
	public void saveUserTest() {
		User user = null;
		try {
			user = new User("lcastro", "lcastro", new Timestamp(
					System.currentTimeMillis()), new Timestamp(
					System.currentTimeMillis()));
			this.userServices.saveUser(user);
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
			user = this.userServices.findUserByUserName("lcastro");
			Assert.assertNotNull(user);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void updateUserTest() {
		User user = null;
		try {
			user = this.userServices.findUserByUserName("lcastro");
			user.setPassword("xxxxx");
			user.setDateUpdated(new Timestamp(System.currentTimeMillis()));
			this.userServices.updateUser(user);
			Assert.assertTrue(Boolean.TRUE);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
}
