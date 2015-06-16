/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevatorScheduling;

/**
 *
 * @author sammy
 */
public class ElevatorCarNode {
    //Private members
    private String elevatorID;    //Identification string of the elevator IE: C1
    private int carCapacity;      // Number of riders each car can hold
    private float floorsPerSecond;// Speed of the elecator in floors per second
    private float currentFloor;   // floor at current timepoint
    private int startingFloor;    // floor the elevator starts at

    //public members
    
    //helper functions
    //getters
    public String getElevatorID()
    {return elevatorID;}

    public int getCarCapacity() 
    {return carCapacity;}

    public float getFloorsPerSecond() 
    {return floorsPerSecond;}

    public float getCurrentFloor() 
    {return currentFloor;}

    public int getStartingFloor() 
    {return startingFloor;}
    
    //setters
    public void setElevatorID(String elevatorID) 
    {this.elevatorID = elevatorID;}

    public void setCarCapacity(int carCapacity) 
    {this.carCapacity = carCapacity;}

    public void setFloorsPerSecond(float floorsPerSecond) 
    {this.floorsPerSecond = floorsPerSecond;}

    public void setCurrentFloor(float currentFloor) 
    {this.currentFloor = currentFloor;}

    public void setStartingFloor(int startingFloor) 
    {this.startingFloor = startingFloor;}
    
    
}
