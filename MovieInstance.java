public class MovieInstance {


    public static void main(String args[]){
        MovieDetailsClass bahubali = new MovieDetailsClass("Bahubali","telugu","ssRajamouli");
        //check whether the constructor assigned values values
        System.out.println(bahubali.name);
        //only name can be accessed sincce other fields has private access modifier
        bahubali.setCollectionInBillions(20);
        System.out.println(bahubali.getCollectionInBillions());

    }
}

/*output
Bahubali 
20
*/
