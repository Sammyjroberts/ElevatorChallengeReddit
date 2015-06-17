/* CHALLENGE DESCRIPTION
 * Most of us have seen and ridden elevators - you crazy folks in the UK and 
 * commonwealth countries often call them "lifts" - but I'm sure I'm not the 
 * only one who has puzzled about the scheduling algorithms. Which riders do you 
 * pick up and when? Do you service requests in the order of arrival or do you work 
 * on maximal overlap? For this challenge, you'll have to anwer those questions. 
 * You're designing an elevator scheduling algorithm for a building and you have 
 * plenty of riders to keep happy. You can have any algorithm you want as long 
 * as you stick to the constraints - the cars have a fixed capacity and speed.
 * Make sure you see the bonus questions after the challenge input.
 *
 * Author: Sammy Roberts | Github: https://github.com/kekeoki 
 * Email: sammy.roberts@outlook.com
 */
package elevatorScheduling;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author sammy
 */
public class Challenge218HardElevatorScheduling  {

    public static void main(String[] args) {
        //variables
        int numElevatorCars;
        int numRequests;
        StateController stateControl = new StateController();
        //Array list is for faster random access
        ArrayList<ElevatorCarNode> elevators = new ArrayList();
        //Linked list is for faster deletion holds request not given to the program
        LinkedList<LiftRequestNode> liftRequests = new LinkedList();      
        //Requests given to the program
        LinkedList<LiftRequestNode> queuedRequests = new LinkedList();
        File data = new File("C:\\Users\\sammy\\Documents\\NetBeansProjects\\[2015-06-12] Challenge #218 [Hard] Elevator Scheduling\\src\\elevatorScheduling\\data.txt");
       
        //grab input from datafile - INPUT
        try{
            Scanner sc = new Scanner(data);
            //First input is number of elevator cars
            numElevatorCars = sc.nextInt();
            System.out.println(numElevatorCars);
            
            //loop to populate all elevators into list
            for(int lcv = 0; lcv < numElevatorCars; lcv++)
            {
                //Create temporary elevator to add to list
                ElevatorCarNode temp = new ElevatorCarNode();
                
                //get data from file and insert into temp elevator
                temp.setElevatorID(sc.next());              
                temp.setCarCapacity(sc.nextInt());
                temp.setFloorsPerSecond(sc.nextFloat());
                temp.setStartingFloor(sc.nextInt());
                
                //add to the list, then loop to create all elevators
                elevators.add(temp);
            }
            //loop to get rider data prepared
            //First input is number of requests
            numRequests = sc.nextInt();
            
            //loop to populate request list
            for(int lcv = 0; lcv < numRequests; lcv++)
            {
                //create temp request to add to list
                LiftRequestNode temp = new LiftRequestNode();
                
                //get data from file and put into temp
                temp.setRiderID(sc.next());
                temp.setTimeOfRequest(sc.nextInt());
                temp.setCurrentFloor(sc.nextInt());
                temp.setDestinationFloor(sc.nextInt());
                
                //add to list
                liftRequests.add(temp);
            }
        }
        catch(IOException e){}
        
        
        // Main Program Loop - PROCESSING
        //initilize state controller
        stateControl.setElevators(elevators);
        while(!liftRequests.isEmpty())
        {
            
            
            
            
            stateControl.incrementState();
        }
        
        
        //Time output - OUTPUT
    }
    
}
