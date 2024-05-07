import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {1,1,2,2,2,8};
        int[] B = new int[6];
        int[] C = new int[6];
        for(int i = 0; i<6;i++){
            B[i] = sc.nextInt();
            C[i] = A[i] - B[i];
            System.out.print(C[i]+" ");
        }
        sc.close();

    }
}