
public class Exit {
	public static String message;
	
	public static void exit(int code, String msg) {
		message = msg;
		System.exit(code);;
	}
	
	public static void exit(int code) {
		exit(code, null);
	}
	
	public static void noExit() {
		message = "There was no exit";
	}
}
