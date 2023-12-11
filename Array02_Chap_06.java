public class Array02_Chap_06 {
    public static void main(String[] args) {
                // Arrays
                // First way to represent Array(decleration then memory allogation)
        int []marks;
        marks=new int[5];
        marks[0]=66;
        marks[1]=30;
        marks[2]=58;
        marks[3]=89;
        marks[4]=97;
                //Second way to representing array (Dicleration+MemoryAllocation
        int[]marks1={45,65,96,47,23};
                //Array length;
        System.out.println(marks.length);
        System.out.println(marks1.length);
                //Displaying Array
                //using forloop
        System.out.println("For First Array ");
        for(int i=0;i<(marks.length-1);i++){
            System.out.println(marks[i]);
        }
        System.out.println("For Second Array ");
        for(int i=0;i<(marks1.length-1);i++){
            System.out.println(marks1[i]);
        }
                //Using For Eachloop
        System.out.println("Using For-Each loop for First array");
        for(int elements:marks){
            System.out.println(elements);
        }
        System.out.println("Using For-Each loop for second array");
        for(int elements:marks1){
            System.out.println(elements);
        }
                // multidiamensional Array
        int [][]flats= new int[2][3];
        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        for(int i=0;i<flats.length;i++){
            for(int j =0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
                //////Practice////////
        // Practice Problem 1
        float[]marks23= {10.2f,50.2f,30.9f,69.3f,58.9f};
        float sum= 0;
        for(float elements:marks){
            sum=sum+elements;
        }
        System.out.println("The value of the sum is "+  sum);
                // Practice Problem 2
        float[]marks00= {10.2f,50.2f,30.9f,69.3f,58.9f};
        float num= 50.2f;
        boolean isinArray = false;
        for(float elements:marks){
            if(num==elements){
                isinArray= true;
                break;
            }
        }
            if(isinArray){
                System.out.println("The value is present in Array ");
            }
            else{
                System.out.println("The Value is Not Present in The Array");
            }
                //Practic Problem 3
        float[]marks11= {10.2f,50.2f,30.9f,69.3f,58.9f};
        float sum1= 0;
        for(float elements:marks) {
            sum = sum + elements;
        }
        System.out.println("The value of Avarage marksis "+  sum/marks.length);
                //Practice Problem 4
                // incomplete
        int [][]matrix1={{1,2,3},
                        {4,5,6}};
        int [][]matrix2={{2,6,13},
                         {3,7,1}};
        int [][]result={ {0,0,0},
                         {0,0,0}};
        for(int i=0;i<matrix1.length;i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(result[i][j]+ " ");
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
            System.out.println("");
        }
                ///// Practice Problem 5 ///////
                // i=  0 , 1, 2,  3
                //   { 7 , 9, 12, 11}
                //   0<-->3    (l-i-1)    ;l = =length ,i==variable
                //   1<-->2
        int [] array = {1,2,3,4,5,};
        int l = array.length;
        int tempbox;
        int n = Math.floorDiv(array.length,2);
        for(int i =0;i<n;i++){
            //swap a[i] and a[l-1-i]
            tempbox = array[i];
            array[i] = array[l-1-i];
            array[l-1-i] = tempbox;
        }
        for(int element: array){
            System.out.print(element+" ");
        }
                /////////Practice Problem 6///////////
                int [] array13 = {1,2,-3,-455,5,67};
                int max = 0;
                for(int e:array){
                    if(e>max){
                        max = e;

                    }
                }
                System.out.println("The Maximum (max) number is in the array is "+max);
                //// Practice Problem 8
                boolean isShorted =true;
                int []array1 = {2100,881,33,88,66};
                for(int i =0;i<array1.length-1;i++){
                    if(array1[i]>array1[i+1]){
                        isShorted = false;
                        break;
                    }
                }if(isShorted){
                    System.out.println("The array1 is Shorted");
                }
                else{
                    System.out.println("The array1 is not Shorted");
                }
    }
}
