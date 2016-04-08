package com.quangnn.ui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class GUI  extends JFrame {
	private MyContainer container;
	private static final int WIDTH = 700;
	private static final int HIGHT = 600;
	public GUI(){
		initGUI();
		initComps();
		addComps();
		
	}

	private void initComps() {
		// menu= new MenuGamePanel();
		container =new MyContainer();
	}

	private void addComps() {
		//this.add(menu);
		this.add(container);
	}

	private void initGUI() {
		setTitle("Co Caro");
		setLayout(new CardLayout());
		setSize(WIDTH, HIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
