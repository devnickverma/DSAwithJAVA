public class AbstractClasses{
    public static void main(String args[]){
        Dog d = new Dog();
        d.walk();
        d.eat();
        d.changeColor();
        System.out.println(d.color);

        Chicken c = new Chicken();
        c.walk();
        c.eat();
        c.changeColor();
        System.out.println(c.color);
    }
}

abstract class Animal{

    String color;
    // Same for all subclasses whenever a object is created
    Animal(){
        color = "Blue";
    }
    // Same for all subclasses
    void eat(){
        System.out.println("Animal Eats");
    }
    // Subclasses can override this method
    abstract void walk();
}

class Dog extends Animal{
    void changeColor(){
        color = "Dark Brown";
    }
    void walk(){
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "Red and White";
    }
    void walk(){
        System.out.println("Walks on two legs");
    }
}
