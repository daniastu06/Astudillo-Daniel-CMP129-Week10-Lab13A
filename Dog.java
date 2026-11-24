public class Dog extends Animal{
    public Dog (String name, String age, String species){
        super(name, age, species);
    }

    @Override 
    public void makeSound(){
        System.out.println("Woof Woof!");
    }

    public void displayType(){
        System.out.println("Aniaml Type: Dog");
    }
}