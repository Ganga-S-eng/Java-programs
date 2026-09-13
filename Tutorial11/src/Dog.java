public class Dog extends Animal implements Pet {

    public Dog(String name) {
        super(name);
    }

    
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }

    
    public void play() {
        System.out.println(name + " is playing with a ball.");
    }
}