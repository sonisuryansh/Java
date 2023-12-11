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
    public class inheritance_45 {
    public static void main(String[] args) {
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
    }
}
