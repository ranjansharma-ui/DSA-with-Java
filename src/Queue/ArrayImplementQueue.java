package Queue;

public class ArrayImplementQueue {
    //user defined class or nested class
    public static class queueA {
        int[] arr = new int[100];
        int front = -1;
        int rear = -1;
        int size = 0;

        //add val
        void add(int val) {
            if (front == -1) {
                front = rear = 0;
                arr[0] = val;
            } else {
                arr[rear + 1] = val;
                rear++;
            }
            size++;
        }

        //remove()
        int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            front++;
            return arr[front - 1];

        }
        //peak()
        int peek(){
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[front];

        }

        boolean isEmpty(){
            if (size == 0) return true;
            return false;
        }

        void display(){
            for (int i=front; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(6);
        q.add(12);
        q.add(18);
        q.add(24);
        q.add(30);
        q.add(36);
        q.add(42);

        q.display();
        q.remove();
        System.out.println(q.peek());
        q.display();


    }
}
