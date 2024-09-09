// inheritance
// a process of one class acquiring properties of another.
// in java we use extends keyword to perform inhertiance
// class student extends person
//   student       person
//   child class   parent class
//   sub class     super class
// dervied class   base class
// inheritance is called as " is-a "relationship.

// types of inheritance
// single inheritance        -> one parent->one child class
// hierarchical inheritance  ->one parent->multiple child classes
// multi-level inheritance   ->grand parent->parent->child
// hybrid inheritance        
// multiple inheritance      More than one parent class ->one child class
// java doesnt support multiple inheritance  ->diamond problem


class Person{
    String name;
    int age;
    void introduce(){
        System.out.println("i am "+name);
    }
}
class Hod extends Person{
  int  salary;
  String hodID;
  void print(){
  System.out.println("hod name "+name+" age "+age+" salary  " +salary+" hodid "+hodID);
  }
}
class Intern extends Person{
 String internId;
}
public class inheritance1 {
    public static void main(String[] args){
        Hod h1=new Hod();
        Intern i1=new Intern();
        h1.name="abc";
        h1.age=45;
        h1.salary=34;
        h1.hodID="4df5gi";
        h1.introduce();
        h1.print();
        Person p1=new Person();
        System.out.println(p1 instanceof Person);
        System.out.println(i1 instanceof Person);
        System.out.println(h1 instanceof Person);


    }
    
}
