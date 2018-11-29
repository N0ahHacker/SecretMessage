import java.util.Scanner;
public class SecretMessage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a message to encode or decode or press Enter to exit");
		String message1 = scan.nextLine();
		while(message1.length() > 0){
			String message = "";
			String output = "";
			for (int y = message1.length()-1; y >= 0; y--){
				message += message1.charAt(y);
			}
			System.out.println("Enter a secret key(-25 to 25): ");
			int keyVal = Integer.parseInt(scan.nextLine());
			char key = (char) keyVal;
			for (int x = 0; x < message.length(); x++) {
				char input = message.charAt(x);
				if (input >= 'A' && input <= 'Z'){
					input += key; //same as input = (input + key)
					if (input > 'Z')
						input -= 26;
					if (input < 'A')
						input +=26;
				}
				else if (input >= 'a' && input <= 'z'){
					input += key;
					if (input > 'z')
						input -= 26;
					if (input < 'a')
						input += 26;
					///if statements are to 'wrap' encoding through
					//only the alphabet rather than into symbols
				}
				else if (input >= '0' && input <='9')
				{
					input += (keyVal % 10);
					///using keyVal for integer version to encode numbers
					if (input > '9')
						input -=10;
					if (input < '0')
						input +=10;
				}
				output += input;
				
			}
			System.out.println(output);
			System.out.println("Enter a new message or hit Enter to quit.");
			message1 = scan.nextLine();
		}
		scan.close();
	}
}
