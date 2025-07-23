import javax.swing.*;
import java.awt.event.*;

class ButtonListener implements ActionListener
{
	public void actionPerformed(ActionEvent e )
	{
			
			JOptionPane.showMessageDialog(null,e.getActionCommand());
			
			
			
	}
	

}

class swing
{
	public static void main(String args[])
	{	
		JFrame frame=new JFrame("Swing prog");
		frame.setLayout(null);
		frame.setVisible(true);
		ButtonListener listener=new ButtonListener();
		
		int k=0;
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<6;j++)
				{
				
				String str=Integer.toString(k+1);
		
				JButton button=new JButton(str);
				button.addActionListener(listener);
				button.setBounds(100*j,i*100,100,100);
				
				frame.add(button);
				k++;
		
			}
		}
				
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);	
		frame.setSize(500,500);
		
		
	}
}