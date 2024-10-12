package Lab2.problem_c;

public class DeviceTester {
    public static void main(String[] args) {
        Device device = new Device(256, 8, "DeviceModel1", 2020);

        device.setMemory(512);
        device.setDram(16);
        System.out.println(device);

        Laptop laptop = new Laptop(1024, 16, 2021, "LaptopModelX", "Windows 11");
        System.out.println(laptop.hashCodeCustom());
        laptop.setMemory(2048);
        laptop.setOperationSystem("Linux");
        System.out.println(laptop);

        Device anotherDevice = new Device(512, 16, "DeviceModel1", 2020);
        System.out.println("equal: " + device.equals(anotherDevice));

        Laptop anotherLaptop = new Laptop(2048, 16, 2023, "LaptopModelX", "Linux");
        System.out.println("equal: " + laptop.equals(anotherLaptop));
    }
}