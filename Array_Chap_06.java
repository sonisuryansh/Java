public class Array_Chap_06 {
    public static void main(String[] args) {
                int[] array = new int[]{1, 2, -3, -455, 5, 67};
                int max = 0;
                int[] var3 = array;
                int var4 = array.length;
                int i;
                for(i = 0; i < var4; ++i) {
                    int e = var3[i];
                    if (e > max) {
                        max = e;
                    }
                }
                System.out.println("The Maximum (max) number is in the array is " + max);
                boolean isShorted = true;
                int[] array1 = new int[]{2100, 881, 33, 88, 66};
                for(i = 0; i < array1.length - 1; ++i) {
                    if (array1[i] > array1[i + 1]) {
                        isShorted = false;
                        break;
                    }
                }
                if (isShorted) {
                    System.out.println("The array1 is Shorted");
                } else {
                    System.out.println("The array1 is not Shorted");
                }
            }
}
