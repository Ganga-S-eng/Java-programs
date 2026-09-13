public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Bruno");
        Cat cat = new Cat("Kitty");
        Lion lion = new Lion("Simba");

        System.out.println("----- Dog -----");
        dog.displayName();
        dog.makeSound();
        dog.play();

        System.out.println();

        System.out.println("----- Cat -----");
        cat.displayName();
        cat.makeSound();
        cat.play();

        System.out.println();

        System.out.println("----- Lion -----");
        lion.displayName();
        lion.makeSound();

        System.out.println();

        System.out.println("----- Polymorphism -----");

        Animal a1 = dog;
        Animal a2 = cat;
        Animal a3 = lion;

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}