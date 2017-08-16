package framgiavn.project01.web.action;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.info.UserInfo;
import framgiavn.project01.web.model.User;
import framgiavn.project01.web.ulti.Logit2;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private Logit2 log = Logit2.getInstance(UserAction.class);

	@Autowired
	private UserBusiness userBusiness;	
	@Autowired
	private UserInfo userBean;
	
	private ArrayList<UserInfo> users;

	public String findByUserId() {
		userBean = userBusiness.findByUserId(userBean.getUser_id());
		return SUCCESS;
	}

	public String findByUsername() {
		userBean = userBusiness.findByUsername(userBean.getUsername());
		return SUCCESS;
	}
	
	public String addUser() {
		UserInfo userInfo = userBusiness.addUser(userBean);
		if(userInfo != null) return SUCCESS;
		else return ERROR;
	}

	public String homePage() {
		log.info("#####################################");
		return SUCCESS;
	}

}