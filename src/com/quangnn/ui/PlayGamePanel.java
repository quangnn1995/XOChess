package com.quangnn.ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PlayGamePanel extends JPanel implements ActionListener{
	BanCo banCo;
	QuanCo quanCo;
	Graphics2D g;
	private MenuGamePanel menu;
	private int x,y;
	private JButton btExit;
	private JButton btNewGame;
	
	
	
	public PlayGamePanel(){
		
		
		
		initPlayGamePanel();
		initComps();
		addComps();
	}

	private void initComps() {
		banCo= new BanCo();
		btExit =new JButton("Home");
		btExit.setBounds(600, 50, 100, 50);
		btExit.setBackground(Color.RED);
		btExit.setForeground(Color.YELLOW);
		btExit.addActionListener(this);
		
		btNewGame = new JButton("New Game");
		btNewGame.setBounds(600, 450, 100, 50);
		btNewGame.setBackground(Color.RED);
		btNewGame.setForeground(Color.YELLOW);
		btNewGame.addActionListener(this);
		addMouseListener(mouse);
		banCo.veBanCoTrang(g);
	}

	private void addComps() {
		this.add(btExit);
		this.add(btNewGame);
	}

	private void initPlayGamePanel() {
		setLayout(null);
		setBackground(Color.WHITE);
		setLocation(0, 0);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		this.g = g2d;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.BLUE);
		for (int i = 0; i <= 600; i+=30) {
			g2d.drawLine(0, i, 600, i);
			g2d.drawLine(i, 0, i, 600);
		}
		
		banCo.veQuan(g2d);
		
	}
	
	MouseAdapter mouse =new MouseAdapter() {

		@Override
		public void mousePressed(MouseEvent paramMouseEvent) {
			super.mousePressed(paramMouseEvent);
			x=paramMouseEvent.getX();
			y=paramMouseEvent.getY();
			if (banCo.kiemTraTonTai(x, y)==false) {
				banCo.setLuotDi();
				banCo.themQuanCo(x, y);
				repaint();
				banCo.kiemTraChienThang();
				
			}
		}
		
	};

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btExit)){
			menu.setVisible(true);
			PlayGamePanel.this.setVisible(false);
		}else if(e.getSource().equals(btNewGame)){
			banCo.veBanCoTrang(g);
			repaint();
		}
	}

	public void setMenuGamePanel(MenuGamePanel menu) {
		this.menu=menu;
	}

		
	
}
