package BreadthFirstSearch;

import BreadthFirstSearch.BFS.Vertex;

public class BFSTest {
	
	public static void main(String[] args) {
		Vertex v1=new Vertex(1);
		Vertex v2=new Vertex(2);
		Vertex v3=new Vertex(3);
		Vertex v4=new Vertex(4);
		Vertex v5=new Vertex(5);
		
		v1.addAdjacentVertex(v2);
		v1.addAdjacentVertex(v4);
		v4.addAdjacentVertex(v5);
		v2.addAdjacentVertex(v3);
		
		BFS bfs=new BFS();
		bfs.bfs(v1);
	}

}
