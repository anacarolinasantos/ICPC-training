package graphTests;

public class DemoGraph {
	public static void main(String[] args){
        Graph graph = new Graph();
        
        //initialize some vertices and add them to the graph
        Vertex[] vertices = new Vertex[5];
        for(int i = 0; i < vertices.length; i++){
            vertices[i] = new Vertex("" + i);
            graph.addVertex(vertices[i], true);
        }
        
        //illustrate the fact that duplicate edges aren't added
        for(int i = 0; i < vertices.length - 1; i++){
            for(int j = i + 1; j < vertices.length; j++){
               graph.addEdge(vertices[i], vertices[j]);
               graph.addEdge(vertices[i], vertices[j]);
               graph.addEdge(vertices[j], vertices[i]);
            }
        }
        
        //display the initial setup- all vertices adjacent to each other
        for(int i = 0; i < vertices.length; i++){
            System.out.println(vertices[i]);
            
            for(int j = 0; j < vertices[i].getNeighborCount(); j++){
                System.out.println(vertices[i].getNeighbor(j));
            }
            
            System.out.println();
        }
        
        if (graph.isConnected()) {
        		System.out.println("sim");
        } else {
        		System.out.println("nao");
        }
        
    }
}