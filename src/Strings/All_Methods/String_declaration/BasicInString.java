package Strings.All_Methods.String_declaration;

public class BasicInString {
    public static void main(String[] args) {
        // what is different between creating String this ways.
        String str = new String("Ranjan");
        String str1 = "Ranjan";

        /*
          String : String is a type of object
                    that can store a sequence of character
                    enclosed is stored in 16 bits.

           # There are two ways to create a String in java.

            1. String Literal :-
                             To make java more memory efficient
                             (because no new object are created if it exists already in
                             the string constant pool)

                             Syntax
                              String demo = "Radha-Krishna";

            2. Using new keyword(Heap-memory) :-
                                         -> String src = new String("Welcome");
                                         -> In such a case, JVM will create a new string object in normal (non-pool)
                                            heap memory and the literal "Welcome" will be the object in the heap(non-pool)




                                         In the given example only one object will be created. Firstly
                                         JVM will not find any string object with the value “Welcome”
                                         in the string constant pool, so it will create a new object.
                                         After that it will find the string with the value “Welcome” in the pool,
                                          it will not create a new object but will return the reference to the same instance.
         */
    }
}
