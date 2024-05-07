import java.util.Scanner;

public class java_study_04_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<10;i++){
            System.out.println(a+" * "+i+" = "+a*i);
        }
        sc.close();
    }

}
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b,c;
        for(int i = 0;i<a;i++){
            b = sc.nextInt();
            c = sc.nextInt();
            System.out.println(b+c);
        }
    }

}

 */
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        
        for(int i = 1;i<=a; i++){
            b=b+i;
        }
        System.out.println(b);
    }

}

 */
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        int d,e;

        for(int i = 0; i<b;i++){
            d = sc.nextInt();
            e = sc.nextInt();

            c=c+d*e;
        }
        if(a==c){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

 */
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        b = a / 4;

        for(int i = 0; i < b ;i++ ){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
 */
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        
        bw.close();
    }

}
 */
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i<a ; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println("Case #"+(i+1)+": "+(b+c));
        }
    }

}
 */
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i<a ; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println("Case #"+(i+1)+": "+b+" + "+c+" = "+(b+c));
        }
    }

}
 */
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for(int i = 1; i<=a; i++){
            for(int k = a-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
           System.out.println();
        }
    }

}
 */
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0){
                break;
            }
            System.out.println(a+b);
        }
        
    }

}
 */
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
            System.out.print(sc.nextLine());
        }
        sc.close();
        
    }

}
 */