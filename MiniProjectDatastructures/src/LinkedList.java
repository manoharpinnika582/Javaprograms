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

public class LinkedList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField insertrearelement;
	private JTextField insertatfront;
	private JTextField indexof;
	private JTextField element;
	private JTextField deleteatindex;
	private JTextField displaybox;
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
					LinkedList frame = new LinkedList();
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
	public LinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 378);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBounds(117, 10, 270, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setBounds(74, 43, 153, 15);
		contentPane.add(lblNewLabel_1);
		
		insertrearelement = new JTextField();
		insertrearelement.setBounds(237, 39, 96, 19);
		contentPane.add(insertrearelement);
		insertrearelement.setColumns(10);
		
		JButton insertrear = new JButton("INSERTREAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write insert rear code here
				Node temp;
				int elem=Integer.valueOf(insertrearelement.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null) {
					first=newnode;
				}
				else {
				temp=first;
				while(temp.link!=null) {
					temp=temp.link;
				}
				temp.link=newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Element "+elem+" inserted rear end");
			}
		});
		insertrear.setForeground(new Color(255, 20, 147));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 12));
		insertrear.setBounds(364, 39, 117, 23);
		contentPane.add(insertrear);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT : ");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_2.setBounds(74, 76, 135, 15);
		contentPane.add(lblNewLabel_2);
		
		insertatfront = new JTextField();
		insertatfront.setBounds(237, 72, 96, 19);
		contentPane.add(insertatfront);
		insertatfront.setColumns(10);
		
		JButton insertfront = new JButton("INSERTFRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write insert front code here
				int elem=Integer.valueOf(insertatfront.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				
				if(first==null) {
					first=newnode;
				}
				else {
					newnode.link=first;
					first=newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Element "+elem+" inserted front end");
			}
		});
		insertfront.setForeground(new Color(255, 20, 147));
		insertfront.setFont(new Font("Constantia", Font.BOLD, 12));
		insertfront.setBounds(364, 72, 127, 23);
		contentPane.add(insertfront);
		
		JLabel indexat = new JLabel("ENTER THE INDEX :");
		indexat.setFont(new Font("Constantia", Font.BOLD, 12));
		indexat.setForeground(new Color(255, 0, 0));
		indexat.setBounds(26, 117, 127, 15);
		contentPane.add(indexat);
		
		indexof = new JTextField();
		indexof.setBounds(161, 113, 56, 19);
		contentPane.add(indexof);
		indexof.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ELEMENT :");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_3.setBounds(237, 117, 62, 15);
		contentPane.add(lblNewLabel_3);
		
		element = new JTextField();
		element.setBounds(309, 113, 47, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insertatindex = new JButton("INSERT AT");
		insertatindex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write insert At index code here
				int index=Integer.valueOf(indexof.getText());
				int elem=Integer.valueOf(element.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				Node temp;
				
				if(first==null) {
					first=newnode;
				}
				if(index<0) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
				if(index==0) {
					newnode.link=first;
					first=newnode;
					return;
				}
				temp=first;
				for(int i=0;i<index-1 && temp!=null;i++) {
					temp=temp.link;
				}
					newnode.link=temp.link;
					temp.link=newnode;
			}
		});
		insertatindex.setForeground(new Color(255, 20, 147));
		insertatindex.setFont(new Font("Constantia", Font.BOLD, 12));
		insertatindex.setBounds(364, 112, 117, 23);
		contentPane.add(insertatindex);
		
		JLabel lblNewLabel_4 = new JLabel("ENTER THE INDEX :");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_4.setBounds(84, 146, 114, 15);
		contentPane.add(lblNewLabel_4);
		
		deleteatindex = new JTextField();
		deleteatindex.setBounds(226, 142, 96, 19);
		contentPane.add(deleteatindex);
		deleteatindex.setColumns(10);
		
		JButton deleteat = new JButton("DELETE AT");
		deleteat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write delete At Index code here
				int index = Integer.valueOf(deleteatindex.getText());

			    if (first == null) {
			    	JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
			        return;
			    }

			    if (index < 0) {
			    	JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
			        return;
			    }

			    if (index == 0) {
			    	JOptionPane.showMessageDialog(contentPane, "Element deleted is " + first.data);
			        first = first.link;
			        return;
			    }

			    Node current = first;
			    Node previous = null;

			    for (int i = 0; i < index && current != null; i++) {
			        previous = current;
			        current = current.link;
			    }

			    if (current == null) {
			    	JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
			        return;
			    }
		    	JOptionPane.showMessageDialog(contentPane, "Element deleted is " + current.data);
			    previous.link = current.link;
			}
		});
		deleteat.setForeground(new Color(255, 20, 147));
		deleteat.setFont(new Font("Constantia", Font.BOLD, 12));
		deleteat.setBounds(345, 142, 114, 23);
		contentPane.add(deleteat);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write delete front code here
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Deletion not possible");
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane,"Element deleted is "+first.data );
					first=null;
				}
				else {
					JOptionPane.showMessageDialog(contentPane,"Element deleted is "+first.data );
					first=first.link;
				}
			}
		});
		deletefront.setFont(new Font("Constantia", Font.BOLD, 12));
		deletefront.setForeground(new Color(255, 20, 147));
		deletefront.setBounds(122, 184, 123, 30);
		contentPane.add(deletefront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write delete rear code here
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane,"Element deleted is "+first.data);
				}
				else {
					temp=first;
					while(temp.link.link!=null) {
						temp=temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+temp.link.data);
					temp.link=null;
				}
			}
		});
		deleterear.setForeground(new Color(255, 20, 147));
		deleterear.setFont(new Font("Constantia", Font.BOLD, 12));
		deleterear.setBounds(295, 184, 123, 30);
		contentPane.add(deleterear);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write display code here
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.link==null) {
					String msg="";
					msg=msg+first.data;
					displaybox.setText(msg);
				}
				else {
					temp=first;
					String msg="";
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.link;
					}
					displaybox.setText(msg);

				}
			}
		});
		display.setForeground(new Color(255, 20, 147));
		display.setFont(new Font("Constantia", Font.BOLD, 12));
		display.setBounds(197, 229, 146, 38);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(117, 293, 322, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
