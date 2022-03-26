
public class SpacedLogger implements Logger {

	@Override //method for splitting letters
	public void Log (String word) {
		StringBuilder splitLog = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			if (i > 0) {
			      splitLog.append(" ");
			    }

			   splitLog.append(word.charAt(i));
		}
		System.out.println(splitLog);
	}
	@Override //method for error and then splitting the string
	public void Error (String word) {
		StringBuilder splitError = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			if (i > 0) {
			      splitError.append(" ");
			    }

			   splitError.append(word.charAt(i));
		}
		System.out.println("Error: " + splitError);
	}
	
}
