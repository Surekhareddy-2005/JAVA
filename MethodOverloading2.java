class MethodOverloading2 {
    static boolean isPrime(int a){
        int cnt=0;
        for(int i=2;i<a;i++){
          if(a%i==0)
          cnt++;
        }
        if(cnt==0) return true;
        else return false;
    }
   
    static boolean isPrime(int a,int b,int c){
        int cnt=0;
        for(int i=a;i<=b;i++){
            if(isPrime(i))
            cnt++;
        }
        if(cnt==c) return true;
        else  return false;
    }
    static boolean isPrime(int a,int b){
        int cnt=0;
        for(int i=a;i<=b;i++){
            if(isPrime(i))
            cnt++;
        }
        if(cnt%2==0) return true;
        else  return false;
    }
    
    public static void main(String[] args){
        int num=11;
        System.out.println(isPrime(num));
        System.out.println(isPrime(10,20));
        System.out.println(isPrime(10,20,4));

    }
    
    
}
