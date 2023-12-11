class Employee{
int id;
String Name;
int Salary;
public void Printdetails(){
    System.out.println("My id is "+id);
    System.out.println("and my Name is "+Name);
}
public int getSalary(){
    return Salary;
}
}
    public class cwh_38_OOPS_custom_class {
    public static void main(String[] args) {
        System.out.println("This Is our Custom Class ");
        Employee Harry = new Employee(); // Instatiating a new Employee Object
        Employee john= new Employee();
        // Setting Attributes
        Harry.id= 12;
        Harry.Name="Suryansh";
        Harry.Salary=35;
        john.id = 45;
        john.Name= "John Sinha";
        john.Salary=15;
        // Printing the arttribute
//        System.out.println(Harry.id);
//        System.out.println(Harry.Name);
        Harry.Printdetails();
        john.Printdetails();
        int Salery = john.getSalary();
        System.out.print(" " +Salery);
    }
}
