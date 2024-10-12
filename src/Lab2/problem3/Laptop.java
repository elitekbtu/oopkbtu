package Lab2.problem3;

import java.util.Objects;

public class Laptop extends Device {
    private String operationSystem;

    Laptop(int memory, int dram, int releaseYear, String model, String operationSystem) {
        super(memory, dram, model, releaseYear);
        this.operationSystem = operationSystem;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        return super.toString() + ", Operation System: " + operationSystem;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Laptop)) return false;
        Laptop laptop = (Laptop) obj;
        return super.equals(laptop) && this.operationSystem == laptop.operationSystem;
    }

    public int hashCodeCustom() {
        String hashSystem = super.hashCodeCustom() + this.operationSystem;
        char[] hashArray = hashSystem.toCharArray();

        for (int i = 0; i < getDram() && i < hashArray.length / 2; i++) {
            char temp = hashArray[i];
            hashArray[i] = hashArray[hashArray.length - i - 1];
            hashArray[hashArray.length - i - 1] = temp;
        }
        int sum = 0;
        for (char c : hashArray) {
            sum += c;
        }

        return sum;
    }

}