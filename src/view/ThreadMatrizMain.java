package view;

import controller.ThreadMatrizController;

public class ThreadMatrizMain {
	public static void main (String[] args) {
		int[][] matriz = new int [3][5];
		int tamanhox = matriz.length;
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = (int) (Math.random() * 100);
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < tamanhox; i++) {
			ThreadMatrizController tCon = new ThreadMatrizController(matriz[i], matriz[0].length, i+1);
			tCon.start();
		}
		
	}
}
