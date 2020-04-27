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
	
	

}
