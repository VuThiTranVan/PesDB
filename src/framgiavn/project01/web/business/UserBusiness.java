package framgiavn.project01.web.business;

import framgiavn.project01.web.info.UserInfo;
import framgiavn.project01.web.model.User;

public interface UserBusiness {
	UserInfo findByUserId(Integer user_id);

	UserInfo findByUsername(String username);
	
	UserInfo addUser(UserInfo user);
}