import java.util.Scanner;

public class java_study_05_08 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("마름모의 크기를 입력하세요 (홀수): ");
        int size = scanner.nextInt();
        scanner.close();

        if (size % 2 == 0) {
            System.out.println("홀수를 입력해야 합니다.");
            return;
        }

        int mid = size / 2;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // 상단 삼각형
                if (i <= mid) {
                    if (j >= mid - i && j <= mid + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // 하단 삼각형
                else {
                    if (j >= i - mid && j < size - (i - mid)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

}
