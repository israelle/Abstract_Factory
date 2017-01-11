import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;

public class FabriqueConcrete2 implements FabriqueAbstraite {

	private JButton jb ;

	public FabriqueConcrete2(){
		creationBouton();
	}
	@Override
	public void creationBouton() {
		// TODO Auto-generated method stub
		jb = new JButton("fc2");
		jb.setBackground(Color.YELLOW);
	}
	public JButton getJb() {
		return jb;
	}
	public void setJb(JButton jb) {
		this.jb = jb;
	}
	



	

}
