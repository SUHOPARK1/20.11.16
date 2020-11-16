package day03;
// 반복문
// 반복문이란 특정 조건이 true가 나오는 동안 
// 코드 블럭을 반복시키는 코드를 반복문이라고 한다.

// 반복문에는 for 반복문과 while 반복문 2가지가 있다.
// for 반복문 : 비교적 횟수가 명확하게 나옴.
// while 반복문 : 조건식이 true인동안 계속 돌아감.

// for 반복문은
// 제어변수가 특정 조건식을 만족하는 동안 코드를 반복하고
// 제어변수의 값을 변화시켜서 다시 조건식을 체크해서 true면 반복, false면 반복종료가 된다.
public class Ex01For {
    public static void main(String[] args) {
        //for 반복문은 다음과 같은 양식을 가진다.
        // for(제어변수의 선언과 초기화; 조건식; 변환식){
        //     반복할 코드
        // }
        // 제어변수의 선언과 초기화는 for문 이전에 선언과 초기화해주어도 괜찮다.
        
        // 제일 흔한 형태는 다음과 같이 만들어줄 수 있다.
        for(int i = 0; i < 4; i++) {
            System.out.println("i의 현재값: "+i);
        }
        // 1. int i
        // 2. i = 0
        // 3. i < 4
        // 4. System.out.println("i의 현재값: "+i)
        // 5. i++
        // 6. 이후론 3->4->5 반복
        // 7. 3이 false가 나오면 반복문 종료
        
        // 전통적으로, for 반복문의 컨트롤 변수는
        // i -> j -> k ... 순으로 들어간다.
        // 또한 컨트롤 변수의 초기화나 조건식에 다른 변수가 들어갈 수도 있다!
        
        
        // 하지만 맨 처음부터 조건식이 false가 나온다면 해당 반복문은 아예 실행이 되지 않는다.
        for(int i = 10; i < 0; i++) {
            System.out.println("실행될까?");         
                       
        }    
        
        // 또한, 여러분들이 흔히 하는 실수중에 for() 뒤에 곧장 ; 을 붙이는데 의미가 달라지게 된다.
        for(int i = 0; i < 4; i++);{
            System.out.println("몇번 반복될까?"); 
        }
        
        // 위 코드에서 ; 이 붙음으로써
        // 해당 for문은 반복할 내용이 없는 반복문이 되게 된다.
        // 즉, 정상적이였으면
        // System.out.println("몇번 반복될까?");
        // 가 멤리 영억에 4번 등록이 되지만
        // 지금 같은 경우에는 딱 1번 등록이 된다.
        // 즉 해당 코드 블락은 for 반복문에 포함된것이 아니라
        // 그저 별개의 코드 한줄이 된 것이다.
        
        
        // 또한 컨트롤 변수는 해당 for문에서 선언됐을 때에는
        // 스코프가 해당 for문이다.
        for(int i = 0; i < 4; i++) {
            System.out.println(i); // 여기는 scope니깐 문제없음
        }
        //System.out.println(i); // scope를 벗어났으므로 에러
        
        // 컨트롤 변수를 밖으로 빼서
        // 선언과 초기화 해줄 때에는 다음과 같은 형태를 갖게 된다.
        int i = 0;
        for(;i < 4; i++) {
            System.out.println(i);            
        }
        // for 반복문의 () 안에는 무조건 ;이 2번 나와야 한다.
        // 그러므로 선언과 초기화를 밖으로 뺄 때에는 ;조건식;변환식 이렇게 적어야 한다.
   }
}











