
# Тестовое задание BetBoom

---

Есть объект обработки ошибок:

```
{
  "data": {
    "name_of_operation": {
      "return_object": null,
      "error": {
        "code": "VALIDATE",
        "fields": [
          {
            "field": "field_name",
            "message": "validation_error_message"
          }
        ],
        "message": "validation error"
      }
    }
  }
}
```
Где:

* В качестве значения {{field_name}} возвращается имя поля, в котором указано невалидное значение
* В качестве знаяения {{validation_error_message}} могут быть:
  * в случае отсутствия обязательных полей: cannot be blank
  * В случае некорректной длины: the length must be between 2 and 63
  * В случае наличия недопустимых символов must be in a valid format

---

**Написать функцию, которая принимает на вход JSON объект подобного типа и вытаскивает значения полей**

---