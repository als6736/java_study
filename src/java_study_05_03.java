import java.util.Scanner;

public class java_study_05_03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        String b = sc.nextLine();

        for(int i = 0; i < a; i++){
            if(Character.isDigit(b.charAt(i))){
                sum += Character.getNumericValue(b.charAt(i));
            }
        }
        System.out.println(sum);

        sc.close();
    }
}
/*
 * 
 */