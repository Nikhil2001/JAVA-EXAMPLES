package Recursion;

/**
 * Created by enilmaa on 2017-06-22.
 */
public class Recursion {

    public static int factorial(int number) {
        if (number != 0) {
            return number * factorial(number - 1);
        }
        return 1;
    }
    public static void main(String args[]){
          int x =5;
        System.out.print("the factorial of "+x+" is "+factorial(x));

    }
}

/*output 
the factorial of 5 is 120
*/
