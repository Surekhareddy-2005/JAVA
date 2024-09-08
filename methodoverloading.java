public class methodoverloading {
    // method overloading ->polymorphism

    // method overloading cannot be done by changing its return type i.e 
    // static void add(int a,int b) --- cannot be done
    // static int add(int a,int b)

    //
   static int add(int a,int b){
    return a+b;
   }
   static int add(int a,int b,int c){
    return a+b+c;            // due to variation of parameters
   }
   static double add(double a,double b){ // due to variation of data types
    return a+b;
   }
   static void add(int[] n,int k){
    int sum=0;
    for(int i:n){
        sum+=i;
    }
    System.out.println(sum);
   }
    public static void main(String[] args){
        int a=10,b=20;
        double s=100, u=40;
        int [] arr= {10,20,30};
        System.out.println(add(a,b));
        System.out.println(add(s,u));
        add(arr,3);
        System.out.println(add(2,3,4));

    }
    
}
