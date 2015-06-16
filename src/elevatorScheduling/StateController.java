/* CLASS DESCRIPTION
 * This class controls the state of the program, including time, 
 * elevator locations, and the current request
 */
package elevatorScheduling;

import java.util.ArrayList;

public class StateController {
    
    private int currentTimePoint = 0;
    private ArrayList<ElevatorCarNode> elevators = new ArrayList();
    
    public void incrementState()
    {
        currentTimePoint++;
        for(int lcv = 0; lcv < elevators.size(); lcv++)
        {
            //Set temp floor to current floor
            float tempFloor = elevators.get(lcv).getCurrentFloor();
            //increase temp floor by floors per second
            tempFloor = tempFloor + elevators.get(lcv).getFloorsPerSecond();
            //set temporary floor to the current floor
            elevators.get(lcv).setCurrentFloor(tempFloor);
        }
    }
    //Helper Functions
    //getters
    public int getCurrentTimePoint() 
    {return currentTimePoint;}
    //setters
    public void setElevators(ArrayList<ElevatorCarNode> elevators) 
    {this.elevators = elevators;}
    
    
}
