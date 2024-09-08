
class Rectangle{
    int length;          // instance variables
    int width;
    void calculateAndPrintArea(){       // instance methods
        // if you create a variable to store area it becomes local variable
        System.out.println("the area of the give rectangle is -> "+ (length*width));
    }
    void calculateAndPrintPerimeter(){
        System.out.println("the perimeter of the given rectangle is -> "+ (2*(length+width)));
    }
}

public class OppsRectangle {
    public static void main(String[] args){
        Rectangle r1= new Rectangle();       // creating object
        r1.length=10;
        r1.width=5;
        r1.calculateAndPrintArea();
        r1.calculateAndPrintPerimeter();

        Rectangle r2= new Rectangle();
        r2.length=20;
        r2.width=15;
        r2.calculateAndPrintArea();
        r2.calculateAndPrintPerimeter();

    }
    
}
