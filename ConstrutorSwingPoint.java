import javax.swing.JOptionPane;
class Point{
    int x,y;
    Point(int x,int y){  // correct way of writing 
        this.x=x;
        this.y=y;

    } 
    void showPoint(){
       String outputString="the value of x is: "+x+"\nthe value of y is: "+y;
       JOptionPane.showMessageDialog(null,outputString);
    }
}
public class PointConstructor {
    static void printDistance(Point p1,Point p2){
        double distance=Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2));
        System.out.printf("%.2f",distance);
    }
    public static void main(String[] args){
      int a=Integer.parseInt(JOptionPane.showInputDialog("enter a value: "));
      int b=Integer.parseInt(JOptionPane.showInputDialog("enter b value "));
        Point p1=new Point(a,b);
        p1.showPoint();
        Point p2=new Point(7,8);
        p2.showPoint();
       printDistance(p1,p2);
        

    }

}
