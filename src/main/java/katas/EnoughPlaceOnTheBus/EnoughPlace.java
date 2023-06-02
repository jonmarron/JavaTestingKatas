package katas.EnoughPlaceOnTheBus;

public class EnoughPlace {
    public int enoughPlace(int capacity, int onTheBus, int waiting){
        int roomFor = capacity - onTheBus;
        if (roomFor > waiting) return 0;
        return waiting - roomFor;
    }
}
