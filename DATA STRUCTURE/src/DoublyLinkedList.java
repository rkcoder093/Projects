import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField rtf;
	private JTextField elemtf;
	class Node {
		Node pevlink;
		int data;
		Node nextlink;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 936, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(274, 11, 374, 27);
		contentPane.add(lblNewLabel);
		
		rtf = new JTextField();
		rtf.setBounds(193, 346, 673, 37);
		contentPane.add(rtf);
		rtf.setColumns(10);
		
		JLabel lblEnterAElement = new JLabel("ENTER A ELEMENT:");
		lblEnterAElement.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 24));
		lblEnterAElement.setBounds(128, 93, 175, 27);
		contentPane.add(lblEnterAElement);
		
		elemtf = new JTextField();
		elemtf.setColumns(10);
		elemtf.setBounds(356, 83, 458, 45);
		contentPane.add(elemtf);
		
		JButton irbtn = new JButton("INSERT RARE");
		irbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				insert rare
				Node temp;
//				System.out.println("enter an element");
				int elem = Integer.valueOf(elemtf.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.pevlink = null;
				newnode.nextlink= null;
				if (first == null) {
					first = newnode;
				}
				else {
					temp = first;
					while(temp.nextlink == null) {
						temp = temp.nextlink;
					}
					temp.nextlink = newnode;
					newnode.pevlink = temp;
				}
				elemtf.setText("");
				JOptionPane.showMessageDialog(contentPane, "Element inserted at rare");
			}
		});
		irbtn.setFont(new Font("Tahoma", Font.BOLD, 22));
		irbtn.setBounds(126, 157, 289, 35);
		contentPane.add(irbtn);
		
		JButton ifbtn = new JButton("INSERT FRONT");
		ifbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				insert front
//				System.out.println("enter the element");
				int elem = Integer.valueOf(elemtf.getText());
				Node newnode = new Node();
				newnode.data= elem;
				newnode.pevlink = null;
				newnode.nextlink= null;
				if (first==null) {
					first = newnode;
				}
				else {
					newnode.nextlink=first;
					first.pevlink = newnode;
					first = newnode;
				}
				elemtf.setText("");
				JOptionPane.showMessageDialog(contentPane, "Element inserted at front");
			}
		});
		ifbtn.setFont(new Font("Tahoma", Font.BOLD, 22));
		ifbtn.setBounds(536, 157, 302, 35);
		contentPane.add(ifbtn);
		
		JButton drbtn = new JButton("DELETE RARE");
		drbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				delete rare
				Node temp;
				
				if (first==null) {
//					System.out.println("delete not posible");
					JOptionPane.showMessageDialog(contentPane, "delete not posible");
				}
				else if(first.nextlink==null) {
//					System.out.println("element deleted is "+ first.data);
					JOptionPane.showMessageDialog(contentPane, "delete element is " +first.data);
					first= null;
				}
				else {
					temp = first;
					while(temp.nextlink.nextlink !=null) {
						temp = temp.nextlink;
					}
//					System.out.println("element deleted " + temp.nextlink.data);
					JOptionPane.showMessageDialog(contentPane, "delete element is "+temp.nextlink.data);
					temp.nextlink= null;
				}
			}
		});
		drbtn.setFont(new Font("Tahoma", Font.BOLD, 22));
		drbtn.setBounds(126, 231, 289, 35);
		contentPane.add(drbtn);
		
		JButton btnDisplayForward = new JButton("DISPLAY FORWARD");
		btnDisplayForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				dsplay forward
				Node temp;
				String msg ="";
				if (first==null) {
//					System.out.println("display not posible");
					JOptionPane.showMessageDialog(contentPane, "Display not posible");
					
				}
				else if(first.nextlink== null) {
//					System.out.println(first.data);
//					JOptionPane.showMessageDialog(contentPane, "delete not posible");
					msg = msg + first.data;
					
				}
				else {
					temp = first;
					while(temp != null) {
//						System.out.println(temp.data+" ");
						msg = msg +" "+temp.data;
						temp = temp.nextlink;
						
					}
				}
				rtf.setText(msg);
				
			
			}
		});
		btnDisplayForward.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDisplayForward.setBounds(126, 300, 289, 35);
		contentPane.add(btnDisplayForward);
		
		JButton dfbtn = new JButton("DELETE FRONT");
		dfbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				delete front
				if (first==null) {
//					System.out.println("delete not posoble");
					JOptionPane.showMessageDialog(contentPane, "delete not posible");
				}
				else if (first.nextlink == null) {
//					System.out.println("element deleted is "+ first.data);
					JOptionPane.showMessageDialog(contentPane, "deleted element is "+ first.data);
					first = null;
				}
				else {
//					System.out.println("element delete is " +first.data);
					JOptionPane.showMessageDialog(contentPane, "deleted element is " +first.data);
					first = first.nextlink;
					first.pevlink = null;
				}
			}
		});
		dfbtn.setFont(new Font("Tahoma", Font.BOLD, 22));
		dfbtn.setBounds(536, 231, 302, 35);
		contentPane.add(dfbtn);
		
		JButton btnDisplayBackward = new JButton("DISPLAY BACKWARD");
		btnDisplayBackward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				display backward
				String msg = "";
				Node temp;
				if (first==null) {
//					System.out.println("display not posible");
					JOptionPane.showMessageDialog(contentPane, "Display not posible");
				}
				else if(first.nextlink== null) {
//					System.out.println(first.data);
					msg = msg + first.data;
					
				}
				else {
					temp = first;
					while (temp.nextlink!=null){
						temp = temp.nextlink;
					}
					while(temp != null) {
//						System.out.println(temp.data+" ");
						msg = msg + " "+ temp.data; 
						temp = temp.pevlink;
					}
					
				}
				rtf.setText(msg);
				
				
			}
		});
		btnDisplayBackward.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDisplayBackward.setBounds(536, 300, 302, 35);
		contentPane.add(btnDisplayBackward);
		
		JLabel lblResulr = new JLabel("RESULT:");
		lblResulr.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 24));
		lblResulr.setBounds(92, 356, 91, 27);
		contentPane.add(lblResulr);
	}

}
