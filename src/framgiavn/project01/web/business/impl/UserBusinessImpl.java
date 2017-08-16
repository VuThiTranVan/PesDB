package framgiavn.project01.web.business.impl;

import org.springframework.beans.factory.annotation.Autowired;

import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.dao.UserDAO;
import framgiavn.project01.web.info.UserInfo;
import framgiavn.project01.web.model.User;

public class UserBusinessImpl implements UserBusiness {

	@Autowired
	public UserDAO userDAO;

	@Override
	public UserInfo findByUserId(Integer user_id) {
		try {
			User u = userDAO.findByUserId(user_id);
			return new UserInfo(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserInfo findByUsername(String username) {
		try {
			User u = userDAO.findByUsername(username);
			return new UserInfo(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserInfo addUser(UserInfo user) {
		// TODO Auto-generated method stub
		try {
			userDAO.addUser(user.toUser());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
		return user;
	}

}