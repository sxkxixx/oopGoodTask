package ru.oop.handlers;

import ru.oop.message.ContentMessage;

/**
 * Класс обработчик полученного запроса от пользователя
 */
public class BotHandler implements Handler {
    /**
     * Обрабатывает запрос пользователя и возвращает ответ
     *
     * @param userMessage Запрос пользователя
     */
    @Override
    public ContentMessage getHandledMessage(String userMessage) {
        String answer = this.getRepliedMessage(userMessage);
        return new ContentMessage(answer);
    }

    /**
     * Возвращает ответ пользователю в формате "Ваше сообщение: '{message}'"
     * @param message Сообщение пользователя
     * @return Сообщение
     */
    private String getRepliedMessage(String message) {
        return "Ваше сообщение: '" + message + "'";
    }
}
