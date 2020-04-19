package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

import DepthFirstSearch.DFS.Vertex;

public class DFSTest {
	
	
	public static void main(String[] args) {		
		Vertex v1=new Vertex(1);
		Vertex v2=new Vertex(2);
		Vertex v3=new Vertex(3);
		Vertex v4=new Vertex(4);
		Vertex v5=new Vertex(5);
		
		v1.addAdjacentVertex(v2);
		v1.addAdjacentVertex(v3);
		v3.addAdjacentVertex(v4);
		v4.addAdjacentVertex(v5);
		
		//Multiple subsets of graph
		List<Vertex> listV=new ArrayList<>();
		listV.add(v1);
		
		DFS	dfs=new DFS();
		//dfs.dfsRecursive(v1);
		//dfs.dfsStack(v1);
		dfs.dfs(listV);
		
	}

}
