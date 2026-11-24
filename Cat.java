public class Cat extends Animal{
    public Cat (String name, String age, String species){
        super(name, age, species);
    }

    @Override 
    public void makeSound(){
        System.out.println("Meow!");
    }

    public void displayType(){
        System.out.println("Aniaml Type: Cat");
    }
}
