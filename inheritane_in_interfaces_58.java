package Cwh;
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
public class inheritane_in_interfaces_58 {
    public static void main(String[] args) {
        Mysample obj = new Mysample();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }

}

