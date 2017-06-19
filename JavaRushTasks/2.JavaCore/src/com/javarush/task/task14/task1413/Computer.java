package com.javarush.task.task14.task1413;

/**
 * Created by max on 19.06.17.
 */
public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
    public Mouse getMouse() {
        return mouse;
    }
    public Monitor getMonitor() {
        return monitor;
    }


}
