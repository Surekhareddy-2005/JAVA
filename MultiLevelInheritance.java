class person{
    String name;
    int age;
}
class Student extends person {
    String id;
    String branch;
    String college;
 
}
class Intern extends Student{
    String internId;
    double salary;
    void print(){
        System.out.println("name "+name+"\n"+"age "+age+"\n"+"id "+id+"\n"+"branch "+branch+"\n"+"college "+college+"\n"+"internid "+internId+"\n"+"salary "+salary+"\n");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args){
        Intern i1=new Intern();
        i1.name="surekha";
        i1.age=12;
        i1.id="23a91a0519";
        i1.branch="cse";
        i1.college="aec";
        i1.internId="abcd123";
        i1.salary=3000.00;
        i1.print();

    }
}
