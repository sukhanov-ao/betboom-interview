package ru.betboom.interview.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReturnObject {
    @JsonProperty("return_obect")
    private String returnObject;

    public ReturnObject(String returnObject) {
        this.returnObject = returnObject;
    }

    public ReturnObject() {
    }

    public String getReturnObject() {
        return returnObject;
    }

    public void setReturnObject(String returnObject) {
        this.returnObject = returnObject;
    }
}
