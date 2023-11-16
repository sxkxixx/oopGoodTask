package ru.oop;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import ru.oop.bots.Bot;
import ru.oop.bots.DiscordBot;
import ru.oop.bots.TelegramBot;
import ru.oop.config.Config;
import ru.oop.handlers.BotHandler;
import ru.oop.handlers.Handler;

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
        // Инициализация обработчика
        Handler handler = new BotHandler();

        // Настройки для телеграм бота
        Config telegramConfig = new Config("BOT_NAME", "BOT_TOKEN");
        // Телеграм бот
        Bot telegramBot = new TelegramBot(telegramConfig, handler);

        // Настройки дискорд бота
        Config discordConfig = new Config(null, "BOT_TOKEN");
        // Дискорд бот
        Bot discordBot = new DiscordBot(discordConfig, handler);

        // Java Discord API
        JDA api = JDABuilder.createDefault(discordBot.getBotToken()).build();
        api.addEventListener(discordBot);
    }
}
