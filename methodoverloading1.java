public class methodoverloading1 {
    static void printArray(int[] arr){
        for(int i:arr){
            System.out.println(i);
        }
    }
    static void printArray(double[] arr){
        for(double i:arr){
            System.out.println(i);
        }
    }
    static void printArray(char[] arr){
        for(char i:arr){
            System.out.println(i);
        }
    }
    static void printArray(String[] arr){
        for(String i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
         int[] intArr={10,20,30};
         printArray(intArr);
         double[] doubleArr={100.00,200.00,300.00};
         printArray(doubleArr);
         char[] charArr2={'a','b','c'};
         printArray(charArr2);
         String[] stringArr={"HI","HELLO","BYE"};
         printArray(stringArr);
    }
}
