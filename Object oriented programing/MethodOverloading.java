public class MethodOverloading{
    public static void main(String args[]){
        calc c = new calc();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10,20,30));
    }
}

class calc{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
