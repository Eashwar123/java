import javax.swing.*;
import java.awt.event.*;


/*class ButtonListener implements ActionListener
{
	
		public void actionPerformed(ActionEvent e)
		{
			tf2.setText(tf1.getText());
			
		}
		public void actionPerformed(ActionEvent f)
		{
			tf1.setText(tf2.getText());
			
		}
	

}*/
class MyFrame1 extends JFrame implements ActionListener
{

		private JTextField	tf1;
		private JButton		button;
		public MyFrame1()
		{	
			String str=System.console().readLine();
			tf1=new JTextField(str);
			tf1.setBounds(100,100,100,100);
			button=new JButton("ok");
			button.setBounds(100,150,100,30);
			ButtonListener listener=new ButtonListener();
			button.addActionListener(listener);
			setSize(500,500);
			add(tf1);
			add(button);
			setVisible(true);
			setLayout(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}	
		
		public void actionPerformed(ActionEvent e)
		{
			tf2=tf1.getText();
			tf2.setText(tf1.getText());
			
		}
	}

class MyFrame2 extends JFrame implements ActionListener
{

		private JTextField	tf2;
		private JButton		button2;
		public MyFrame2()
		{	
			tf2=new JTextField();
			tf2.setBounds(100,100,100,100);
			ButtonListener listener2=new ButtonListener();
			button2=new JButton("ok");
			button2.setBounds(100,150,100,30);
			button2.addActionListener(listener2);
			setSize(500,500);
			add(tf2);
			add(button2);
			setVisible(true);
			setLayout(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}	
		public void actionPerformed(ActionEvent f)
		{
			tf1.setText(tf2.getText());
			
		}
		
		
	}
class program
{
	public static void main(String args[])
	{
		MyFrame1 fm1=new MyFrame1();
		MyFrame2 fm2=new MyFrame2();


	}
}