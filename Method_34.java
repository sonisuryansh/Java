public class Method_34 {
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
    // Method 5 For Problem 5 ;
//    static int fib(int n) {
//        if (n == 1) {
//            return 0;
//        } else if (n == 2) {
//            return 2;
//        } else {
//            return (n - 1) + n - 2;
//        }
        public static void main(String[]args){
            multiplication(5);     // Problem 1
            pattern(4);            // Problem 2
            int c = sumRac(3);
            System.out.println(c);      // Problem 3
//            pattern1(5);                  // Problem 4
        }
    }

