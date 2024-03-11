package ru.betboom.interview;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToResponse {

    /**
     * @param data  - json в виде строки
     * @param clazz - класс, в который, необходимо преобразовать объект
     * @param <T>
     * @return - экземпляр класса, типа указанного в clazz
     * @throws JsonProcessingException
     */
    public static <T> T getResponseFromJson(String data, Class<T> clazz) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(data, clazz);
    }
}
