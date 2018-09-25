import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class InterestCalculator extends JFrame {

	private JPanel contentPane;				
	private JPanel p1, p2, p3, p4, p5;
	private JLabel l1, l2;
	private JButton button;
	private JTextField money, rate, result;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterestCalculator frame = new InterestCalculator();
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
	public InterestCalculator() {


		setTitle("���� ����");									//Ÿ��Ʋ ����
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		p1 = new JPanel();										//�ֻ�� �ǳ� ������ ��� �߰� MileToKM�� ������ ���
		p1.setLayout(new FlowLayout());
		l1 = new JLabel("������ �Է��Ͻÿ�.");
		money = new JTextField(10);
		money.setHorizontalAlignment(SwingConstants.RIGHT);
		p1.add(l1);
		p1.add(money);

		
		p2 = new JPanel();										//��ܰ� ������ ����
		p2.setLayout(new FlowLayout());
		l2 = new JLabel("������ �Է��Ͻÿ�.");
		rate = new JTextField(10);
		rate.setHorizontalAlignment(SwingConstants.RIGHT);
		p2.add(l2);
		p2.add(rate);
		
		

		p3 = new JPanel();										//��ư������ �������
		button = new JButton("��ȯ");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		p3.add(button);

		p4 = new JPanel();										//���ϴ� ���â ����, ���� �� �Է� ����, ���� ����
		p4.setLayout(new FlowLayout()); 
		result = new JTextField(30);
		result.setBackground(Color.WHITE);
		result.setEditable(false);
		result.setHorizontalAlignment(SwingConstants.CENTER);
		p4.add(result);

		
		
		p5 = new JPanel();										//��� �ǳ��� �θ� �ǳڿ� ����
		p5.setLayout(new BoxLayout(p5, BoxLayout.Y_AXIS));
		p5.add(p1);
		p5.add(p2);
		p5.add(p3);
		p5.add(p4);

		getContentPane().add(p5);
		pack();
		setVisible(true);
	}

}
