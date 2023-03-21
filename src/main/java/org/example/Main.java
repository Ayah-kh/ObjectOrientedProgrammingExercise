package org.example;

class Person{
    protected int age;

    public void greet(){
        System.out.println("Hello");
    }

    public final void setAge(int age) {
        this.age = age;
    }
}

class Teacher extends Person{
    public void explain(){
        System.out.println("Explanation begins");
    }

}

class Student extends Person{
    public void goToClasses(){
        System.out.println("I’m going to class.");
    }

    public void showAge(){
        System.out.println("My age is: "+age+" years old");
    }


}

public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        person.greet();

        Student student=new Student();
        student.setAge(21);
        student.greet();
        student.showAge();

        Teacher teacher=new Teacher();
        teacher.setAge(30);
        teacher.greet();
        teacher.explain();
    }
}