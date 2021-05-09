package graph;
import graph.*;

public class TestGraphImpl{
  public static void main(String[] args){
    IncidenceArrayGraph G = new IncidenceArrayGraph(3);
    
    Vertex v1 = new Vertex(0, "impl1", "red");
    Vertex v2 = new Vertex(1, "impl2", "blue");
    Vertex v3 = new Vertex(2, "impl3", "yellow");

    G.addVertex(v1);
    G.addVertex(v2);
    G.addVertex(v3);
    G.addEdge(v1, v2, EdgeKind.undirected);
    G.addEdge(v1, v3, EdgeKind.undirected);

    System.out.println(v1);
    System.out.println(v2);
    System.out.println(v3);
    System.out.println(" v1 and v3 are connected?  : " + G.isConnected(v1,v3));
    System.out.println(" v2 and v3 are connected?  : " + G.isConnected(v2,v3));

    Edge[] E = G.getEdges(v1, v2);
    
    System.out.println("number of vertices : " + G.nbOfVertices());
    System.out.println("number of Edges : " + G.nbOfEdges());
    if(E.length > 0){
      System.out.println("\nThere is edge between v1 and v2\n");
    }
    else {
      System.out.println("\nThere is no edge between v1 and v2");
    }
    System.out.println("\nGraph connected ? : " + G.isConnected() );
    
  }
}