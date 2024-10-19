package calculator.exception;

public enum ErrorMessage {

    IS_NOT_NUMBER("구분자 사이에 숫자가 들어있지 않습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
