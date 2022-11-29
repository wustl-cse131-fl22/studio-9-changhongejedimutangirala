package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// FIXME
		Map<String, Integer> nameToHeight = new HashMap<>();
		nameToHeight.put("Chloe", 167);
		nameToHeight.put("Nicole", 167);
		nameToHeight.put("Jenny", 158);
		nameToHeight.put("Aisha", 167);
		
		//one method
		
//		for(Entry<String, Integer> pbEntry : nameToHeight.entrySet()) {
//			System.out.println(pbEntry.getKey() + ": " + pbEntry.getValue());
//			if(in.next() == "quit") {
//				return;
//			}
//		}
		//second method
		System.out.println("Enter a name:");
		String name = in.next();
		for(Entry<String, Integer> pbEntry : nameToHeight.entrySet())
		{
			if(pbEntry.getKey().equals(name)) {
				System.out.println(name + ": " + pbEntry.getValue());
			}

		}}
}
