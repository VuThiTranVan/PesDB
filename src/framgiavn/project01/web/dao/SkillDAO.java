package framgiavn.project01.web.dao;

import framgiavn.project01.web.model.Skill;

public interface SkillDAO {
	public Skill findSkillByName(String name);
	public Skill findSkillById(Integer id);
}
