class student{
    String name;
    int age;
    public void display(){
        System.out.println("name of the student: "+name+" and age: "+age);}}
        public class main{
    public static void main(String[] args) {
        student s1= new student();
        s1.name= "sharanya";
        s1.age= 19;
        s1.display();

        student s2= new student();
        s2.name= "sharu";
        s2.age= 20;
        s2.display();

    }
    }