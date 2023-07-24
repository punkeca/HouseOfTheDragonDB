package HouseOfTheDragonSwing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import HouseOfTheDragon.Dothraki;
import HouseOfTheDragon.Dragon;
import HouseOfTheDragon.House;
import HouseOfTheDragon.Human;
import HouseOfTheDragon.Targaryen;
import HouseOfTheDragon.Valyrian;
import HouseOfTheDragon.Velaryon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;

public class InsertHumanForm extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
					InsertHumanForm frame = new InsertHumanForm();
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
	public InsertHumanForm() {
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
		btnDeadY.setBounds(99, 176, 50, 21);
		contentPane.add(btnDeadY);
		
		JRadioButton btnDeadN = new JRadioButton("No");
		btnDeadN.setBounds(161, 176, 59, 21);
		contentPane.add(btnDeadN);
		
		JRadioButton btnMagicY = new JRadioButton("Yes");
		btnMagicY.setBounds(99, 142, 50, 21);
		contentPane.add(btnMagicY);
		
		JRadioButton btnMagicN = new JRadioButton("No");
		btnMagicN.setBounds(161, 142, 59, 21);
		contentPane.add(btnMagicN);
		
		JRadioButton btnVelaryon = new JRadioButton("Velaryon");
		btnVelaryon.setBounds(318, 165, 83, 21);
		contentPane.add(btnVelaryon);
		
		JRadioButton btnTargaryen = new JRadioButton("Targaryen");
		btnTargaryen.setBounds(456, 165, 101, 21);
		contentPane.add(btnTargaryen);
		
		JSpinner spnInt = new JSpinner();
		spnInt.setBounds(150, 63, 93, 20);
		contentPane.add(spnInt);
		
		JSpinner spnRespect = new JSpinner();
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
		
		JButton applyBtn = new JButton("Apply");
		applyBtn.setBounds(250, 304, 85, 21);
		contentPane.add(applyBtn);
		
		JCheckBox chckbxValyrian = new JCheckBox("Valyrian");
		chckbxValyrian.setBounds(21, 260, 93, 21);
		contentPane.add(chckbxValyrian);
		
		JCheckBox chckbxDothraki = new JCheckBox("Dothraki");
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
		btnDragonY.setBounds(99, 206, 50, 21);
		contentPane.add(btnDragonY);
		
		JRadioButton btnDragonN = new JRadioButton("No");
		btnDragonN.setBounds(161, 206, 59, 21);
		contentPane.add(btnDragonN);
		
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
		
		applyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				House house = null;
				em.getTransaction().begin();
				if(btnTargaryen.isSelected()) {
					house = new Targaryen((Integer)spnHeatRes.getValue(),(
											Integer) spnMadness.getValue());
					
				}
				else if(btnVelaryon.isSelected()){
					house = new Velaryon((Integer)spnFleet.getValue(),
										(Integer)spnSeaSkill.getValue());
				}
				
				human = new Human(house);
				human.baptize(fldName.getText(), human.getHouse());
				human.setDead(btnDeadY.isSelected());
				human.setIntelligence((Integer)spnInt.getValue());
				human.setRespect((Integer)spnRespect.getValue());
				human.setMagic(btnMagicY.isSelected());
				
				if(chckbxDothraki.isSelected()) {
					Dothraki dr = new Dothraki();
					human.getLanguages().add(dr);
					em.persist(dr);
				}
				if(chckbxValyrian.isSelected()) {
					Valyrian v = new Valyrian();
					human.getLanguages().add(v);
					em.persist(v);
				}
				
				if(btnDragonY.isSelected()) {
					dragon = new Dragon();
					human.setDragon(dragon);
					dragon.setName(fldDName.getText());
					dragon.setRage((Integer)spnRage.getValue());
					dragon.setSize((Integer)spnSize.getValue());
					em.persist(dragon);
				}
				
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
				
				
				em.persist(human);
				em.getTransaction().commit();
			}
		});
	}
}
