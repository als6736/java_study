import java.util.Scanner;

public class java_study_04_29 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = null;
        a = new int[N];

        for(int f= 0; f<M;f++){
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            int k = sc.nextInt();

            for (; i<=j;i++){
                a[i]=k;
            }

        }
        for(int q =0; q<N;q++){
            System.out.print(a[q]+" ");
        }
        sc.close();
    }

}
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = 0;
        int[] b = null;
        b = new int[a];
        for (int i = 0; i<a; i++){
            b[i] = sc.nextInt();
        }
        int c = sc.nextInt();

        for(int j = 0;j<a;j++){
            if(b[j]==c){
                d+=1;
            }
        }
        System.out.println(d);
    }

}
 */
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] c = null;
        c = new int[a];

        for(int i = 0; i<a; i++){
            c[i] = sc.nextInt();
        }

        for(int j=0;j<a;j++){
            if(c[j]<b){
                System.out.print(c[j]+" ");
            }
        }
    }

}
 */
/*
 * import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b= null;
        b = new int[a];

        for(int i = 0; i<a;i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);

        System.out.println(b[0]+" "+b[a-1]);
    }

}
 */
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 9;
        int[] b = null;
        b = new int[a];
        int max = 0;
        int maxindex = 0;
        for(int j = 0; j<a;j++){
            b[j] = sc.nextInt();
            if (b[j]>max){
                max = b[j];
                maxindex = j+1;

            }
        } 
        System.out.println(max+"\n"+maxindex);
        
    }

}
 */
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = null;
        a = new int[N];
        int qwe = 0;

        for(int k=0;k<N;k++){
            a[k] = k+1;
        }
        for(int f= 0; f<M;f++){
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;

            qwe = a[i];
            a[i] = a[j];
            a[j] = qwe;

        }
        for(int q =0; q<N;q++){
            System.out.print(a[q]+" ");
        }
    }

}
 */
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] b = new int[30]; 
        
        for(int i =0;i<28;i++){
            int num = sc.nextInt();
            b[num-1]=1;
        }
        for(int j = 0;j<30;j++){
            if(b[j]==0){
                System.out.println(j+1);
            }
        }
    }

}
 */
/*
 * import java.io.BufferedReader;
import java.io.IOException;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i< 10; i++){
            hs.add(Integer.parseInt(br.readLine()) % 42);
        }
        br.close();
        System.out.println(hs.size());
    }

}
 */