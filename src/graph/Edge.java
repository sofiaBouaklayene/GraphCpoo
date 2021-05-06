package graph;
import java.util.Arrays;
public abstract class Edge{
  private int id;
  private String color;
  private double value;
  private Vertex[] ends;

  public Edge(int id, String color, double value, Vertex[] ends){
    this.id = id;
    this.color = color;
    this.value = value;
    this.ends = ends;
  }
  public int getId(){
    return this.id;
  }

  public void setId(int id){
    this.id = id;

  }
  public String getColor(){
    return this.color;
  }
  public void setColor(String color){
    this.color = color;
  }
  public Vertex[] getEnds(){
    return this.ends;

  }
  public void setEnds(Vertex[] ends){
    this.ends = ends;
    
  }
  public double getValue(){
    return this.value;
  }
  public void setValue(double value){
    this.value = value;
  }
  public String toString(){
    return "id : "+this.id+" color :"+color+" value : "+value + ",ends=" + Arrays.toString(ends);

  }
}









































