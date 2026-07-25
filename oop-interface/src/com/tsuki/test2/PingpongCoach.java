package com.tsuki.test2;

public class PingpongCoach extends Coach implements English {
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练会教乒乓球");

    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练会说英语");

    }
}
