package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Point;

/**
 * Задание №2.
 *
 * <p>Тема: "Создание обобщённых классов".
 */
public class Task2 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        
        
        Point pointFloat = new Point(3.093f, 4.277f);
        Point pointInt = new Point(3, 4);
        double distance = pointFloat.distanceTo(pointInt);

    }
}
