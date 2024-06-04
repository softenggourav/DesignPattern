package com.design.pattern.creationPattern.singletonDesignPattern;

public class DemoSingletonPattern {
    public static void main(String[] args) {
        demoSingletonPattern();
        demoThreadSafeSingletonPattern();
    }

    private static void demoThreadSafeSingletonPattern() {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    private static void demoSingletonPattern() {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton1 = Singleton.getInstance("Gourav");
        Singleton singleton2 = Singleton.getInstance("Sourav");

        System.out.println(singleton1.value);
        System.out.println(singleton2.value);
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
