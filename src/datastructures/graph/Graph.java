package datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjList=new HashMap<>();

    public boolean addVertex(String vertex){
        if(vertex!=null&&adjList.get(vertex)==null)
        {
            adjList.put(vertex,new ArrayList<String>());
            return true;
        }
        return false;
    }
    public boolean addEdge(String vertex1,String vertex2){
        if(vertex1!=null&&vertex2!=null&&adjList.get(vertex1)!=null&&adjList.get(vertex2)!=null){
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }
    public boolean removeEdge(String vertex1,String vertex2){
        if(vertex1!=null&&vertex2!=null&&adjList.get(vertex1)!=null&&adjList.get(vertex2)!=null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
            return false;
    }

    public boolean removeVertex(String vertex){
        if(vertex!=null&adjList.get(vertex)!=null){
            adjList.remove(vertex);
            for(ArrayList<String> edgeList:adjList.values()){
                edgeList.remove(vertex);
            }
            return true;
        }
        return false;
    }


    public void printGraph(){
        System.out.println(adjList);
    }
}
