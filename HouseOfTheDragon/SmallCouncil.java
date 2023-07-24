package HouseOfTheDragon;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Entity
@Data
public class SmallCouncil extends Authority {
	public void notifyDeath(Human successor, String title) {
	 for (Monarch x : this.getTitles()) {
		 x.succession(successor, title);
	 }
	}

}
