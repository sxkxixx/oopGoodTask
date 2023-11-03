package ru.oop;

import java.util.Arrays;
import java.util.List;

/**
 * <b>Задача 2:</b><br>
 * Добраться человеку до заданного места.<br>
 * Притом он может поехать не только на машине, а на автобусе,
 * метро, велосипеде или любом другом виде транспорта.<br>
 * Стоит учесть, что может понадобится до транспорта дойти пешком.<br>
 * И не всегда можно подъехать прямо к нужному месту, может понадобиться дойти пешком.<br>
 * Человек знает своё текущее местоположение (у него есть метод {@link Person#getPosition()}<br>
 * Подсказка: появился интерфейс {@link Positioned}, его можно использовать для чего-то ещё<br>
 * <ul>
 *   <li>Код не должен превышать 7 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(Person person, Position destination)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 * </ul>
 * <br>
 * <b>Задача 3:</b><br>
 * То же самое, но добраться нужно с пересадками<br>
 * Можно определить транспортные средства списком:<br>
 * {@code Arrays.asList(new Car(person), new Bus("43", person),
 *        new Bus("50", person));}
 * <ul>
 *   <li>Код не должен превышать 12 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(Person person, Position destination)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 * </ul>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class Main {
    /**
     * Добраться человеку до заданного места.<br>
     * <strong>Задача 2</strong>
     */
    public static void moveToTask2(Person person, Position destination, Transport transport){
        person.walk(transport.getPosition());
        transport.deliver(destination, person);
        person.walk(destination);
        assert person.getPosition() == destination;
    }

    /**
     * Переехать из текущего места в заданную точку
     * на любом, заранее определённом транспорте
     * <br/><strong>Задача 3</strong>
     */
    public static void moveToTask3(Person person, Position destination) {
        List<Transport> transports = Arrays.asList(
                new Car(person), new Bus("43", person), new Bus("50", person)
        );
        for (Transport transport : transports) {
            person.walk(transport.getPosition());
            transport.deliver(destination, person);
        }
        person.walk(destination);
        assert person.getPosition() == destination;
    }
}