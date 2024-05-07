import java.util.Scanner;

public class java_study_05_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 1. 1을 입력하려면 2초, 2는 3초, 3은 4ㅊ초 .... 0은 11초
         * 2. 문자열을 입력받고
         * 3. 특정문자를 숫자로 치환
         * 4. 숫자만큼 걸리는시간 더하기
         * 5. 시간 총합 출력
         */
        String snum = sc.nextLine();
        int calldtime = 0;
        for(int i =0;i<snum.length();i++){
            switch(snum.charAt(i)){

                case 'A': case 'B': case 'C':
                    calldtime += 3;
                    break;
                case 'D': case 'E': case 'F':
                    calldtime += 4;
                    break;
                case 'G': case 'H': case 'I':
                    calldtime += 5;
                    break;
                case 'J': case 'K': case 'L':
                    calldtime += 6;
                    break;
                case 'M': case 'N': case 'O':
                    calldtime += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    calldtime += 8;
                    break;
                case 'T': case 'U': case 'V':
                    calldtime += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    calldtime += 10;
                    break;
            }
        }
        System.out.println(calldtime);
        sc.close();
    }

}
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
 */
/*
 * public class Main {
    public static void main(String[] args) {
        System.out.println("         ,r'\"7");
        System.out.println("r`-_   ,'  ,/");
        System.out.println(" \\. \". L_r'");
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");
    }
}
 */
/*
 * import java.util.Scanner;

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
 */