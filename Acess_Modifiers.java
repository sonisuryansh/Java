class MyEmployee{
    private int id;
    private String Name;
    public MyEmployee(){
        id = 70;
        Name = "SURYANSH SONI GOOD MORNING ";
    }
    public MyEmployee(String myname){
        id =  90;
        Name = myname;
    }
    public void setid(int i){
        id = i;
    }
    public int getid(){
        return id;
    }
    public void setname(String n){
        Name = n;
    }
    public String getname(){
        return Name;
    }
}
public class cwh_40_Acess_Modifiers{
    public static void main(String[] args) {
        MyEmployee Suryansh = new MyEmployee("Soni ji good nightm");
        Suryansh.setid(53);
        Suryansh.setname("Suryansh Soni");
        System.out.println(Suryansh.getid());
        System.out.println(Suryansh.getname());
    }
}


