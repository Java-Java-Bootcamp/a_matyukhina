package lesson16;

public class Dog extends Animal {

//    private int leg;
    private String name;

    public Dog() {
    }

    public Dog(String food, String location, String name){
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("I saying 'woof-woof'!!!");
    }

    @Override
    public void eat() {
        System.out.println("I usually eat meat and like to gnaw on the bones");
    }

    @Override
    public String toString() {
        return "Dog";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
