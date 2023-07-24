package HouseOfTheDragon;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class IronThrone extends Monarch {
	private static String announcement = "Ruler of the Seven Kingdoms, of the Andals, the Rhoynar, and the First Men. "
			+ "Protector of the Realm. ";
	@Override
	public boolean succession(Human successor, String title) {
		if ((seated.isDead() || seated == null) && title == this.getName()) {
			seated = successor;
			return true;
		}
		return false;
	}
	public String getAnnouncement() {
		return announcement;
	}
}
