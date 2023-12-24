package ru.oop.handlers;

import ru.oop.message.ContentMessage;

/**
 * Интерфейс для логики обработки полученного сообщения
 */
public interface Handler {
    /**
     * Возвращает обработанное сообщение пользователя
     *
     * @param userMessage Запрос пользователя
     */
    ContentMessage getHandledMessage(String userMessage);
}
