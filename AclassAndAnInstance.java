import javax.management.InstanceAlreadyExistsException;

public class AclassAndAnInstance {
    int x;
    public String y;
    private boolean z;
    public String Greetings(){
        return "Hello World! ";
    }

    public static void main(String[] args) {
        //create instance of this class
        AclassAndAnInstance instance = new AclassAndAnInstance();
        instance.x=10;
        instance.y="Nikhil";
        instance.z=true;
        System.out.println("The  value of x  is "+instance.x);
        System.out.println("The value of y is "+instance.y);
        System.out.println("the value of z is "+instance.z);
    }
}
/*
The  value of x  is 10
The value of y is Nikhil
the value of z is true

*/
