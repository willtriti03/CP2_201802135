import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class NomalCalculator extends JFrame {

	private JPanel contentPane;
	private JPanel p1, p2, p3, p4;
	private JTextField result;
	private JButton cancel, n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, back, equals, plus, minus, multi, divide;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NomalCalculator frame = new NomalCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NomalCalculator() {
		
		
			setTitle("����");											//Ÿ��Ʋ ����
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			p1 = new JPanel();											//��� �ǳ� ����
			result = new JTextField(15);								//�ؽ�Ʈ�ʵ� ����
			result.setHorizontalAlignment(SwingConstants.RIGHT);		//���� ����������
			result.setAlignmentX(Component.CENTER_ALIGNMENT);			//��� ��ġ
			p1.add(result);
			
			
			p2 = new JPanel();											//ĵ����ư �ϳ�
			p2.setLayout(new GridLayout(0, 4));
			cancel = new JButton("C");
			p2.add(cancel);
			
			
			p3 = new JPanel();											//�������� ���δ� �ǳ� �ϳ�			
			p3.setLayout(new GridLayout(4, 4, 3, 3));					//�׸���� ���ڹ�ư�� �迭 
				
			n1 = new JButton("1");										//��ư�� ����
			n2 = new JButton("2");
			n3 = new JButton("3");
			n4 = new JButton("4");
			n5 = new JButton("5");
			n6 = new JButton("6");
			n7 = new JButton("7");
			n8 = new JButton("8");
			n9 = new JButton("9");
			n0 = new JButton("0");
			back = new JButton("00");
			equals = new JButton("=");
			plus = new JButton("+");
			minus = new JButton("-");
			multi = new JButton("*");
			divide = new JButton("/");
			
			p3.add(n7);													//��ư�� �ǳڿ� �߰�	
			p3.add(n8);
			p3.add(n9);
			p3.add(divide);
			p3.add(n4);
			p3.add(n5);
			p3.add(n6);
			p3.add(multi);
			p3.add(n1);
			p3.add(n2);
			p3.add(n3);
			p3.add(minus);
			p3.add(n0);
			p3.add(back);
			p3.add(equals);
			p3.add(plus);
			
			p2.setBorder(BorderFactory.createEmptyBorder(0, 3, 3, 0));
			p3.setBorder(BorderFactory.createEmptyBorder(0, 3, 3, 3));
			
			p4 = new JPanel();											//�θ� �ǳڿ� ��ġ��
			p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));
			p4.add(p1);
			p4.add(p2);
			p4.add(p3);
			
			getContentPane().add(p4);
			pack();
			setVisible(true);
	}

}
