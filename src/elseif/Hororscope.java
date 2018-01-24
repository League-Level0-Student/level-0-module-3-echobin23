package elseif;

import javax.swing.JOptionPane;

public class Hororscope {
	public static void main(String[] args) {
		String sign = JOptionPane.showInputDialog("What is your Zodiac sign");
		if(sign.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "You are Hardwowrking, Straightforward, Stubborn");
		}
		else if(sign.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "You are Good taste, sensual, Down to Earth, stubborn");
		}
		else if(sign.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "You are successful, creative, clever");
	}
		else if(sign.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "You are innovative, admired, eccentric");	
	}
		else if(sign.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "You are Dynamic, many talents, likes game");
		}
		else if(sign.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "You are Iresistible, adventurous, indecisive");
		}
		else if(sign.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "You are free, sensual, sensitve");
			}
		else if(sign.equalsIgnoreCase("cancer")) {
			JOptionPane.showMessageDialog(null, "You are sensitive, friend-oriented, pratical");	
            }
		else if(sign.equalsIgnoreCase("scorpio")) {
			JOptionPane.showMessageDialog(null, "You are self-reliant, powerful, dominant");
			}
		else if(sign.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "You are brave, independent, impulsive");
			}
		else if(sign.equalsIgnoreCase("leo")) {
			JOptionPane.showMessageDialog(null, "You are a creative, popular, faithful");
		}
		else if (sign.equalsIgnoreCase("Sagitarius")) {
			JOptionPane.showMessageDialog(null, "You are open-minded, loving, insensitive");
			}
		
		
}
}
