public class Run {
    public static void main(String[]args){
        Battery battery = new Battery();
        FlashLamp flashLamp = new FlashLamp();
        flashLamp.setBattery(battery);
        for (int i = 0;i<10;i++) {
            flashLamp.turnOn();
            flashLamp.turnOff();
        }
        System.out.println(flashLamp.getBatteryInfo());

    }
}
