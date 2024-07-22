import java.util.*;

class JosephusArray {

    private static int josephus(int n, int k){
        boolean people[] = new boolean[n];
        for(int i = 0; i < people.length; i++){
            people[i] = true;
        }

        int count = n, index = -1, step = 0;

        while(count > 1){
            step = 0;
            while(step < k){
                index = (index + 1) % n;
                if(people[index]){
                    step++;
                }
            }
            people[index] = false;
            count--;
        }

        for(int i = 0; i < n; i++){
            if(people[i]){
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people : ");
        int n = sc.nextInt();
        System.out.print("Enter number of skip : ");
        int k = sc.nextInt();
        int surviver = josephus(n, k);
        System.out.println("Surviver = " + surviver);

        sc.close();
    }    
}
