import java.util.*;
public class Arrays3 {
    public static void main(String[] args){
    int[] arr ={1,2,4,5};

    // Arrays.toString method is used to print the elements in array form
    System.out.println(Arrays.toString(arr));   


    //fill() -> an array value -> void->fills all the array elements with given values
    int[] a=new int[5];
    Arrays.fill(a,3);
    System.out.println(Arrays.toString(a));
    // you can give index also Arrays.fill(arrayName,startIndex,EndIndex,valueToBeFilled)

    //Arrays.sort(arrayName) uses  dual-pivot quicks sort.O(nlog(n)) and in place sorting takes place
    int[] b={4,66,43,21,54,00};
    Arrays.sort(b);
    System.out.println(Arrays.toString(b));

    //Arrays.equals(1starray,2ndarray) boolean value compares lexicographyically
    int[] h={4,3,6,78,8};
    int[] s={4,3,6,78,8};
    System.out.println(Arrays.equals(h,s));
    String[] name={"surekha","geetha"};
    String[] names={"surekh","geetha"};
    System.out.println(Arrays.equals(name,names));

    // Arrays.compare(1starray,2ndarray)- lexicographically ans returns a 
    //-ve value if array1 is smaller than array2 
    //0 if array1=array2
    //+ve value if array 1 is greater than array2                                                                           
    System.out.println(Arrays.compare(name,names));
          char[] c1={'a','b','c'};
          char[] cs={'z','y','x'};
          System.out.println(Arrays.compare(c1,cs));

          
    //mismatch()->two arrays-> int->returns the index where mismatch takes place
    System.out.println(Arrays.mismatch(name,names));


    // binary search
    int[] c={34,45,67,87,90};
    System.out.println(Arrays.binarySearch(c,100));

    //copyOf   returns a array
    int[] arrcopy=(Arrays.copyOf(c,5));
    System.out.println(Arrays.toString(arrcopy));

          



}
}

