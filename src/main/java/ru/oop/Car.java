package ru.oop;

/**
 * Интерфейс машины
 */
public class Car {
    private Person person;
    /**
     * Доставляет человека на машине в пункт назначения
     */
    public void go(Position destination) {
        changePersonPosition(person, destination);
    }

    public void setPerson(Person person){
        this.person = person;
    }

    /**
     * Меняет позицию Person
     */
    private void changePersonPosition(Person person, Position destination){
        person.setPosition(destination);
    }

}
