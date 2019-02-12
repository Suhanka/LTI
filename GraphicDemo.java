//testing entity

import java.awt.*;

class MyFrame extends Frame
{
	Button signup = new Button("Sign-Up");
	Button signin = new Button("Sign-In");
	Button forgPass = new Button("Forgot Password");
	Button resetPass = new Button("Reset Password");

	MyFrame() {
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		add(signup);
		add(signin);
		add(forgPass);
		add(resetPass);
	}
}

class GraphicDemo
{
	public static void main(String args[])
	{
		System.out.println("starting the bank....");

		MyFrame f = new MyFrame();
		f.setSize(100,100);
		f.setLocation(100,200);
		f.setVisible(true);
		
	}
}