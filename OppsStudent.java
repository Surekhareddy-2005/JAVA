
class Student{
    String name;
    int age;
    int [] marks;
    int totalMarks;
    float percentage;

    void calculateTotal(){
        for(int i=0;i<marks.length;i++){
            totalMarks+=marks[i];
        }

    }
    void calculatePercentage(){
        percentage= (totalMarks*100.0F/600);
    }
    void printDetails(){
        System.out.println(name+" "+age+" "+totalMarks+" "+percentage);
    }

}

public class OppsStudent {
    public static void main(String[] args){
        Student s1= new Student();
        s1.name="LILY BLOOM";
        s1.age=16;
        s1.marks= new int[] {99,99,99,99,99,99};
        s1.calculateTotal();
        s1.calculatePercentage();
        s1.printDetails();



    }

    
}
