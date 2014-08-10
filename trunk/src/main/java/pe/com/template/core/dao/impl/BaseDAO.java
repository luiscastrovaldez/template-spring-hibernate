package pe.com.template.core.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDAO<T> extends HibernateDaoSupport {

	@Autowired
    public BaseDAO(SessionFactory sessionFactory) {
            setSessionFactory(sessionFactory);
    }

    public void save(T object) {
            getHibernateTemplate().save(object);
    }

    public T update(T object) {
            return getHibernateTemplate().merge(object);
    }

    public T findById(Serializable id, Class<T> clazz) {
            return getHibernateTemplate().get(clazz, id);
    }
    
    public List<T> findByCriteria(DetachedCriteria criteria) {
            return getHibernateTemplate().findByCriteria(criteria);
    }

    public List<T> findAll(Class<T> clazz) {
            return getHibernateTemplate().loadAll(clazz);
    }

    public List<T> findByQuery(StringBuilder queryString,Object...params) {
            
            return getHibernateTemplate().find(queryString.toString(),params);
    }
    
    public List<T> findByQuery(StringBuilder queryString) {
            
            return getHibernateTemplate().find(queryString.toString());
    }
    
    public List findByNativeQuery(StringBuilder queryString) {
            Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(queryString.toString());
            return query.list();
    }
}
