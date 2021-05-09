package graph;
public class UndirectedEdge extends Edge{
  public UndirectedEdge(int id, String color, Vertex[] ends, double value){
    super(id,color,ends,value);
  }
  public Vertex[] getEnds(){
    return super.getEnds();
  }

  public String toString(){
    return super.toString();
  }
}