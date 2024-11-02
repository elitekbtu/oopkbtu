package Lab2.problem_c;

public class Device {
    private int memory;
    private int dram;
    private String model;
    private int releaseYear;

    Device(int memory, int dram, String model, int releaseYear) {
        this.memory = memory;
        this.dram = dram;
        this.model = model;
        this.releaseYear = releaseYear;
    }

    public int getDram() {
        return dram;
    }

    public int getMemory() {
        return memory;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getModel() {
        return model;
    }

    public void setDram(int dram) {
        this.dram = dram;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Device{" +
                "memory=" + memory +
                ", dram=" + dram +
                ", model='" + model + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }


//    public boolean equals(Object obj) {
//        // if(!this==obj) return false;
//        // else{
////        if(obj instanceof Device){
////        Dedive d = (Device) obj;
////        this.memory == d.memory && this.dram == d.dram && this.mode == d.model
////        }
////        else{
////            return false;
////        }
////    }
////    }

    public int hashCodeCustom() {
        String hashSystem = this.model + this.dram + this.memory + this.releaseYear;
        char[] hashArray = hashSystem.toCharArray();
        for (int i = 0; i < this.dram && i < hashArray.length / 2; i++) {
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