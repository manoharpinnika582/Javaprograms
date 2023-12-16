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

public class DoublyLinkedList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField insertrearelement;
	private JTextField insertfrontelement;
	private JTextField indexatpos;
	private JTextField element;
	private JTextField deleteindexvalue;
	private JTextField displaybox;
	
	class Node{
		private Node prevlink;
		private int data;
		private Node nextLink;
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
		setBounds(100, 100, 450, 361);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(107, 142, 35));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKEDLIST DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBounds(95, 10, 271, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT : ");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(53, 44, 135, 15);
		contentPane.add(lblNewLabel_1);
		
		insertrearelement = new JTextField();
		insertrearelement.setBounds(198, 40, 96, 19);
		contentPane.add(insertrearelement);
		insertrearelement.setColumns(10);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert rear code here
				Node temp;
				int elem=Integer.valueOf(insertrearelement.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prevlink=null;
				newnode.nextLink=null;
				if(first==null) {
					first=newnode;
				}
				else {
					temp=first;
					while(temp.nextLink!=null) {
						temp=temp.nextLink;
					}
					temp.nextLink=newnode;
					newnode.prevlink=temp;
				}
				JOptionPane.showMessageDialog(contentPane, "Element "+elem+" inserted rear end");
				insertrearelement.setText("");
			}
		});
		insertrear.setForeground(new Color(128, 0, 0));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 12));
		insertrear.setBounds(304, 39, 111, 23);
		contentPane.add(insertrear);
		
		JLabel lblNewLabel_2 = new JLabel(" ENTER THE ELEMENT :");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_2.setBounds(53, 77, 135, 15);
		contentPane.add(lblNewLabel_2);
		
		insertfrontelement = new JTextField();
		insertfrontelement.setBounds(198, 73, 96, 19);
		contentPane.add(insertfrontelement);
		insertfrontelement.setColumns(10);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert front code here
				int elem=Integer.valueOf(insertfrontelement.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prevlink=null;
				newnode.nextLink=null;
				if(first==null) {
					first=newnode;
				}
				else {
					newnode.nextLink=first;
					first.prevlink=newnode;
					first=newnode;
					
				}
				JOptionPane.showMessageDialog(contentPane, "Element "+elem+" inserted rear end");
				insertfrontelement.setText("");
			}
		});
		insertfront.setForeground(new Color(128, 0, 0));
		insertfront.setFont(new Font("Constantia", Font.BOLD, 12));
		insertfront.setBounds(304, 73, 119, 23);
		contentPane.add(insertfront);
		
		JLabel lblNewLabel_3 = new JLabel("ENTER THE INDEX :");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 115, 114, 15);
		contentPane.add(lblNewLabel_3);
		
		indexatpos = new JTextField();
		indexatpos.setBounds(134, 111, 45, 19);
		contentPane.add(indexatpos);
		indexatpos.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("ELEMENT :");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_4.setBounds(189, 115, 62, 15);
		contentPane.add(lblNewLabel_4);
		
		element = new JTextField();
		element.setBounds(261, 111, 45, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete rear code here
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
			    } else if (first.nextLink == null) {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
			        first = null;
			    } else {
			        Node temp = first;
			        while (temp.nextLink != null && temp.nextLink.nextLink != null) {
			            temp = temp.nextLink;
			        }

			        if (temp.nextLink != null) {
						JOptionPane.showMessageDialog(contentPane, "Element deleted is " + temp.nextLink.data);
			            temp.nextLink = null;
			        } else {
			        	JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
			        }
			    }
				

			}

		});
		deleterear.setForeground(new Color(128, 0, 0));
		deleterear.setFont(new Font("Constantia", Font.BOLD, 12));
		deleterear.setBounds(164, 176, 130, 23);
		contentPane.add(deleterear);
		
		JLabel lblNewLabel_3_1 = new JLabel("DELETE AT INDEX :");
		lblNewLabel_3_1.setForeground(Color.RED);
		lblNewLabel_3_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(36, 151, 114, 15);
		contentPane.add(lblNewLabel_3_1);
		
		deleteindexvalue = new JTextField();
		deleteindexvalue.setColumns(10);
		deleteindexvalue.setBounds(177, 147, 74, 19);
		contentPane.add(deleteindexvalue);
		
		JButton insertat = new JButton("INSERT AT");
		insertat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert at index code here
				int index=Integer.valueOf(indexatpos.getText());
				int elem=Integer.valueOf(element.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prevlink=null;
				newnode.nextLink=null;
				Node temp;
				
				if(first==null) {
					first=newnode;
				}
				if(index<0) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
				if(index==0) {
					if(first!=null) {
						newnode.nextLink=first;
						first.prevlink=newnode;
					}
					first=newnode;
					return;
				}
				temp=first;
				for(int i=0;i<index-1 && temp!=null;i++) {
					temp=temp.nextLink;
				}
					newnode.nextLink=temp.nextLink;
					if(temp.nextLink!=null) {
						temp.nextLink.prevlink=newnode;
					}
					temp.nextLink=newnode;
					newnode.prevlink=temp;
					JOptionPane.showMessageDialog(contentPane, "Element "+elem+" inserted @ position "+index);
					indexatpos.setText("");
					element.setText("");
			}
		});
		insertat.setForeground(new Color(128, 0, 0));
		insertat.setFont(new Font("Constantia", Font.BOLD, 12));
		insertat.setBounds(314, 110, 109, 23);
		contentPane.add(insertat);
		
		JButton deleteat = new JButton("DELETE AT");
		deleteat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete at code here
				int index = Integer.valueOf(deleteindexvalue.getText());

			    if (index < 0) {
			    	JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
			        return;
			    }

			    if (first == null) {
			    	JOptionPane.showMessageDialog(contentPane, "List is empty");
			        return;
			    }

			    if (index == 0) {
			        if (first.nextLink != null) {
			            first.nextLink.prevlink = null;
			        }
			        first = first.nextLink;
			        return;
			    }

			    Node temp = first;
			    for (int i = 0; i < index && temp != null; i++) {
			        temp = temp.nextLink;
			    }

			    if (temp == null) {
			    	JOptionPane.showMessageDialog(contentPane, "Index out of bounds");
			        return;
			    }

			    if (temp.nextLink != null) {
			        temp.nextLink.prevlink = temp.prevlink;
			    }

			    if (temp.prevlink != null) {
			        temp.prevlink.nextLink = temp.nextLink;
			    }
				JOptionPane.showMessageDialog(contentPane, "Element deletedted @ position "+index);
			    deleteindexvalue.setText("");
			}
		});
		deleteat.setForeground(new Color(128, 0, 0));
		deleteat.setFont(new Font("Constantia", Font.BOLD, 12));
		deleteat.setBounds(271, 140, 109, 23);
		contentPane.add(deleteat);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete front code here
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.nextLink==null) {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=first.nextLink;
					first.prevlink=null;
				}
			}
		});
		deletefront.setForeground(new Color(128, 0, 0));
		deletefront.setFont(new Font("Constantia", Font.BOLD, 12));
		deletefront.setBounds(164, 209, 130, 23);
		contentPane.add(deletefront);
		
		JButton displayforward = new JButton("DISPLAY FORWARD");
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display forward code here
				Node temp;
				
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.nextLink==null) {
					String msg="";
					msg=msg+first.data;
					displaybox.setText(msg);
				}
				else {
					temp=first;
					String msg="";
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.nextLink;
					}
					displaybox.setText(msg);

				}

			}
		});
		displayforward.setForeground(new Color(128, 0, 0));
		displayforward.setFont(new Font("Constantia", Font.BOLD, 12));
		displayforward.setBounds(20, 252, 168, 23);
		contentPane.add(displayforward);
		
		JButton displayreverse = new JButton("DISPLAY REVERSE");
		displayreverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display reverse code here
				Node temp;
				
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.nextLink==null) {
					String msg="";
					msg=msg+first.data;
					displaybox.setText(msg);
				}
				else {
					temp=first;
					String msg="";
					while(temp.nextLink!=null) {
						temp=temp.nextLink;
					}
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.prevlink;
					}
					displaybox.setText(msg);
				}
			}
		});
		displayreverse.setForeground(new Color(128, 0, 0));
		displayreverse.setFont(new Font("Constantia", Font.BOLD, 12));
		displayreverse.setBounds(261, 252, 154, 23);
		contentPane.add(displayreverse);
		
		displaybox = new JTextField();
		displaybox.setBounds(65, 285, 315, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
