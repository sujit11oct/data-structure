package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalOrder {
	
	private  Stack<Vertex> stack=new Stack<>();
	
	public void dfs(Vertex v) {
		v.setVisited(true);
		for(Vertex neighbourVtx:v.getNeighbourList()) {
			if(!neighbourVtx.isVisited()) {
				dfs(neighbourVtx);
			}
			
		}
		
		stack.push(v);
	}
	
	public Stack<Vertex> getStack(){
		return this.stack;
	}
	
	static class Vertex{
		String data;
		boolean isVisited;
		List<Vertex> neighbourList;
		
		public Vertex(String data) {
			this.data=data;
			this.neighbourList=new ArrayList<>();
		}
		
		public void addNeighbourList(Vertex v) {
			this.neighbourList.add(v);
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



		public List<Vertex> getNeighbourList() {
			return neighbourList;
		}

		public void setNeighbourList(List<Vertex> neighbourList) {
			this.neighbourList = neighbourList;
		}

		@Override
		public String toString() {
			return  this.data;
		}
		
		
	}

}
