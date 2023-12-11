import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

class Cylinder{
    private int height;
    private int radius;
    // constructor
    public Cylinder(int h,int r){
        height = h;
        radius = r;
    }
    public Cylinder(int h){
        height = h;
//        radius = r;
    }

    public void setradius(int r){
        radius =r;
    }
    public int getradius(){
        return radius;
    }
    public void setheight(int h){
        height = h;
    }
    public int getheight(){
        return height;
    }
//    public float volume(){
//        float f = 3.14f*(radius*radius)*height;
//        return f;
//    }*/

}
    public class constructor_practice {

    public static void main(String[] args) {
        Cylinder LPG= new Cylinder(10,4);
//        LPG.setradius(4);
//        LPG.setheight(10);
//        System.out.println(LPG.getradius()+"cm");
//        System.out.println(LPG.getheight()+"cm");
//        System.out.println(LPG.volume());
        System.out.println(LPG.getheight());
        System.out.println(LPG.getradius());

    }
}
