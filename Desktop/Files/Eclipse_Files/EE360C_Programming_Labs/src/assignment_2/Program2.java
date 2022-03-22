package assignment_2;

/*
 * Name: Jan C. Rubio
 * EID: jcr4698
 */

// Implement your algorithms here
// Methods may be added to this file, but don't remove anything
// Include this file in your final submission

import java.util.ArrayList;

public class Program2 {
    private ArrayList<GasStation> stations;  // this is a list of all Cities, populated by Driver class
    private Heap minHeap;

    // additional constructor fields may be added, but don't delete or modify anything already here
    public Program2() {
        minHeap = new Heap();
        stations = new ArrayList<GasStation>();
    }

    /**
     * findAllReachableStations(GasStation start, int init_size)
     *
     * @param start     - the starting GasStation.
     * @param init_size - the initial tank size obtained
     * @return the list of all gas stations we can reach from start
     */
    public ArrayList<GasStation> findAllReachableStations(GasStation start,int init_size) {
        // TODO: implement this method
        return null;
    }

    /**
     * findMinimumTankSize()
     * @param start  - the starting GasStation
     * @param dest   - the destination Gas Station
     * @return The minimum gas tank size needed at the beginning of the trip
     */
    public int findMinimumTankSize(GasStation start, GasStation dest) {
        // TODO: implement this method
        return 0;
    }

    //return the gas station id and its upgrade value
    //this function can be altered for your debugging purpose
    public String toString() {
        String o = "";
        for (GasStation v : stations) {
            boolean first = true;
            o += "Gas Station ";
            o += v.getID();
            o += " has upgrade value ";
            o += v.getUpgradeValue();
            o += System.getProperty("line.separator");

        }

        return o;
    }

///////////////////////////////////////////////////////////////////////////////
//                           DANGER ZONE                                     //
//                everything below is used for grading                       //
//                      please do not change :)                              //
///////////////////////////////////////////////////////////////////////////////

    public Heap getHeap() {
        return minHeap;
    }

    public ArrayList<GasStation> getAllStations() {
        return stations;
    }


    // used by Driver.java and sets cities to reference an ArrayList of all RestStops
    public void setAllNodesArray(ArrayList<GasStation> x) {
        stations = x;
    }
}
