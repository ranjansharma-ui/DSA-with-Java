package Stack.ArrayImplementation;

public class ArrayStack {
    public static class Stack{
        private int[] arr = new int[100];
        private int idx = 0;

        //push() Method
        void push(int x){
            if (isFull()){
                System.out.println("Stack is full!");
                return;
            }
            arr[idx] = x;
            idx++;
        }
//pop() Method
        int pop(){
            if (idx == 0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
//peek() Method
        int peek(){
            if (idx==0){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }
        //Size()
        int size(){
            return idx;
        }
//display()
        void display(){
            for (int i=0; i<=idx-1; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
//isFull()
        boolean isFull(){
            if (idx == arr.length){
               return true;
            } else return false;
        }
//isEmpty()
        boolean isEmpty(){
            if (idx == 0) return true;
            else return false;
        }


    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(9);
        st.push(41);
        st.push(91);
        st.push(98);
        st.display(); // 3,4,5,9,41.91,98
        st.pop();
        st.pop();
        st.display();//3,4,5,9,41
        System.out.println("Peek() target element:");
        System.out.println(st.peek()); // 41
        System.out.println("Let check the isEmpty & isFull methods");
        System.out.println(st.isFull()); // false
        System.out.println(st.isEmpty()); // false

        System.out.println("Size : "+st.size());

        System.out.println("return Pop() method after the delete :"+st.pop());




    }
}
