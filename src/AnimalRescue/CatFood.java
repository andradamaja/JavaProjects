package AnimalRescue;

import AnimalRescue.Food;

public class CatFood extends Food {

    private String type; //wet or dry

    private String meat; //fish, chicken, etc.

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
