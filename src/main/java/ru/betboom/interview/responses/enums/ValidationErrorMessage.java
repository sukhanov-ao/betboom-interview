package ru.betboom.interview.responses.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum ValidationErrorMessage {
    CANNOT_BE_BLANK("cannot be blank"),
    LENGTH("the length must be between 2 and 63"),
    FORMAT("must be in a valid format");

    private String message;

    ValidationErrorMessage(String message) {
        this.message = message;
    }

    @JsonValue
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
