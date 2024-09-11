package SmartphoneCharger;
import TargetObject.*;
public class SmartphoneChargerAdapter implements PowerOutlet{

    private SmartphoneCharger smartphoneCharge;

    public SmartphoneChargerAdapter(SmartphoneCharger smartphoneCharge){
        this.smartphoneCharge = smartphoneCharge;
    }

    @Override
    public String plugIn() {
        if (powerRequirements()) {
            return  "Plug-In: " + smartphoneCharge.getSmartphonePlugType() +
                    "Voltage: " + smartphoneCharge.getSmartphoneVoltage() +
                    "Amperage: " + smartphoneCharge.getSmartphoneAmperage() +
                    "The Smartphone is " + smartphoneCharge.chargePhone();


        } else {
            return "Cannot plug in the Smartphone Charger. Incompatible power requirements.";
        }
    }

    @Override
    public boolean powerRequirements(){
        return smartphoneCharge.getSmartphonePlugType().equals(SmartphonePlugType()) &&
                smartphoneCharge.getSmartphoneVoltage() <= SmartphoneVoltage() &&
                smartphoneCharge.getSmartphoneAmperage() <= SmartphoneAmperage();
    }


    public String SmartphonePlugType(){
        return "C";
    }
    public Integer SmartphoneVoltage(){
        return 200;
    }

    public  Integer SmartphoneAmperage(){
        return 20;
    }


}
