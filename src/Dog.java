public class Dog {

    private String name;

    private byte age;

    private float weight;

    private String breed;

    private String color;


    public void setName(String name){
        this.name =name;
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

    public void setWeight(float weight){
        this.weight = weight;
    }

    public float getWeight(){
        return weight;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    //BEHAVIORS:

    public String run(){

        return "The dog is running.";

    }

    public String wagTail(){

        return "The dog is happy and wagging its tail.";

    }

    public String eatFood(){

        return "The dog is eating.";

    }

    public String fetchBall(){

        return "The dog retrieves the ball to the owner.";

    }

    public String bark(){

        return "The dog is barking.";

    }

    public String wince(){

        return "The dog shrinks back with fear.";

    }

    public String growl(){

        return "The dog growls threateningly.";

    }

    public String kiss(){

        return "The dog gives the human a kiss.";

    }

    public String scratch(){

        return "The dog scratches itself.";

    }

    public String sniff(){

        return "The dog is sniffing the ground.";

    }

    public String pottyBreak(){

        return "The dog answers nature's call. :)";

    }

    public String drinkWater(){

        return "The dog drinks water.";

    }

    public String sit(){

        return "The dog sits.";

    }

    public String stay(){

        return "The dog waits for the owner's next command.";

    }

    public String rollOver(){

        return "The dog rolls over.";

    }

    public String tugLeash(){

        return "The dog is pulling on the leash.";

    }
}
