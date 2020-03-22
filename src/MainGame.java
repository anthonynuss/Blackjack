import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField; 

public class MainGame {
    
	private static int var = 100;
	private static JFrame frame;
	private static JPanel panel;
	public static void main(String[] args) {    
        // Creating instance of JFrame
        frame = new JFrame("Blackjack by Tony Nuss");
        // Setting the width and height of frame
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.GREEN);
        /* Creating panel. This is same as a div tag in HTML
         * We can create several panels and add them to specific 
         * positions in a JFrame. Inside panels we can add text 
         * fields, buttons and other components.
         */
        panel = new JPanel();    
        // adding panel to frame
        frame.add(panel);
        /* calling user defined method for adding components
         * to the panel.
         */
        panel.setBackground(Color.GREEN);
        placeComponents(panel);

        // Setting the frame visibility to true
        frame.setVisible(true);
        
    
        
    }
	private static void placeComponents(JPanel panel) {
		Random rand = new Random();
		
		String num = Integer.toString(rand.nextInt(10)+1);
		String num2 = Integer.toString(rand.nextInt(10)+1);
		panel.setLayout(null);
		
		JLabel blackJackTitle = new JLabel("BLACKJACK");
		blackJackTitle.setBounds(500, 20, 300, 100);
		blackJackTitle.setFont(new Font("Calibri", Font.BOLD, 50));
		panel.add(blackJackTitle);
		
		JLabel cardNumber = new JLabel(num);
		cardNumber.setBounds(580, 620, 80,25);
		panel.add(cardNumber);
		
		JLabel cardNumberBottom = new JLabel(num);
		cardNumberBottom.setBounds(510,740, 80, 25);
		panel.add(cardNumberBottom);
		
		JButton cardButton = new JButton();
		cardButton.setBounds(500,620,100,150);
		cardButton.setActionCommand("click");
		cardButton.addActionListener(new Action());
		panel.add(cardButton);
		
		JLabel card2Number = new JLabel(num2);
		card2Number.setBounds(680, 620, 80,25);
		panel.add(card2Number);
		
		JLabel card2NumberBottom = new JLabel(num2);
		card2NumberBottom.setBounds(610,740, 80, 25);
		panel.add(card2NumberBottom);
		
		JButton card2Button = new JButton();
		card2Button.setBounds(600,620,100,150);
		card2Button.setActionCommand("click");
		card2Button.addActionListener(new Action());
		panel.add(card2Button);
		
		JLabel cardSuit = new JLabel();
		cardSuit.setIcon(new ImageIcon("C:\\Users\\tonynuss\\Downloads\\Card_heart.png"));
		cardSuit.setBounds(300, 620, 80,25);
		panel.add(cardSuit);
		
		   
	  	  
	}
	
	private static void newCard(JPanel panel) {
		Random rand = new Random();
		String num = Integer.toString(rand.nextInt(10)+1);
		
		JLabel cardNumber = new JLabel(num);
		cardNumber.setBounds(680+var, 620, 80,25);
		panel.add(cardNumber);
		
		JLabel cardNumberBottom = new JLabel(num);
		cardNumberBottom.setBounds(610+var,740, 80, 25);
		panel.add(cardNumberBottom);
		
		JButton cardButton = new JButton();
		cardButton.setBounds(600+var,620,100,150);
		cardButton.setActionCommand("click");
		cardButton.addActionListener(new Action());
		panel.add(cardButton);
		var += 100;
		
	}
	static class Action implements ActionListener{     
		public void actionPerformed(ActionEvent e) {
			
			//        	 JFrame frame2 = new JFrame("clicked");
//        	 frame2.setVisible(true);
//        	 frame2.setSize(200,200);
			newCard(panel);
			panel.repaint();
		}
	}
        
             

}