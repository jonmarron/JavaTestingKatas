package katas.WillYouMakeIt;

public class ZeroFuel {
    public boolean ZeroFuel(double distanceToPump, double kpl, double fuelLeft) {
        return distanceToPump <= kpl * fuelLeft;
    }
}
