public class BlockPhonesWireWithController extends BlockPhonesWire{
    private SwitchIOSController switchIOSController;
    public BlockPhonesWireWithController(double _amperage, BaseSwitch _baseSwitch, String _marking, SwitchIOSController _switchIOSController) {
        super(_amperage, _baseSwitch, _marking);
        this.switchIOSController = _switchIOSController;
    }

    public void LampOn(){
        if(this.amperage <= 60 && this.marking == "M-15") {
            System.out.println(this.baseSwitch.getDevice() + " is turned");
            this.baseSwitch.setLightOnOff(true);
        }
        else {
            System.out.println("Error!");
        }
    }

    public void LampOff(){
        if(this.amperage <= 60 && this.marking == "M-15") {
            System.out.println(this.baseSwitch.getDevice() + " is off");
            this.baseSwitch.setLightOnOff(false);
        }
        else {
            System.out.println("Error!");
        }
    }
}
