package lesson16;

public class Vet {

    public void treatAnimal(Animal animal){
        System.out.println("This " + animal.toString() + " eat " + animal.getFood() +  " and it's location is: " + animal.getLocation());
    }
}
