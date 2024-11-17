package lab3.problem1;
public abstract class BankSystem implements CanExtractBalance{
    private int balance;
    BankSystem(int balance){
        this.balance = balance;
    } 
    @Override
    public boolean extractBalance(int value) {
        if (value <= balance){
            return true;
        }
        return false;
    }
}