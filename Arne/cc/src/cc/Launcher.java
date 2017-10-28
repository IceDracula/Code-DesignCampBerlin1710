package cc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Launcher  extends JFrame implements ActionListener {

	private JButton start;
	private JButton ende;
	
	
	
	public static void main(String[] args) {
		
		Launcher frame = new Launcher("Men�");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		
		
		frame.setLayout(null);
		frame.setVisible(true);
		

	}
	
	public Launcher(String title){
		
		super(title);
		
		start = new JButton("Spiel starten");
		start.setBounds(120,40,160,40);
		start.addActionListener(this);
		add(start);
		
		ende = new JButton("Ende");
		ende.setBounds(120,280,160,40);
		ende.addActionListener(this);
		add(ende);
		
		
		
	}
	
	
	
	public static void fenster(){
		
		
		JFrame fenster = new JFrame("Game");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(1200,720);
		fenster.setVisible(true);
		fenster.add(new gui());
		
		
		
			
		}
		
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

		if (e.getSource()== start ){
			fenster();	
		}
		
		
		
		if(e.getSource() == ende){
			System.exit(0);
		}
		
	}

}
