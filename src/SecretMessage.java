import java.util.Scanner;
public class SecretMessage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a message to Encode or Decode");
		String message = scan.nextLine();
		String output = "";
		char key = 13;
		for (int x = 0; x < message.length(); x++) {
			char input = message.charAt(x);
			if (input >= 'A' && input <= 'Z'){
				input += key; //same as input = (input + key)
				if (input > 'Z')
					input -= 26;					
			}
			else if (input >= 'a' && input <= 'z'){
				input += key;
				if (input > 'z')
					input -= 26;
			}
			output += input;
		}
		System.out.println(output);
		scan.close();
	}

}
