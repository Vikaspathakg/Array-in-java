package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class arraysquestions {
//    static void printarray(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println();
//    }
        // Qus: Count the number of occurrences of a particular element x.
//    static int countOccurrences(int[] arr,int x){
//        int count = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] == x){
//                count++;
//            }
//
//        }
//        return count;
//
//    }
   // Qus: Find the last occurrence of an element x in a given array.
    static int lastoccurrence(int[] arr,int x){
        int lastindex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                lastindex = arr[i];
            }
        }
        return lastindex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array :");
       // int n = sc.nextInt();
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
//        System.out.println("Original Array :");
//        printarray(arr);
//
//      //  int[] arr2 = arr.clone();
//        // Or
//        int[] arr2 = Arrays.copyOf(arr,arr.length);
//        System.out.println("Copied array arr2 :");
//        printarray(arr2);
//
//        arr2[0] = 4;
//        arr2[1] = 8;
//
//        System.out.println("original Array after changing arr2 :");
//        printarray(arr);
//
//        System.out.println("copied Array after changing arr2 :");
//        printarray(arr2);
//
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x :");
        int x = sc.nextInt();

       // System.out.println("Count of X : "+countOccurrences(arr,x));
        System.out.println("Last occurrence of x :"+lastoccurrence(arr,x));




    }
}
