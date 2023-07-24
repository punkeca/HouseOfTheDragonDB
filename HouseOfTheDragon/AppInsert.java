package HouseOfTheDragon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppInsert {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HouseOfTheDragon");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		//initial declarations
		House targaryen = new Targaryen(80,25);
		House velaryon = new Velaryon(80,25);
		Human rhaenyra = new Human(targaryen);
		Dragon syrax = new Dragon(targaryen);
		IronThrone ironThrone = new IronThrone();
		SmallCouncil sm = new SmallCouncil();
		
		rhaenyra.setIntelligence(100);
		rhaenyra.setRespect(100);
		rhaenyra.setBirthdate("97 a.C"); //a.C after Aegon's conquest
		rhaenyra.baptize("Rhaenyra", targaryen);
		
		//creating languages for Rhaenyra
		Valyrian v = new Valyrian();
		v.setVariation("HighValyrian");
		v.setDragonCharm(100);
		
		Dothraki d = new Dothraki();
		d.setAgression(90);
		d.setHorseCharm(90);
		
		rhaenyra.learnLanguage(v);
		rhaenyra.learnLanguage(d);
		
		//adding details to Syrax
		syrax.setRage(60);
		syrax.setSize(50);
		syrax.baptize("Syrax", targaryen);
		
		rhaenyra.tameDragon(syrax);
		
		//creating artifacts
		ValyrianSteel vs = new ValyrianSteel(200);
		CommonSteel cs = new CommonSteel(100);
		
		vs.setType("Long Sword");
		vs.setName("Dark Sister Sword");
		
		cs.setType("Dagger");
		
		rhaenyra.acquireItem(cs);
		rhaenyra.acquireItem(vs);
		
		//creating her children
		Human jace = new Human(targaryen);
		Human luke = new Human(targaryen);
		Human joff = new Human(targaryen);
		
		jace.baptize("Jaecerys", velaryon);
		luke.baptize("Lucerys", velaryon);
		joff.baptize("Joffrey", velaryon);
	
		//making Rhaenyra Queen and Warden Of the North
		ironThrone.setName("IronThrone");
		sm.setAllegiance("Blacks");
		sm.notifyDeath(rhaenyra, "IronThrone");
		
		sm.notifyDeath(rhaenyra, "NorthWarden");
		
		
		
		System.out.println("Queen " + rhaenyra.getName() + ", first of her name. ");
		System.out.println(ironThrone.getAnnouncement());
		System.out.println("With her sons, " + jace.getName() + ", " + luke.getName() + " and " + joff.getName()+ ". ");
		System.out.println("And her dragon, " + syrax.getName() + ". ");
		System.out.println("Long live the " + targaryen.getSigil() + ". May " + targaryen.getWords() + " prevail.");
		em.persist(targaryen);
		em.persist(velaryon);
		em.persist(rhaenyra);
		em.persist(syrax);
		em.persist(ironThrone);
		em.persist(sm);
		em.persist(v);
		em.persist(d);
		em.persist(vs);
		em.persist(cs);
		em.persist(jace);
		em.persist(luke);
		em.persist(joff);
		em.getTransaction().commit();
        em.close();
        emf.close();
	}

}
