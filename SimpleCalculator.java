import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener
{
	private JLabel label1, label2, label3, label4;
	private JTextField textNum1, textNum2, textResult;
	private JButton addButton, subButton, mulButton, divButton;
	
	public SimpleCalculator()
	{
		// Create components
		label1 = new JLabel("Simple Calculator");
		label2 = new JLabel("Enter first number:");
		label3 = new JLabel("Enter second number:");
		label4 = new JLabel("Result:");
		
		textNum1 = new JTextField(10);
		textNum2 = new JTextField(10);
		textResult = new JTextField(10);
		textResult.setEditable(false); // make result field non-editable
		addButton = new JButton("+");
		addButton.addActionListener(this);
		subButton = new JButton("-");
		subButton.addActionListener(this);
		mulButton = new JButton("*");
		mulButton.addActionListener(this);
		divButton = new JButton("/");
		divButton.addActionListener(this);
		
		// Layout setup
		setLayout(new GridLayout(6, 2, 5, 5));
		add(label1);
		add(new JLabel("")); // empty cell for spacing
		add(label2);
		add(textNum1);
		add(label3);
		add(textNum2);
		add(label4);
		add(textResult);
		add(new JLabel("Operations: "));
		
		JPanel btnPanel = new JPanel( new GridLayout(1, 4, 2, 2));
		btnPanel.add(addButton);
		btnPanel.add(subButton);
		btnPanel.add(mulButton);
		btnPanel.add(divButton);
		add(btnPanel);
	}
	
	// Handle button click
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			double num1 = Double.parseDouble(textNum1.getText());
			double num2 = Double.parseDouble(textNum2.getText());
			double sum = 0;
			
			if (e.getSource() == addButton)
			{
				sum = num1 + num2;
			}
			else if (e.getSource() == subButton)
			{
				sum = num1- num2;
			}
			else if (e.getSource() == mulButton)
			{
				sum = num1 * num2;
			}
			else if  (e.getSource() == divButton)
			{
				if (num2 == 0)
				{
					JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
					return;
				}
				sum = num1 / num2;
			}
			
			textResult.setText(String.valueOf(sum));
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Please enter valid numbers!");
		}
	}

	public static void main(String[] args)
	{
		SimpleCalculator frame = new SimpleCalculator();
		// Frame setup
		frame.setTitle("Simple Calculator");
		frame.setSize(380, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // center on screen
		frame.setVisible(true);
	}
}
