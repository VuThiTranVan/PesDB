package framgiavn.project01.web.business.impl;

import framgiavn.project01.web.business.SkillBusiness;
import framgiavn.project01.web.dao.SkillDAO;
import framgiavn.project01.web.info.SkillInfo;
import framgiavn.project01.web.model.Skill;


public class SkillBusinessImpl implements SkillBusiness{

	private SkillDAO skillDAO;
	
	public SkillDAO getSkillDAO() {
		return skillDAO;
	}

	public void setSkillDAO(SkillDAO skillDAO) {
		this.skillDAO = skillDAO;
	}

	@Override
	public SkillInfo findSkillByName(String name) {
		try {
			Skill s = getSkillDAO().findSkillByName(name);
			return new SkillInfo(s);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public SkillInfo findSkillById(Integer id) {
		try {
			Skill s = getSkillDAO().findSkillById(id);
			return new SkillInfo(s);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
