package ru.oop.config;

public class Config {
    /**
     * Имя бота
     */
    private final String botName;

    /**
     * Токен бота
     */
    private final String token;

    /**
     * @param botName Имя бота
     * @param token Имя токена
     */
    public Config(String botName, String token) {
        this.botName = botName;
        this.token = token;
    }

    /**
     * Возвращает имя бота
     * @return Имя бота
     */
    public String getBotName() {
        return botName;
    }

    /**
     * Возвращает токен бота
     * @return Токен бота
     */
    public String getToken() {
        return token;
    }
}
