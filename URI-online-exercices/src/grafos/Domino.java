package grafos;

import java.util.Scanner;

public class Domino {
	
	public static class Vertex {
		
	}
	
	private static Scanner scn;
	
	public static void main(String[] args) {
		scn = new Scanner(System.in);

		int N = Integer.parseInt(scn.nextLine());
		int num = 1;
		boolean ehPossivel = false;
		
		while (N != 0) {
			for (int i = 0; i < N; i++) {
				
			}
			
			System.out.println("Teste " + num);
			if (ehPossivel) {				
				System.out.println("sim");
			} else {
				System.out.println("nao");				
			}
			System.out.println();
			
			num += 1;
		}
	}
}
