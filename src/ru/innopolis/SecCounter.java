package ru.innopolis;

/**
 *класс счетчик секунд
 */

class SecCounter implements Runnable {
    Seconds seconds;
    private int SystemWorkTime;

    SecCounter(Seconds seconds, int SystemWorkTime) {
        this.seconds = seconds;
        this.SystemWorkTime = SystemWorkTime;
    }

    public void run() {
        for (int i = 1; i <= SystemWorkTime; i++) {
            seconds.put();
        }
    }
}
