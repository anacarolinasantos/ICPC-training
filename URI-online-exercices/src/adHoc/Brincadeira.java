package adHoc;

import java.util.Scanner;

public class Brincadeira {
	
	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		
		int N;
		
		N = Integer.parseInt(scn.nextLine());
		
		while (N != 0) {
			int maria = 0;
			int joao = 0;
			int v[] = new int[N];
			
			String text[] = scn.nextLine().split(" ");
			
			for (int i = 0; i < v.length; i++) {
				v[i] = Integer.parseInt(text[i]);
				if (v[i] == 0) {
					maria += 1;
				} else {
					joao += 1;
				}
			}
			
			System.out.println("Mary won " + maria + " times and John won " + joao + " times");
			
			N = Integer.parseInt(scn.nextLine());
		}
	}
}
