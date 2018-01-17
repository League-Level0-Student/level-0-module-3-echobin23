package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Are you happy");
		
		if(answer.equals("no")) {
			answer = JOptionPane.showInputDialog("Do you want to be happy");
			if(answer.equals("no")){
				JOptionPane.showMessageDialog(null, "Keep doing what your doing");
			}
			else if(answer.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
		}
			
			else if(answer.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Keep doing what your doing");
				
			}

}
}
