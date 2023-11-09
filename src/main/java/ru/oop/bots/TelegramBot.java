package ru.oop.bots;

import ru.oop.handlers.Handler;

/**
 * Класс для реализации Телеграм бота
 */
public class TelegramBot implements Bot {
    /**
     * Оработчик сообщений
     */
    private Handler handler;

    /**
     * @param handler обработчик сообщений
     */
    public TelegramBot(Handler handler) {
        this.handler = handler;
    }

    /**
     * Метод для отправки сообщения в чат
     * @param chatId ID чата
     * @param message Сообщение для отправки
     */
    @Override
    public void sendMessage(Long chatId, String message) {
    }

    /**
     * Принимает и обрабатывает полученное сообщение
     * @param chatId ID чата
     * @param message Полученное сообщение
     */
    @Override
    public void onUpdateReceived(Long chatId, String message) {
        String handledReply = this.handler.getHandledMessage(message);
        sendMessage(chatId, message);
    }

    /**
     * Запускает бота
     */
    @Override
    public void run() {

    }
}
