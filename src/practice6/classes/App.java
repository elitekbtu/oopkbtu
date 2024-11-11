package practice6.classes;
import practice6.interfaces.Game;
import practice6.interfaces.IGame;

public class App{
    public void getStatistics(Game g) {
        g.a();
        g.b();
        g.c();
        if (g instanceof IGame) {
            ((IGame)g).d();
        }

    }


}
