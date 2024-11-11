package practice6.classes;

import practice6.interfaces.Plugginable;

public class PowerSocket {
    public boolean charge(Plugginable p){
        p.plugIn();
        System.out.println("The phone is charging");
        return true;

    }
}
