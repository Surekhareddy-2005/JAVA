//composition - fundamental oop concept ,where one class contaions objects of other classes inside it as fieds
// composition is also called as "has-a" relationship
class Student{
    String name,branch;
    DateOfBirth dob;
    Student(String name,String branch,DateOfBirth dob){
        this.name=name;
        this.branch=branch;
        this.dob=dob;
    }
   void calculateAgePrint(){
    System.out.println(2024-dob.year);
   }
}
class DateOfBirth{
    int date,month,year;
    DateOfBirth(int date,int month,int year){
        this.date=date;
        this.month=month;
        this.year=year;
    }
    public String toString(){
        return date+"-"+month+"-"+year;
    }

}
public class Inheritance {
    public static void main(String[] args){
   Student s1=new Student("surekha","cse",new DateOfBirth(27, 12, 2005)); 
//    s1.name="surekha";
//    s1.branch="cse";
//    s1.dob=new DateOfBirth(27,12,2005);
   s1.calculateAgePrint();
   System.out.println(s1.dob);
    }
    
}
