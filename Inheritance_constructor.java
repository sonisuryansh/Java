package Cwh;
class base {
    base(){
        System.out.println("I am a Constructor");
    }
    base(int x){
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
class derived extends base{
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
public class Inheritance_constructor {
    public static void main(String[] args) {
       base b = new base();
       derived d = new derived();
        childofderived cod = new childofderived();





    }
}
