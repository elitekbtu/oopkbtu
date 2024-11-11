package practice6.classes;

import practice6.interfaces.SellableAndPluggable;

public class Samsung extends Device implements SellableAndPluggable {
    double price;
    public Samsung(String devicename,double price){
        super(devicename);
        this.price=price;
    }

    @Override
    public void plugIn() {
        System.out.println(getDeviceName()+"is plug in");
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }

}
