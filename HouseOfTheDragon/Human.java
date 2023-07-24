package HouseOfTheDragon;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Human extends Being {
	@OneToMany
	private List<Language> languages = new ArrayList<Language>();
	@OneToMany
	private List<Artifact> items = new ArrayList<Artifact>();
	@OneToOne
	private Human spouse;
	@OneToOne
	private Dragon dragon;
	private boolean dead;
	private int intelligence;
	private int respect;
	private boolean magic;
	public Human(){
	}
	public Human(House h){
		super(h);
	}
	@Override
	public void baptize(String n, House h) {
		this.setHouse(h);
		String lastName;
		if(this.getHouse()!= null)
			lastName = this.getHouse().getName();
		else
			lastName = "The Bastard";
		this.setName(n + " " + lastName);
	}
		
	public boolean tameDragon(Dragon d) {
		int dragonResistance = d.getRage()* d.getSize();
		int humanInfluence = intelligence * respect;
		if(dragonResistance > humanInfluence) {
			this.dragon = d;
		}
		return false;
	}
		
	public void learnLanguage(Language l){
		languages.add(l);
		respect += l.benefit();
		intelligence += l.benefit();
	}
		
	public void acquireItem(Artifact a){
		items.add(a);
	}

}
