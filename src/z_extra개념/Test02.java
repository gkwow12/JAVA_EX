package z_ets;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

class MyForm2 extends Frame{
	Button bu;
	
	MyForm2() {
		super("나의 두 번째 창");          // super 이용해서 타이틀 나오게 하기 
		bu = new Button("확인");
										// 부모 클래스 상속했기 때문에  super 함수 사용
	}
	void addlayout() {
		setBounds(100, 200, 300, 200);
		setVisible(true);
		
		setLayout(new FlowLayout());
		add(bu);
		
		MyEvent evt = new MyEvent();    //인터페이스 클래스 객체 생성하기
		bu.addActionListener(evt);  		//버튼에 이벤트가 발생했을 때 호출할거야
	
		}
	}


class MyEvent implements ActionListener {     //버튼을 누르면 나오게 하기 위헤 인터페이스

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "버튼을 눌렀습니다.");
		}
	
	}
	




public class Test02 {

	public static void main(String[] args) {
		MyForm2 my2 = new MyForm2();
		my2.addlayout();
	}

}