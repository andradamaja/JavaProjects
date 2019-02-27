public class Veterinarian {

    private String name;

    private byte age;

    private String gender;


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(byte age){
        this.age = age;
    }

    public byte getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    //BEHAVIORS:

    public String vaccinate(){

        return "The vet gives the dog a vaccine.";

    }

    public String weighDog(){

        return "The vet weighs the dog.";

    }

    public String givePill(){

        return "The vet gives the dog a pill.";

    }

    public String suggestTreatment(){

        return "The vet tells the owner what treatment they think is best for the dog.";

    }

    public String writeDown(){

        return "The vet writes down the info in the dog's book of health.";

    }

    public String checkTeeth(){

        return "The vet checks the dog's teeth.";

    }

    public String checkEars(){

        return "The vet checks the dog's ears.";

    }
}
