package com.anf2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Stepan Anfi
 * 3/9/2023
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = Application.run("com.anf2", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        CoronaDesinfector desinfector = context.getObject(CoronaDesinfector.class);
        desinfector.start(new Room());

    }
}
