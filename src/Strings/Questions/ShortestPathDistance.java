package Strings.Questions;

public class ShortestPathDistance {
    public static float ShortestDistance(String dir){
        int x = 0;
        int y = 0;



        for (int i=0; i<dir.length(); i++){  //O(N)
            if (dir.charAt(i) == 'N'){
                y += 1;
            }
            if (dir.charAt(i) == 'S'){
                y -= 1;
            }
            if (dir.charAt(i) == 'E'){
                x += 1;
            }
            if (dir.charAt(i) == 'W'){
                x -= 1;
            }
        }

        float sd = (float)Math.sqrt(Math.pow((x-0),2) + Math.pow((y-0),2));
        return sd;
    }
    public static void main(String[] args) {
         String dest = "WNEENESENNN";
        System.out.println(ShortestDistance(dest));

    }
}
