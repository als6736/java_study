import java.util.Scanner;

public class java_study_04_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int c=b/100;
        int d=(b-(c*100))/10;
        int e=b-(c*100)-(d*10);

        System.out.println(a*e);
        System.out.println(a*d);
        System.out.println(a*c);
        System.out.println(a*b);
        
        sc.close();
    }
}
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        b=b+c;
        if (b>=60){
            a=a+(b/60);
            b=b%60;
            if (a>=24){
                a=a-24;
            }

        }
        System.out.println(a+" "+b);
    }
}

 */

 /*
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max=0;

        if(a==b && b==c){
            System.out.println(10000+(a*1000));
        }
        else if (a==b || b==c || c==a){
            if(a==b){
                System.out.println(1000+(a*100));
            }
            else if(b==c){
                System.out.println(1000+(b*100));
            }
            else if(c==a){
                System.out.println(1000+(c*100));
            }

        }
        else {
            if (a>=b && a>=c){
                max = a;
            }
            else if (b>=a && b>=c){
                max = b;
            }
            else {
                max = c;
            }
            System.out.println(max*100);
        }
    }
}

 */ 