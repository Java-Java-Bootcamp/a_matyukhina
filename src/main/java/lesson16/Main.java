package lesson16;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Royal Canin", "Moscow Region", "jh");
        Vet vet = new Vet();
        vet.treatAnimal(dog);
    }
}
