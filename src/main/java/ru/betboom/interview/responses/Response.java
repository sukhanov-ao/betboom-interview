package ru.betboom.interview.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    @JsonProperty("data")
    Data data;

    public Response(Data data) {
        this.data = data;
    }

    public Response() {
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
