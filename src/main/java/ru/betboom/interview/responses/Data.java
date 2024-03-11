package ru.betboom.interview.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

    @JsonProperty("name_of_operation")
    private NameOfOperation nameOfOperation;

    public Data(NameOfOperation nameOfOperation) {
        this.nameOfOperation = nameOfOperation;
    }

    public Data() {
    }

    public NameOfOperation getNameOfOperation() {
        return nameOfOperation;
    }

    public void setNameOfOperation(NameOfOperation nameOfOperation) {
        this.nameOfOperation = nameOfOperation;
    }
}
