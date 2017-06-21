
public class MovieDetailsClass {

    public String name;
    private String language;
    private String director;
    private int collectionInBillions;

    public MovieDetailsClass( String name,String language,String director ){
        this.name=name;
        this.language=language;
        this.director=director;
    }
    public void setCollectionInBillions(int collectionInBillions){
        this.collectionInBillions=collectionInBillions;

    }

    public int getCollectionInBillions(){
        return collectionInBillions;
    }
}
