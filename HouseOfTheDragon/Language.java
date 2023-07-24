package HouseOfTheDragon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public abstract class Language {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private int code;
	private String name;
	private int complexity;
	private String origin;
	
	public abstract int benefit();
}
