//problem link: http://br.spoj.com/problems/OBIDOMIN/

package grafos;

import java.util.Scanner;

public class Domino {
	private static Scanner scn;
	
	public static void main(String[] args) {
		scn = new Scanner(System.in);

		GraphMatrix g = new GraphMatrix(7);
		
		int N = Integer.parseInt(scn.nextLine());
		int num = 1;
		boolean ehPossivel = false;
		
		while (N != 0) {
			for (int i = 0; i < N; i++) {
				String[] aresta = scn.nextLine().split(" ");
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

class GraphMatrix {
	private int V; 
	private int A; 
	private int adj[][];
	
	// inicializa os atributos da classe e cria a matriz de adjac�ncia para V v�rtices
	public GraphMatrix( int V ){
		this.V = V;
		this.A = 0; // zero arestas
		this.adj = new int[V][V];
	}

	// m�todo insere um arco v-w no digrafo. O m�todo sup�e que v e w s�o distintos, positivos e menores que V. 
	// Se o digrafo j� tem arco v-w, o m�todo n�o faz nada. */
	public void insertA( int v, int w) { 
		 if (adj[v][w] == 0) {
			if (v == w) {
				adj[v][w] = 2;
			} else {
				adj[v][w] = 1; 
				adj[w][v] = 1;
			}
			A++;
		}
	}

	// m�todo remove do digrafo o arco que tem ponta inicial v e ponta final w. O m�todo sup�e que v e w s�o distintos, positivos e menores que V. 
	// Se n�o existe arco v-w, m�todo n�o faz nada. */
	public void removeA( int v, int w) { 
		if (adj[v][w] != 0) {
			adj[v][w] = 0; 
			adj[w][v] = 0;
			A--;
		}
	}
	
	// Para cada v�rtice v do digrafo, este metodo imprime, em uma linha, todos os v�rtices adjacentes a v. 
	public void show( ) { 
		int v, w; 
		for (v = 0; v < V; v++) {
			System.out.printf("%2d:",v);
			for (w = 0; w < V; w++)
				if (adj[v][w] != 0) 
					System.out.printf(" %2d", w);
			System.out.printf("\n");
		}
	}
	
	public void bfs(int v) {
		// inicializar um fila F
		Fila fila = new Fila( this.V );
		
		boolean visitados[] = new boolean[this.V];
		visitados[v] = true;
		
		fila.enqueue(v);
		
		while (!fila.isEmpty()) {
			
		}
	}
	
	public boolean[] buscaLargura( int v ){
	      
	      // inicializar um fila F
	      Fila fila = new Fila( this.V );
	      // marcar v como visitado
	      boolean visitados[] = new boolean[this.V];
	      visitados[v] = true;
	    
	      // colocar v na fila F
	      fila.enqueue( v );
	      
	      
	      // enquanto F no vazia faca
	      while( !fila.isEmpty() ){
	        // u = retira um elemento da fila F
	        int u = fila.dequeue();
	        
	        // para Cada vertice w adjacente a u faca
	        No w = adj[u];
	        while( w != null ){
	        
	          // se w nao foi visitado entao
	          if( ! visitados[w.getElem()] ){
	            // marcar w como visitado
	            visitados[w.getElem()] = true;
	            //colocar w na fila F
	            fila.enqueue( w.getElem() );
	          }
	          w = w.getProx();
	        }
	      }
	      return verticesVisitados;

	    }
	    /*
	    * Calcula a distancia usando Busca em Largura
	    * Entrada: um vertice v
	    */
	    public int [] distancia( int v ){
	      
	      // inicializar um fila F
	      Fila fila = new Fila( this.V );
	      // marcar v como visitado
	      boolean visitados[] = new boolean[this.V];
	      visitados[v] = true;
	      // inicializa o vetor de distancia com um numero bem grande MAX_VALUE =  2^31-1
	      int dist[] = new int[V];
	      Arrays.fill(dist, Integer.MAX_VALUE);
	      dist[v] = 0;
	    
	      // colocar v na fila F
	      fila.enqueue( v );
	      
	      
	      // enquanto F no vazia faca
	      while( !fila.isEmpty() ){
	        // u = retira um elemento da fila F
	        int u = fila.dequeue();
	        
	        // para Cada vertice w adjacente a u faca
	        No w = adj[u];
	        while( w != null ){
	        
	          // se w nao foi visitado E a distancia de u ateh w eh do valor armazenado em dist[w]
	          if( ! visitados[w.getElem()] && dist[u]+1 < dist[w.getElem()]){
	            // marcar w como visitado
	            visitados[w.getElem()] = true;
	            // calcular a distancia
	            dist[w.getElem()] = dist[u]+1;
	            //colocar w na fila F
	            fila.enqueue( w.getElem() );
	          }
	          w = w.getProx();
	        }
	      }
	      return dist;

	    }
}

class No{
	private int elem;
	private No prox;
	public No( int elem, No prox){
		this.elem = elem;
		this.prox = prox;
	}

        public int getElem() {
            return elem;
        }

        public void setProx(No prox) {
            this.prox = prox;
        }

        public No getProx() {
            return prox;
        }
}

class Fila{
  private int elementos[];
  private int first, last;
  
  public Fila(int N){
    elementos = new int[N];
    first = last = 0;
  }
  public void enqueue( int E ){
      elementos[last++] = E;  
  }
  public int dequeue(){
      return elementos[first++];
  }
  public boolean isEmpty(){
      return first == last;
  }
  @Override
  public String toString()
  {
	String resp="";
    for( int i = first; i < last;i++)
		resp+= elementos[i]+" ";
	return resp;
  }

}

