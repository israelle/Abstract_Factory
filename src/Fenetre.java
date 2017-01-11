import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.*;
public class Fenetre {

	 private Bouton bouton = new Bouton("mon bouton");
	 private JLabel labelChoix = new JLabel("Choisissez votre couleur : ");
	 private String [] item ={"","bleu","jaune" };
	 private JComboBox t = new JComboBox(item);
	 private JPanel theme = new JPanel();
	 FabriqueConcrete1 fc1 =new FabriqueConcrete1();
	 FabriqueConcrete2 fc2=new FabriqueConcrete2();;
	 
	 /*Constructeur*/
	  public Fenetre()
	  {
		  frame();
	  }
	  
	  /**
	   * methode permettant l'affichage d'une fenetre
	   */
	  public void frame (){
		  JFrame jf = new JFrame();
		  jf.setVisible(true);
		  jf.setSize(1000, 1000);
		 
		  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  jf.setLocationRelativeTo(null);

		  JPanel p = new JPanel();
		  p.add(t);
		  jf.add(p);
		  
		    t.setBounds(10, 20, 10, 20);
		    theme.add(labelChoix);
		    theme.add(t);
		    jf.add(theme);
		    
		    /*Gestion du choix selectionné dans la liste deroulante*/
		    t.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e)
		    	{
		    		String s = t.getSelectedItem().toString();//recuperation de la chaine selectionnée
		    		
		    		if (s=="bleu")
		    		{
		    			if (fc2!=null)
		    			{

		    				theme.remove(fc2.getJb());
		    				theme.add(fc1.getJb());
		    			} else {
			    			
		    				theme.add(fc1.getJb());

		    			}
		    		//	theme.remove(fc2.getJb());
		    			//fc1=new FabriqueConcrete1();
		    			fc1.getJb().setBounds(500, 300, 90, 50);
		    			
		    			jf.add(theme);
		    			//jf.add(fc1.getJb());
		    			jf.repaint();
		    			jf.revalidate();
		    		}
		    		
		    		if (s=="jaune")
		    		{
		    			if (fc1!=null){
		    				theme.remove(fc1.getJb());
		    				theme.add(fc2.getJb());
		    			}else{
		    				theme.add(fc2.getJb());
		    			}
		    			//theme.remove(fc1.getJb());
		    			fc2.getJb().setBounds(500, 300, 90, 50);

		    			//theme.add(fc2.getJb());
		    			jf.add(theme);
		    			jf.repaint();
		    			jf.revalidate();
		    		}
		    		
		    	}
		    });
		  
	  }
	  
	  /**
	   * programme principal
	   * @param args
	   */
	  public static void main(String[] args) {
			// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				new Fenetre();
			}
			
		});
		
		

		}
}
