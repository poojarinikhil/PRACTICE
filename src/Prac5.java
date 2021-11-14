class student{
    String Name;
    int age;
    String program;
}
class graduate extends student{
    int percentage ;
    String stream;
    graduate(String n ,int a , String pro,int per,String s){
        Name = n;
        age = a;
        program = pro;
        percentage = per;
        stream = s;
    }
    void display(){
        System.out.println();
        System.out.println("The Name of the student : "+Name);
        System.out.println("Age "+age);
        System.out.println("Program : "+program);
        System.out.println("stream : "+stream);
        System.out.println("Percentage : "+percentage);
    }

}
class research extends student{
    String specialization;
    int experience;
    research() {
        Name = "default";
        age = 20;
        program = "Null";
    }
    research(String n ,int a , String pro,int exp,String specs){
        Name = n;
        age = a;
        program = pro;
        experience = exp;
        specialization = specs;
    }
    research(String n ,int a , String pro,String specs){
        Name = n;
        age = a;
        program = pro;
        experience = 0;
        specialization = specs;
    }
    research(String n ,int a , String pro,int exp){
        Name = n;
        age = a;
        program = pro;
        experience = exp;
        specialization = "NUll";
    }
    research(String n ,int a , String pro){
        Name = n;
        age = a;
        program = pro;
        experience = 0;
        specialization = "Null";
    }
    void display(){
        System.out.println();
        System.out.println("The Name of the student : "+Name);
        System.out.println("Age "+age);
        System.out.println("Program : "+program);
        System.out.println("years of experience  : "+experience);
        System.out.println("Specialization : "+specialization);
    }
}
public class Prac5 {
    public static void main(String[] args) {
        graduate abhishek = new graduate("Abhishek", 18, "mechanical", 80, "Science");
        research ram = new research("ram", 20, "computer science", 2, "ML and AI");
        research sham = new research("sham", 24, "IT");
        research stev = new research("stev", 22, "IT", 2);
        research shaun = new research("shaun", 24, "IT", "Cyber Security");
        abhishek.display();
        ram.display();
        sham.display();
        stev.display();
        shaun.display();
    }
    }
