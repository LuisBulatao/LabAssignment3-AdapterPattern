package Laptop;
import TargetObject.PowerOutlet;
public class Laptop {

    private String laptopPlugType;
    private Integer laptopVoltage;
    private  Integer laptopAmperage;

    public Laptop(String laptopPlugType, Integer laptopVoltage, Integer laptopAmperage){
        this.laptopPlugType = laptopPlugType;
        this.laptopVoltage = laptopVoltage;
        this.laptopAmperage = laptopAmperage;
    }
    public String charge(){
        return "Charging";
    }

    public String getLaptopPlugType() {
        return laptopPlugType;
    }

    public Integer getLaptopVoltage() {
        return laptopVoltage;
    }

    public Integer getLaptopAmperage() {
        return laptopAmperage;
    }
}
