public class Cat extends Animal implements Pet {

    public Cat(String name) {
        super(name);
    }

    
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    
    public void play() {
        System.out.println(name + " is playing with a toy.");
    }
}