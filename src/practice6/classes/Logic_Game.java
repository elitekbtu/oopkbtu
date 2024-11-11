package practice6.classes;

import practice6.interfaces.Game;

public class Logic_Game implements Game {
    @Override
    public void a() {
        System.out.println("Game is started\n you choose method a, good luck!");
    }
    public void b() {
        System.out.println("Game is started\n you choose method b, good luck!");
    }
    public void c() {
        System.out.println("Game is started\n you choose method c, good luck!");
    }
}

