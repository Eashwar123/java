import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame
{
	JButton		btn;
	JLabel		lbl,imagelbl;//2 labels
	JScrollPane	jsp;
	public MyFrame()
	{
		setSize(500,500);
		setLayout(null);
		lbl=new JLabel();
		lbl.setText("Select Image..");
		
		lbl.setBounds(100,100,100,30);
		
		ImageIcon ic=new ImageIcon("https://static.wikia.nocookie.net/gintama/images/b/b9/GinFinal.png/revision/latest?cb=20210902112030");
		imagelbl=new JLabel(ic);
		jsp=new JScrollPane(imagelbl);
		jsp.setBounds(100,200,250,200);
		btn=new JButton("Browse");
		btn.setBounds(230,100,100,30);
		/*btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				showDialog();
			}
		});*/
		
		add(btn);
		add(jsp);
		add(lbl);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
class program
{
	public static void main(String args[])
	{
		MyFrame frm=new MyFrame();

	}



}