package baseball.message;

public enum Message {
	ENTER_INPUT_NUMBER("숫자를 입력해주세요 : "),
	PRINT_THREE_STRIKE("3스트라이크"),
	PRINT_RIGHT_ANSWER("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
	LINE_BREAKER("\n"),
	BALL("볼"),
	STRIKE("스트라이크");

	private String message;

	Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
