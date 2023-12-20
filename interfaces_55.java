package Cwh;

import java.sql.SQLOutput;

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
public class interfaces_55 {
    public static void main(String[] args) {
        android surya = new android();
        surya.Startphone("SAMSUNG");
        System.out.println(surya.Componey);
        surya.booting();
        surya.windowssound();
    }
}
