import java.util.Scanner;

public class BlockPhone extends SwitchIOSController {
    public BlockPhone(String _device, double _numberOfOS, BaseSwitch _baseSwitch) {
        super(_device, _numberOfOS, _baseSwitch);
    }
    public void LampOn(){
        System.out.println(this.baseSwitch.getDevice() + " is turned");
        this.baseSwitch.setLightOnOff(true);
    }

    public void LampOff(){
        System.out.println(this.baseSwitch.getDevice() + " is off");
        this.baseSwitch.setLightOnOff(false);
    }
}
