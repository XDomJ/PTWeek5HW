import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		Logger asterisk = new AsteriskLogger();
		System.out.println("Please enter your test word.");
		asterisk.Log(kb.nextLine());
		System.out.println("Please enter your test word.");
		asterisk.Error(kb.nextLine());
		
		Logger splitLetter = new SpacedLogger();
		System.out.println("Please enter your test word.");
		splitLetter.Log(kb.nextLine());
		System.out.println("Please enter your test word.");
		splitLetter.Error(kb.nextLine());
	}
}
