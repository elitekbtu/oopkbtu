package practice6.classes;

import practice6.interfaces.Game;

public class Logic_Game implements Game {
    @Override
    public void a() {
        System.out.println("Game is started\n you choose method a");
    }
    public void b() {
        System.out.println("Game is started\n you choose method b");
    }
    public void c() {
        System.out.println("Game is started\n you choose method c");
    }
}

