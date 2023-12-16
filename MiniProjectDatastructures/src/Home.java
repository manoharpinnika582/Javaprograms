import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton array = new JButton("ARRAY");
		array.setBounds(175, 41, 81, 27);
		array.setForeground(new Color(0, 128, 0));
		array.setFont(new Font("Constantia", Font.BOLD, 12));
		array.setBackground(new Color(253, 245, 230));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENING CODE HERE
//				Array a=new Array();
//				a.setVisible(true);
				//creating ananymos object
				new Array().setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(array);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(107, 10, 249, 21);
		contentPane.add(lblNewLabel);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW OPENING CODE HERE
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(new Color(0, 0, 255));
		stack.setBackground(new Color(253, 245, 230));
		stack.setFont(new Font("Constantia", Font.BOLD, 12));
		stack.setBounds(45, 75, 81, 27);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENING CODE HERE
				new Queue().setVisible(true);
			}
		});
		queue.setBackground(new Color(253, 245, 230));
		queue.setForeground(new Color(255, 0, 0));
		queue.setFont(new Font("Constantia", Font.BOLD, 12));
		queue.setBounds(312, 75, 89, 27);
		contentPane.add(queue);
		
		JButton cicularqueue = new JButton("CIRCULARQUEUE");
		cicularqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CIRCULAR QUEUE WINDOW OPENING CODE HERE
				new CircularQueue().setVisible(true);
			}
		});
		cicularqueue.setForeground(new Color(128, 0, 0));
		cicularqueue.setFont(new Font("Constantia", Font.BOLD, 12));
		cicularqueue.setBackground(new Color(253, 245, 230));
		cicularqueue.setBounds(140, 114, 163, 33);
		contentPane.add(cicularqueue);
		
		JButton singlylinkedlist = new JButton("SINGLYLINKEDLIST");
		singlylinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLY LINKED LIST WINDOW OPENING CODE HERE
				new LinkedList().setVisible(true);
			}
		});
		singlylinkedlist.setFont(new Font("Constantia", Font.BOLD, 12));
		singlylinkedlist.setBackground(new Color(253, 245, 230));
		singlylinkedlist.setBounds(10, 171, 157, 40);
		contentPane.add(singlylinkedlist);
		
		JButton doublylinkedlist = new JButton("DOUBLYLINKEDLIST");
		doublylinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOUBLY LINKED LIST WINDOW OPENING CODE HERE
				new DoublyLinkedList().setVisible(true);
				
			}
		});
		doublylinkedlist.setForeground(new Color(102, 205, 170));
		doublylinkedlist.setBackground(new Color(253, 245, 230));
		doublylinkedlist.setFont(new Font("Constantia", Font.BOLD, 12));
		doublylinkedlist.setBounds(263, 172, 163, 38);
		contentPane.add(doublylinkedlist);
	}
}
