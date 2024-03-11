package ru.betboom.interview.responses.errors;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.betboom.interview.responses.enums.ValidationErrorMessage;

public class ErrorField {

    @JsonProperty("field")
    private String field;

    @JsonProperty("message")
    private String message;

    public ErrorField(String field, ValidationErrorMessage message) {
        this.field = field;
        this.message = message.getMessage();
    }

    public ErrorField() {
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public ValidationErrorMessage getMessage() {
        return ValidationErrorMessage.valueOf(this.message);
    }

    public void setMessage(ValidationErrorMessage message) {
        this.message = message.getMessage();
    }
}
