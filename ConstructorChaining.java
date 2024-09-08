class Studentee{
    int age;
    String name;
    char gender;
    String college,branch;

    Studentee(){}
    Studentee(int age){
        this.age=age;          
    }
    Studentee(int age,String name){
        this(age);
         this.name=name;
    }
    Studentee(int age,String name, char gender ){
        this(age,name);
        this.gender=gender;
    }
    Studentee(int age, String name,char gender, String college, String branch){
        this(age, name, gender);
        this.college=college;
        this.branch=branch;
    }
    void prints(){
        System.out.println(age+" "+name+" "+gender+" "+college+" "+branch);
    }
}
public class ConstructorChaining {
    public static void main(String[] args){
        Studentee s=new Studentee();
        s.prints();
        Studentee s1=new Studentee(18);
        s1.prints();
        Studentee s2=new Studentee(18,"surekha");
        s2.prints();
        Studentee s3=new Studentee(18,"surekha",'F');
        s3.prints();
        Studentee s4=new Studentee(18,"surekha",'F',"aditya","cse");
        s4.prints();

    }
}
