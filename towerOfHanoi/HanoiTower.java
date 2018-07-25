package towerOfHanoi;
import java.util.*;
public class HanoiTower {
	public void tower(Stack<Integer> source, Stack<Integer> buffer, Stack<Integer> dest, int n) {
		if(n == 0) {
			return;
		}
		tower(source, dest, buffer, n-1);
		dest.push(source.pop());
		tower(buffer, source, dest, n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 7; i >= 0; i--) {
			s.push(i);
		}
		System.out.println(s);
		Stack<Integer> d = new Stack<Integer>();
		Stack<Integer> b = new Stack<Integer>();
		new HanoiTower().tower(s,b , d, s.size());
		System.out.println(d);
	}

}
