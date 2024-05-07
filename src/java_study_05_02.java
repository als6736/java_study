public class java_study_05_02 {

}

/*
 * import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
         * 1. 배열을 a길이만큼 만듦
         * 2. 배열안에 인덱스 순서대로 1 2 3 4 ... a 까지 만듦
         * 3. m만큼 순서를 뒤집을것
         * 4. 인덱스 번호 j 부터 k까지 뒤집을것
         * 5. 출력
         * 4번을 어떻게 구현할 것인가
         
        int[] num = new int[N];
        for (int i = 0; i<N;i++){
            num[i]=i+1;
        }
        for (int i = 0; i<M;i++){
            int j = sc.nextInt()-1;
            int k = sc.nextInt()-1;
            while (j < k){
                int temp = num[j];
                num[j++] = num[k];
                num[k--] = temp;
            }
        }
        for (int i = 0; i<N;i++){
            System.out.print(num[i]+" ");
        }
        
    }

}
 */
/*
 * import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 인덱스 수 N개 입력
        // 2. N 개만큼의 성적 입력
        // 3. 성적중 가장 높은 성적 선택해서 M으로 설정
        // 4. 모든성적에 성적/M*100 한후 다 더하고 N개로 나눔 이후 출력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double sum = 0;
        int[] num = new int[N];

        for (int i = 0; i<N; i++){
            num[i]= sc.nextInt();
        }
        int M = Arrays.stream(num).max().getAsInt();

        for (int i = 0; i<N; i++){
            sum = (sum + (num[i]/(double)M*100));
        }
        System.out.println(sum/N);
        
    }

}
 */
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        System.out.println(a.charAt(b-1));
        sc.close();
    }

}
 */
/*
 * import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a.length());

        sc.close();
    }
}
 */
/*
 * import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine(); // nextInt는 줄바꿈을 하지않아서 nextLine으로 한번 줄바꿈을해야한다

        for(int i = 0; i<a; i ++){
            String b = sc.nextLine();
            System.out.println(b.charAt(0)+""+b.charAt(b.length()-1));
        }

        sc.close();

    }
}
 */
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = a.charAt(0);
        System.out.println(b);
        
        sc.close();
    }
}
 */