class Cat{
    String name;
    int age;
    Cat(){  // default constructor
        System.out.println("hey have you read it ends with us");
    }
}
class Dog{
    String name;
    int age;
    // parametric consturctor with two parameters
    Dog(String n,int a){
        name=n;
        age=a;
    }
    // constructor overloading  with one parameter
    Dog(String n){
        name=n;
    }

    Dog(){}  //with no parameters
    void prints(){
        System.out.println(name+" "+age);
    }
}
public class constructor {
    // it is a special method 
    // constructor is used to construct an object while creating it.
    // is to initialize instance variables with values, while creating object.
    // constsructor name shourlb be class name
    // it should not have written type for it even void
    // types of constructors
    //1. default constructor
    //2.parametric constructor (parameterized constructor)
    //3.copy constructor
    // every class will have a default constructor and the will be triggeres upon creation of each object of that class
    
    public static void main(String[] args) {
        Cat c1= new Cat();
        Cat c2= new Cat();
        Dog d1=new Dog("prasana",50); // and now it is not possible to create  Dog d2= new Dog() it expects arguments
        d1.prints();
        Dog d2= new Dog("geetha");
        d2.prints();
        Dog d3= new Dog();  //prints default values
        d3.prints();
        Dog d4=new Dog("surekha",30);
        d4.prints();


    }
}
