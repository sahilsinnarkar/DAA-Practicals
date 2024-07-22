import java.util.*;

class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Enter number to check prime : ");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.print("The number " + n + " is Prime.");
        } else {
            System.out.print("The number " + n + " is Not Prime.");
        }
        sc.close();
    }
}