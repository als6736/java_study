import java.util.Scanner;

public class java_study_05_04{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        for(int i = 97; i<123;i++){
            System.out.print(S.indexOf(i)+" ");
        }

        sc.close();
    }
}
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i<T;i++){
            int R = sc.nextInt();
            String S = sc.next();
            for(int j = 0; j<S.length();j++){
                for(int k =0; k<R;k++){
                    System.out.print(S.charAt(j));
                }
                
            }
            System.out.println();
        }
        sc.close();
    }
}
 */