package Inheritence;

/**
 * Created by enilmaa on 2017-06-22.
 */
public class Main {
public static void main(String[] args){
Car ferrari  = new Car("ferrari","car",2009,"black",4,5);
    System.out.println(ferrari.wheels);
    System.out.println(ferrari.name);
    System.out.println(ferrari.getWheels());
}
}

/*output

4
ferrari
this is from vehicle class
this is from class car
*/
