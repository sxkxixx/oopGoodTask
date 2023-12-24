package ru.oop.message;

/**
 * Класс сообщения
 */
public class ContentMessage {
    /**
     * Содержимое сообщение
     */
    private final String messageContent;

    /**
     * @param messageContent Контет сообщения
     */
    public ContentMessage(String messageContent) {
        this.messageContent = messageContent;
    }

    /**
     * Возвращаеь контент сообщения
     * @return контент сообщения
     */
    public String getMessageContent() {return this.messageContent;}
}
