//problem link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1437

package adHoc;

import java.util.Scanner;

public class EsquerdaVolver {

	private static Scanner scn;
	
	public enum coordenada {
		N, L, S, O;
	}
	
	public static void main(String[] args) {
		scn = new Scanner(System.in);
		
		int N = Integer.parseInt(scn.nextLine());
		
		while (N != 0) {
			coordenada direcao = coordenada.N;

			String comandos = scn.nextLine();
			
			for (int i = 0; i < N; i++) {
				if (comandos.charAt(i) == 'D') {
					if (direcao.equals(coordenada.O)) {
						direcao = coordenada.N;
					} else {
						direcao = coordenada.values()[direcao.ordinal() + 1];
					}
				} else {
					if (direcao.equals(coordenada.N)) {
						direcao = coordenada.O;
					} else {
						direcao = coordenada.values()[direcao.ordinal() - 1];
					}
				}
			}
			
			System.out.println(direcao);
			
			N = Integer.parseInt(scn.nextLine());
		}
	}
}
