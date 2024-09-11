package Laptop;
import TargetObject.PowerOutlet;
public class LaptopAdapter implements PowerOutlet {

     Laptop laptop;

    public LaptopAdapter(Laptop laptop){
        this.laptop = laptop;
    }

    @Override
    public String plugIn(){
        if (powerRequirements()) {
            return  "Plug-In Type: " + laptop.getLaptopPlugType() +
                    "\nVoltage: " + laptop.getLaptopVoltage() +
                    "\nAmperage: " + laptop.getLaptopAmperage() +
                    "\nThe Laptop is " + laptop.charge();

        } else {
            return "Cannot plug in the Laptop. Incompatible power requirements.";
        }
    }

    @Override
    public boolean powerRequirements() {
        return laptop.getLaptopPlugType().equals(LaptopPlugType()) &&
                laptop.getLaptopVoltage() <= LaptopVoltage() &&
                laptop.getLaptopAmperage() <= LaptopAmperage();
    }

    public String LaptopPlugType(){
        return "D";
    }
    public int LaptopVoltage(){
        return 200;
    }
    public int LaptopAmperage(){
        return 20;
    }
}
