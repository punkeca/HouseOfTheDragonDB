package HouseOfTheDragon;

import javax.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class ValyrianSteel extends Artifact {
	private String name;
	private int enchantment;
	public ValyrianSteel(){

	}
	public ValyrianSteel(int care){
		this.enchantment = care;
		this.setResistance(care*1000);
	}
}
