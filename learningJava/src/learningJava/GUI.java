package learningJava;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class GUI extends JFrame {
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	public GUI() {
		super("The title");// add title
		setLayout(new FlowLayout()); // for default layout
		item1 = new JTextField(10);// create a text input field with size 20
		add(item1);// add the item to the screen
		item2 = new JTextField("enter text here");// create a text input field with a default value
		add(item2);
		item3 = new JTextField("uneditable",20);// it default value is 20
		item3.setEditable(false);// make item3 uneditable
		passwordField = new JPasswordField("mypass");// create a password input field with a default value
		add(item3);

		add(passwordField);
		
		thehandler handler = new thehandler();// creating an object that will handle the events
		item1.addActionListener(handler);// connecting the event to the handle
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
	}
	
	
	//create a class for the handle object that implement ActionListener
	private class thehandler implements ActionListener{
		
		// it main methods
		public void actionPerformed(ActionEvent event) {
			String string = "";
			
			
			// check if enter is press on any field
			if(event.getSource()==item1) {
				string = String.format("field 1: %s", event.getActionCommand());
			
			}else if(event.getSource()==item2) {
				string = String.format("field 2: %s", event.getActionCommand());
			}else if(event.getSource()==item3) {
				string = String.format("field 3: %s", event.getActionCommand());
				
			}else if(event.getSource()==passwordField) {
				string = String.format("password field is %s", event.getActionCommand());
			}
			
			//showing the result in another window
			JOptionPane.showMessageDialog(null, string);
			
		}
		
	}

	
	
}