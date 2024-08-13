package pl.programujodpodstaw.enums;

public enum StatusCode {
    NOT_FOUND(400),
    NOT_CREATED(300),
    NOT_AUTHORIZED(250),
    OK(0);


    private final int code;                                                                                             // tworzymy pole `code` aby dodać kod błedu do enmua

    public int getCode() {                                                                                              // tworzymy getter dla code
        return code;
    }

    StatusCode(int code) {                                                                                              // tworzymy konstruktor code
        this.code = code;
    }
 }