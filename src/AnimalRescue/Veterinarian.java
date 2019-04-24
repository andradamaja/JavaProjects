package AnimalRescue;

public class Veterinarian extends Medic{

    //BEHAVIORS:

    public void vaccinate(){

        System.out.println("vaccinates ");

    }

    public void weigh(){

        System.out.println("weighs ");

    }

    public void givePill(){

        System.out.println("gives pill ");

    }

    public void suggestTreatment(){

        System.out.println("suggests best treatment ");

    }

    public void writeDown(){

        System.out.println("writes down information in the pet's book of health");

    }

    //for cats and dogs only:

    public void checkTeeth(){

        System.out.println("checks teeth ");

    }

    public void checkEars(){

        System.out.println("checks ears ");

    }
}
