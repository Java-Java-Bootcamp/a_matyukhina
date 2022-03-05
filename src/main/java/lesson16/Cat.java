package lesson16;

public class Cat extends Animal{

//    private String name;
//    private int claws;

    @Override
    public void eat() {
        System.out.println("I like milk, but prefer some fish.");
    }

    @Override
    public void makeNoise() {
        System.out.println("I can purr and meow.");
    }
}
