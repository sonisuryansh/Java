import java.sql.SQLOutput
class Base {
    Base(){
        System.out.println("I'm A constructor");
    }
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I'm in Base and setting X now ");
        this.x = x;
    }
    public void printme() {
        System.out.println();
    }
}
class Derived extends Base{
    Derived (){
        System.out.println("I'm duplicate Constructor");
    }
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        System.out.println("using Derived class  using geter and seter ");
        this.y = y;
    }
}
class base1 {
    base1(){
        System.out.println("I am a Constructor");
    }
    base1(int x){
        System.out.println("I am a base class overloaded constructor with the value of x");
    }
    public int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}
class derived extends base1{
    derived(){
        System.out.println("I am a derived class constructor ");
    }
    derived(int x,int y){
        super(x);
        System.out.println(
                "I am a Derived class Overloaded constructor with the value of x and y");
    }
    public int y;

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
class childofderived extends derived {
    childofderived(){
        System.out.println("I am a child of derived class constructor");
    }
    childofderived(int x,int y,int z){
        super(x,y);
        System.out.println("I am a child of derived class constructor with the value of x, y and z");
    }
}
interface cool{
    void method1();
    void method2();
}
interface cool2 extends cool{
    void method3();
    void method4();
}
class Mysample implements cool2{
    public void method1(){
        System.out.println("Hey Goodmorning ");
    }
    public void method2(){
        System.out.println("Hey Goodevening ");
    }
    public void method3(){
        System.out.println("Hey Goodafternoon ");
    }
    public void method4(){
        System.out.println("Hey Goodnight");
    }
}
interface Mobile{
    String Componey= "Android Phones";
    void Startphone(String poweron);
    void Switchof(String powerof);
}
interface Computers{
    void booting();
    void windowssound();
}
class android implements Mobile,Computers{
    public void Startphone(String poweron){
        System.out.println("Welcome to "+ poweron + " Android ");
    }
    public void Switchof(String powerof){
        System.out.println("Shutting Down");
    }
    public void booting(){
        System.out.println("HP WORLD");
    }
    public void windowssound(){
        System.out.println("TING TING");
    }
}
public class Inheritance_and_Interface{
    public static void main(String[] args) {
        base1 b = new base1();
        derived d = new derived();
        childofderived cod = new childofderived();
        // Creating an object of Base Class
        Base object = new Base();
        object.setX(55);
        System.out.println(object.getX());
        // Creating an Object Of Derived Class
        Derived object1 =  new Derived();
        object1.setX(100);
        System.out.println(object1.getX());
        object1.setY(69);
        System.out.println(object1.getY());
        Mysample obj = new Mysample();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        android surya = new android();
        surya.Startphone("SAMSUNG");
        System.out.println(surya.Componey);
        surya.booting();
        surya.windowssound();
    }
}
