package day05;

import java.util.Scanner;

import util.ScannerUtil;

// 사용자로부터 숫자를 입력 받아서
// 1회차 국영수
// 2회차 국영수
// 3회차 국영수
// 4회차 국영수
// 를 입력하는 2차원 배열 프로그램
public class Ex12GradeBook01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 점수를 저장할 2차원 배열을 마들어준다.
        // 단 1차원 배열은 각 회차의 국영수 점수를 담아야 한다.
        int[][] scoreArray = new int[4][3]; // 4=4회차임, 3은 국영수임
        for (int i = 0; i < scoreArray.length; i++) {
            System.out.println("----" + (i + 1) + "회차----");

            // i번째 회차의 국어점수는 scoreArray[i]번째의 0번칸에 넣어주면 된다.
            scoreArray[i][0] = ScannerUtil.nextInt(scanner, "국어: ", 0, 100);

            // i번째 회차의 영어점수는 scoreArray[i]번째의 1번칸에 넣어주면 된다.
            scoreArray[i][1] = ScannerUtil.nextInt(scanner, "영어: ", 0, 100);

            // i번째 회차의 수학점수는 scoreArray[i]번째의 2번칸에 넣어주면 된다.
            scoreArray[i][2] = ScannerUtil.nextInt(scanner, "수학: ", 0, 100);

            System.out.println("-------------");
        }

        // 입력된 정보들을 회차별로 출력한다.
        for (int i = 0; i < scoreArray.length; i++) {
            System.out.printf("-------%d회차 점수 요약 -------\n", (i + 1));
            // scoreArray의 i번 인덱스 배열의 0번 인덱스는 국어점수이니 임시변수 korean에 넣어주자
            int korean = scoreArray[i][0];
            
            // scoreArray의 i번 인덱스 배열의 0번 인덱스는 국어점수이니 임시변수 english에 넣어주자
            int english = scoreArray[i][1];
            
            // scoreArray의 i번 인덱스 배열의 0번 인덱스는 국어점수이니 임시변수 math에 넣어주자
            int math = scoreArray[i][2];
            
            // 총점과 평균을 별개의 임시변수에 저장한다.
            int sum = korean + english + math;
            double average = sum / (double)scoreArray[i].length;
            
            System.out.printf("국어: %03d점 영어: %03d점 수학 %03d점\n", korean, english, math);
            System.out.printf("총점: %03d점 평균: %.2f점\n", sum, average);
            

            System.out.printf("--------------------------");
        }

        scanner.close();
    }

}




