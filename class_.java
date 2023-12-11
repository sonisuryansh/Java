import java.util.Scanner;
public class class_ {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Your Marks in physics");
                byte m1 = sc.nextByte();
                System.out.println("Enter Your Marks in Chemistry");
                byte m2 = sc.nextByte();
                System.out.println("Enter Your Marks in Mathematics");
                byte m3 = sc.nextByte();
                float avg = (float)(m1 + m2 + m3) / 3.0F;
                System.out.println("Overall percentage is: " + avg);
                if (avg >= 40.0F && m1 >= 33 && m2 >= 33 && m3 >= 33) {
                    System.out.println("Congratulation you are passed");
                } else {
                    System.out.println("Sorry You are Failed ,Fill the Back form.");
                }
                Scanner sc1 = new Scanner(System.in);
                float f = sc1.nextFloat();
                float f1 = sc.nextFloat();
            }
}
