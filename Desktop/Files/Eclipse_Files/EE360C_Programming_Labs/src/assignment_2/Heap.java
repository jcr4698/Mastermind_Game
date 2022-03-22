package assignment_2;

/*
 * Name: Jan C. Rubio
 * EID: jcr4698
 */

// Implement your heap here
// Methods may be added to this file, but don't remove anything
// Include this file in your final submission

import java.util.ArrayList;

public class Heap {
    private ArrayList<GasStation> minHeap;
    int MinDist;

    public Heap() {
        minHeap = new ArrayList<GasStation>();
    }

    /**
     * buildHeap(ArrayList<GasStation> stations)
     * Given an ArrayList of GasStation, build a min-heap keyed on each GasStation's minDist
     * Time Complexity - O(nlog(n)) or O(n)
     *
     * @param stations
     */
    public void buildHeap(ArrayList<GasStation> stations) {
        // TODO: implement this method
    	for(GasStation gs : stations)
    		insertNode(gs);
    }

    /**
     * insertNode(GasStation in)
     * Insert a GasStation into the heap.
     * Time Complexity - O(log(n))
     *
     * @param in - the GasStation to insert.
     */
    public void insertNode(GasStation in) {
        // TODO: implement this method
    	int index = minHeap.size();
    	minHeap.add(index, in);
    	if(index > 0)
    		heapifyUp(index, in); // DEBUG
    }

    /**
     * findMin()
     * Time Complexity - O(1)
     *
     * @return the minimum element of the heap.
     */
    public GasStation findMin() {
        // TODO: implement this method
        return minHeap.get(0);
    }

    /**
     * extractMin()
     * Time Complexity - O(log(n))
     *
     * @return the minimum element of the heap, AND removes the element from said heap.
     */
    public GasStation extractMin() {
        // TODO: implement this method
        return null;
    }

    /**
     * delete(int index)
     * Deletes an element in the min-heap given an index to delete at.
     * Time Complexity - O(log(n))
     *
     * @param index - the index of the item to be deleted in the min-heap.
     */
    public void delete(int index) {
        // TODO: implement this method
    }

    /**
     * changeKey(GasStation r, int newDist)
     * Changes minDist of GasStation s to newDist and updates the heap.
     * Time Complexity - O(log(n))
     *
     * @param r       - the City in the heap that needs to be updated.
     * @param newDist - the new cost of City r in the heap (note that the heap is keyed on the values of minDist)
     */
    public void changeKey(GasStation r, int newDist) {
    	// TODO: implement this method
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < minHeap.size(); i++) {
            output += minHeap.get(i).getID() + " ";
        }
        return output;
    }

    /** Heapify up(index, GasStation in)
     * given the index of the GasStation and heapify it up
     * O(log(n))
     * **/
    public void heapifyUp(int index, GasStation in) {
        // TODO: implement this method
    	if(index > 0) {
    		int j = index/2;
    		if(in.distance < minHeap.get(j).distance) { // make sure you are doing right heap (min)
    			GasStation gs = minHeap.remove(j); // replace this correctly
    			minHeap.set(j, in);
    			minHeap.set(index, gs);
    			heapifyUp(j, in);
    		}
    		System.out.println();
    	}
    }

    /** Heapify down(index)
     * given the index of the GasStation and heapify it down
     * O(log(n))
     * **/
    public void heapifyDown(int index){
        // TODO: implement this method
    }

///////////////////////////////////////////////////////////////////////////////
//                           DANGER ZONE                                     //
//                everything below is used for grading                       //
//                      please do not change :)                              //
///////////////////////////////////////////////////////////////////////////////

    public ArrayList<GasStation> toArrayList() {
        return minHeap;
    }
}
