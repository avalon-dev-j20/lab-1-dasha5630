package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.util.Iterator;
import ru.avalon.java.j20.labs.models.Fibonacci;

/**
 * Задание №3
 *
 * <p>
 * Тема: "Изучение интерфейсов {@link Iterable} и {@link Iterator}".
 */
public class Task3 implements Task {

    public static double sum;

    @Override
    public void run() {

        Iterable<Integer> fib = new Fibonacci(20);
        double f = sum(fib);
    }

    static double sum(Iterable<? extends Number> numbers) {
        for (Number x : numbers) {
            sum += x.doubleValue();
        }
        return sum;
    }

}
