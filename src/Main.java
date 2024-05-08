import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * 1. 숫자를 입력받는다
         * 2. 마름모 꼴로 별을 출력한다
         * 3. 2*N-1 줄 만큼 출력
         * 4. N이 5일때 기준 공백 4개 별1개 출력
         * 5. 2번째 줄 공백 3개 별 3개 출력
         * 6. 3번째 줄 공백 2개 별 5개 출력
         * 7. 5번째 줄 공백 0개 별 9개 출력이후 줄어들기
         */
        int a = sc.nextInt();
        for (int i = 1; i<=a;i++){
            for(int j = 1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();

        }
        sc.close();

    }
}