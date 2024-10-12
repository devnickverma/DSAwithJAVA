public class ShallowAndDeepCopy{

    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Nick";
        s1.roll = 456;
        s1.marks = new int[]{10, 20, 30};
        Student s2 = new Student(s1);
        s1.marks[0] = 100;
        for(int i=0; i<s2.marks.length; i++){
            System.out.println(s2.marks[i]);
        }
        System.out.println(s2.name + " " + s2.roll);
    }
}

class Student{
    String name;
    int roll;
    int marks[];
    Student(){
    
    }
    // Deep Copy
    Student(Student s){
        marks = new int[3];
        this.name = s.name;
        this.roll = s.roll;
        for(int i=0; i<s.marks.length; i++){
            this.marks[i] = s.marks[i];
        }
    }

    // Shallow Copy
    // Student(Student s){
    //     this.name = s.name;
    //     this.roll = s.roll;
    // }
}
