package graph;
public class DirectedEdge extends Edge{
  private int source;
  public DirectedEdge(int id, String color, Vertex[] ends, double value, int source){
      super(id,color,ends,value);
      this.source = source;
  }
  public Vertex getSource(){
    return super.getEnds()[this.source];
  }
  public Vertex getSink(){
    return super.getEnds()[1-this.source];
  }
  public String toString(){
    return super.toString() + ", source =" + source;
  }
}
