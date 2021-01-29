package com.company;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class Main {
    private static void workingClock(ClockDisplay clockDisplay)
    {
        Calendar curr = Calendar.getInstance();
        int hour = curr.get(Calendar.HOUR);
        int min = curr.get(Calendar.MINUTE);
        int sec = curr.get(Calendar.SECOND);
        clockDisplay.setTime(hour , min , sec);
        clockDisplay.getTime();
        while (true)
        {
            waitSecond();
            clockDisplay.timeTick();
            clearScreen();
            clockDisplay.getTime();
        }
    }

    private static void waitSecond()
    {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * clear the screen in cmd
     * java intellij console is not a real cmd so this function wont work here.
     */
    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        ClockDisplay clockDisplay = new ClockDisplay();
        workingClock(clockDisplay);
    }
}
