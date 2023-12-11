public class loop_control_instruction {
    public static void main(String[] args) {
                int b = 0;
                do {
                    ++b;
                    if (b == 2) {
                        System.out.println("Ending the loop");
                    } else {
                        System.out.println(b);
                        System.out.println("Java is Great");
                    }
                } while(b < 45);
            }
}
