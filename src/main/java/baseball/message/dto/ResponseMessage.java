package baseball.message.dto;

public class ResponseMessage {
	private StringBuilder result;

	public void init() {
		result = new StringBuilder();
	}

	public static void of(String message) {
		System.out.println(message);
	}
}
