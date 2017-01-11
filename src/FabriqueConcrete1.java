import java.awt.Color;

import javax.swing.JButton;

public class FabriqueConcrete1 implements FabriqueAbstraite {

	private JButton jb ;
	
	public FabriqueConcrete1(){
		creationBouton();
	}
	
	@Override
	public void creationBouton() {
		// TODO Auto-generated method stub
		jb = new JButton("fc1");
		//jb.setBounds(500, 500, 20, 50);
		jb.setBackground(Color.BLUE);
	}

	public JButton getJb() {
		return jb;
	}

	public void setJb(JButton jb) {
		this.jb = jb;
	}





}
