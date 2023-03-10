package com.anf2;

import javax.annotation.PostConstruct;

/**
 * @author Stepan Anfi
 * 3/9/2023
 */
public class PolicemanImpl implements Policeman {
    @InjectByType
    private Recommendator recommendator;

    @PostConstruct
    public void init() {
        System.out.println(recommendator.getClass());
    }
    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("пиф пафб бах бах");
    }
}
