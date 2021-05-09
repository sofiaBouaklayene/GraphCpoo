package graph;
import graph.*;
public class IncidenceArrayGraph implements Graph{
  private Vertex [] arrayVertices;
  private Edge [] arrayEdges;
  private Edge[][] incidenceArray;
  private int nbVertices;
  private int nbEdges;
  private int size;
  
  public IncidenceArrayGraph(int size){
    this.nbEdges = 0;
    this.size = size;
    this.nbVertices = 0;
    this.arrayVertices = new Vertex[this.size];
    this.arrayEdges = new Edge[this.size*2];
    this.incidenceArray = new Edge[this.size][this.size*2];
    
  }

  
  public int nbOfVertices(){
    return this.nbVertices;
  }

  public int nbOfEdges(){
    return this.nbEdges;
  }
    public Edge[] getEdges(){
    return this.arrayEdges;
  }

  public Vertex[] getVertices(){
    return this.arrayVertices;
  }

  public void addVertex(Vertex vertex){
    this.arrayVertices[vertex.getId()] = vertex;
    nbVertices+=1;
  }

  public void addEdge(Vertex v1, Vertex v2, EdgeKind edgekind){
    nbEdges+=1;
    
    if (edgekind == EdgeKind.undirected){
      UndirectedEdge newEdge1 = new UndirectedEdge(1,"blue",new Vertex[]{v1, v2},1);
      incidenceArray[v1.getId()][v2.getId()] = newEdge1;
      incidenceArray[v2.getId()][v1.getId()] = newEdge1;
      arrayEdges[newEdge1.getId()] = newEdge1;
    }
    else if (edgekind == EdgeKind.directed){
      DirectedEdge newEdge2 = new DirectedEdge(1, "red",new Vertex[]{v1, v2} , 1, 0);
      incidenceArray[v1.getId()][v2.getId()] = newEdge2;
      incidenceArray[v2.getId()][v1.getId()+this.size] = newEdge2;
      arrayEdges[newEdge2.getId()] = newEdge2;
    }
    
    
  }

  public boolean isConnected(Vertex v1, Vertex v2){
    if (v1==v2){
      return true;
    }
  
    int etat[] = new int[this.nbVertices];
    for (int i = 0; i < this.nbVertices; i++){
      etat[i]=0;
    }
    etat[v1.getId()]=1;
    int current = v1.getId();
    
    while (current != -1){
      
      if(etat[v2.getId()]==1){
        return true;
      }

      
      for (int i = 0; i < this.size; i++){
        if(this.incidenceArray[current][i]!=null && etat[i]==0){
          etat[i]=1;
        }
      }

      
      etat[current]=2;

      for (int i = 0; i < this.size; i++){
        if(etat[i]==1){
          current = i;
        }
        else{
          current = -1;
        }
      }
    }

    return false;
  }

  public boolean isConnected(){
    boolean isC = true;
    int i = 1;
    Vertex v = this.arrayVertices[0];
    while(isC && i < this.size){
      isC = isConnected(v, this.arrayVertices[i]);
      i++;
    }
    return isC;
  }

  public Edge[] getEdges(Vertex v1, Vertex v2){
    int rep = 0;
    for(int i = 0; i < 2; i++){
      if(this.incidenceArray[v1.getId()][v2.getId()+i*this.size] != null){
        rep+=1;
      }
    }

    Edge[] tab = new Edge[rep];

    int rep1 = 0;

    while(rep1 < rep){
      for(int i = 0; i < 2; i++){
        if(this.incidenceArray[v1.getId()][v2.getId()+i*this.size] != null){
          tab[rep1] = this.incidenceArray[v1.getId()][v2.getId()+i*this.size];
          rep1+=1;
        }
      }
    }
    return tab;
  }

  
  

  public Edge[] getNeighborEdges(Vertex vertex){
    return incidenceArray[vertex.getId()]; 
  } 
  
}