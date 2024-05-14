package org.example;

public enum Message {
    GREETING("Привіт"),
    QUESTION("Що таке паляниця?"),
    ANSWER("хліб"),
    CURRENT_DATE_AND_TIME("Поточна дата і час: "),
    WRONG_ANSWER("Неправильна відповідь. Роз'єднано."),
    SUCCESS_CONNECTION("Client connected"),
    START_SERVER("Server is listening on port: "),
    SERVER_EXCEPTION("Server exception: ");

    private String message;

    Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
