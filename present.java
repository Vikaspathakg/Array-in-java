package Arrays;
import java.util.Scanner;
public class present {
    static int[] makeFrequency(int[] arr){
        int[] Freq = new int[100005];

        for(int i=0;i<arr.length;i++){
            Freq[arr[i]]++;
        }
        return Freq;
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
        int[] freq = makeFrequency(arr);
        System.out.println("Enter Number of queries :");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("Enter number to be searched :");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            q--;
        }

    }
}
