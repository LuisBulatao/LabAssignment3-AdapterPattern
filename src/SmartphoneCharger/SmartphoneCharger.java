package SmartphoneCharger;

import TargetObject.PowerOutlet;

public class SmartphoneCharger {
    public  String SmartphonePlugType;

    private Integer SmartphoneVoltage;
    private  Integer SmartphoneAmperage;

    public SmartphoneCharger(String SmartphonePlugType ,Integer SmartphoneVoltage, Integer SmartphoneAmperage) {
        this.SmartphonePlugType = SmartphonePlugType;
        this.SmartphoneVoltage = SmartphoneVoltage;
        this.SmartphoneAmperage = SmartphoneAmperage;
    }


    public String chargePhone(){
        return "Charging";
    }

    public String getSmartphonePlugType() {
        return SmartphonePlugType;
    }

    public Integer getSmartphoneVoltage() {
        return SmartphoneVoltage;
    }

    public Integer getSmartphoneAmperage() {
        return SmartphoneAmperage;
    }
}
