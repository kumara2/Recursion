package treeDiameter;

public  class Edge {
	private Node node;
	private int distance;
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public Edge(Node target , int d) {
		node = target;
		distance = d;
	}
}
