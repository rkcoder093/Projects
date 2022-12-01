import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DSApp extends JFrame {

	private JPanel stack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DSApp frame = new DSApp();
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
	public DSApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		stack = new JPanel();
		stack.setBackground(new Color(0, 255, 0));
		stack.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(stack);
		stack.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose A Data Sructure");
		lblNewLabel.setForeground(new Color(255, 0, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 21));
		lblNewLabel.setBounds(86, 11, 245, 25);
		stack.add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//array window opening code here
//				Array a = new Array();
//				a.setVisible(true);
				new Array().setVisible(true);
			}
		});
		array.setForeground(new Color(255, 0, 0));
		array.setFont(new Font("Centaur", Font.BOLD, 12));
		array.setBounds(183, 70, 89, 23);
		stack.add(array);
		
		JButton btnStack = new JButton("STACK");
		btnStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//stack window opening here
				new Stack().setVisible(true);
			}
		});
		btnStack.setForeground(new Color(0, 0, 0));
		btnStack.setFont(new Font("Centaur", Font.BOLD, 12));
		btnStack.setBounds(289, 103, 89, 23);
		stack.add(btnStack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//queue window opening here
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(0, 0, 255));
		queue.setFont(new Font("Centaur", Font.BOLD, 12));
		queue.setBounds(59, 103, 89, 23);
		stack.add(queue);
		
		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//circular queue window opening here
				new CircularQueue().setVisible(true);
			}
		});
		cqueue.setForeground(new Color(11, 244, 239));
		cqueue.setFont(new Font("Centaur", Font.BOLD, 12));
		cqueue.setBounds(268, 159, 158, 23);
		stack.add(cqueue);
		
		JButton sll = new JButton("SINGLY LINKEDLIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//singly linkedlist window opening here
				new SinglyLinkedList().setVisible(true);
			}
		});
		sll.setForeground(new Color(250, 5, 238));
		sll.setFont(new Font("Centaur", Font.BOLD, 12));
		sll.setBounds(10, 159, 208, 23);
		stack.add(sll);
		
		JButton dll = new JButton("DOUBLY LINKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Doubly linked list window opening here
				new DoublyLinkedList().setVisible(true);
			}
		});
		dll.setForeground(new Color(254, 166, 1));
		dll.setFont(new Font("Centaur", Font.BOLD, 12));
		dll.setBounds(116, 213, 215, 23);
		stack.add(dll);
	}
}
