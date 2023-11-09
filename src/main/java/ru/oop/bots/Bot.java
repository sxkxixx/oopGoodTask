package ru.oop.bots;

import ru.oop.handlers.Handler;

/**
 * Интерфейс для реализации Бота для любой платформы
 */
public interface Bot {
    /**
     * Отправляет сообщение в чат
     * @param chatId ID чата
     * @param message Сообщение для отправки
     */
    void sendMessage(Long chatId, String message);

    /**
     * Принимает сообщение из чата.
     * @param chatId ID чата
     * @param message Полученное сообщение
     */
    void onUpdateReceived(Long chatId, String message);

    /**
     * Запускает бота
     */
    void run();
}
