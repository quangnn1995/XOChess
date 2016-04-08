package com.quangnn.ui;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class MyContainer extends JPanel {
	private MenuGamePanel menu;
	private PlayGamePanel play;
	private  CardLayout mCard;
	public static final String MENU_ID="KEY_MENU";
	public static final String PLAY_ID="KEY_PLAY";
	public MyContainer(){
		initContainer();
		initComps();
		addComps();
	}

	private void addComps() {
		this.add(menu,MENU_ID);
		this.add(play,PLAY_ID);
	}

	private void initComps() {
		menu =new MenuGamePanel();
		play=new PlayGamePanel();
		//menu.setPlayGamePanel(play);
		
		menu.setCard(mCard);
		play.setMenuGamePanel(menu);
	}

	private void initContainer() {
		 mCard = new CardLayout();
		setLayout(mCard);
	}
	
}
