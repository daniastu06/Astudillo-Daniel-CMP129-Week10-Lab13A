public abstract class Animal {
    private String name;
    private String age;
    private String species;

    public Animal(String name, String age, String species){
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Specie: " + species);
    }

    public abstract void makeSound();
}
