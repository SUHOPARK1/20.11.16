package day03;
// 별찍기 10번
import java.util.Scanner;
public class Ex14PrintStar10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------");
        System.out.println("별찍기 10번");
        System.out.println("---------");
        System.out.println("출력할 수: ");
        int userNumber = scanner.nextInt();
        for (int i = 1; i <= 2 * userNumber -1; i++) {
            String stars = new String();
            
            if(i == 1 || i == 2 * userNumber -1) {
                //맨 처음이나 맨 마지막 줄
                
                //별을 담당하는 j for 문
                for(int j = 1; j <= 2 * userNumber -1; j++) {
                    stars += "*";
                }                
            }else if(i < userNumber) {
                //맨 첫줄을 제외한 윗 부분
                //userNumber가 5이면
                //i가 2, 3, 4 일때 여기로 들어온다.
                
                //왼쪽 별을 담당하는 j for 문
                for(int j = i; j <= userNumber; j++) {
                    stars += "*";                   
                }   
                int upperI = i - 1;
                //가운데 공백을 담당하는 j for 문
                for(int j = 1; j <= 2 * upperI - 1; j++) {
                    stars += " ";
                } 
                //오른쪽 별을 담당하는 j for 문
                for(int j = i; j <= userNumber; j++) {
                    stars += "*";
                }
            } else {
                // 맨 마지막 줄을 제외한 아랫부분
                int lowerI = i - userNumber + 1;
                
                // 왼쪽 별을 담당하는 j for 문
                for(int j = 1; j <= lowerI; j++) {
                    stars += "*";
                }                                
                //전체폭을 게산하여 저장하는 maxwidth 변수
                int maxwidth = 2 * userNumber - 1;
                //공백폭을 계산하여 저장하는 spacewidth 변수
                int spacewidth = maxwidth - 2*lowerI;
                
                //가운데 공백을 담당하는 j for 문
                for(int j = 1; j <= spacewidth; j++) {
                    stars += " ";
                }
                
                
                //오른쪽 별을 담당하는 j for 문
                for(int j = 1; j <= lowerI; j++) {
                    stars += "*";
                }
            }
               
    
        
        
      
        System.out.println(stars);
    
    }
    
        
        scanner.close();
  }
}




