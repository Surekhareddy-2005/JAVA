import javax.swing.JOptionPane;
class Employee{
    int id,salary;
    String name;
    Employee(){
        name=JOptionPane.showInputDialog("enter your name: ");
        id=Integer.parseInt(JOptionPane.showInputDialog("enter your id: "));
        salary=Integer.parseInt(JOptionPane.showInputDialog("enter your salary: "));
        details();
    }
    void details(){
        String outputString = "id: "+id +"\nname: "+name +"\nsalary: "+salary;
        JOptionPane.showMessageDialog(null, outputString);
    }
}
public class ConstructorSwing {
    public static void main(String[] args) {
        Employee e1=new Employee();
       // e1.details(); // you can either call this method inside the constructor
        Employee e2= new Employee();
       // e2.details();

    }
}
