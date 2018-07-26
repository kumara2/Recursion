package paranthesesMatch;
import java.util.*;
public class Parentheses {
	public List<String> generateParentheses(int n) {
		List<String> allComb = new ArrayList<String>();
		generateParantheses(n, n, "", allComb);
		return allComb;
	}
	private void generateParantheses(int left, int right, String curr, List<String> allComb) {
		// TODO Auto-generated method stub
		if(left < 0 || right < 0 || left > right) {
			return;
		}
		if(left == 0 && right == 0) {
			allComb.add(curr);
		}
		generateParantheses(left-1, right, curr+"(" , allComb);
		generateParantheses(left, right-1, curr+")" , allComb);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sol = new Parentheses().generateParentheses(3);
		for(String x: sol) {
			System.out.println(x);
		}
	}

}
