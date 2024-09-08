public class variableFunctions {
    static String adds(String ... strings){
        String result="";
        for(int i=0;i<strings.length;i++){
            result+=strings[i].charAt(0);
        }
        return result;
    }
static void add(int ... nums){
    int sum=0;
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
    }
    System.out.println(sum);
}
public static void main(String[] args){
    add(10,20);
    add(10,20,30);
    add(30,40,50,30);
    System.out.print(adds("surekha", "geetha"));
}
    
}
