package framgiavn.project01.web.business;

import framgiavn.project01.web.info.SkillInfo;

public interface SkillBusiness {
	SkillInfo findSkillByName(String name);
	SkillInfo findSkillById(Integer id);
}
