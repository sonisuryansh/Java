import java.util.Scanner;
import java.sql.SQLOutput;
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
    // Method 1 for problem 1
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }
    // Method 2 for problem 2
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Method 3 for problem 3
    static int sumRac(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRac(n - 1);
        }
    }
    //          Method 4 For Problem 4;
    static void pattern1(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void tellJoke(){
        System.out.println("I invented a new word!\n"+"Plagiarism");
    }
    //    Method 2
    static void change(int a){
        a = 98;
    }
    //    Method 3
    static void change2(int[]arr){
        Scanner sc = new Scanner(System.in);
        arr [0]= sc.nextInt();
        arr [1]= sc.nextInt();
        arr [2]= sc.nextInt();
        arr [3]= sc.nextInt();
        arr [4]= sc.nextInt();
        arr [5]= sc.nextInt();
    }
    //    Method 4
    static void foo(){
        System.out.println("Good Morning Suryasnh");
    }
    static void foo(String a){
        System.out.println("Good Morning "+ a +" Bro!");
    }
    static void foo(String a, String b){
        System.out.println("Good Morning "+ a +" Bro!");
        System.out.println("Good Morning "+ b +" Bro!");
    }
  class A{
        public int a;
        public int harry(){
            return 4;
        }
        public void meth2(){
            System.out.println("I am method 2 of Class A ");
        }
    }
    class B extends A{
        @Override
        public void meth2(){
            System.out.println("I am method 2 of class B ");
        }
        public void meth3(){
            System.out.println("I am method 3 of Class B ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number ");
        int b = sc.nextInt();
        // CALLING LOGIC usig object creation
        Method obj = new Method();
        int Result_of_first_mathod = obj.logic(a, b);
        // LOGIC CALLING STATIC MAtHOD
        int sum = logic(a, b);
        System.out.println(sum);
        multiplication(5);     // Problem 1
        pattern(4);            // Problem 2
        int c = sumRac(3);
        System.out.println(c);      // Problem 3
//            pattern1(5);                  // Problem 4

        tellJoke();
//        case 1 = changing the integer
        int x= 45;
        change(x);
        System.out.println("The value of x after running change is : "+ x);
//        case II CHANGING THE ARRAY
        int []marks = {52,73,75,89,98,94};
        change2(marks);
        for(int element: marks){
            System.out.println("The Value after using Chang2 Method "+ element);
        }
        foo();
        foo("Vansh");
        foo("Shobhit","Abhikalp");
    }
}
