package Cwh;
interface Mycamera{
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
interface Mywifi{
    String[] getNetworks();
    void connecttonetwork(String network);
}

class mycellphone{
    void callnumber(int phonenumber){

        System.out.println("Calling"+ phonenumber);
    }
    void pickcall(){
        System.out.println("connecting...");
    }


}
class Mysmartphone extends mycellphone implements Mywifi,Mycamera{

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

//    public void record4k(){
//        System.out.println("Recording 4k video with the help of our SmartPhone");
//    }

}



public class default_method_57 {
    public static void main(String[] args) {
            Mysmartphone ms = new Mysmartphone();
            String[] ar= ms.getNetworks();
            for(String elements: ar){
                System.out.println(elements);
        }

            ms.record4k();
    }
}
