public class Array {
    public static void main(String[] args) {
        // Creating an Array
        System.out.print("Dicleration + Memory Allocation");
      int[]arr=new int[4];
      arr[0]=50;
      arr[1]=60;
      arr[2]=90;
      arr[3]=90;

        System.out.println("Dicleration +Initialize");
      int []arry={10,20,30,40,50};

      //Printing an Array
        System.out.println("Using For loop");
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
      }
        System.out.println("");


        System.out.print("Using For-each loop"+"\n");
        for(int a :arry){
            System.out.print(a+" ");
        }
        System.out.println(" ");

        // Multidiamensional Array

        int [][]a=new int[2][3];
        a[0][0]=60;
        a[0][1]=20;
        a[0][2]=30;
        a[1][0]=60;
        a[1][1]=70;
        a[1][2]=50;

        System.out.println("Printing Multidiamentional Array Using For loop");

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }




    }
    }

