package ru.oop;

public interface Transport extends Positioned {
    /**
     * Доставить человека на позицию
     */
    void deliver(Position position, Person person);
}
