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

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField elem;
	private JTextField position;
	private JTextField dposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(253, 11, 334, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheLength = new JLabel("Enter the length of array");
		lblEnterTheLength.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lblEnterTheLength.setBounds(211, 85, 254, 26);
		contentPane.add(lblEnterTheLength);
		
		length = new JTextField();
		length.setBounds(568, 82, 187, 38);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton createarray = new JButton("CREATE ARRAY");
		createarray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// write code for creating array
//				new int[Integer.valueOf(length.getText())];		
//				int len = Integer.valueOf(length.getText());
				arr = new int[Integer.valueOf(length.getText())];
				String message = "Array of length " +Integer.valueOf(length.getText()) +" created";
				JOptionPane.showMessageDialog(contentPane, message);;
			}
		});
		createarray.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		createarray.setBounds(448, 141, 177, 38);
		contentPane.add(createarray);
		
		JLabel lblEnterTheElement = new JLabel("Enter the element of array");
		lblEnterTheElement.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lblEnterTheElement.setBounds(24, 205, 272, 46);
		contentPane.add(lblEnterTheElement);
		
		elem = new JTextField();
		elem.setColumns(10);
		elem.setBounds(331, 211, 134, 40);
		contentPane.add(elem);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// write the code for insertion
				int element = Integer.valueOf(elem.getText());
				int pos = Integer.valueOf(position.getText());
				arr[pos]= element;
				String message = "Element "+ element +" inserted";
				JOptionPane.showMessageDialog(contentPane,message);
				elem.setText("");
				position.setText("");
			}
		});
		insert.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		insert.setBounds(739, 208, 125, 40);
		contentPane.add(insert);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lblPosition.setBounds(485, 215, 85, 26);
		contentPane.add(lblPosition);
		
		position = new JTextField();
		position.setColumns(10);
		position.setBounds(580, 211, 134, 40);
		contentPane.add(position);
		
		JLabel lblDeletePosition = new JLabel("Delete Position");
		lblDeletePosition.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lblDeletePosition.setBounds(100, 284, 159, 26);
		contentPane.add(lblDeletePosition);
		
		dposition = new JTextField();
		dposition.setColumns(10);
		dposition.setBounds(331, 280, 197, 40);
		contentPane.add(dposition);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete
				int dpos = Integer.valueOf(dposition.getText());
				arr[dpos] = 0;
				String message = "element deleted at the position " + dpos ;
				JOptionPane.showMessageDialog(contentPane, message);
				dposition.setText("");
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		delete.setBounds(597, 280, 125, 40);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display.
				String msg = "";
				for (int i = 0; i<= arr.length-1;i++) {
					msg = msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		display.setBounds(392, 359, 159, 31);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(128, 255, 128));
		displaybox.setColumns(10);
		displaybox.setBounds(70, 421, 735, 40);
		contentPane.add(displaybox);
	}
}
