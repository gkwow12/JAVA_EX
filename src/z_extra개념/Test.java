package z_ets;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

class MyForm{                   //���ο� Ŭ���� ����
	Frame f;					//f ����
	Button b;			

	
	MyForm() {					// MyForm ������ �Լ�	
	f = new Frame("���� ù ȭ��");	//f ��ü ����
	b= new Button("Ȯ��");							
	 }											
	 
	 void addlayout() {
		 
		 f.setLayout(new FlowLayout());  //���̴� ����� �����ϴ� �޼ҵ� 
		 f.add(b); 						//��ư�� ������ --> �� ���� �޼ҵ�� â�� ���� ��ư ����� �޼ҵ�
		 
		
		 f.setBounds(100, 200, 300, 200);  //â ����� �Լ� 
		 f.setVisible(true);		     //true �ؾ� ���� (ȭ���� ��������)   ---> â�� ������ �ϴ� �޼ҵ�
		 
		MyEvent evt = new MyEvent();    //�������̽� Ŭ���� ��ü �����ϱ� 
		b.addActionListener(evt);  		//��ư�� �̺�Ʈ�� �߻����� �� ȣ���Ұž�  --> ��ư�� ������ ȭ���� ������ �ϴ� �޼ҵ� 
	 }
	 
	 class MyEvent implements ActionListener {     //��ư�� ������ ������ �ϱ� ���� �������̽�

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "��ư�� �������ϴ�.");
		}
	
	}
	
}


public class Test {

	public static void main(String[] args) {
		MyForm my = new MyForm();   	// ��ü�����ؼ� �Լ� �ҷ�����
		my.addlayout();
		

	}

}