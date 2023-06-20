public abstract class BaseSwitch {
    public boolean lightOnOff;
    public String frame;
    public String device;

    public BaseSwitch(boolean _lightOnOff, String _frame, String _device){
        this.lightOnOff = _lightOnOff;
        this.frame = _frame;
        this.device = _device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public void setLightOnOff(boolean lightOnOff) {
        this.lightOnOff = lightOnOff;
    }

    public String getDevice() {
        return device;
    }

    public String getFrame() {
        return frame;
    }
}