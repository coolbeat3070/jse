package api05.awt;
import   java.awt.*;
import   java.awt.event.*;
/*
AWT (Abstract Windows Toolkit)
    : GUI(Graphic User Interface)환경의 프로그램및 안드로이드 위젯과 비슷

 컴포넌트 :사용자 인터페이스를 구성하는 기본요소
             버튼, 체크박스, 레이블, 텍스트필드, 리스트, 팝업메뉴와 같은 부속품의 총칭
             자바에서는 component라는 클래스가 있는데 모든 컴포넌트들은 
             이 Compont 클래스의 자손이다.
 컨테이너 : 컨테이너는 컴포넌트들이 붙어 있는 윈도우 같은 것
             윈도우, 프레임, 패널, 다이얼로그 박스 등이 있다.  
             (다른 컴포넌트를 담을수 있는 컴포넌트)
 레이아웃 : 컨테이너에 컴포넌트를 붙일때 어떤 식으로 배치하는가가 중요한데 
              이것을 레이아웃이라 한다
 이벤트 : 사용자로부터 입력이 일어나는 것


Layout
   레이아웃 매니저
    : 컴포넌트를 적절한 위치에 배치할 수 있도록 하기 위해 레이아웃 매니저를 제공.
   레이아웃 매니저의 종류
      : FlowLayout, GridLayout, BorderLayout, CardLayout, GridBagLayout,null

   FlowLayout - 왼쪽에서 오른쪽으로,위에서 아래로 순서대로 배치하는 단순한 레이아웃
   GridLayout - 가로,세로 비율을 나누어 공간(셀)에 배치(모눈종이와같은모양)
   BorderLayout - 동, 서, 남, 북, 중앙으로 화면을 분할
   CardLayout - 여러개의 카드를 쌓아둔것처럼 보여주는 배치관리자 
   GridBagLayout - 가장복잡한 레이아웃
   null - 레이아웃 매니저를 이용하지 않고 좌표를 지정하여 붙인 예제

   레이아웃 매니저를 사용법.
        setLayout(new FlowLayout());//Container 클래스의 메소드 
   각 레이아웃의 기본.
       - FlowLayout - Panel이나 Applet의 기본 레이아웃.
       - BorderLayout - Frame과 Dialog의 기본 레이아웃.
 * */



public class Note extends  Frame {
	private  TextArea  ta = new TextArea( );
	private  Font font = new Font("궁서체", Font.BOLD, 36 );
	
	public Note( ){
		//Frame에  add대상을 ta
		ta.setFont(font);
		this.add(ta);
		
		//화면윈도우모양크기 만들기
		this.setTitle("메모장");
		this.setBackground(Color.GREEN);//바탕칼라
		this.setBounds(100, 100, 600, 450);//x,y,가로,높이
		this.setVisible(true);//진짜창=화면 보여주기
		
		//감시자=>윈도우감시자
		MyExit me = new MyExit( ); //아래문장은익명의개체로 접근
		this.addWindowListener(new MyExit( ));
	}//생성자end
	
	public static void main(String[] args) {//static=정적함수
		new Note( );//개체이름이 없어요 annoymous
	} //end
	
	class MyExit  extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.out.println("내부클래스 프로그램을 종료합니다");
			System.exit(1);//진짜종료처리 Terminates the currently Running JVM
		}		
	}//내부클래스 end
} //class END======================================================================


