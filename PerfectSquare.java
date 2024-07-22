import java.util.*;

class PerfectSquare {
    private static boolean checkPerfectSquare(double num) {
        double sqrt = Math.sqrt(num);
        return((sqrt - Math.floor(sqrt)) == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(checkPerfectSquare(n)){
            System.out.println("It is perfect square");
        } else {
            System.out.println("It is not perfect square.");
        }
        sc.close();
    }
}