class Rectangle{
    int length;
    int breadth;
// Mutators or Setter methods
    void setLengthAndBreadth(int l,int b){
        length=l;
        breadth=b;
    }
    void print(){
        System.out.println(length+" "+breadth);
    }
}
class Student{
    String name,rollno,gender;
    int age,passoutyear;
    double cgpa;
    void set(String n, String r,String g, int a,int p,double c){
        name=n;
        rollno=r;
        gender=g;
        age=a;
        passoutyear=p;
        cgpa=c;
    }
    void prints(){
        System.out.println(name+" "+rollno+" "+gender+" "+age+" "+passoutyear+" "+cgpa);
    }
}
class Dog{
    String name;
    int agee;
    void set(String s,int a){
        name=s;
        agee=a;
    }
    public String toString(){
        return "DOg("+name+" "+agee+")";
    }
}
public class setter {
    
    public static void main(String args[]){
        Rectangle r1= new Rectangle();
        r1.setLengthAndBreadth(3, 3);
        r1.print();
        Rectangle r2=new Rectangle();
        r2.setLengthAndBreadth(2, 2);
        r2.print();
        Student s=new Student();
        s.set("LILLY","23a91a0519","female",18,2027,9.54); 
        s.prints();
        Student s2=new Student();
        s2.set("Atlas","23a91a0529","male",19,2027,8.5);
        s2.prints();
        //objectm--> superclass for every
        System.out.println(s2 instanceof Student);
        System.out.println(s2 instanceof Object);
        Dog d1=new Dog();
        d1.set("bob",7);
        System.out.println(d1);
   }

}
