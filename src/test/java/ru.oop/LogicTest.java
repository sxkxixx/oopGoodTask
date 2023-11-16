package ru.oop;

import org.junit.Assert;
import org.junit.Test;
import ru.oop.handlers.BotHandler;
import ru.oop.handlers.Handler;
import ru.oop.message.ContentMessage;

public class LogicTest {
    private final Handler handler;

    public LogicTest() {
        this.handler = new BotHandler();
    }

    @Test
    public void testHandlingMessage() {
        String message = "Hellow, World!";
        ContentMessage answer = this.handler.getHandledMessage(message);
        Assert.assertEquals("Ваше сообщение: '" + message + "'", answer.getMessageContent());
    }
}
