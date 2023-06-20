public class Default extends BaseSwitch{
    public Default(boolean _lightOnOff, String _frame, String _device) {
        super(_lightOnOff, _frame, _device);
    }
    public Default(boolean lightOnOff) {
        this(lightOnOff, "metalic", "default switch");
    }
    public void LightOn(){
        System.out.println(getDevice() + " is turned!");
        setLightOnOff(true);
    }
    public void LightOf(){
        System.out.println(getDevice() + " is off!");
        setLightOnOff(false);
    }
}
