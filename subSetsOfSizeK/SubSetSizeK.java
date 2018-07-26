package subSetsOfSizeK;
import java.util.*;

public class SubSetSizeK {
	
	public List<List<Integer>> subsetSizeK(List<Integer> set, int k) {
		List<List<Integer>> allSubSets = new ArrayList<>();
		subsetSizeKHelper(set, allSubSets, new ArrayList<>(), k, 0);
		return allSubSets;
	}
	private void subsetSizeKHelper(List<Integer> set, List<List<Integer>> allSubSets, ArrayList<Integer> subset, int k, int index) {
		if(index >= set.size()) {
			return;
		}
		if(subset.size() == k) {
			ArrayList<Integer> temp = (ArrayList<Integer>) subset.clone();
			allSubSets.add(temp);
			return;
		}
		subsetSizeKHelper(set, allSubSets, subset, k, index+1);
		subset.add(set.get(index));
		subsetSizeKHelper(set, allSubSets, subset, k, index+1);
		subset.remove(subset.size()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubSetSizeK ab = new SubSetSizeK();
		List<Integer> set = new ArrayList<Integer>();
		//set.add(1);
		List<List<Integer>> sol = ab.subsetSizeK(set, 2);
		for(List<Integer> x: sol) {
			for(int y: x) {
				System.out.print(y + " " );
			}
			System.out.println("----");
		}
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		sol = ab.subsetSizeK(set, 2);
		for(List<Integer> x: sol) {
			for(int y: x) {
				System.out.print(y + " " );
			}
			System.out.println();
		}
	}

}
