import java.util.Scanner;

class MaxSubArrayKadene {
    public static int kadene(int arr[], int startIndex, int endIndex){
        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        for(int i=startIndex; i<=endIndex; i++){
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
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
        int maxSum = kadene(arr, startIndex, endIndex);
        System.out.println("Maximum sub array sum = " + maxSum);
        sc.close();
    }    
}
