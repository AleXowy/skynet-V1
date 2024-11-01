package XO2;

public enum StatusCodes {
NOT_FOUND(404),
FORBIDDEN(403);


    private final int code;

    public int getCode() {
        return code;
    }

    StatusCodes(int code) {
        this.code = code;
    }
}

