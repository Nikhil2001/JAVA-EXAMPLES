package Recursion.Encapsulation;

/**
 * Created by enilmaa on 2017-06-22.
 */
public class Mybike {
    public static void main(String[] args) {
        Bike suzuki = new Bike();
        suzuki.setWheels(5);
        suzuki.setWheels(2);
        System.out.println("suzuki has "+suzuki.getWheels()+" wheels");
    }
}
/*output
Bikes do not have 5 wheels
suzuki has 2 wheels

*/
