
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "June 12th";
		String dadsBirthday = "September 9th";
		String myBirthday = "March 12th";

		// 2. Find out which birthday the user wants and and store their response in a variable
String Birthday = JOptionPane.showInputDialog("Whos birthday do you want?");
		// 3. Print out what the user typed
		if(Birthday.equals("mom")) {
			JOptionPane.showMessageDialog(null, "Mom's birthday is June the 12th");
		}
		else if(Birthday.equals("dad")) {
			JOptionPane.showMessageDialog(null, "Dad's birthday is September 9th");
		}
		else if(Birthday.equals("Subin")) {
			JOptionPane.showMessageDialog(null, "My birthday is March 12th");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't know that birthday");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
