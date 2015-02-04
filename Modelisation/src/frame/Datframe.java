package frame;

import javax.swing.JFrame;

public class Datframe extends JFrame{
	
	public Datframe(){
		
		this.setResizable(false);
		this.pack();
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);

	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	          new Datframe();
	        }
	    });
	}

}
