package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
	private Queue<Vertex> queue;
	public BFS() {
		this.queue=new LinkedList<>();	
	}
	
	//Running time complexity = O(V+E)
	public void bfs(Vertex root) {
		root.setVisited(true);
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Vertex v=queue.poll();
			System.out.print(v+" ");
			List<Vertex> adjacentVertexes=v.adjacenctVertexList;
			for(Vertex neigbhourVtx:adjacentVertexes) {	
				if(!neigbhourVtx.isVisited()) {
					neigbhourVtx.setVisited(true);
					queue.add(neigbhourVtx);
				}	
			}
		}
		
		
	}
	
	//Class to store the vertex attributes
	static class Vertex{
		private int data;
		private boolean visited;
		private List<Vertex> adjacenctVertexList;
		
		public Vertex(int data) {
			this.data=data;
			this.adjacenctVertexList=new ArrayList<>();
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public boolean isVisited() {
			return visited;
		}
		public void setVisited(boolean visited) {
			this.visited = visited;
		}
		public List<Vertex> getAdjacenctVertexList() {
			return adjacenctVertexList;
		}
		public void setAdjacenctVertexList(List<Vertex> adjacenctVertexList) {
			this.adjacenctVertexList = adjacenctVertexList;
		}
		
		public void addAdjacentVertex(Vertex v) {
			this.adjacenctVertexList.add(v);
		}
		
		@Override
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
}
