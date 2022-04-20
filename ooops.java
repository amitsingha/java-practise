/**
 * student
 */ 
class Student {

    String name;
    int age;
    int roll;
    String gender;
    static String uni_name;

    int bengali;
    int english;
    int math;

    Student(){ //Constructor

    }

    Student(Student s2){ //Cop_ Constructor
        this.name = s2.name;
        this.age = s2.age;
        this.roll = s2.roll;
        this.gender = s2.gender;
    }

    public void info(){
        System.out.println("Name : "+ this.name);
        System.out.println("Age : "+ this.age);
        System.out.println("Roll : "+ this.roll);
        System.out.println("Gender : "+ this.gender);
        System.out.println("Uni_Name : "+ this.uni_name);
    }
    
    public void result(){
        System.out.println("Marks in Bengali : "+ this.bengali);
        System.out.println("Marks in English : "+ this.english);
        System.out.println("Marks in Mathematics : "+ this.math);
    }

    public int totalResult(){
        int total = this.bengali + this.english + this.math;
        return total;
    }
}

public class ooops {
    public static void main(String args[]){
        Student.uni_name = "ewu";
        Student s1 = new Student();
        s1.name = "Amit Singha";
        s1.age = 23;
        s1.roll = 3424;
        s1.gender = "Male";

        s1.info();

        s1.bengali = 89;
        s1.english = 98;
        s1.math = 78;

        s1.result();
        int totals = s1.totalResult();
        System.out.println("Total Marks : "+ totals);

        //Coping s1 student data s3 student using cop_ Constructor
        Student s3 = new Student(s1);
        s3.info();
    }
}
