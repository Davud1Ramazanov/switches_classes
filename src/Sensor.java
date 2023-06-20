public class Sensor extends BaseSwitch {
    public Sensor(boolean _lightOnOff, String _frame, String _device){
        super(_lightOnOff, _frame, _device);
    }
    public Sensor(boolean lightOnOff) {
        this(lightOnOff, "glass", "sensor switch");
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
