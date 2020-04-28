package DFSCycleDetection;

import java.util.ArrayList;
import java.util.List;

public class CycleDetection {
	public void cycleDetection(List<Vertex> vertexList) {
		
		for(Vertex v:vertexList) {
			if(!v.isVisited()) {
				dfs(v);
			}
		}
	}

	private void dfs(Vertex vertex) {
		vertex.setBeingVisited(true);
		System.out.println("Being Visited vertex:"+vertex);
		for(Vertex v:vertex.getNeighBourList()) {
			if(v.isBeingVisited()) {
				System.out.println("Cycle Found.");
				return;
			}
			if(!v.isVisited()) {
				System.out.println("Visited vertex:"+vertex);
				v.setVisited(true);
				dfs(v);
			}
		}
		
		System.out.println("Being Visited false.");
		vertex.setBeingVisited(false);
		vertex.setVisited(true);// calling again for confirmation
		
	}

	static class Vertex {
		private String data;
		private boolean isVisited;
		private boolean isBeingVisited;
		private List<Vertex> neighBourList;

		public Vertex(String data) {
			this.data = data;
			this.neighBourList = new ArrayList<>();
		}

		public void addNeighbourList(Vertex v) {
			this.neighBourList.add(v);
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public boolean isVisited() {
			return isVisited;
		}

		public void setVisited(boolean isVisited) {
			this.isVisited = isVisited;
		}

		public boolean isBeingVisited() {
			return isBeingVisited;
		}

		public void setBeingVisited(boolean isBeingVisited) {
			this.isBeingVisited = isBeingVisited;
		}

		public List<Vertex> getNeighBourList() {
			return neighBourList;
		}

		public void setNeighBourList(List<Vertex> neighBourList) {
			this.neighBourList = neighBourList;
		}

		@Override
		public String toString() {
			return this.data;
		}

	}

}
