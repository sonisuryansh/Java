package Cwh;
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
}
public class abstract_interfaces {
    public static void main(String[] args) {
//        parents p1 = new parents(); // can't rum because abstract can't allowed objects creation
        child ch = new child();
//        child2 ch = new child2();
    }

    }

