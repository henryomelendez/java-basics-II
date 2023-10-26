import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var myCat = new Cat("Gypsy");
        System.out.println(myCat);
        var mytable = new Table(4);
        System.out.println();

        var animals = new ArrayList<Animal>();
        var dog = new Dog();
        var fish = new Fish();
        var rabbit = new Rabbit();

        animals.add(dog);
        animals.add(fish);
        animals.add(rabbit);

        for(Animal s : animals){
            System.out.println(s.speak());
        }
    }
}