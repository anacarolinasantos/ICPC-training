//problem link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1087

package adHoc;

import java.util.Scanner;

public class Dama {
	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);

		String text[] = scn.nextLine().split(" ");
		
		int x1 = Integer.parseInt(text[0]);
		int y1 = Integer.parseInt(text[1]);
		int x2 = Integer.parseInt(text[2]);
		int y2 = Integer.parseInt(text[3]);
		
		while (x1 != 0 && x2 != 0 && y1 != 0 && y2 != 0) {
			int moves;
			int difX = x2 - x1;
			int difY = y2 - y1;
			
			if (x1 == x2 && y1 == y2) {
				moves = 0;
			} else if (x1 == x2 || y1 == y2 || (Math.pow(difX, 2) == Math.pow(difY, 2))) {
				moves = 1;
			} else {
				moves = 2;
			}
			
			System.out.println(moves);
			
			text = scn.nextLine().split(" ");
			
			x1 = Integer.parseInt(text[0]);
			y1 = Integer.parseInt(text[1]);
			x2 = Integer.parseInt(text[2]);
			y2 = Integer.parseInt(text[3]);
		}
		
	}
}
