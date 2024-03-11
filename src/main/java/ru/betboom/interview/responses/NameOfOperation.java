package ru.betboom.interview.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.betboom.interview.responses.errors.ResponseError;

public class NameOfOperation {
    @JsonProperty("return_object")
    ReturnObject returnObject;
    @JsonProperty("error")
    ResponseError responseError;

    public NameOfOperation(ReturnObject returnObject, ResponseError responseError) {
        this.returnObject = returnObject;
        this.responseError = responseError;
    }

    public NameOfOperation() {
    }

    public ReturnObject getReturnObject() {
        return returnObject;
    }

    public void setReturnObject(ReturnObject returnObject) {
        this.returnObject = returnObject;
    }

    public ResponseError getResponseError() {
        return responseError;
    }

    public void setResponseError(ResponseError responseError) {
        this.responseError = responseError;
    }
}
