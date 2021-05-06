package graph;
public class Vertex{
  private int id;
  private String color;
  private Object info;
  public Vertex(int id, String color, Object info){
    this.id = id;
    this.color = color;
    this.info = info;
  } 
  public int getId(){
    return this.id;
  }
  public void setId(int id){
    this.id = id;
  }
  public Object getInfo(){
    return this.info;
  }
  public void setInfo(Object info){
    this.info = info;
  }
  public String getColor(String color){
    return this.color;
  }
  public void setColor(String color){
    this.color = color;
  }
  public String toString(){
    return "id  =" + this.id +"color is " + this.color + "info" + this.info;
  }
}