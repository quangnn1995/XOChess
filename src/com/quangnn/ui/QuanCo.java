package com.quangnn.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class QuanCo {
	private static final int TYPEO=0;
	private static final int TYPEX=1;
	private Font font = new Font("Tahoma", Font.BOLD, 24);
	
	private int x,y,type;
	
	
	public QuanCo(int x, int y,int type) {
		super();
		this.x = x;
		this.y = y;
		this.type=type;
	}


	public void draw(Graphics2D g){
		if(type==TYPEO){
			g.setFont(font);
			g.setColor(Color.GREEN);
			g.drawString("O", x, y);
		}else{
			g.setFont(font);
			g.setColor(Color.RED);
			g.drawString("X", x, y);
		}
	}


	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}

	
}
