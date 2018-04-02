package ru.innopolis;

public class Main {
    public static void main(String[] args) {
        //время жизни приложения в сек
        int SystemWorkTime = 15;

        //запуск с интервалом в секунду
        Seconds secOne = new Seconds(1);
        SecCounter sc = new SecCounter(secOne, SystemWorkTime);
        SecNotice sn = new SecNotice(secOne, SystemWorkTime);
        new Thread(sc).start();
        new Thread(sn).start();

        //запуск с интервалом в 5 секунд
        Seconds secFive = new Seconds(5);
        SecCounter scFive = new SecCounter(secFive, SystemWorkTime);
        SecNotice snFive = new SecNotice(secFive, SystemWorkTime);
        new Thread(scFive).start();
        new Thread(snFive).start();

    }
}
