public class MethodOverriding{
    public static void main(String args[]){
        dear d = new dear();
        d.eat();
        Animal a = new Animal();
        a.eat();
        Dog d1 = new Dog();
        d1.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eats anything.");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Eats meat.");
    }
}

class dear{
    void eat(){
        System.out.println("Eats Grass.");
    }
}
