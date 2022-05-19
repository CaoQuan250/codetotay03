public class Run {
    public static void main(String[]args){
            SwitchButton switchButton = new SwitchButton();
            ElectricLamp electricLamp = new ElectricLamp();

            switchButton.connectToLamp(electricLamp);

            for (int i=1; i<11 ; i++){
                switchButton.switchOff();
                System.out.println(switchButton.getSwitchStatus());
            }

    }
}
