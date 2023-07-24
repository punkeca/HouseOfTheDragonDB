package HouseOfTheDragon;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Dragon extends Being {
	private int size;
	private int rage;

	public Dragon(House h) {
		super(h);
	}
	
	public Dragon() {
	}
	@Override
	public void baptize(String n, House h) {
		this.setHouse(h);
		this.setName(n + " of The " + h.getName());
	}

}
