package framgiavn.project01.web.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import framgiavn.project01.web.dao.SkillDAO;
import framgiavn.project01.web.model.Skill;
import framgiavn.project01.web.ulti.DAOSessionFactory;
import framgiavn.project01.web.ulti.Logit2;

public class SkillDAOImpl extends DAOSessionFactory implements SkillDAO{

	private static final Logit2 log = Logit2.getInstance(UserDAOImpl.class);
	
	@Override
	public Skill findSkillByName(String name) {
		// TODO Auto-generated method stub
		String sql = "Select * from User where User.name = ?";
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = null;
		Skill result = null;
		try {
			tx = session.beginTransaction();
			result = (Skill)session.createQuery(sql)
					.setString(0, name)
					.uniqueResult();
			
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;	
	}

	@Override
	public Skill findSkillById(Integer id) {
		// TODO Auto-generated method stub
		String sql = "Select * from Skill where Skill.skill_id = ?";
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = null;
		Skill result = null;
		try {
			tx = session.beginTransaction();
			result = (Skill)session.createQuery(sql)
					.setParameter(0, id)
					.uniqueResult();
			
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return result;
	}

}
