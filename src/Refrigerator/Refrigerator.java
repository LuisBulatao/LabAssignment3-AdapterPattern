package Refrigerator;

public class Refrigerator {
    private String refPlugtType;
    private Integer refVoltage;
    private  Integer refAmperage;

    public Refrigerator(String refPlugtType, Integer refVoltage, Integer refAmperage) {
        this.refPlugtType = refPlugtType;
        this.refVoltage = refVoltage;
        this.refAmperage = refAmperage;
    }

    public String startCooling(){
        return "Cooling";
    }

    public String getRefPlugType() {
        return refPlugtType;
    }

    public Integer getRefVoltage() {
        return refVoltage;
    }

    public Integer getRefAmperage() {
        return refAmperage;
    }
}
