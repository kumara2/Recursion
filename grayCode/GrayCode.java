package grayCode;
import java.util.*;
public class GrayCode {
	public List<List<Integer>> grayCode(int n) {
		List<List<Integer>> sol = new ArrayList<>();		
		ArrayList<Integer> current = new ArrayList<Integer>();
		current.add(0);
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(0);
		grayCode(n, sol, 0, set, current);
		return sol;
	}

	private void grayCode(int n, List<List<Integer>> sol, int num, HashSet<Integer> set, ArrayList<Integer> current) {
		// TODO Auto-generated method stub
		if(set.size() == 1 << n) {
			int s = current.get(current.size() - 1);
			if((s & (s-1)) == 0) {
				ArrayList<Integer> temp = (ArrayList<Integer>) current.clone();
				sol.add(temp);
			}
			return;
		}
		for(int i = 0; i < n; i++) {
			int offset = 1 << i;
			int temp = num ^ offset;
			
			if(!set.contains(temp)) {
				set.add(temp);
				current.add(temp);
				grayCode(n, sol, temp, set, current);
				set.remove(temp);
				current.remove(current.size()-1);
			}
		}
	}
	public static void main(String[] args) {
		GrayCode gc = new GrayCode();
		List<List<Integer>> sol = gc.grayCode(3);
		for(List<Integer> abc: sol) {
			System.out.println(abc.toString());
		}
	}
}
