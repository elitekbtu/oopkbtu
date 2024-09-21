package lab1.problem2;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone2 = new Phone("15", 256, 12);
        phone2.setDram(123);
        phone2.getDram();
        System.out.println(Phone.version);
        phone2.getMemory();
        phone2.getModel();
        phone2.getVersion();
    }
}
