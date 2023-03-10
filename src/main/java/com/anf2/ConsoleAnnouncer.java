package com.anf2;

/**
 * @author Stepan Anfi
 * 3/9/2023
 */

public class ConsoleAnnouncer implements Announcer {
    @InjectByType
    private Recommendator recommendator;
    @Override
    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
