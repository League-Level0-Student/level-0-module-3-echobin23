package elseif;

import javax.swing.JOptionPane;

public class Hororscope {
	public static void main(String[] args) {
		String sign = JOptionPane.showInputDialog("What is your Zodiac sign");
		if(sign.equals("Capricorn")) {
			JOptionPane.showMessageDialog(null, "You are Hardwowrking, Straightforward, Stubborn");
		}
		else if(sign.equals("Taurus")) {
			JOptionPane.showMessageDialog(null, "You are Good taste, sensual, Down to Earth, stubborn");
		}
		else if(sign.equals("Virgo")) {
			JOptionPane.showMessageDialog(null, "You are successful, creative, clever");
	}
		else if(sign.equals("Aquarius")) {
			JOptionPane.showMessageDialog(null, "You are innovative, admired, eccentric");	
	}
		else if(sign.equals("Gemini")) {
			JOptionPane.showMessageDialog(null, "You are Dynamic, many talents, likes game");
		}
		else if(sign.equals("Libra")) {
			JOptionPane.showMessageDialog(null, "You are Iresistible, adventurous, indecisive");
		}
		
}
}
