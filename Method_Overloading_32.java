import java.util.Scanner;
public class Method_Overloading_32 {
//    Method 1
//     When we don't want to return anything then we use "Void" method
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
    public static void main(String[] args) {
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

