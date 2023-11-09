package ru.oop;

import ru.oop.bots.DiscordBot;
import ru.oop.bots.TelegramBot;
import ru.oop.handlers.Handler;
import ru.oop.handlers.ReplyHandler;

/**
 * Построить базовую архитектуру бота,
 * который сможет работать в  telegram и ещё как минимум одной чат-бот платформе (Discord, VK или др.).
 * В качестве основного функционала бота можно возвращать в ответ текст,
 * который отправил пользователь с пометкой от бота. Например "Ваше сообщение: <сообщение>".
 * Нужно акцентировать внимание именно на архитектуре и интерфейсах.<br/>
 * Пример:<br/>
 * User: привет<br/>
 * Bot: "Ваше сообщение: 'привет'".
 */
public class BotApplication {
    public static void main(String[] args){
        Handler handler = new ReplyHandler();
        new TelegramBot(handler).run();
        new DiscordBot(handler).run();
    }
}
