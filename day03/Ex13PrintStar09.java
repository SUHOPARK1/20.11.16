package day03;
// 별찍기 9번
import java.util.Scanner;

public class Ex13PrintStar09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------");
        System.out.println("별찍기 9번");
        System.out.println("---------");
        System.out.println("출력할 수: ");
        int userNumber = scanner.nextInt();
        for (int i = 1; i <= 2 * userNumber; i++) {
            String stars = new String();
            int controlI = 0;
            if (i < userNumber) {
                controlI = i;
            } else {
                controlI = 2 * userNumber - i;
            }
                // 공백을 담당하는 j for 문
                for (int j = 1; j <= userNumber - controlI; j++) {
                    stars += " ";
                }

                // 별을 담당하는 j for 문
                for (int j = 1; j <= 2 * controlI - 1; j++) {
                    stars += "*";
                }

            

            System.out.println(stars);
        }

        scanner.close();
    }
}
