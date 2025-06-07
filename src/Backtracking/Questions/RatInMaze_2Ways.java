package Backtracking.Questions;

public class RatInMaze_2Ways {
    public static void PrintWays(int sr,int sc, int er, int ec, String s, int[][] maze){
        if (sr>er || sc>ec) return;
        if (sr < 0 || sc < 0) return;


        if (sr==er && sc==ec){

            System.out.println(s);

            return;
        }

        if (maze[sr][sc] == 0) return;

        //go to right

        PrintWays(sr,sc+1,er,ec,s+"R",maze);
        //go  down
        PrintWays(sr+1,sc,er,ec,s+"D",maze);


    }
    public static void main(String[] args) {
        int row = 6;
        int col = 6;
        int[][] maze = {{1, 1, 0, 1, 1, 1},
                        {1, 1, 1, 1, 1, 0},
                        {1, 1, 1, 1, 1, 1},
                        {0, 1, 0, 1, 1, 1},
                        {1, 1, 1, 0, 1, 1},
                        {1, 0, 1, 0, 1, 1}};

        PrintWays(0,0,row-1,col-1,"",maze);





    }

    public static class FourRatMaze {

        public static void print(int sr,int sc, int er, int ec, String s, boolean[][] isVisted){
            if (sr<0 || sc <0) return;
            if (sr>er || sc>ec) return;
            if (isVisted[sr][sc] == true) return; // v imp
            if (sr==er && sc==ec){
                System.out.println(s);
                return;
            }

            isVisted[sr][sc] = true;

            // go to down
            print(sr+1,sc,er,ec,s+"D",isVisted);
            //go to right
            print(sr,sc+1,er,ec,s+"R",isVisted);
            // go to up
            print(sr-1,sc,er,ec,s+"U",isVisted);
            // go to left
            print(sr,sc-1,er,ec,s+"L",isVisted);

            //Backtracking is very important
            isVisted[sr][sc] = false;


        }
        public static void main(String[] args) {
            int row = 3;
            int col = 3;
            boolean isVisted[][] = new boolean[row][col];

            print(0,0,row-1,col-1,"",isVisted);
        }
    }
}
