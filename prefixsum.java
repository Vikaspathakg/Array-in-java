package Arrays;
import java.util.Scanner;


public class prefixsum {

    // Qus: Check if we can partition the Array into two sub Arrays with equal sum. More formally, check that the Prefix sum
    // of a Part of the Array is equal to the suffix sum of rest the Array!!


    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    static int sumOfArrays(int[] arr){
        int totalsum = 0;
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];

        }
        return totalsum;
    }

   static boolean equalSumPartition(int[] arr){
        int totalsum = sumOfArrays(arr);
        int preSum = 0;
        for(int i=0;i<arr.length;i++){
            preSum = preSum + arr[i];

            int sufSum = totalsum - preSum;

            if(sufSum == preSum){
                return true;
            }
        }
        return false;
   }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array :" );
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" Elements :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Equal Partition Possible "+equalSumPartition(arr));
    }
}


////Qus: Given an Array of integers of size n. Answer q queries where you need to print the sum of values in a given range of indices from l to r (both included)
//// Note: The values of l and r in queries follow 1-based indexing!!
//
//
//static void printArray(int[] arr){
//    for(int i=0;i<arr.length;i++){
//        System.out.println(arr[i]+" ");
//    }
//    System.out.println();
//}
//
//static int[] makePrefixSumArray(int[] arr){
//    int n = arr.length;
//
//    for(int i=1;i<n;i++){
//        arr[i] = arr[i-1]+arr[i]  ;
//
//    }
//    return arr;
//
//}
//
//
//
//
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter size of Array :" );
//    int n = sc.nextInt();
//    int[] arr = new int[n+1];
//    System.out.println("Enter "+n+" Elements :");
//    for(int i=1;i<=n;i++){
//        arr[i] = sc.nextInt();
//
//    }
//    System.out.println("Original Array :");
//    printArray(arr);
//
//    int[] prefix = makePrefixSumArray(arr);
//    printArray(prefix);
//
//    System.out.println("Enter number of queries :");
//    int q = sc.nextInt();
//
//    while(q-- > 0){
//        System.out.println("Enter range :");
//        int l = sc.nextInt();
//        int r = sc.nextInt();
//
//        int ans = prefix[r] - prefix[l-1];
//        System.out.println(" Sum "+ans);
//
//    }
//
//}
//}






//static void printArray(int[] arr){
//    for(int i=0;i<arr.length;i++){
//        System.out.println(arr[i]+" ");
//    }
//    System.out.println();
//}
//
//static int[] makePrefixSumArray(int[] arr){
//    int n = arr.length;
//
//    for(int i=1;i<n;i++){
//        arr[i] = arr[i-1]+arr[i]  ;
//
//    }
//    return arr;
//
//}
//
//
//
//
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter size of Array :" );
//    int n = sc.nextInt();
//    int[] arr = new int[n];
//    System.out.println("Enter "+n+" Elements :");
//    for(int i=0;i<n;i++){
//        arr[i] = sc.nextInt();
//
//    }
//    System.out.println("Original Array :");
//    printArray(arr);
//
//    int[] ans = makePrefixSumArray(arr);
//    printArray(ans);
//
//}
//}
