package ru.avalon.java.j20.labs.models;

import java.util.Objects;

/**
 * Представление о человеке.
 */
public class Person {

    /**
     * Имя.
     */
    private final String name;
    /**
     * Фамилия.
     */
    private final String surname;

    /**
     * Создаёт экземпляр класса на основании имени и даты рождения.
     *
     * @param name имя человека
     * @param surname дата рождения человека
     */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * возвращает имя человека.
     *
     * @return имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает фамилию человека.
     *
     * @return фамилия человека
     */
    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            return (this.name == ((Person) o).name) && (this.surname  == ((Person) o).surname) ? true : false;
        } else {
            throw new IllegalArgumentException("can't be equals");
        }
        // compiled code
    }

    public int hashCode() {
        return Objects.hashCode(name + surname);
    }
}
