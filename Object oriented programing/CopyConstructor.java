public class CopyConstructor{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Nick";
        s1.roll = 456;
        Student s2 = new Student(s1);

        System.out.println(s2.name + " " + s2.roll);
    }
}

class Student{
    String name;
    int roll;

    Student(){
    
    }
    Student(Student s){
        this.name = s.name;
        this.roll = s.roll;
    }
}