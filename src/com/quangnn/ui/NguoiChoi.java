package com.quangnn.ui;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class NguoiChoi {
	private ArrayList<QuanCo> arrQuanCo =new ArrayList<QuanCo>();
	
	public void themQuan(QuanCo quan){
		arrQuanCo.add(quan);
	}
	
	public void veQuan(Graphics2D g){
		for ( QuanCo co : arrQuanCo ) {
			co.draw(g);
		}
	}

	public ArrayList<QuanCo> getArrQuanCo() {
		return arrQuanCo;
	}

	
	
}
