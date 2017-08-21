package framgiavn.project01.web.info;
import java.util.ArrayList;
import java.util.HashMap;

import framgiavn.project01.web.model.Player;

public class PlayerInfo {
	public String name;
	public int age;
	public String nationality;
	public String region;
	public int height;
	public int weight;
	public int strongFoot;
	public ArrayList<String> position;
	public HashMap abilities;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getStrongFoot() {
		return strongFoot;
	}
	public void setStrongFoot(int strongFoot) {
		this.strongFoot = strongFoot;
	}
	public ArrayList<String> getPosition() {
		return position;
	}
	public void setPosition(ArrayList<String> position) {
		this.position = position;
	}
	public HashMap getAbilities() {
		return abilities;
	}
	public void setAbilities(HashMap abilities) {
		this.abilities = abilities;
	}
	
	public PlayerInfo(Player p) {
		setAbilities(p.getAbilities());
		setAge(p.getAge());
		setHeight(p.getHeight());
		setName(p.getName());
		setNationality(p.getNationality());
		setPosition(p.getPosition());
		setRegion(p.getRegion());
		setStrongFoot(p.getStrongFoot());
		setWeight(p.getWeight());
	}
	
	public Player toPlayer() {
		Player p = new Player();
		p.setAbilities(getAbilities());
		p.setAge(getAge());
		p.setHeight(getHeight());
		p.setName(getName());
		p.setNationality(getNationality());
		p.setPosition(getPosition());
		p.setRegion(getRegion());
		p.setStrongFoot(getStrongFoot());
		p.setWeight(getWeight());
		return p;
	}
	
}