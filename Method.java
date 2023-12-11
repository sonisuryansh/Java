import java.util.Scanner;
public class Method {
    public static void printmassage(String massage) {
        System.out.println(massage);
    }
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = (x + y) * 5;
        } else {
            z = x + y;
        }
        return z;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number ");
        int b = sc.nextInt();
        // CALLING LOGIC usig object creation
        Method obj = new Method();
        int Result_of_first_mathod = obj.logic(a,b);
        // LOGIC CALLING STATIC MAtHOD
        int sum = logic(a, b);
        System.out.println(sum);
    }
    static void tellJoke(){
        System.out.println("I invented a new word!\n"+"Plagiarism");
    }
}