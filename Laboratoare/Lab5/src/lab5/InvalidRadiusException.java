package lab5;

public class InvalidRadiusException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidRadiusException() {
		System.out.println("Invalid radius");
	}
}
