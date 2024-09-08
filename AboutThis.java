// this keyword in java represents the current object
// this keyword has several uses in java
//  1. used to access instance members of the class  within the class
//  2.used to distinguish instacne varibles and local variables
// 3. used in constuction chaining

// objects to functions is always call by reference in java.
// objects are always passed as references , not as values.


class Point{
    int x,y;
    void printthisObject(){
        System.out.println(this);    // it is going to print the address of the current object
    }
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    void print(){
        System.out.println(x+" "+y);
    }
}
class Students{
    int id;
    String name, branch;
    Students(String name,String branch,int id){
        this.name=name;
        this.branch=branch;
        this.id=id;
        printDetails();

    }
    void printDetails(){
        System.out.println("name: "+name+"\nbrancdh: "+branch+"\nud: "+id);
    }
}
public class AboutThis {
    static void change(Point p){
        p.x=100;
        p.y=200;
    }
    public static void main(String[] args){
        Point p1=new Point(5,6);
       // System.out.println(p1);// it is going to print the address of the object
       // p1.printthisObject();
       p1.print();
       change(p1);
       p1.print();
    Students s1=new Students("Surekha","cse",87);

    }
    
}
