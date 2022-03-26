
public class AsteriskLogger implements Logger {
	
	@Override
	public void Log (String word) {
		System.out.println("***" + word + "***");
	}
	
	@Override
	public void Error (String word) {
		int aster = word.length() + 12;
		for (int i = 0; i <= aster; i++) {
			if( i == aster) {
				System.out.println("*");
			} else {
				System.out.print("*");
			}
		}
		System.out.println("***Error: " + word +"***");
		for (int i = 0; i <= aster; i++) {
			if( i == aster) {
				System.out.println("*");
			} else {
				System.out.print("*");
			}
		}
	}
	
}
