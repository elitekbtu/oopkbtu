package practice6.classes;

import practice6.interfaces.IGame;

public class MemoryGame implements IGame {
    @Override
    public void a() {
        System.out.println("Game is started\n you choose method a");
    }

    @Override
    public void b() {
        System.out.println("Game is started\n you choose method b");

    }

    @Override
    public void c() {
        System.out.println("Game is started\n you choose method c");
    }
    public void d() {
        System.out.println("Game is started\n you choose method d");
    }
}
