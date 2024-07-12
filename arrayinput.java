package Arrays;
import java.util.Scanner;
public class arrayinput {
//    static int pairSum(int[] arr,int x){
//        int n = arr.length;
//        int ans = 0;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]+arr[j]==x){
//                    ans++;
//                }
//            }
//        }
//        return ans;
//    }
    // Count the Number of triplets whose sum equal to the given value x!!
//    static int tripletSum(int[] arr,int x){
//        int n = arr.length;
//        int ans = 0;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                for(int k=j+1;k<n;k++){
//                    if(arr[i]+arr[j]+arr[k]==x){
//                        ans++;
//                    }
//                }
//            }
//        }
//        return ans;
//    }

    // Find the unique number in a given Array where all the elements are being repeated twice with one value being unique!!
//    static  int findUnique(int[] arr){
//        int n = arr.length;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]==arr[j]){
//                    arr[i] = -1;
//                    arr[j] = -1;
//                }
//            }
//        }
//        int ans = -1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>0){
//                ans = arr[i];
//            }
//        }
//        return ans;
//    }

    // Find the second largest element in the given Array!!

//    static int findMax(int[] arr){
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//    static int findSmax(int[] arr){
//        int max = findMax(arr);
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==max){
//                arr[i] = Integer.MIN_VALUE;
//            }
//
//        }
//        int secondmax = findMax(arr);
//
//        return secondmax;
//    }

    // Find second smallest in an given Array!!
//    static int findMax(int[] arr){
//        int max = Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//    static int findSmax(int[] arr){
//        int max = findMax(arr);
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==max){
//                arr[i] = Integer.MAX_VALUE;
//            }
//
//        }
//        int secondmax = findMax(arr);
//
//        return secondmax;
//    }

    // Given an Array 'a' consisting of integers.Return the first value that is repeating in this Array.if no value is being repeated,return -1!!
//    static int firstRepeating(int[] arr){
//        int n = arr.length;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]==arr[j]){
//                    return arr[i];
//                }
//            }
//        }
//        return -1;
//    }

    //Reverse an Array consisting integer values!!
    static void prinArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
//    static int[] findReverse(int[] arr){
//        int n = arr.length;
//        int[] ans = new int[n];
//        int j = 0;
//
//        for(int i=n-1;i>=0;i--){
//            ans[j++]=arr[i];
//        }
//        return ans;
//    }
//    static void swapInarray(int[] arr,int i,int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

    // Second Method!!
//    static void reverseArray(int[] arr){
//        int i = 0, j = arr.length-1;
//        while (i<j){
//            swapInarray(arr,i,j);
//            i++;
//            j--;
//        }
//    }

    // Rotate the given Array 'a' by k steps.where k is non-negative.Note k can be greater than n as well!!
//    static int[] rotate(int[] arr,int k){
//        int n = arr.length;
//        k = k%n;
//        int[] ans = new int[n];
//        int j = 0;
//        for(int i=n-k;i<n;i++){
//            ans[j++] = arr[i];
//
//        }
//        for(int i=0;i<n-k;i++){
//            ans[j++] = arr[i];
//
//        }
//        return ans;
//
//    }

    // Rotate the given Array 'a' by k steps. without extra space.where k is non-negative.Note k can be greater than n as well!!
        static void swapInarray(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
        static void reverse(int[] arr,int i,int j){
//        int i = 0, j = arr.length-1;
        while (i<j){
            swapInarray(arr,i,j);
            i++;
            j--;
        }
    }

    static void rotateInplace(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }












    public static void main(String[] args) {
        System.out.println("Enter size of Array: " );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" Elements :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k :");
        int k = sc.nextInt();

        System.out.println("Original Array :");
        prinArray(arr);

//        int[] ans = rotate(arr,k);
          rotateInplace(arr,k);

        System.out.println("Array after Rotation :");
        prinArray(arr);


//        System.out.println("Your inputed Array Is :");
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
        //System.out.println("Enter the Target Value :");
       // int x = sc.nextInt();
        //System.out.println(pairSum(arr,x));
       // System.out.println(tripletSum(arr,x));
        //System.out.println(findUnique(arr));
       // System.out.println(findMax(arr));
        //System.out.println(findSmax(arr));
        //System.out.println("First repeating value is "+firstRepeating(arr)+" ");

       // int[] arr = {1,2,3,4,5};
        //int[] res = findReverse(arr);
        //prinArray(res);
       // reverseArray(arr);
      //  prinArray(arr);




    }
}