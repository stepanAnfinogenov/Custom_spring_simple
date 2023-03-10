package com.anf2;

/**
 * @author Stepan Anfi
 * 3/9/2023
 */
@Deprecated
public class CoronaDesinfector {
    @InjectByType
    Announcer announce;
    @InjectByType
    Policeman policeman;
    public void start(Room room) {
        announce.announce("Начинаем дезинфекцию");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announce.announce("Рискните зайти обратно");
    }

    private void desinfect(Room room) {
        System.out.println("зачитывается молитва: корона изыди ");
    }
}
