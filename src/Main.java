import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseSwitch[] baseSwitch = new BaseSwitch[]{new Sensor(true), new Circular(false), new Default(false)};
        BaseSwitch switchNum = null;
        System.out.println("Select 3 switches:\n1 - Sensor Switch\n2 - Circular Switch\n3 - Default Switch");
        int switches_select = scanner.nextInt();
        if (switches_select == 1) {
            switchNum = baseSwitch[0];
        } else if (switches_select == 2) {
            switchNum = baseSwitch[1];
        } else if (switches_select == 3) {
            switchNum = baseSwitch[2];
        }
        BlockPhone blockPhone = new BlockPhone("Iphone 12 Pro max", 12.05, switchNum);
        System.out.println("Hello (" + blockPhone.getDevice() + ") select in this menu what do you want to do (" + switchNum.getDevice() + "):\n 1 - Turn switch\n 2 - Off switch\nYOUR IOS VERSION IS: " + blockPhone.numberOfOS);
        int select = scanner.nextInt();
        if(select == 1){
            blockPhone.LampOn();
        } else if (select == 2) {
            blockPhone.LampOff();
        }
        else {
            System.out.println("Input correct data.");
        }

    }
}