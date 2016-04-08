package com.quangnn.ui;

import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BanCo {
	private QuanCo quanco;
	private NguoiChoi nguoix = new NguoiChoi();
	private NguoiChoi nguoio = new NguoiChoi();
	private int luotDi = 0;
	private int arrBanCo[][] = new int[20][20];
	private static final int SIZE_CELL_CHESS = 30;

	public void veQuan(Graphics2D g) {
		nguoio.veQuan(g);
		nguoix.veQuan(g);

	}

	public boolean kiemTraTonTai(int x, int y) {
		int i = x / SIZE_CELL_CHESS;
		int j = y / SIZE_CELL_CHESS;
		if (arrBanCo[i][j] == 1 || arrBanCo[i][j] == 2) {
			return true;
		}
		return false;
	}

	public void veBanCoTrang(Graphics2D g) {
		nguoio.getArrQuanCo().clear();
		nguoix.getArrQuanCo().clear();
		veQuan(g);
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				arrBanCo[i][j] = 0;
			}
		}
		
	}

	public void themQuanCo(int x, int y) {
		int i = x / 30;
		int j = y / 30;
		if (kiemTraTonTai(x, y) == false) {
			arrBanCo.toString();
			if (getLuotDi() % 2 == 0) {
				arrBanCo[i][j] = 1;
				quanco = new QuanCo(i * 30 + 7, j * 30 + 25, 0);
				nguoio.themQuan(quanco);
			} else {
				arrBanCo[i][j] = 2;
				quanco = new QuanCo(i * 30 + 7, j * 30 + 25, 1);
				nguoix.themQuan(quanco);
			}
		}

	}

	public void kiemTraChienThang() {
		try {
			for (int h = 0; h < 20; h++) {
				for (int k = 0; k < 20; k++) {
					// check doc
					if (arrBanCo[h][k] == 1 && arrBanCo[h][k + 1] == 1
							&& arrBanCo[h][k + 2] == 1
							&& arrBanCo[h][k + 3] == 1
							&& arrBanCo[h][k + 4] == 1) {
						JOptionPane.showMessageDialog(null, "nguoi O thang");
					}
					if (arrBanCo[h][k] == 2 && arrBanCo[h][k + 1] == 2
							&& arrBanCo[h][k + 2] == 2
							&& arrBanCo[h][k + 3] == 2
							&& arrBanCo[h][k + 4] == 2) {
						JOptionPane.showMessageDialog(null, "nguoi X thang");
					}
					// check ngang
					if (arrBanCo[h][k] == 1 && arrBanCo[h + 1][k] == 1
							&& arrBanCo[h + 2][k] == 1
							&& arrBanCo[h + 3][k] == 1
							&& arrBanCo[h + 4][k] == 1) {
						JOptionPane.showMessageDialog(null, "nguoi O thang");
					}
					if (arrBanCo[h][k] == 2 && arrBanCo[h + 1][k] == 2
							&& arrBanCo[h + 2][k] == 2
							&& arrBanCo[h + 3][k] == 2
							&& arrBanCo[h + 4][k] == 2) {
						JOptionPane.showMessageDialog(null, "nguoi X thang");
					}
					// check cheo
					if (arrBanCo[h][k] == 1 && arrBanCo[h + 1][k + 1] == 1
							&& arrBanCo[h + 2][k + 2] == 1
							&& arrBanCo[h + 3][k + 3] == 1
							&& arrBanCo[h + 4][k + 4] == 1) {
						JOptionPane.showMessageDialog(null, "nguoi O thang");
					}
					if (arrBanCo[h][k] == 2 && arrBanCo[h + 1][k + 1] == 2
							&& arrBanCo[h + 2][k + 2] == 2
							&& arrBanCo[h + 3][k + 3] == 2
							&& arrBanCo[h + 4][k + 4] == 2) {
						JOptionPane.showMessageDialog(null, "nguoi X thang");
					}
					if (arrBanCo[h][k] == 1 && arrBanCo[h - 1][k + 1] == 1
							&& arrBanCo[h - 2][k + 2] == 1
							&& arrBanCo[h - 3][k + 3] == 1
							&& arrBanCo[h - 4][k + 4] == 1) {
						JOptionPane.showMessageDialog(null, "nguoi O thang");
					}
					if (arrBanCo[h][k] == 2 && arrBanCo[h - 1][k + 1] == 2
							&& arrBanCo[h - 2][k + 2] == 2
							&& arrBanCo[h - 3][k + 3] == 2
							&& arrBanCo[h - 4][k + 4] == 2) {
						JOptionPane.showMessageDialog(null, "nguoi X thang");
					}
				}
			}

		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}

	}

	public int getLuotDi() {
		return luotDi;
	}

	public void setLuotDi() {
		this.luotDi += 1;
	}

}
