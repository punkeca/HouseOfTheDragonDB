package HouseOfTheDragon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public abstract class Artifact {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code;
	private int resistance;
	private String type;
}
