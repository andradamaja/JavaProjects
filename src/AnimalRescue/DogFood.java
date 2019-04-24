package AnimalRescue;

public class DogFood extends Food{

    private String type; //wet or dry

    private String meat; //lamb, chicken, duck, etc.


    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setMeat(String meat){
        this.meat = meat;
    }

    public String getMeat(){
        return meat;
    }
}
