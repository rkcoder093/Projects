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

public class Queue extends JFrame {

	private JPanel box;
	private JTextField sizetf;
	private JTextField elemtf;
	private JTextField rtf;
	private int Q[];
	private int r = -1;
	private int size;
	private int f =0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1162, 536);
		box = new JPanel();
		box.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(box);
		box.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUECTERE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(370, 11, 337, 31);
		box.add(lblNewLabel);
		
		JLabel lblEnterQueueSize = new JLabel("ENTER QUEUE SIZE");
		lblEnterQueueSize.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblEnterQueueSize.setBounds(175, 95, 290, 31);
		box.add(lblEnterQueueSize);
		
		sizetf = new JTextField();
		sizetf.setBounds(569, 80, 459, 46);
		box.add(sizetf);
		sizetf.setColumns(10);
		
		JButton createbtn = new JButton("CREATE QUEUE");
		createbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len = Integer.valueOf(sizetf.getText());
				Q = new int[len];
				size = Q.length;
				JOptionPane.showMessageDialog(box, "Queue Created");
			}
		});
		createbtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		createbtn.setBounds(370, 151, 243, 46);
		box.add(createbtn);
		
		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT");
		lblEnterTheElement.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblEnterTheElement.setBounds(68, 221, 290, 31);
		box.add(lblEnterTheElement);
		
		elemtf = new JTextField();
		elemtf.setColumns(10);
		elemtf.setBounds(370, 218, 473, 40);
		box.add(elemtf);
		
		JButton insertbtn = new JButton("INSERT ");
		insertbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//to insert element
				int elem;
				if (r==size-1) {
					JOptionPane.showMessageDialog(box, "insert not posible");
				}
				else {
					 elem = Integer.valueOf(elemtf.getText());
					++r;
					Q[r] = elem;
					elemtf.setText("");
					JOptionPane.showMessageDialog(box, "element inserted");
				}
			}
		});
		insertbtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		insertbtn.setBounds(895, 210, 243, 54);
		box.add(insertbtn);
		
		JButton deletebtn = new JButton("DELETE");
		deletebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// delete the element
				if (r==-1 || f>r) {
					JOptionPane.showMessageDialog(box, "Delete not posible");
				}
				else {
//					System.out.println("element deleted is "+ Q[f]);
					JOptionPane.showMessageDialog(box, "Element deleted is " +Q[f]);
					++f;
				}
			}
		});
		deletebtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		deletebtn.setBounds(180, 311, 243, 54);
		box.add(deletebtn);
		
		JButton displaybtn = new JButton("DISPLAY");
		displaybtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display
				if (r ==-1 ||f>r) {
//					System.out.println("display not posible");
					JOptionPane.showMessageDialog(box, "display not posible");
				}
				
				else {
					String msg = "";
					for (int i= f; i<= r;i++) {
//						System.out.print();
						msg =  msg +" "+ Q[i];
					}
//					System.out.println();
					rtf.setText(msg);
				}
			}
		});
		displaybtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		displaybtn.setBounds(718, 311, 243, 54);
		box.add(displaybtn);
		
		rtf = new JTextField();
		rtf.setColumns(10);
		rtf.setBounds(300, 427, 806, 46);
		box.add(rtf);
		
		JLabel lblEnterQueueSize_1_1 = new JLabel("RESULT");
		lblEnterQueueSize_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblEnterQueueSize_1_1.setBounds(131, 429, 99, 31);
		box.add(lblEnterQueueSize_1_1);
	}
}
