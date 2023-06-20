public class Circular extends BaseSwitch{
    public Circular(boolean _lightOnOff, String _frame, String _device) {
        super(_lightOnOff, _frame, _device);
    }
    public Circular(boolean lightOnOff) {
        this(lightOnOff, "plastic", "circular switch");
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
