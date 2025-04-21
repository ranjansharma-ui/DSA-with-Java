package Graph.AdjacencyList.DFS_Traversal;

import java.util.ArrayList;

public class Traversal {
    static class Edge{
        int src;
        int dest;
        
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
            
        }
    }
    
    // create-graph
    public static void CreateGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[1].add(new Edge(1, 5));
        graph[1].add(new Edge(1, 8));

        graph[5].add(new Edge(5, 1));
        graph[5].add(new Edge(5, 8));
        graph[5].add(new Edge(5, 11));

        graph[8].add(new Edge(8, 5));
        graph[8].add(new Edge(8, 1));

        graph[11].add(new Edge(11, 5));
        graph[11].add(new Edge(11, 3));

        graph[3].add(new Edge(3, 11));
    }

    //DFG
    static void DFS(ArrayList<Edge> graph[],int curr, boolean vis[]){
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if (vis[e.dest] == false){
                DFS(graph,e.dest,vis);

            }
        }
    }

    public static void main(String[] args) {
        int V = 12;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);

        boolean vis[] = new boolean[V];

        for (int i=0; i<V; i++){
            if (vis[i] == false){
                DFS(graph,i,vis);
            }
        }
    }
}
