import java.util.*;

class MaxSubArrayBrute {

    public static int maxSubArraySum(int arr[], int startIndex, int endIndex){
        int maxSum = Integer.MIN_VALUE;
        for(int i=startIndex;i<=endIndex;i++){
            int sum=0;
            for (int j = i; j <= endIndex; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.print("Enter start index: ");
        int startIndex = sc.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = sc.nextInt();
        int maxSum = maxSubArraySum(arr, startIndex, endIndex);
        System.out.println("Maximum sub array sum = " + maxSum);
        sc.close();
    }
}