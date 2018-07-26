package chess;
import java.util.*;
public class NQueen {
	public List<List<Integer>> nQueenSolution(int n) {
		List<List<Integer>> queenCols = new ArrayList<List<Integer>>();
		nQueenHelper(n , queenCols, new ArrayList<Integer>());
		return queenCols;
	}

	private void nQueenHelper(int n, List<List<Integer>> queenCols, ArrayList<Integer> currSol) {
		if(currSol.size() >= n) {
			ArrayList<Integer> sol = ((ArrayList<Integer>) currSol.clone());			
			queenCols.add(sol);
			return;
		}
		for(int j = 0; j < n; j++) {
			if(validPlacement(currSol, j)) {
				currSol.add(j);
				nQueenHelper(n, queenCols, currSol);
				currSol.remove(currSol.size()-1);
			}
		}
	}

	private boolean validPlacement(ArrayList<Integer> currSol, int col) {
		int row = currSol.size();
		for(int i = 0; i < currSol.size(); i++) {
			int r = i, c = currSol.get(i);
			if(c == col || ((row - r) == Math.abs(col - c)))  {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		List<List<Integer>> sol = new NQueen().nQueenSolution(8);
		System.out.println(sol.size()); // size should be 92
	}
}
