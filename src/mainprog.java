import java.util.Scanner;;

public class mainprog {
	public static void main(String[] args) {
		Scanner MyKbd = new Scanner(System.in);
		System.out.println("Hi, what's your name?");
		String Username = MyKbd.nextLine();
		String NewName = new String(Username);
		String FirstChar, LastChar;
		FirstChar = Username.substring(0,1);
		LastChar = Username.substring(Username.length()-1);
		NewName = LastChar.toUpperCase() + Username.substring(1,Username.length() - 1) + FirstChar.toLowerCase();
		System.out.println("Hi, " + NewName);
	}
}
