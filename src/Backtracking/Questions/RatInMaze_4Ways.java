package Backtracking.Questions;

public class RatInMaze_4Ways {
    public static void PrintWays(int sr,int sc, int er, int ec, String s, int [][] maze,boolean [][] visited) {

        if (sr>er || sc>ec) return;
        if(sr<0 || sc<0) return;
        if (sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if (visited[sr][sc] == true) return; // this was already visited
        if (maze[sr][sc] == 0) return;  // block


        visited[sr][sc] = true;

        // go to right
        PrintWays(sr,sc+1,er,ec,s+"R",maze,visited);
        // go to down
        PrintWays(sr+1,sc,er,ec,s+"D",maze,visited);
        // go to left
        PrintWays(sr,sc-1,er,ec,s+"L",maze,visited);
        // go to Up
        PrintWays(sr-1,sc,er,ec,s+"U",maze,visited);

        visited[sr][sc] = false;

    }

    //optimized Space Complexity

    public static void PrintWays_opti(int sr,int sc, int er, int ec, String s, int [][] maze,boolean [][] visited){

        if (sr>er || sc>ec) return;
        if(sr<0 || sc<0) return;
        if (sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if (maze[sr][sc] == -1) return; // this was already visited
        if (maze[sr][sc] == 0) return;  // block


        maze[sr][sc] = -1;

        // go to right
        PrintWays(sr,sc+1,er,ec,s+"R",maze,visited);
        // go to down
        PrintWays(sr+1,sc,er,ec,s+"D",maze,visited);
        // go to left
        PrintWays(sr,sc-1,er,ec,s+"L",maze,visited);
        // go to Up
        PrintWays(sr-1,sc,er,ec,s+"U",maze,visited);

        maze[sr][sc] = 1;

    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;

        int [][] maze = {{1,0,1},
                         {1,1,1},
                         {1,0,1}};



        PrintWays(0,0,row-1,col-1,"",maze,new boolean[row][col]);
        PrintWays_opti(0,0,row-1,col-1,"",maze,new boolean[row][col]);


    }
}
