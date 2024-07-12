package Arrays;
import java.util.Scanner;
public class present {

    // Qus: Sort an Array consisting of only 0 and 1!!

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    static void swapArray(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void sortZeroesAndOne(int[] arr){
        int n = arr.length;
        int zeroes = 0;
        // Count Number of Zeroes
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Original Array");
        printArray(arr);
        sortZeroesAndOne(arr);
        System.out.println("Sorted Array :");
        printArray(arr);

    }
}




//    static int[] makeFrequency(int[] arr){
//        int[] Freq = new int[100005];
//
//        for(int i=0;i<arr.length;i++){
//            Freq[arr[i]]++;
//        }
//        return Freq;
//    }
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter Array size :");
//    int n = sc.nextInt();
//    int[] arr = new int[n];
//
//    System.out.println("Enter "+n+" elements :");
//    for(int i=0;i<arr.length;i++){
//        arr[i] = sc.nextInt();
//
//    }
//    int[] freq = makeFrequency(arr);
//    System.out.println("Enter Number of queries :");
//    int q = sc.nextInt();
//    while(q>0){
//        System.out.println("Enter number to be searched :");
//        int x = sc.nextInt();
//        if(freq[x]>0){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }
//        q--;
//    }
//
//}
//}
