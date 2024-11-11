package practice6.classes;

import practice6.interfaces.Pluggable;

public class PowerSocket {
    public boolean charge(Pluggable p){
        p.plugging();
        System.out.println("The phone is charging");
        return true;
    }
}
