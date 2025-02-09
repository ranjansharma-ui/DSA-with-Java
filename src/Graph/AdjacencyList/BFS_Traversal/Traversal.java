package Graph.AdjacencyList.BFS_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    static class Edge {
        int src, dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Create graph
    static void createGraph(ArrayList<Edge> graph[], int V) {
        for (int i = 0; i < V; i++) {
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

    // BFS
    static void BFS(ArrayList<Edge> graph[], boolean vis[], int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true; // Mark before adding to queue

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            // Traverse neighbors
            for (Edge e : graph[curr]) {
                if (!vis[e.dest]) {
                    q.add(e.dest);
                    vis[e.dest] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 12;
        ArrayList<Edge> graph[] = new ArrayList[V]; // Adjacency-List
        createGraph(graph, V);
        boolean vis[] = new boolean[V];

        System.out.println("BFS Traversal:");

        // Start BFS from unvisited nodes, skipping empty lists
        for (int i = 0; i < V; i++) {
            if (!vis[i] && !graph[i].isEmpty()) {
                System.out.print("\nComponent starting from " + i + ": ");
                BFS(graph, vis, i);
            }
        }
        System.out.println();
    }
}
