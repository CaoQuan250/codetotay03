public class Battery
{

    private int energy;

    public Battery()
    {
        // To do:
        energy=100;
    }

    public void setEnergy(int value) {
        energy=value;
    }
    public int getEnergy() {
        return energy;
    }
    public void decreaseEnergy() {
        energy--;
    }
}