package Queue;

public class CircularQueueImplementation {
    public static class CqueueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) throws Exception{
            if (size == arr.length){
                throw new Exception("Queue is Full!");
            }
            else if (size == 0){
                f = r = 0;
                arr[0] = val;

            }
            else if (r < arr.length-1){
                arr[++r] = val;
            }
            else if (r == arr.length-1){
                r = 0;
                arr[0] = val;
            }
        }



    }
    public static void main(String[] args) throws Exception {

    }
}
