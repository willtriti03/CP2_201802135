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
		
		
			setTitle("계산기");											//타이틀 설정
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			p1 = new JPanel();											//상단 판넬 생성
			result = new JTextField(15);								//텍스트필드 생성
			result.setHorizontalAlignment(SwingConstants.RIGHT);		//글자 오른쪽정렬
			result.setAlignmentX(Component.CENTER_ALIGNMENT);			//가운데 배치
			p1.add(result);
			
			
			p2 = new JPanel();											//캔슬버튼 하나
			p2.setLayout(new GridLayout(0, 4));
			cancel = new JButton("C");
			p2.add(cancel);
			
			
			p3 = new JPanel();											//숫자판을 감싸는 판넬 하나			
			p3.setLayout(new GridLayout(4, 4, 3, 3));					//그리드로 숫자버튼들 배열 
				
			n1 = new JButton("1");										//버튼들 생성
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
			
			p3.add(n7);													//버튼들 판넬에 추가	
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
			
			p4 = new JPanel();											//부모 판넬에 합치기
			p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));
			p4.add(p1);
			p4.add(p2);
			p4.add(p3);
			
			getContentPane().add(p4);
			pack();
			setVisible(true);
	}

}
