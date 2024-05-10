import java.util.Scanner;

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