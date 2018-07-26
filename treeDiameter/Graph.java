package treeDiameter;
import java.util.*;
public class Graph {
	List<Node> allNodes = new ArrayList<Node>();
	HashMap<String, Node> nodeMap = new HashMap<String, Node>();
	
	public void addEdge(String start, String end, int d) {
		Node u = getOrCreateNode(start);
		Node v = getOrCreateNode(end);
		Edge e = new Edge(v, d);
		u.getEdges().add(e);		
	}
	private Node getOrCreateNode(String nodeName) {
		if(!nodeMap.containsKey(nodeName)) {
			Node n = new Node(nodeName);
			nodeMap.put(nodeName, n);
			allNodes.add(n);
		}		
		return nodeMap.get(nodeName);
	}
}
