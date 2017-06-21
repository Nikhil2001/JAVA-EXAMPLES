package ClassAndObjects;

/**
 * Created by enilmaa on 2017-06-21.
 */
public class Cricketer {

    private String name;
    private String country;
    private int age;
    private String role;

    public void setName( String name){
        this.name=name;
    }
    public void setCoutry( String country){
        this.country=country;
    }
    public  void setAge( int age){
        this.age=age;
    }

    public String getName( ){
        return this.name;
    }
    public  String getCoutry( ){
        return this.country;
    }
    public  int getAge( ){
        return this.age;
    }
}
