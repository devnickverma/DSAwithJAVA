public class StaticKeyword{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "ABC School";
        s1.setName("Nick");
        System.out.println(s1.getName());
        System.out.println(Student.schoolName);

        Student s2 = new Student();
        System.out.println(Student.schoolName);
    }
}

class Student{
    String name;
    int roll;
    static String schoolName;
    void setName(String name){
           this.name = name;
    } 

    String getName(){
        return this.name;
    }         
}

