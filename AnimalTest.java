public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Rocky", "3", "Bolognese");
        Cat cat = new Cat("Wilson", "7", "Orange Tabby");

        System.out.println("Dog Information");
        dog.displayInfo();
        dog.makeSound();
        dog.displayType();

        System.out.println();

        System.out.println("Cat Information");
        cat.displayInfo();
        cat.makeSound();
        cat.displayType();

    }
}