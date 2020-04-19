package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class DFS {
	
	private Stack<Vertex> stack;
	public DFS() {
		this.stack=new Stack<>();
	}
	
	//For multiple sub graphs within a graph
	public void dfs(List<Vertex> listVertex) {
		if(listVertex.isEmpty()) return;
		
		for(Vertex inputV:listVertex) {
			if(!inputV.isVisited()) {
				dfsStack(inputV);
				//dfsRecursive(inputV);
			}
		}
	}
	
	////Running time complexity = O(V+E)
	public void dfsStack(Vertex root) {
		this.stack.add(root);
		root.setVisited(true);
		
		while(!stack.isEmpty()) {
			Vertex currentV=this.stack.pop();
			System.out.print(currentV.getData()+" ");
			
			for(Vertex adjacentV:currentV.getAdjacenctVertexList()) {
				if(!adjacentV.isVisited()) {
					this.stack.push(adjacentV);
					adjacentV.setVisited(true);
				}
			}
		}
		
	}
	
	////Running time complexity = O(V+E)
	public void dfsRecursive(Vertex root) {		
		System.out.print(root.getData()+" ");
		for(Vertex adjacentV:root.getAdjacenctVertexList()) {
				if(!adjacentV.isVisited()) {
					adjacentV.setVisited(true);
					dfsRecursive(adjacentV);
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
