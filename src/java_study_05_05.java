import java.util.Scanner;

public class java_study_05_05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int Count = 0;
        for(int i = 0; i<A.length();i++){
            if(A.charAt(i) == ' '){
                Count += 1;
            }
        }
        if(A.charAt(0) == ' '){
            Count -= 1;
        }
        if(A.charAt(A.length()-1) == ' '){
            Count -= 1;
        }
        System.out.println(Count+1);
        sc.close();
    }

}
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String Ar = "";
        String Br = "";
        for (int i = A.length()-1; i>= 0;i--){
            Ar += A.charAt(i);
        }
        for (int i = B.length()-1; i>= 0;i--){
            Br += B.charAt(i);
        }
        int Ai = Integer.parseInt(Ar);
        int Bi = Integer.parseInt(Br);
        if(Ai>Bi){
            System.out.println(Ar);
        }
        else if (Bi>Ai){
            System.out.println(Br);
        }
        
        sc.close();
    }
}
 */