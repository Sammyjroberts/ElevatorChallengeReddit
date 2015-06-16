/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevatorScheduling;

import java.util.Comparator;

/**
 *
 * @author sammy
 */
public class LiftRequestNode implements Comparator<Integer>{
    //Private members
    private String riderID;       // Rider's identification, IE: R1
    private int timeOfRequest;    // time point of the request
    private int currentFloor;     // starting floor at time of request
    private int destinationFloor; // destination floor
    private Integer requestPriority;  // priorty of the request
    
    //Public members
    //Constructors
    public LiftRequestNode(String riderID, int timeOfRequest, int currentFloor,
                           int destinationFloor, int requestPriority)
    {
        this.riderID = riderID;
        this.timeOfRequest = timeOfRequest;
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
        this.requestPriority = requestPriority;
    }
    public LiftRequestNode(){}; //Default
    //Helper functions
    //Getters
    public String getRiderID()
    {return riderID;}
    
    public int getTimeOfRequest() 
    {return timeOfRequest;}
    
    public int getCurrentFloor() 
    {return currentFloor;}
    
    public int getDestinationFloor() 
    {return destinationFloor;}
    
    public int getRequestPriority() 
    {return requestPriority;}
    
    //Setters
    public void setRiderID(String riderID) 
    {this.riderID = riderID;}

    public void setTimeOfRequest(int timeOfRequest) 
    {this.timeOfRequest = timeOfRequest;}
    
    public void setCurrentFloor(int currentFloor)
    {this.currentFloor = currentFloor;}
    
    public void setDestinationFloor(int destinationFloor) 
    {this.destinationFloor = destinationFloor;}
    
    public void setRequestPriority(int requestPriority) 
    {this.requestPriority = requestPriority;}
    
    
    //Comparator override to sort by Priorty
    @Override
    public int compare(Integer priority1, Integer priority2) {
        return priority1.compareTo(priority2);
    }
    
}


