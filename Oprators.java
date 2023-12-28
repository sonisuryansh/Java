public class Oprators{
    public static void main(String[]args){
        int age = 18;
        boolean cond = (age==18);
        if(cond){
            System.out.println("Yes, Boy You Can Drive!");
        }
        else{
            System.out.println("No Boy You Cannot Drive Yet ");
        }
        boolean a = true;
        boolean b = false;
        System.out.println(!a);
        System.out.println(!b);
        String var = "Suryansh";
        switch(var){
            case "Ayush":
                System.out.println("you are going to become an Adult");
                break;
            case "Yash":
                System.out.println("you are going to join a job");
                break;
            case "Suryansh":
                System.out.println("you are going to Retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        if (age>=56){
            System.out.println("You are experinced");
        }
        else if(age>=45){
            System.out.println("You are semi- Experinced");
        }
        else if(age>=36){
            System.out.println("You are semi semi expeinced");
        }
        else if(age>=15){
            System.out.println("you are not experinced");
        }
        if(age>=2){
            System.out.println("You are a Baby");
        }
        if (age > 56) {
            System.out.println("you are experinced! ");
        } else if (age > 46) {
            System.out.println("you are semi experienced");
        } else if (age > 36) {
            System.out.println("you are semi semi expperinced");
        } else {
            System.out.println("you are not experinced ");
        }
        if (age > 2) {
            System.out.println("You are not a baby");
        }
    }
}
