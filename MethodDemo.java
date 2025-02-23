public class MethodDemo {
	public static void main(String[] args) {
		greet();
		printMessage("This is my message.");
	}
	
	public static void greet() {
	    System.out.println("Hello from the greet method!");
	}
	
	// method with a parameter (this pass the value to the method.)
	public static void printMessage(String message){
	    System.out.println(message);
	}
}