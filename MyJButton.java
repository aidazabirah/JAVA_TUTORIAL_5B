import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // import?

class MyJButton extends JFrame implements ActionListener
{
	JLabel my_label = new JLabel();
	JButton my_button = new JButton("Display message");
	
	public MyJButton()
	{
		Container pane = getContentPane();
		pane.setBackground(Color.white);
		pane.setLayout(new FlowLayout());
		
		pane.add(my_button);
		pane.add(my_label); // ??
		my_button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		my_label.setText("Hi"); //__.setText
	}
	
	public static void main(String[] args) 
	{
		MyJButton frame = new MyJButton();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // (__)
		frame.setTitle("My Frame"); // (__)
		frame.setSize(300, 200); // (__)
		frame.setVisible(true);; //
	}
}
