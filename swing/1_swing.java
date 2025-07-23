import javax.swing.*;
import java.awt.event.*;
	
class ButtonListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
			//System.out.println("hello");
			JOptionPane.showMessageDialog(null,"hello");
	}
}

class Program
{
	public static void main(String args[])
	{
		
		JFrame frm=new JFrame();
		frm.setLayout(null);
		ButtonListener listener=new ButtonListener();
		JButton btn=new JButton("ok");
		btn.addActionListener(listener);
		btn.setBounds(100,100,100,30);
		frm.add(btn);
		frm.setSize(400,400);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}