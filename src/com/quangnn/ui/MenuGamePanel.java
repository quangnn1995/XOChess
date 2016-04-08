package com.quangnn.ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javafx.scene.control.Menu;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MenuGamePanel extends JPanel implements ActionListener{
	private PlayGamePanel play;
	private CardLayout mCard;
	private JButton btPlay;
	private JButton btOption;
	private JButton btExit;
	public MenuGamePanel(){
		initMenuGamePanel();
		initComps();
		addComps();
	}

	private void initComps() {
		play =new PlayGamePanel();
		
		btPlay= new JButton("Play");
		btPlay.setBounds(300, 275, 100, 50);
		btPlay.setForeground(Color.YELLOW);
		btPlay.setBackground(Color.RED);
		btPlay.addActionListener(this);
		
		btOption=new JButton("Option");
		btOption.setBounds(300, 350, 100, 50);
		btOption.setForeground(Color.YELLOW);
		btOption.setBackground(Color.RED);
		btOption.addActionListener(this);
		
		btExit=new JButton("Exit");
		btExit.setBounds(300, 425, 100, 50);
		btExit.setForeground(Color.YELLOW);
		btExit.setBackground(Color.RED);
		btExit.addActionListener(this);
	}

	private void addComps() {
		this.add(btPlay);
		this.add(btOption);
		this.add(btExit);
		this.add(play);
		
	}

	private void initMenuGamePanel() {
		setLayout(null);
		setLocation(0, 0);
		setBackground(Color.GREEN.darker());
		
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d=(Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		Font font = new Font("Tahoma", Font.BOLD, 50);
		g2d.setFont(font);
		g2d.setColor(Color.YELLOW);
		g2d.drawString("Co CaRo", 250, 150);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btExit)){
			System.exit(0);
		}else if(e.getSource().equals(btPlay)){
			//play.setVisible(true);
			mCard.show(getParent(),MyContainer.PLAY_ID);
			MenuGamePanel.this.setVisible(false);
			getParent().getComponent(1).requestFocus();
		}
	}
	
	public void setPlayGamePanel(PlayGamePanel play){
		this.play = play;
	}

	public void setCard(CardLayout mCard) {
		// TODO Auto-generated method stub
		this.mCard=mCard;
	}

//	@Override
//	public void actionPerformed(ActionEvent paramActionEvent) {
//		btPlay.setVisible(false);
//		this.setLayout(new CardLayout());
//		play.setVisible(true);
//	}
	
	
	
}
