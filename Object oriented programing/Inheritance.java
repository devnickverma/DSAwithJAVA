public class Inheritance{
    public static void main(String args[]){
        Dog d = new Dog();
        d.bark();
        d.eat();
        d.breath();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breathes");   
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barks");
    }
}