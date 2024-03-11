package ru.betboom.interview;

import org.junit.jupiter.api.Test;
import ru.betboom.interview.responses.Data;
import ru.betboom.interview.responses.NameOfOperation;
import ru.betboom.interview.responses.Response;
import ru.betboom.interview.responses.enums.Code;
import ru.betboom.interview.responses.enums.ValidationErrorMessage;
import ru.betboom.interview.responses.errors.ErrorField;
import ru.betboom.interview.responses.errors.ResponseError;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class JsonToResponseTest {

    @Test
    void testJsonToResponse() throws URISyntaxException, IOException {
        String json = getJsonAsString();
        Response response = JsonToResponse.getResponseFromJson(json, Response.class);

        assertThat(response)
                .usingRecursiveComparison()
                .isEqualTo(getExpectedResponse());
    }

    private String getJsonAsString() throws URISyntaxException, IOException {
        URL resource = JsonToResponseTest.class.getClassLoader().getResource("json_data.json");
        byte[] bytes = new byte[0];
        if (resource != null) {
            bytes = Files.readAllBytes(Paths.get(resource.toURI()));
        }
        return new String(bytes);
    }

    private Response getExpectedResponse() {
        ErrorField errorField = new ErrorField(
                "field_name",
                ValidationErrorMessage.FORMAT
        );

        ResponseError responseError = new ResponseError(
                Code.VALIDATE,
                List.of(errorField),
                "validation error"

        );
        NameOfOperation nameOfOperation = new NameOfOperation(
                null, responseError
        );

        Data data = new Data(nameOfOperation);

        return new Response(data);
    }
}