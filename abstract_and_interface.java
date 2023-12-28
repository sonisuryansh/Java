package Cwh.Cwh;
abstract class parents {
    parents() {
        System.out.println("I am a Parents Class Constructor");
    }
    void sayhello() {
        System.out.println("Hello Sir");
    }
    abstract public void sayanything();
    abstract public void saynothing();
}
class child extends parents{
    @Override
    public void sayanything(){
        System.out.println("Good Morning");
    }
    public void saynothing(){
        System.out.println("Say Nothing");
    }
}
abstract class child2 extends parents{
    public void th(){
        System.out.println("Say nothing to me ");
    }
// PROBLEM 1
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
    void write(){
        System.out.println("Written Using FountainPen");
    }
    void refill(){
        System.out.println("Fountain pen is Refilled from Pen ");
    }
    void changenib(){
        System.out.println("Changing The nib ");
    }
}
// Problem 2
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Bite...");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping....");}
}
///     Problem 3
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void dissconnect();
}
class Smartphone extends Telephone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void lift(){
        System.out.println("Lifting");
    }
    public void dissconnect(){
        System.out.println("Dissconnected");
    }
    public void camera(){
        System.out.println("Openning Camera");
    }
    public void findingcontect(){
        System.out.println("Finding Contect");
    }
}
//   problem 4
interface Tvremote{
    void on();
    void off();
    void changingchanel();
}
interface SmartTvremote extends Tvremote{
    void connectwireless();
    void changingHz();
    void Gamingmode();
}
class TV implements SmartTvremote{
    public void on(){
        System.out.println("TV ON");
    }
    public void off(){
        System.out.println("TV OF");
    }
    public void changingchanel(){
        System.out.println("Chanel Changed");
    }
    public void connectwireless(){
        System.out.println("Searching for Device");
    }
    public void changingHz(){
        System.out.println("Changing to 144hz ");
    }
    public void Gamingmode(){
        System.out.println("Shifting to gaming mode");
    }
}
public class abstract_and_interface_practice {
    public static void main(String[] args) {
        //     Problem 1 Solution
        fountainpen P = new fountainpen();
        P.write();
        P.refill();
        P.changenib();
        //   Problem 2 Solution
        Human H1 = new Human();
        H1.eat();
        H1.sleep();
        System.out.println("\n");
        System.out.println("Polymorphism --");
        Monkey M1 = new Human();
        M1.bite();
        M1.jump();
        //  Problem 3 Solution
        Telephone T1 = new Smartphone();
        T1.ring();
        T1.lift();
        T1.dissconnect();
        // Problem 4 Solution
        TV t1 = new TV();
        t1.on();
        t1.changingHz();
        t1.connectwireless();
        t1.changingchanel();
        t1.Gamingmode();
        t1.off();
    }
}
