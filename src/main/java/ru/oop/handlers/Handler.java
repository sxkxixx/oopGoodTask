package ru.oop.handlers;

/**
 * Интерфейс для логики обработки полученного сообщения
 */
public interface Handler {
    /**
     * Возвращает обработанное сообщение
     * @param message сообщение для обработки
     * @return обработанное сообщение
     */
    String getHandledMessage(String message);
}
