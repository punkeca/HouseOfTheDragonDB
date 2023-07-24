package HouseOfTheDragonSwing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import HouseOfTheDragon.Artifact;
import HouseOfTheDragon.Dothraki;
import HouseOfTheDragon.Dragon;
import HouseOfTheDragon.House;
import HouseOfTheDragon.Human;
import HouseOfTheDragon.Language;
import HouseOfTheDragon.Targaryen;
import HouseOfTheDragon.Valyrian;
import HouseOfTheDragon.Velaryon;
import net.bytebuddy.implementation.HashCodeMethod;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;

public class SearchHumanForm extends JFrame {
	
	private EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("HouseOfTheDragon");
	private EntityManager em = emf.createEntityManager();
	private Human human;
	private Dragon dragon;
	
	private JPanel contentPane;
	private JTextField fldName;
	private JTextField fldDName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchHumanForm frame = new SearchHumanForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchHumanForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel HouseLabel = new JLabel("House:");
		HouseLabel.setBounds(411, 146, 59, 13);
		contentPane.add(HouseLabel);
		
		JLabel NameLabel = new JLabel("Name:");
		NameLabel.setBounds(31, 33, 59, 13);
		contentPane.add(NameLabel);
		
		JLabel IntelligenceLabel = new JLabel("Intelligence:");
		IntelligenceLabel.setBounds(31, 68, 83, 13);
		contentPane.add(IntelligenceLabel);
		
		JLabel RespectLabel = new JLabel("Respect:");
		RespectLabel.setBounds(31, 105, 72, 13);
		contentPane.add(RespectLabel);
		
		JLabel MagicLabel = new JLabel("Magic:");
		MagicLabel.setBounds(31, 148, 59, 13);
		contentPane.add(MagicLabel);
		
		JLabel CharacterLabel = new JLabel("Character");
		CharacterLabel.setBounds(103, 10, 85, 13);
		contentPane.add(CharacterLabel);
		
		JLabel DragonLabel = new JLabel("Dragon");
		DragonLabel.setBounds(411, 10, 86, 13);
		contentPane.add(DragonLabel);
		
		JLabel lblLanguage = new JLabel("Language:");
		lblLanguage.setBounds(102, 237, 86, 13);
		contentPane.add(lblLanguage);
		
		fldName = new JTextField();
		fldName.setBounds(117, 28, 126, 19);
		contentPane.add(fldName);
		fldName.setColumns(10);
		
		JLabel DNameLabel = new JLabel("Name:");
		DNameLabel.setBounds(318, 31, 45, 13);
		contentPane.add(DNameLabel);
		
		JLabel RageLabel = new JLabel("Rage:");
		RageLabel.setBounds(318, 103, 45, 13);
		contentPane.add(RageLabel);
		
		JLabel SizeLabel = new JLabel("Size:");
		SizeLabel.setBounds(318, 66, 45, 13);
		contentPane.add(SizeLabel);
		
		fldDName = new JTextField();
		fldDName.setEnabled(false);
		fldDName.setColumns(10);
		fldDName.setBounds(383, 28, 134, 19);
		contentPane.add(fldDName);
		
		JLabel lblFleet = new JLabel("Fleet:");
		lblFleet.setBounds(318, 206, 45, 13);
		contentPane.add(lblFleet);
		
		JLabel lblSeaSkill = new JLabel("Sea Skill:");
		lblSeaSkill.setBounds(307, 240, 59, 13);
		contentPane.add(lblSeaSkill);
		
		JLabel DeadLabel = new JLabel("Dead:");
		DeadLabel.setBounds(31, 182, 59, 13);
		contentPane.add(DeadLabel);
		
		JRadioButton btnDeadY = new JRadioButton("Yes");
		btnDeadY.setEnabled(false);
		btnDeadY.setBounds(99, 176, 50, 21);
		contentPane.add(btnDeadY);
		
		JRadioButton btnDeadN = new JRadioButton("No");
		btnDeadN.setEnabled(false);
		btnDeadN.setBounds(161, 176, 59, 21);
		contentPane.add(btnDeadN);
		
		JRadioButton btnMagicY = new JRadioButton("Yes");
		btnMagicY.setEnabled(false);
		btnMagicY.setBounds(99, 142, 50, 21);
		contentPane.add(btnMagicY);
		
		JRadioButton btnMagicN = new JRadioButton("No");
		btnMagicN.setEnabled(false);
		btnMagicN.setBounds(161, 142, 59, 21);
		contentPane.add(btnMagicN);
		
		JRadioButton btnVelaryon = new JRadioButton("Velaryon");
		btnVelaryon.setEnabled(false);
		btnVelaryon.setBounds(318, 165, 83, 21);
		contentPane.add(btnVelaryon);
		
		JRadioButton btnTargaryen = new JRadioButton("Targaryen");
		btnTargaryen.setEnabled(false);
		btnTargaryen.setBounds(456, 165, 101, 21);
		contentPane.add(btnTargaryen);
		
		JSpinner spnInt = new JSpinner();
		spnInt.setEnabled(false);
		spnInt.setBounds(150, 63, 93, 20);
		contentPane.add(spnInt);
		
		JSpinner spnRespect = new JSpinner();
		spnRespect.setEnabled(false);
		spnRespect.setBounds(150, 100, 93, 20);
		contentPane.add(spnRespect);
		
		JSpinner spnSize = new JSpinner();
		spnSize.setEnabled(false);
		spnSize.setBounds(429, 65, 88, 20);
		contentPane.add(spnSize);
		
		JSpinner spnRage = new JSpinner();
		spnRage.setEnabled(false);
		spnRage.setBounds(429, 102, 88, 20);
		contentPane.add(spnRage);
		
		JSpinner spnFleet = new JSpinner();
		spnFleet.setEnabled(false);
		spnFleet.setBounds(362, 203, 39, 20);
		contentPane.add(spnFleet);
		
		JSpinner spnSeaSkill = new JSpinner();
		spnSeaSkill.setEnabled(false);
		spnSeaSkill.setBounds(362, 237, 39, 20);
		contentPane.add(spnSeaSkill);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(82, 316, 85, 21);
		contentPane.add(btnSearch);
		
		JCheckBox chckbxValyrian = new JCheckBox("Valyrian");
		chckbxValyrian.setEnabled(false);
		chckbxValyrian.setBounds(21, 260, 93, 21);
		contentPane.add(chckbxValyrian);
		
		JCheckBox chckbxDothraki = new JCheckBox("Dothraki");
		chckbxDothraki.setEnabled(false);
		chckbxDothraki.setBounds(150, 260, 93, 21);
		contentPane.add(chckbxDothraki);
		
		JSpinner spnMadness = new JSpinner();
		spnMadness.setEnabled(false);
		spnMadness.setBounds(507, 203, 39, 20);
		contentPane.add(spnMadness);
		
		JSpinner spnHeatRes = new JSpinner();
		spnHeatRes.setEnabled(false);
		spnHeatRes.setBounds(507, 237, 39, 20);
		contentPane.add(spnHeatRes);
		
		JLabel lblMadness = new JLabel("Madness:");
		lblMadness.setBounds(429, 206, 72, 13);
		contentPane.add(lblMadness);
		
		JLabel lblSeaSkill_1 = new JLabel("Heat Resistance:");
		lblSeaSkill_1.setBounds(415, 240, 83, 13);
		contentPane.add(lblSeaSkill_1);
		
		JLabel lblDragonYN = new JLabel("Dragon:");
		lblDragonYN.setBounds(31, 212, 59, 13);
		contentPane.add(lblDragonYN);
		
		JRadioButton btnDragonY = new JRadioButton("Yes");
		btnDragonY.setEnabled(false);
		btnDragonY.setBounds(99, 206, 50, 21);
		contentPane.add(btnDragonY);
		
		JRadioButton btnDragonN = new JRadioButton("No");
		btnDragonN.setEnabled(false);
		btnDragonN.setBounds(161, 206, 59, 21);
		contentPane.add(btnDragonN);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setEnabled(false);
		btnUpdate.setBounds(248, 316, 85, 21);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setEnabled(false);
		btnDelete.setBounds(399, 316, 85, 21);
		contentPane.add(btnDelete);
		
		btnMagicY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMagicN.setSelected(false);
			}
		});
		
		btnMagicN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMagicY.setSelected(false);
			}
		});
		
		btnDeadY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDeadN.setSelected(false);
			}
		});
		
		btnDeadN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDeadY.setSelected(false);
			}
		});
		
		
		
		btnDragonY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDragonN.setSelected(false);
				fldDName.setEnabled(true);
				spnSize.setEnabled(true);
				spnRage.setEnabled(true);
			}
		});
		
		btnDragonN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDragonY.setSelected(false);
				fldDName.setEnabled(false);
				spnSize.setEnabled(false);
				spnRage.setEnabled(false);
			}
		});
		
		btnTargaryen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnVelaryon.setSelected(false);
				spnHeatRes.setEnabled(true);
				spnMadness.setEnabled(true);
				spnFleet.setEnabled(false);
				spnSeaSkill.setEnabled(false);
				
			}
		});
		
		btnVelaryon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTargaryen.setSelected(false);
				spnFleet.setEnabled(true);
				spnSeaSkill.setEnabled(true);
				spnHeatRes.setEnabled(false);
				spnMadness.setEnabled(false);
			}
		});
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				human = em.find(Human.class, fldName.getText());
				
				if(human!=null) {
					spnRespect.setValue(human.getRespect());
					spnInt.setValue(human.getIntelligence());
					btnDeadY.setSelected(human.isDead());
					btnDeadN.setSelected(!human.isDead());
					btnMagicY.setSelected(human.isMagic());
					btnMagicN.setSelected(!human.isMagic());
					
					if(human.getDragon()!= null) {
						btnDragonY.setSelected(true);
						fldDName.setText(human.getDragon().getName());
						spnRage.setValue(human.getDragon().getRage());
						spnSize.setValue(human.getDragon().getSize());
						spnSize.setEnabled(true);
						spnRage.setEnabled(true);
					}else {
						btnDragonY.setSelected(false);
					}
					
					if(human.getHouse() instanceof Targaryen) {
						btnTargaryen.setSelected(true);
						btnVelaryon.setSelected(false);
						Targaryen t = (Targaryen) human.getHouse();
						spnHeatRes.setValue(t.getHeatResistance());
						spnMadness.setValue(t.getMadness());
						spnHeatRes.setEnabled(true);
						spnMadness.setEnabled(true);
						spnFleet.setEnabled(false);
						spnSeaSkill.setEnabled(false);
					}
					else if(human.getHouse() instanceof Velaryon) {
						btnVelaryon.setSelected(true);
						btnTargaryen.setSelected(false);
						Velaryon v = (Velaryon) human.getHouse();
						spnFleet.setValue(v.getFleetSize());
						spnSeaSkill.setValue(v.getSeaSkill()); 
						spnHeatRes.setEnabled(false);
						spnMadness.setEnabled(false);
						spnFleet.setEnabled(true);
						spnSeaSkill.setEnabled(true);
					}else {
						btnTargaryen.setSelected(false);
						btnVelaryon.setSelected(false);
						spnFleet.setEnabled(true);
						spnSeaSkill.setEnabled(true);
						spnFleet.setEnabled(true);
						spnSeaSkill.setEnabled(true);
					}
					
				
					for (Language x:human.getLanguages()) {
						if(x.getName().equals("Dothraki"))chckbxDothraki.setSelected(true);
						if(x.getName().equals("Valyrian"))chckbxValyrian.setSelected(true);
					}
					
					fldName.setEnabled(false); //not allowed to change ID
					btnUpdate.setEnabled(true); 
					btnDelete.setEnabled(true);
					btnDragonY.setEnabled(true);
					btnDragonN.setEnabled(true);
					btnDeadY.setEnabled(true);
					btnDeadN.setEnabled(true);
					btnMagicY.setEnabled(true);
					btnMagicN.setEnabled(true);
					chckbxValyrian.setEnabled(true);
					chckbxDothraki.setEnabled(true);
					spnInt.setEnabled(true);
					spnRespect.setEnabled(true);
				}else {
					JOptionPane.showMessageDialog(null, "This human doesn't exist!");
				}
				
				
			}
		});
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				House house = human.getHouse();
				
				if(btnTargaryen.isSelected()) {
					Targaryen t = (Targaryen) house;
					t.setHeatResistance((Integer)spnHeatRes.getValue());	
					t.setMadness((Integer)spnMadness.getValue());
					
				}
				else if(btnVelaryon.isSelected()){
					Velaryon v = (Velaryon) house;
					v.setFleetSize((Integer)spnFleet.getValue());
					v.setSeaSkill((Integer)spnSeaSkill.getValue());
				}

				human.setDead(btnDeadY.isSelected());
				human.setIntelligence((Integer)spnInt.getValue());
				human.setRespect((Integer)spnRespect.getValue());
				human.setMagic(btnMagicY.isSelected());
				
				//TODO: deal with languages
				boolean speaksDothraki = false;
				boolean speaksValyrian = false;
				
				
				for (Language x:human.getLanguages()) {
					if(x.getName().equals("Dothraki"))speaksDothraki = true;
					if(x.getName().equals("Valyrian"))speaksValyrian = true;
				}
				
				if(chckbxDothraki.isSelected() && !speaksDothraki) 
				{
					Dothraki dr = new Dothraki();
					human.getLanguages().add(dr);
					em.persist(dr);
				}
				else if(!chckbxDothraki.isSelected() && speaksDothraki)
				{
					List<Language> temp = new ArrayList();
					
					for (Language x:human.getLanguages()) {
						if(x.getName().equals("Dothraki")) {
							temp = human.getLanguages();
							human.getLanguages().remove(x);
							human.setLanguages(null);
							em.remove(x);
							break;
						}
						
					}
					human.setLanguages(temp);
					em.merge(human);
				}
				
				
				if(chckbxValyrian.isSelected() && !speaksValyrian)
				{
					Valyrian v = new Valyrian();
					human.getLanguages().add(v);
					em.persist(v);
				}
				else if(!chckbxValyrian.isSelected() && speaksValyrian)
				{
					List<Language> temp = new ArrayList();
					
					for (Language x:human.getLanguages()) {
						if(x.getName().equals("Valyrian")) {
							temp = human.getLanguages();
							human.getLanguages().remove(x);
							human.setLanguages(null);
							em.remove(x);
							break;
						}
						
					}
					human.setLanguages(temp);
					em.merge(human);
				}
				
				if(btnDragonY.isSelected()) {
		
					if(em.find(Dragon.class, fldDName.getText()) == null) //no dragon yet
					{
						dragon = new Dragon();
						dragon.setName(fldDName.getText());
						dragon.setRage((Integer)spnRage.getValue());
						dragon.setSize((Integer)spnSize.getValue());
						human.setDragon(dragon);
						em.persist(dragon);
						
					}
					else //already has a dragon
					{ 
						dragon = human.getDragon();
						fldDName.setEnabled(false); //not allowed to change ID
						dragon.setRage((Integer)spnRage.getValue());
						dragon.setSize((Integer)spnSize.getValue());
						em.merge(dragon);
					}
				}else {
					dragon = em.find(Dragon.class, fldDName.getText());
					if(dragon != null) {
						human.setDragon(null);
						em.merge(human);
						em.remove(dragon);
					}

				}
				btnUpdate.setEnabled(false);
				btnDelete.setEnabled(false);
				btnTargaryen.setEnabled(false);
				btnVelaryon.setEnabled(false);
				btnDragonY.setEnabled(false);
				btnDragonN.setEnabled(false);
				btnDeadY.setEnabled(false);
				btnDeadN.setEnabled(false);
				btnMagicY.setEnabled(false);
				btnMagicN.setEnabled(false);
				chckbxValyrian.setEnabled(false);
				chckbxDothraki.setEnabled(false);
				spnInt.setEnabled(false);
				spnRespect.setEnabled(false);
				btnSearch.setEnabled(true);
				fldName.setEnabled(true);
				spnHeatRes.setEnabled(false);
				spnFleet.setEnabled(false);
				spnSeaSkill.setEnabled(false);
				spnMadness.setEnabled(false);
				
				fldName.setText("");
				fldDName.setText("");
				spnInt.setValue(0);
				spnRespect.setValue(0);
				spnSize.setValue(0);
				spnRage.setValue(0);
				spnHeatRes.setValue(0);
				spnFleet.setValue(0);
				spnSeaSkill.setValue(0);
				spnMadness.setValue(0);
				
				chckbxValyrian.setSelected(false);
				chckbxDothraki.setSelected(false);
				btnMagicY.setSelected(false);
				btnMagicN.setSelected(false);
				btnDeadY.setSelected(false);
				btnDeadN.setSelected(false);
				btnDragonY.setSelected(false);
				btnDragonN.setSelected(false);
				btnVelaryon.setSelected(false);
				btnTargaryen.setSelected(false);
				
				
				em.getTransaction().begin();
				em.merge(human);
				em.getTransaction().commit();
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnUpdate.setEnabled(false);
				btnDelete.setEnabled(false);
				btnTargaryen.setEnabled(false);
				btnVelaryon.setEnabled(false);
				btnDragonY.setEnabled(false);
				btnDragonN.setEnabled(false);
				btnDeadY.setEnabled(false);
				btnDeadN.setEnabled(false);
				btnMagicY.setEnabled(false);
				btnMagicN.setEnabled(false);
				chckbxValyrian.setEnabled(false);
				chckbxDothraki.setEnabled(false);
				spnInt.setEnabled(false);
				spnRespect.setEnabled(false);
				btnSearch.setEnabled(true);
				fldName.setEnabled(true);
				fldDName.setEnabled(true);
				spnSize.setEnabled(false);
				spnRage.setEnabled(false);
				spnHeatRes.setEnabled(false);
				spnFleet.setEnabled(false);
				spnSeaSkill.setEnabled(false);
				spnMadness.setEnabled(false);
				
				fldName.setText("");
				fldDName.setText("");
				spnInt.setValue(0);
				spnRespect.setValue(0);
				spnSize.setValue(0);
				spnRage.setValue(0);
				spnHeatRes.setValue(0);
				spnFleet.setValue(0);
				spnSeaSkill.setValue(0);
				spnMadness.setValue(0);
				
				chckbxValyrian.setSelected(false);
				chckbxDothraki.setSelected(false);
				btnMagicY.setSelected(false);
				btnMagicN.setSelected(false);
				btnDeadY.setSelected(false);
				btnDeadN.setSelected(false);
				btnDragonY.setSelected(false);
				btnDragonN.setSelected(false);
				btnVelaryon.setSelected(false);
				btnTargaryen.setSelected(false);
				

				
				em.getTransaction().begin();
				em.remove(human);
				em.getTransaction().commit();
			}
			
		});
	}
}
