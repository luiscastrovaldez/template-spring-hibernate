package pe.com.template.core.dao;

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
public class UserDaoTest extends UnitTest {

	@Autowired
	private UserDAO userDAO;

	@Test
	public void saveUserTest() {
		User user = null;
		try {
			user = new User("lcastro", "lcastro", new Timestamp(
					System.currentTimeMillis()), new Timestamp(
					System.currentTimeMillis()));
			this.userDAO.saveUser(user);
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
			user = this.userDAO.findUserByUserName("lcastro");
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
			user = this.userDAO.findUserByUserName("lcastro");
			if(user != null){
				user.setPassword("xxxxx");
				user.setDateUpdated(new Timestamp(System.currentTimeMillis()));
				this.userDAO.updateUser(user);	
				Assert.assertTrue(Boolean.TRUE);
			} else {
				Assert.assertNotNull(user);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
}
