package pe.com.template.core.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.template.core.dao.UserDAO;
import pe.com.template.core.domain.User;

@Repository
public class UserDAOImpl extends BaseDAO<User> implements UserDAO {

	@Autowired
	public UserDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public User findUserByUserName(String userName) throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append(" from User a where a.userName = '" + userName + "'");
		List<User> lista = findByQuery(sql);

		if (lista != null && !lista.isEmpty()) {
			return lista.get(0);
		}
		return null;

	}

	@Override
	public void saveUser(User user) throws Exception {
		save(user);

	}

}
