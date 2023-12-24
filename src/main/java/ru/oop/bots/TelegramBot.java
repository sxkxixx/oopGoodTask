package ru.oop.bots;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.oop.config.Config;
import ru.oop.handlers.Handler;
import ru.oop.message.ContentMessage;

/**
 * Класс для реализации Телеграм бота
 */
public class TelegramBot extends TelegramLongPollingBot implements Bot {
    /**
     * Настройки бота
     */
    private final Config config;
    /**
     * Обработчик сообщений
     */
    private final Handler handler;

    /**
     * @param config Настройки бота
     * @param handler Обработчик сообщений
     */
    public TelegramBot(Config config, Handler handler) {
        this.config = config;
        this.handler = handler;
    }

    /**
     * Принимает сообщение из чата.
     *
     * @param update
     */
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            ContentMessage message = this.handler.getHandledMessage(update.getMessage().getText());
            sendMessage(update.getMessage().getChatId(), message.getMessageContent());
        }
    }

    /**
     * Возвращает название бота
     * @return Название бота
     */
    @Override
    public String getBotUsername() {
        return this.config.getBotName();
    }

    /**
     * Возвращает токен бота
     * @return Токен бота
     */
    @Override
    public String getBotToken() {
        return this.config.getToken();
    }

    /**
     * Отправляет сообщение в чат
     *
     * @param chatId  ID чата
     * @param reply Сообщение для отправки
     */
    public void sendMessage(Long chatId, String reply) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(reply);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}
