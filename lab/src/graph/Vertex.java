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
    return id;
  }
  public void setId(int id){
    this.id = id;
  }
  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color = color;
  }
  public Object getInfo(){
    return info;
  }
  public void setInfo(Object info){
    this.info = info;
  }
  public String toString(){
    return "Vertex{" +
                "id =" + id +
                ", info =" + info +
                ", color ='" + color + '\'' +
                '}';
  }
}