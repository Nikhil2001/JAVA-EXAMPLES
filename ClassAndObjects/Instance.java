package ClassAndObjects;


public class Instance {
  public static void main(String args[]){
      Cricketer Dhoni =new Cricketer();
      Dhoni.setAge(36);
      Dhoni.setName("M.S Dhoni");
      Dhoni.setCoutry("India");
   System.out.println("age: "+Dhoni.getAge());
   System.out.println("name: "+Dhoni.getName());
   System.out.println("country: "+Dhoni.getCoutry());
  }
}
/*output:

age: 36
name: M.S Dhoni
country: India
*/
