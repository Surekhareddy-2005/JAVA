
    // arrays in java
    // arrays are indexed
    // arrays are mutable
    // memory for arrays should be allocated using new keyword
    // index bounds check will take place
    // syntax for declaring an array
    // java style -> datatype[] arrrayname=new datatype[size];
    // int[] arr=new int[5] an array of 5 integers
    //c style -> int arr[] =new int[5];


import java.util.Scanner;
class student{
    int marks;
    int roll;
    String name;

}
public class Arrays1 {
   public static void main(String[] args){

    //declaring array
    int[] arr={1,2,3,4,5};
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     }
     System.out.println();


   // another way form printing arrays
   for(int i : arr){
      System.out.println(i+" ");
   }
   System.out.println();



   //declaring from user
   Scanner sc=new Scanner(System.in);
   System.out.println("enter n value");
   int n =sc.nextInt();
   int[] crr=new int[n];
   System.out.println("enter the values of array");
    for(int j=0;j<n;j++){
      crr[j]=sc.nextInt();
    }
    for(int k : crr){
        System.out.println(k+" ");
     }
     System.out.println();

    // creating an array from your own type
       student s1= new student();
        s1.roll=19;
        s1.name="surekha";
        s1.marks=9;
        student s2= new student();
        s2.roll=29;
        s2.name="geetha";
        s2.marks=8;
        student s3=new student();
        s3.roll=28;
        s3.name="hari";
        s3.marks=10;

        student students[]= new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name +":"+students[i].roll+":"+students[i].marks);
        }
        System.out.println();

        for(student stud: students)
        {
            System.out.println(stud.name +":"+stud.roll+":"+stud.marks);
        }


}
}
