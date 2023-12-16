import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int r=-1;
	private int f=0;
	private int size;

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
		setBounds(100, 100, 462, 277);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBounds(131, 10, 176, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE : ");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setBounds(87, 39, 124, 15);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(250, 35, 96, 19);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton createqueue = new JButton("CREATE QUEUE");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating queue
				size=Integer.valueOf(length.getText());
				q=new int[size];
				JOptionPane.showMessageDialog(contentPane, "Queue of Length "+size+" Created");
			}
		});
		createqueue.setForeground(new Color(255, 20, 147));
		createqueue.setFont(new Font("Constantia", Font.BOLD, 12));
		createqueue.setBounds(158, 64, 149, 23);
		contentPane.add(createqueue);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT : ");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_2.setBounds(87, 107, 128, 15);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(250, 103, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insertelement = new JButton("INSERT");
		insertelement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert element
				int elem;
				if(r==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not Possible");
				}
				else {
					elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane, "Element "+elem+" inserted @ position "+r);
					element.setText("");
				}
			}
		});
		insertelement.setForeground(new Color(46, 139, 87));
		insertelement.setFont(new Font("Constantia", Font.BOLD, 12));
		insertelement.setBounds(356, 100, 85, 29);
		contentPane.add(insertelement);
		
		JButton deleteelement = new JButton("DELETE");
		deleteelement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete an element
				if(r==-1 || f>r) {
					JOptionPane.showMessageDialog(contentPane, "Deletion is not possible!!!");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+q[f]);
					++f;
				}
			}
		});
		deleteelement.setForeground(new Color(255, 20, 147));
		deleteelement.setFont(new Font("Constantia", Font.BOLD, 12));
		deleteelement.setBounds(158, 132, 125, 21);
		contentPane.add(deleteelement);
		
		JButton displayelement = new JButton("DISPLAY");
		displayelement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				if(r==-1 || f>r) {
					JOptionPane.showMessageDialog(contentPane,"Display is not possible");
				}
				else {
				String msg="";
				for(int i=f;i<=r;i++) {
					msg=msg+" "+q[i];
				}
				displaybox.setText(msg);
				}
				
			}
		});
		displayelement.setForeground(new Color(255, 69, 0));
		displayelement.setFont(new Font("Constantia", Font.BOLD, 12));
		displayelement.setBounds(158, 178, 124, 21);
		contentPane.add(displayelement);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setBounds(87, 209, 297, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
