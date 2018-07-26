package treeDiameter;

public class Tree {
	public double computeDiameter(Node root) {
		if(root == null) {
			return 00.0;
		}
		HeightAndDiameter sol = computeDiameterHelper(root);
		return sol.diameter;
	}

	private HeightAndDiameter computeDiameterHelper(Node root) {
		if(root == null) {
			return new HeightAndDiameter(0, 0);
		}
		double[] heights = new double[2];
		double maxDiameter = 0.0;
		for(Edge e: root.getEdges()) {
			HeightAndDiameter temp = computeDiameterHelper(e.getNode());
			if(temp.diameter  > maxDiameter) {
				maxDiameter = temp.diameter;
			}
			if(temp.height + e.getDistance() > heights[0]) {
				heights[1] = heights[0];
				heights[0] = temp.height + e.getDistance();				
			} else if(temp.height + e.getDistance() > heights[1]) {
				heights[1] = temp.height + e.getDistance();
			}
		}
		return new HeightAndDiameter(heights[0], maxDiameter);
	}
}
