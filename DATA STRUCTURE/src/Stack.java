import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int top = -1;
	private int size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(284, 11, 279, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheStack = new JLabel("ENTER THE STACK SIZE");
		lblEnterTheStack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblEnterTheStack.setBounds(125, 78, 261, 27);
		contentPane.add(lblEnterTheStack);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT");
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblEnterAnElement.setBounds(125, 229, 261, 27);
		contentPane.add(lblEnterAnElement);
		
		length = new JTextField();
		length.setBounds(480, 68, 363, 47);
		contentPane.add(length);
		length.setColumns(10);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(396, 229, 309, 37);
		contentPane.add(element);
		
		JButton create = new JButton("CREATE STACK");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code to create the array
				size =  Integer.valueOf(length.getText());
				s = new int[size];
				String message =  "Stack of size "+size +" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setForeground(new Color(255, 0, 0));
		create.setFont(new Font("Tahoma", Font.BOLD, 22));
		create.setBounds(361, 148, 199, 47);
		contentPane.add(create);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				code to pop
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "pop not posible");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "the element is deleted is "+s[top]);
					--top;
				}
			}
		});
		pop.setForeground(new Color(255, 0, 0));
		pop.setFont(new Font("Tahoma", Font.BOLD, 22));
		pop.setBounds(154, 329, 199, 47);
		contentPane.add(pop);
		
		JButton displaybtn = new JButton("DISPLAY");
		displaybtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				code to display
				String msg = "";
				if (top == -1) {
					JOptionPane.showMessageDialog(contentPane, "display not posible");
				}
				else {
					for (int i =top; i>= 0;i--) {
//						System.out.print(s[i]+" ");
						msg  = msg + s[i] +" ";
					}
					displaybox.setText(msg);
				}
			}
		});
		displaybtn.setForeground(new Color(255, 0, 0));
		displaybtn.setFont(new Font("Tahoma", Font.BOLD, 22));
		displaybtn.setBounds(569, 329, 199, 47);
		contentPane.add(displaybtn);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code to push
				int elem;
				if(top==size-1) {
//					System.out.println("push not posible");
					JOptionPane.showMessageDialog(contentPane, "push not posible");
				}
				else {
//					System.out.println("entet the element");
					elem = Integer.valueOf(element.getText());
					++top;
					s[top] = elem;
					JOptionPane.showMessageDialog(contentPane, "push done");
					element.setText("");
					
					
				}
			}
			
		});
		push.setForeground(new Color(255, 0, 0));
		push.setFont(new Font("Tahoma", Font.BOLD, 22));
		push.setBounds(744, 229, 151, 37);
		contentPane.add(push);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(128, 255, 128));
		displaybox.setColumns(10);
		displaybox.setBounds(154, 411, 689, 47);
		contentPane.add(displaybox);
	}
}
