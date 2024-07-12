package Arrays;
import java.util.Scanner;
class arrayexample{
    void maxofarray(){
        int[] arr = {3,15,45,89};
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans = arr[i];
            }

        }
        System.out.println("The Max Value the Array :"+ans);
    }
    void sumofarray(){
        int[] a = {5,3,4,6};
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            sum+=a[i];

        }
        System.out.println("The sum is : "+sum);
        return;
    }
    void multiarray(){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr[0][0]);//1
        System.out.println(arr[0][1]);//2
        System.out.println(arr[0][2]);//3


    }
    void demo(){
        int[] age = new int[3];
        float[] marks = new float[3];
        String[] names = new String[3];
        age[0] = 4;
        age[1] = 18;
        age[2] = 25;
       // System.out.println(age[0]);
        //System.out.println(age[1]);
       // System.out.println(age[2]);
        //System.out.println(age.length);
        for(int i=0;i<3;i++){
            System.out.println(age[i]);
        }

        // For each Loop!
        for(int x:age){
            System.out.println("This is printing with the help of For Each Loop : "+x);
        }

    }
}




public class basicofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arrayexample obj = new arrayexample();
        //obj.demo();
       // obj.multiarray();
        //obj.sumofarray();
        obj.maxofarray();


    }
}
