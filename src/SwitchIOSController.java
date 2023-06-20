public abstract class  SwitchIOSController {
    public String device;
    public double numberOfOS;
    public BaseSwitch baseSwitch;

    public SwitchIOSController(String _device, double _numberOfOS, BaseSwitch _baseSwitch){
        this.device = _device;
        this.numberOfOS = _numberOfOS;
        this.baseSwitch = _baseSwitch;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public void setBaseSwitch(BaseSwitch baseSwitch) {
        this.baseSwitch = baseSwitch;
    }

    public void setNumberOfOS(double numberOfOS) {
        this.numberOfOS = numberOfOS;
    }

    public String getDevice() {
        return device;
    }

    public BaseSwitch getBaseSwitch() {
        return baseSwitch;
    }

    public double getNumberOfOS() {
        return numberOfOS;
    }
}
