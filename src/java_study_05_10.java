import java.util.Scanner;

public class java_study_05_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        for (int i = 1; i<=a-1; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k = 1;k<(2*a-i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }

}
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int len = A.length();
        int lens = len/2;
        int cont = 0;

        if (len%2 == 0){ //문자열의 길이가 짝수일때
            for(int i = 0; i<(lens); i++){
                if(A.charAt((lens-1)-i) == A.charAt(lens+i)){
                    cont +=1;
                }
            }
        }
        else if (len%2 != 0){ //문자열의 길이가 홀수 일때
            for(int i = 0; i<(lens); i++){
                if(A.charAt((lens-1)-i) == A.charAt(lens+1+i)){
                    cont +=1;
                }
            }
        }
        if (cont == lens){
            System.out.println(1);
        }
        else {
            System.out.println(0);
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
        String A = sc.nextLine();
        A = A.toLowerCase();
        int arr[] = new int[26];
        char ch = '?';
        int max = 0;
        for (int i =0; i<A.length();i++){
            arr[A.charAt(i)-'a']++;
        }
        for (int i =0; i<26;i++){
            if(arr[i]>max){
                max = arr[i];
                ch = (char)( i +'A');
            }
            else if (arr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
        sc.close();
    }
}
 */