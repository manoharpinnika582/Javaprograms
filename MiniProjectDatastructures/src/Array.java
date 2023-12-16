import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField insertposition;
	private JTextField deleteposition;
	private JTextField displaybox;
	//
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
		setBounds(100, 100, 546, 317);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setBounds(191, 10, 195, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1.setBackground(new Color(255, 99, 71));
		lblNewLabel_1.setBounds(120, 54, 176, 34);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(276, 60, 133, 18);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton createarray = new JButton("CREAT ARRAY");
		createarray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR CREATE ARRAY
//			String len=length.getText();
//			int l=Integer.valueOf(len);
			//converting string to int
			int len=Integer.valueOf(length.getText());
			arr=new int[len];
			//showing message in content pan
			String message="Array of Length "+len+" Created";
			JOptionPane.showMessageDialog(contentPane, message);
			
			}
		});
		createarray.setBackground(new Color(127, 255, 212));
		createarray.setForeground(new Color(139, 0, 0));
		createarray.setFont(new Font("Constantia", Font.BOLD, 14));
		createarray.setBounds(168, 88, 189, 27);
		contentPane.add(createarray);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN INTEGER ELEMENT");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 125, 210, 18);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(211, 125, 63, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSERTION
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertposition.getText());
				arr[pos]=elem;
				String message="Element "+elem+" Inserted at Position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				//After inserted we dont need no visible that text
				element.setText("");
				insertposition.setText("");
				
			}
		});
		insert.setForeground(new Color(72, 61, 139));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(413, 121, 96, 27);
		contentPane.add(insert);
		
		insertposition = new JTextField();
		insertposition.setBounds(353, 123, 50, 20);
		contentPane.add(insertposition);
		insertposition.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DELETE POSITION");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_3.setBounds(95, 162, 162, 27);
		contentPane.add(lblNewLabel_3);
		
		deleteposition = new JTextField();
		deleteposition.setBounds(221, 164, 96, 19);
		contentPane.add(deleteposition);
		deleteposition.setColumns(10);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETE
				int pos=Integer.valueOf(deleteposition.getText());
				arr[pos]=0;
				String message="Element deleted @ the position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
		});
		delete.setForeground(new Color(0, 139, 139));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(339, 162, 117, 27);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY
				String msg="";
				for(int i=0;i<arr.length;i++) {
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(255, 69, 0));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(168, 199, 189, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(240, 255, 255));
		displaybox.setForeground(new Color(255, 0, 255));
		displaybox.setBounds(95, 246, 390, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("POSITION");
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setBounds(284, 129, 59, 15);
		contentPane.add(lblNewLabel_4);
	}
}
