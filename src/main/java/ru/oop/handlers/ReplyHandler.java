package ru.oop.handlers;

/**
 * Класс обработчик полученного запроса от пользователя
 */
public class ReplyHandler implements Handler{
    /**
     * Возвращает сообщение в формате "Ваше сообщение: {message}"
     * @param message
     * @return "Ваше сообщение: {message}"
     */
    @Override
    public String getHandledMessage(String message) {
        return "Ваше сообщение: " + message;
    }
}
