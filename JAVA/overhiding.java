class AnimalS {

    public void makeSound() {
        System.out.println("Animal make a Sound");
    }
}
class DogS extends AnimalS {
    public void makeSound(){
        System.out.println("Dog Barks!");
    }
}
public class overhiding {
    public static void main(String[] args) {
        AnimalS myAnimal = new AnimalS();
        DogS myDog = new DogS();

        myAnimal.makeSound();
        myDog.makeSound();
    }
}