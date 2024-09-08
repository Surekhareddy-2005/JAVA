class Point{
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Straight{
    Point p1,p2;
    Straight(Point p1,Point p2){
        this.p1=p1;
        this.p2=p2;
    }
     void getDistance(){
        System.out.println(Math.sqrt(Math.pow(p1.x-p2.x,2)-Math.pow(p1.y-p2.y,2)));
     }
    
}
public class composition {
    public static void main(String[] args){
        Straight s1= new Straight(new Point(1,2),new Point(1,2));
        s1.getDistance();

    }
    
}
