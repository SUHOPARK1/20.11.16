package day07;

import java.util.Calendar;

//아래의 필드는 모두 private 으로 바꿔서 캡슐화를 진행하고
// toString과 equals 메소드를 오버라이드 하세요.

public class Board {
    private int id;
    private String title;
    private String content;
    private String writer;
    private Calendar writtenDate;
    private Calendar updatedDate;
    
    

    // getter setter 이클립스 사용해서 자동으로 만들기
    // 소스 빈 창에 마우스 오른쪽 클릭 -> 가운데의 source 메뉴 ->
    // -> generate getters/setters 클릭
    // 단, 기존의 겟터 셋터가 있을 경우 해당 필드에 대한 겟터 셋터는 나오지 않는다.

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
    
    public Calendar getWrittenDate() {
        return writtenDate;
    }

    public void setWrittenDate(Calendar writtenDate) {
        this.writtenDate = writtenDate;
    }

    public Calendar getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    
    //toString() 구현
    public String toString() {
        //객체의 필드값을
        // 출력하는 방법은 다양하다.
        
        // 숙제 JSON 표기법에 대해 알아오시오
        
        
           // 예를 들어
           // 자바는
           // 클래스이름[필드명=필드값, 필드명=필드값...] 이러한 표기를 추천한다.
        
           // 하지만 웹에서 사용할때에는 
           // 자바스크립트 객체 표기법을 사용하면 편하다.
           // 자바스크립트 객체 표기법이란 다음과 같은 양식을 가진다.
           // {필드이름: 값, 필드이름  : 값...}
        
        return "id:" + id + 
                ", title: "+title+
                ", content: "+content+
                ", writer: "+writer;
                
                
        
    }

}














