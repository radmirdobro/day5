package ru.innopolis;

public class Seconds {
    private int sessionStart = 0;
    private int seconds = 0;
    private int interval = 1;

    public Seconds(int interval){
        this.interval = interval;
    }

    /**
     * кладем секунды в хранилище
     */
    public synchronized void put() {
        while (seconds > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        seconds++;
        sessionStart += seconds;
        notify();
    }

    /**
     * получаем секунды из  хранилища и выводим сообщение через нужный инетрвал времени
     */

    public synchronized void get() {
        while (seconds < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        seconds--;
        if(sessionStart%interval == 0) {
            System.out.print("Прошло сек: " + interval);
        }
        System.out.println(" Время работы приложения: "+  sessionStart);
        notify();
    }


}

