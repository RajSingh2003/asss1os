import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class s17 extends JFrame implements ActionListener {
    JTextField textField1, textField2, textField3;
    JButton concatButton, reverseButton;

    s17() {
        textField1 = new JTextField();
        textField1.setBounds(50, 50, 150, 20);

        textField2 = new JTextField();
        textField2.setBounds(50, 100, 150, 20);

        textField3 = new JTextField();
        textField3.setBounds(50, 150, 200, 20);
        textField3.setEditable(false);

        concatButton = new JButton("Concatenate");
        concatButton.setBounds(50, 200, 120, 30);

        reverseButton = new JButton("Reverse");
        reverseButton.setBounds(180, 200, 120, 30);

        concatButton.addActionListener(this);
        reverseButton.addActionListener(this);

        add(textField1);
        add(textField2);
        add(textField3);
        add(concatButton);
        add(reverseButton);

        setTitle("Text Manipulation");
        setSize(350, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) 
	{
        if (e.getSource() == concatButton) 
		{
            String text1 = textField1.getText();
            String text2 = textField2.getText();
            textField3.setText(text1 + text2);
        } 
		else if (e.getSource() == reverseButton) 
		{
            String text1 = textField1.getText();
            String reversedText = new StringBuilder(text1).reverse().toString();
            textField3.setText(reversedText);
        }
    }

    public static void main(String[] args) {
        new s17();
    }
}