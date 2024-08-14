import java.util.*;
class FindingMaxSumOfSubArray{
    public static int maxSumOfSubArray(int[] arr, int n, int s){
        if(n<=s){
            System.out.println("Invalid");
            return -1;
        }
        int maxSum = 0;
        for(int i = 0; i < s;i++){
            maxSum += arr[i];
        }
        int window_sum = maxSum;
        for(int i = s; i < n; i++){
            window_sum += arr[i] - arr[i-s];
            if(window_sum > maxSum)
            maxSum = window_sum;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner In = new Scanner (System.in);
        System.out.println("Enter the Number of Element: ");
        int len = In.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the Element: ");
        for(int i = 0; i < len; i++){
            arr[i] = In.nextInt();
        }
        System.out.println("ENter the Sub Array Size");
        int s = In.nextInt();
        System.out.println(maxSumOfSubArray(arr,len,s));
    }
}