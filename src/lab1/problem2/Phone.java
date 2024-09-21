package lab1.problem2;

public class Phone {
    private final String model = "Iphone";
    public static String version;
    private int memory;
    private int dram;

    Phone(){

    }
    Phone(String version, int memory, int DRAM){
        this.version = version;
        this.memory = memory;
        dram = DRAM;
    }
    public void getModel(){
        System.out.println(model);
    }

    public static void getVersion(){
        System.out.println(version);
    }

    public void getMemory(){
        System.out.println(memory);
    }

    public void getDram(){
        System.out.println(dram);
    }


    public void setVersion(String version){
        this.version = version;
    }

    public void setMemory(int memory){
        this.memory = memory;
    }

    public void setMemory(double memory){
        this.memory = (int) memory;
    }

    public void setDram(int dram){
        this.dram = dram;
    }

    public void setDram(double dram){
        this.memory = (int) dram;
    }
}
