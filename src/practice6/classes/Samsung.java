package practice6.classes;

import practice6.interfaces.SellableAndPluggable;

public class Samsung extends Device implements SellableAndPluggable {
    double price;
    public Samsung(String devicename,double price){
        super(devicename);
        this.price=price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    @Override
    public void plugging() {
        System.out.println(getDeviceName()+" is plug incto charging");
    }

    @Override
    public String getDeviceName() {
        return super.getDeviceName();
    }

    @Override
    public void setDeviceName(String deviceName) {
        super.setDeviceName(deviceName);
    }

}
