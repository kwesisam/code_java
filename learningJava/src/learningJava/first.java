package learningJava;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class first {
	public static void main(String args[]) {
		GUI sam = new GUI();// creating object of class GUI
		sam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close the window when the close button is clicked
		sam.setSize(400, 100);//setting the width and height of the window
		sam.setVisible(true);// setting the visibility of the window
	}

}
