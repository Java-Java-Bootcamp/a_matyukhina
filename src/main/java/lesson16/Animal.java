package lesson16;

public class Animal {

    private String food;
    private String location;

    public Animal() {
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void sleep(){
        System.out.println("I'm sleeping...");
    }

    public void eat(){
        System.out.println("I eat ");
    }

    public void makeNoise(){
        System.out.println("my noise is: ");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
