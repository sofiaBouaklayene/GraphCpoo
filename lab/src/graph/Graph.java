package graph;
public interface Graph{
  public int nbOfVertices();
  public int nbOfEdges();
  public void addVertex(Vertex v1);
  public void addEdge(Vertex v1, Vertex v2, EdgeKind edgekind);
  public boolean isConnected(Vertex v1,Vertex v2);
  public boolean isConnected();
  public Edge[] getEdges(Vertex v1, Vertex v2);
  public Edge[] getEdges();
  public Vertex[] getVertices();
  public Edge[] getNeighborEdges(Vertex v1);
  public String toString();
}