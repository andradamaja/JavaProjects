public class DogFood {

    private String brand;

    private String type; //wet or dry

    private String meat; //lamb, chicken, duck, etc.

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

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
