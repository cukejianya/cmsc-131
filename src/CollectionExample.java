import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionExample {

	public static Collection<Integer> defineElements(boolean arrayFlag, 
			int numValues, int maxValue) {
		Collection<Integer> elements;
		
		if (arrayFlag) {
			elements = new ArrayList<Integer>();
		} else {
			elements = new LinkedList<Integer>();
		}
		
		for (int j = 0; j < numValues; j++) {
			elements.add((int) (Math.random() * maxValue +1));
		}
		
		return elements;
	} //This method creates an arraylist or linkedlist full of random numbers 
	
	public static void displayValues (Collection<Integer> data) {
		if (data.isEmpty()) {
			System.out.println("Empty collection");
		} else {
			for (Integer value : data) //!!!!ASK ABOUT THIS!!!!!
				System.out.print(value + " ");
		}
	} // This method prints out the collection that you created before
	
	public static void main(String[] args) {
		Collection<Integer> firstCollection = defineElements(true, 5, 10);
		System.out.println("First Collection:");
		displayValues(firstCollection);
		
		System.out.println("\nScond Collection:");
		Collection<Integer> secondCollection = defineElements(false, 5, 10);
		displayValues(secondCollection);
		
		Collection<Integer> union = new ArrayList<Integer>();
		// Made a new Arraylist called union which is a Collection<Integer> type
		
		union.addAll(firstCollection);
		union.addAll(secondCollection);
		System.out.println("\nUnion");
		displayValues(union);
		// We combine both collections into one called union
		
		if (union.containsAll(firstCollection))
			System.out.println("\nIncludes all elements of first collection");
		
		union.removeAll(secondCollection);
		System.out.println("After removing");
		displayValues(union);
		
		union.clear();
		System.out.println();
		displayValues(union);
	}
}