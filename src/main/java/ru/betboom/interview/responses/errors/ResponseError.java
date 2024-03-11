package ru.betboom.interview.responses.errors;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.betboom.interview.responses.enums.Code;

import java.util.List;

public class ResponseError {

    @JsonProperty("code")
    private Code code;
    @JsonProperty("fields")
    private List<ErrorField> fields;
    @JsonProperty("message")
    private String message;

    public ResponseError(Code code, List<ErrorField> fields, String message) {
        this.code = code;
        this.fields = fields;
        this.message = message;
    }

    public ResponseError() {
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public List<ErrorField> getFields() {
        return fields;
    }

    public void setFields(List<ErrorField> fields) {
        this.fields = fields;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
