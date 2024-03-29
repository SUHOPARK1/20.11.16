package day06;

import java.util.Scanner;

import util.ScannerUtil;

// Student 데이터타입에 직접 우리가 값을 넣고 출력하는 프로그램을 만들어보자

public class Ex04Struct01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s = new Student();

        System.out.println("번호: ");
        s.id = scanner.nextInt();

        System.out.println("이름: ");
        s.name = ScannerUtil.nextLine(scanner);

        s.korean = ScannerUtil.nextInt(scanner, "국어: ", 0, 100);

        s.english = ScannerUtil.nextInt(scanner, "영어: ", 0, 100);

        s.math = ScannerUtil.nextInt(scanner, "수학: ", 0, 100);

        System.out.printf("번호: %d, 이름 %s\n", s.id, s.name);
        System.out.printf("국어: %03d점, 영어: %03d점,수학: %03d점\n",
                s.korean, s.english, s.math);
        int sum = s.korean+ s.english+ s.math;
        double average = sum / 3.0;
        System.out.printf("총점: %03d점, 평균: %.2f점\n", sum, average);
        

    }

}
