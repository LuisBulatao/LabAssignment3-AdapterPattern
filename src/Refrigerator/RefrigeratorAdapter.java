package Refrigerator;
import Laptop.Laptop;
import TargetObject.*;

public class RefrigeratorAdapter implements PowerOutlet {
    private Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator){
        this.refrigerator = refrigerator;
    }

    @Override
    public String plugIn(){
        if (powerRequirements()) {
            return  "Plug-In Type: " + refrigerator.getRefPlugType() +
                    "\nVoltage: " + refrigerator.getRefVoltage() +
                    "\nAmperage: " + refrigerator.getRefAmperage() +
                    "\nThe Refrigerator is starting to " + refrigerator.startCooling();

        } else {
            return "Cannot plug in the Refrigerator. Incompatible power requirements.";
        }
    }


    @Override
    public boolean powerRequirements() {
        return refrigerator.getRefPlugType().equals(RefPlugtType()) &&
                refrigerator.getRefVoltage() <= RefVoltage() &&
                refrigerator.getRefAmperage() <= RefAmperage();
    }


    public String RefPlugtType(){
        return "A";
    }

    public Integer RefVoltage(){
        return 200;
    }
    public Integer RefAmperage(){
        return 20;
    }
}
