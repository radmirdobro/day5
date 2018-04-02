package ru.innopolis;

/**
 *класс генератор сообщений
 */

public class SecNotice implements Runnable {
    private int SystemWorkTime;
    Seconds seconds;

    SecNotice(Seconds seconds, int SystemWorkTime) {
        this.seconds = seconds;
        this.SystemWorkTime = SystemWorkTime;
    }

    public void run() {
        for (int i = 1; i <= SystemWorkTime; i++) {
            seconds.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
