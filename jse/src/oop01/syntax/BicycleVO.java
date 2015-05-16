package oop01.syntax;


public class BicycleVO {
    
    private int cadence;
    private int gear;
    private int speed;
    private int id;
    private static int numberOfBicycles = 0;
        
    public BicycleVO(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
        
     // increment number of Bicycles
        // and assign ID number
        id = ++numberOfBicycles;
        
    }
 // new method to return the ID instance variable
    public int getID() {
        return id;
    }   
    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }
    public int getCadence() {
        return cadence;
    }
        
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public int getGear() {
        return gear;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public int getSpeed() {
        return speed;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
}