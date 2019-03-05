public class Animal {

    private String name;
    private float age;
    private float weight;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //BEHAVIORS:

    public void eatFood(){
        System.out.println("eats ");
    }

    public void drinkWater(){
        System.out.println("drinks water ");
    }

    public void pottyBreak(){
        System.out.println("nature calls :) ");
    }

    public void sleep(){
        System.out.println("sleeps ");
    }
}
