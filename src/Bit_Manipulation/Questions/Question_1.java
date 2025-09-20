package Bit_Manipulation.Questions;
// check number odd or even

// checking it working
public class Question_1 {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            //even number
            System.out.println("This is Even number");
        }
        else{
            System.out.println("This is Odd number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(2);

    }
}
