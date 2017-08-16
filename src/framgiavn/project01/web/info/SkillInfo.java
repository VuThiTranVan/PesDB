package framgiavn.project01.web.info;

import framgiavn.project01.web.model.Skill;

public class SkillInfo {
	private int skill_id;
	private String name;

	public int getSkill_id() {
		return skill_id;
	}

	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public SkillInfo(Skill s) {
		setSkill_id(s.getSkill_id());
		setName(s.getName());
	}
}
