package HouseOfTheDragon;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class CommonSteel extends Artifact {
	public CommonSteel(int care) {
		this.setResistance(care);
	}
	
	public CommonSteel() {
	}
}
