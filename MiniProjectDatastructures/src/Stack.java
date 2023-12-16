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

public class Stack extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField insertelement;
	private JTextField displaybox;
	private int s[];
	private int top=-1;
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
		setBounds(100, 100, 516, 329);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setBounds(160, 10, 208, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE :");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setBounds(80, 34, 167, 32);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(272, 39, 96, 19);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton createstack = new JButton("CREATE STACK");
		createstack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create array code here
				size=Integer.valueOf(length.getText());
				s=new int[size];
				String message="Stack of Length "+size+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
				
				
			}
		});
		createstack.setForeground(new Color(255, 0, 255));
		createstack.setFont(new Font("Constantia", Font.BOLD, 14));
		createstack.setBounds(172, 76, 146, 32);
		contentPane.add(createstack);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT : ");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_2.setBounds(83, 135, 198, 25);
		contentPane.add(lblNewLabel_2);
		
		insertelement = new JTextField();
		insertelement.setBounds(232, 136, 96, 19);
		contentPane.add(insertelement);
		insertelement.setColumns(10);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push operation code here
				int elem;
				if(top==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Push is not posible");
				}
				else {
				elem=Integer.valueOf(insertelement.getText());
				top++;
				s[top]=elem;
				JOptionPane.showMessageDialog(contentPane, "Push Successfull");
				insertelement.setText("");
				}
			}
		});
		push.setForeground(new Color(128, 0, 0));
		push.setFont(new Font("Constantia", Font.BOLD, 14));
		push.setBounds(358, 135, 85, 25);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop operation code here
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Deletion is not possible");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Element is deleted "+s[top]);
					--top;
				}
				
				
			}
		});
		pop.setFont(new Font("Constantia", Font.BOLD, 14));
		pop.setForeground(new Color(0, 0, 255));
		pop.setBounds(232, 174, 95, 26);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code here
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "display not possible");
				}
				else {
					String msg="";
					for(int i=0;i<=top;i++) {
						msg=msg+" "+s[i];
					}
					displaybox.setText(msg);
				}

				
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(213, 210, 155, 32);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(255, 250, 250));
		displaybox.setBackground(new Color(64, 224, 208));
		displaybox.setBounds(124, 252, 332, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
