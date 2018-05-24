package adHoc;

import java.util.Scanner;

public class Mergulho {
	
	private static Scanner scn;
	
	public static void main(String[] args) {
		scn = new Scanner(System.in);
		
		String texto[] = scn.nextLine().split(" ");
		
		while (!texto[0].equals("EOF")) {
			int mergulhou = Integer.parseInt(texto[0]);
			int retornou = Integer.parseInt(texto[1]);
			
			texto = scn.nextLine().split(" ");
			
			boolean voltou[] = new boolean[mergulhou];
			
			if (mergulhou == retornou) {
				System.out.println("*");
			} else {
				for (int i = 0; i < retornou; i++) {
					int id = Integer.parseInt(texto[i]);
					
					voltou[id - 1] = true;
				}
				
				for (int i = 0; i < voltou.length; i++) {
					if (voltou[i] == false) {
						System.out.print((i+1) + " ");
					}
				}
				
				System.out.println();
			}
			
			texto = scn.nextLine().split(" ");
		}
		
	}
}
