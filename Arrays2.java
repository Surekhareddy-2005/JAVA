import java.util.*;
public class Arrays2 {
    public static void main(String args[]){

        // declaring array and printing
        int[][] arr={{1,2},{3,4}};
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // declaring array from user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        int n=sc.nextInt();
        System.out.println("enter no of columns");
        int m=sc.nextInt();
        int[][] brr=new int[n][m];
        for(int k=0;k<n;k++){
            for(int l=0;l<m;l++){
                brr[k][l]=sc.nextInt();
            }      
        }
        // printing using for each loop
        for(int h[] : brr){
            for(int a :h){
                System.out.print(a+" ");
            }
            System.out.println();
        }

        //another way of declaring multidimensionl array
        int[] A={1,2};
        int[] B={3,4};
        int[][] C={A,B};

        //jagged arrays  or array of varrying lengths
        int[][] crr=new int[3][];
        crr[0]=new int[2];
        crr[1]=new int[3];
        crr[2]=new int[1];
        for(int v=0;v<crr.length;v++)                            // to find the length use  arrayName.length
        {
            for(int d=0;d<crr[v].length;d++)
            {
                crr[v][d]=(int)(Math.random() *10);    // in case if you initilize one row the other rows are automatically filled with zero
            }
        }
        System.out.println();
        for(int r[]:crr)
        {                  // you can use Arrays.deeptoString() to print array elements
            
            for(int y :r)
            {
                System.out.print(y+"  ");

            }
            System.out.println();
        }

    }
    
}
