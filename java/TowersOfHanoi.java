import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * Towers Of Hanoi
 * 
 * The towers of hanoi are three towers that start with
 * some number of segments on the first tower 
 * from the smallest number at the top to the largest number 
 * at the bottom.  The problem you are trying to solve is to
 * move all of the numbers from one tower to another.  
 * The restrictions you must consider:
 * A) You move one number at a time
 * B) A smaller number can never be under a larger number
 * 
 * Example: 
 * 
 * [3, 2, 1]
 * []
 * []
 * 
 * [3, 2]
 * [1]
 * []
 * 
 * 
 * [3]
 * [1]
 * [2]
 * 
 * [3]
 * []
 * [2, 1]
 * 
 * []
 * [3]
 * [2, 1]
 * 
 * [1]
 * [3]
 * [2]
 * 
 * [1]
 * [3, 2]
 * []
 * 
 * []
 * [3, 2, 1]
 * []
 */
public class TowersOfHanoi {	
	List<Stack<Integer>> towers;
	
	TowersOfHanoi(int numberOfSegments) {
		this.towers = new ArrayList<Stack<Integer>>(3);
		this.towers.add(new Stack<Integer>());
		this.towers.add(new Stack<Integer>());
		this.towers.add(new Stack<Integer>());
		for(int segmentCount = numberOfSegments; segmentCount > 0; segmentCount--) {
			this.towers.get(0).push(segmentCount);
		}

	}
	
	private void printTowers() {
		for(Stack<Integer> tower : this.towers) {
			System.out.println(tower.toString());
		}
		System.out.println("\n");
	}

	// Create a method here that will solve the towers of
    // hanoi problem, recursively.
	// Begin Code Here



    // End Code Here
	
	
	public static void main(String[] args) {
		// Try running this program with tower size as 1, 2, 3, 4, and 5
        int towerSize = 1;
		TowersOfHanoi towersOfHanoi = new TowersOfHanoi(towerSize);
		towersOfHanoi.printTowers();
        // Begin Code Here
        // Replace this comment with a call to your method
        // End Code Here
	}
}
