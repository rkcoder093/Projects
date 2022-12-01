import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField elemtf;
	private JTextField rtf;
	class Node{
		int data;
		Node link;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(98, 21, 483, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT");
		lblEnterTheElement.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEnterTheElement.setBounds(67, 105, 255, 29);
		contentPane.add(lblEnterTheElement);
		
		elemtf = new JTextField();
		elemtf.setBounds(412, 101, 216, 49);
		contentPane.add(elemtf);
		elemtf.setColumns(10);
		
		JButton irbtn = new JButton("INSERT RARE");
		irbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert rare
				Node temp;
				int elem = Integer.valueOf(elemtf.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if (first == null) {
					first  = newnode;
				}
				else {
					
					temp = first;
					while(temp.link != null) {
						temp = temp.link;
					}
					temp.link = newnode;
				}
				elemtf.setText("");
				JOptionPane.showMessageDialog(contentPane, "element inserted at rare end");
			}
		});
		irbtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		irbtn.setBounds(86, 161, 192, 49);
		contentPane.add(irbtn);
		
		JButton ifbtn = new JButton("INSERT FRONT");
		ifbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				insert front
				int elem = Integer.valueOf(elemtf.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if (first == null) {
					first = newnode;
				}
				else {
					newnode.link = first;
					first = newnode;
				}
				elemtf.setText("");
				JOptionPane.showMessageDialog(contentPane, "element inserted at front");
			}
		});
		ifbtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		ifbtn.setBounds(422, 161, 192, 49);
		contentPane.add(ifbtn);
		
		JButton drbtn = new JButton("DELETE RARE");
		drbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				delete rare
				Node temp;
				if (first == null) {
//					System.out.println("deletion not posible");
					JOptionPane.showMessageDialog(contentPane, "deletion not posible");					
				}
				else if( first.link == null) {
//					System.out.println("element deleted is "+ first.data);
					JOptionPane.showMessageDialog(contentPane, "element deleted is " +first.data);
					first = null;
				}
				else {
					temp = first;
					while(temp.link.link != null) {
						temp = temp.link;
					}
//					System.out.println("element deleted is " + temp.link.link);
					JOptionPane.showMessageDialog(contentPane, "element deleted is "+ temp.link.link);
					temp.link = null;
				}
			}
		});
		drbtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		drbtn.setBounds(86, 234, 192, 49);
		contentPane.add(drbtn);
		
		JButton dfbtn = new JButton("DELETE FRONT");
		dfbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				delete front
				if (first == null) {
//					System.out.println("deletion not posible");
					JOptionPane.showMessageDialog(contentPane, "deletion not posible");
				}
				else if(first.link == null) {
//					System.out.println("elemenrt delted is "+ first.data);
					JOptionPane.showMessageDialog(contentPane, "element deleted is " +first.data);
					first = null;
				}
				else {
//					System.out.println("element deleted is "+ first.data);
					JOptionPane.showMessageDialog(contentPane, "element deleted is " +first.data);
					first = first.link;
				}
			}
		});
		dfbtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		dfbtn.setBounds(422, 234, 192, 49);
		contentPane.add(dfbtn);
		
		rtf = new JTextField();
		rtf.setColumns(10);
		rtf.setBounds(55, 368, 590, 49);
		contentPane.add(rtf);
		
		JButton dbtn = new JButton("DISPLAY");
		dbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				display list
				Node  temp;
				String msg ="";
				if (first==null) {
//					System.out.println("display not posible");
					JOptionPane.showMessageDialog(contentPane, "display not posible");
				}
				else if(first.link==null) {
//					System.out.println(first.data);
//					JOptionPane.showMessageDialog(contentPane, first.data);
					msg = msg + first.data;					
				}
				else {
					temp = first;
					while(temp != null) {
//						System.out.println(temp.data+" ");
						msg = msg +" "+ temp.data;
						temp = temp.link;
					}					
				}
				rtf.setText(msg);
			}
		});
		dbtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		dbtn.setBounds(256, 294, 192, 49);
		contentPane.add(dbtn);
	}

}
