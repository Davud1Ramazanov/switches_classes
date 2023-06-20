public abstract class Wire {
    public double amperage;
    public BaseSwitch baseSwitch;
    public String marking;

    public Wire(double _amperage, BaseSwitch _baseSwitch, String _marking){
        this.amperage = _amperage;
        this.baseSwitch = _baseSwitch;
        this.marking = _marking;
    }

    public void setBaseSwitch(BaseSwitch baseSwitch) {
        this.baseSwitch = baseSwitch;
    }

    public void setAmperage(double amperage) {
        this.amperage = amperage;
    }

    public void setMarking(String marking) {
        this.marking = marking;
    }

    public BaseSwitch getBaseSwitch() {
        return baseSwitch;
    }

    public double getAmperage() {
        return amperage;
    }

    public String getMarking() {
        return marking;
    }
}
