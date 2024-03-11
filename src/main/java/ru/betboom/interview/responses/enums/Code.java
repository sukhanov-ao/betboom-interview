package ru.betboom.interview.responses.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Code {
    VALIDATE("VALIDATE");

    private String code;

    Code(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
