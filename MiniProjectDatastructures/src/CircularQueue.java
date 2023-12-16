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

public class CircularQueue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int r=-1;
	private int f=0;
	private int size;
	private int count=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 127));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setBounds(98, 10, 250, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER CIRCULAR QUEUE SIZE : ");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setBounds(41, 39, 190, 15);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(254, 39, 96, 19);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton createcircularqueue = new JButton("CREATE CIRCULAR QUEUE");
		createcircularqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create queue code here
				size=Integer.valueOf(length.getText());
				cq=new int[size];
				JOptionPane.showMessageDialog(contentPane, "Circular Queue length "+size+" is Created");
			}
		});
		createcircularqueue.setForeground(new Color(139, 0, 0));
		createcircularqueue.setFont(new Font("Constantia", Font.BOLD, 12));
		createcircularqueue.setBackground(new Color(253, 245, 230));
		createcircularqueue.setBounds(115, 64, 204, 23);
		contentPane.add(createcircularqueue);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_2.setBounds(42, 97, 125, 15);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(194, 97, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert code here
				if(count==size) {
					JOptionPane.showMessageDialog(contentPane, "Insertion is not possible");
				}
				else {
					int elem=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					JOptionPane.showMessageDialog(contentPane, "Element "+elem+" inserted @ position "+r);
					count++;
				}
				element.setText("");
			}
		});
		insert.setForeground(new Color(255, 0, 255));
		insert.setFont(new Font("Constantia", Font.BOLD, 12));
		insert.setBounds(320, 92, 85, 32);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete code here
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+cq[f]);
					f=(f+1)%size;
					count--;
				}
			}
		});
		delete.setForeground(new Color(255, 69, 0));
		delete.setFont(new Font("Constantia", Font.BOLD, 12));
		delete.setBounds(158, 133, 119, 36);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code here
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					int f1=f;
					String msg="";
					for(int i=1;i<=count;i++) {
						msg=msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 12));
		display.setForeground(new Color(153, 50, 204));
		display.setBounds(158, 179, 119, 32);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(78, 221, 306, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
