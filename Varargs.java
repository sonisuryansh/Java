public class Varargs{
    static int sum( int x,int...arr){
        int result =x;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sum(5,6));
        System.out.println(sum(4,6,7,5,888,8745,546));
    }
}
