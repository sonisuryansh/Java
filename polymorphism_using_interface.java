package Cwh;


interface mycamera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4k(){
        greet();
        System.out.println("Recording 4k video ");
    }
}
interface mywifi{
    String[] getNetworks();
    void connecttonetwork(String network);
}

class Mycellphone{
    void callnumber(int phonenumber){

        System.out.println("Calling"+ phonenumber);
    }
    void pickcall(){
        System.out.println("connecting...");
    }


}
class MySmartphone extends mycellphone implements mywifi,mycamera{

    public void takesnap(){
        System.out.println("Taking Snap");
    }
    public void recordvideo(){
        System.out.println("Recording Video");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of Networks");
        String[] networklist = {"Harry","Prashanth","Anjali5G"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("Connecting to "+network);
    }

    // impliment default method

    public void record4k(){
        System.out.println("Recording 4k video with the help of our SmartPhone");
    }

}

public class polymorphism_using_interface {
    public static void main(String[] args) {
        mycamera cam1 = new MySmartphone();
        cam1.takesnap();
        cam1.recordvideo();
        cam1.record4k();
    }
}
