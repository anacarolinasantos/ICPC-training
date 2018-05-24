package graphTests;

public class DemoGraph {
	public static void main(String[] args){
		GraphMatrix g = new GraphMatrix(5);
		
		g.insertA(1, 1);
		g.insertA(1, 2);
		g.show();
	}
}
