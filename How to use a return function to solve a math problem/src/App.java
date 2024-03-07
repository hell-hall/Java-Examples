public class App {

    public static void main(String[] args) 
    {
        /* We can call doSomeMath and get a 
        int value just as if you used int = 13 */
        // A whole number by default is a int in java
        System.out.println(doSomeMath(5, 8));
    }
    
    /* Here we add a and b to get 13 this takes in 2 ints 
       and returns a int
       ints can only be whole numbers
    */
    public static int doSomeMath(int a, int b) 
    {
       /* We just add a and b in the return statement 
       to cut the code short */
        return a + b;
    }

}