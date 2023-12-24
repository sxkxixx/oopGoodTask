package ru.oop.bots;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import ru.oop.config.Config;
import ru.oop.handlers.Handler;
import ru.oop.message.ContentMessage;

/**
 * Класс для реализации Discord бота
 */
public class DiscordBot extends ListenerAdapter implements Bot {
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
    public DiscordBot(Config config, Handler handler) {
        this.config = config;
        this.handler = handler;
    }

    /**
     * Метод, который получает сообщения от пользователя
     * @param event Событие
     */
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
        String content = message.getContentRaw();
        ContentMessage contentMessage = this.handler.getHandledMessage(content);
        sendMessage(event.getChannel(), contentMessage.getMessageContent());
    }

    /**
     * Метод для отправки сообщения
     * @param messageChannel
     * @param answer
     */
    public void sendMessage(MessageChannel messageChannel, String answer) {
        messageChannel.sendMessage(answer).queue();
    }

    /**
     * Возвращает токен бота
     * @return Токен бота
     */
    @Override
    public String getBotToken() {
        return this.config.getToken();
    }
}
